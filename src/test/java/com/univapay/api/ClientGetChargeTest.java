/*
 * Custom test (not auto-generated): pins getCharge(chargeId) -- the store-scoped
 * convenience call that reads the store id from the configured App Token instead
 * of making the caller pass (and persist) one.
 *
 * Two things are guarded here.
 *
 * First the *guard*: when the configured token carries no usable store_id, the
 * call must fail before a request is built. Interpolating a missing id would
 * send GET /stores/null/charges/{id} -- a confusing 4xx instead of a clear
 * client-side failure -- so the failure cases assert not just the throw but that
 * no request was ever issued. Those cases are fully offline: no network, no
 * environment, no credential.
 *
 * Second the *delegation*: on the happy path this must behave exactly like
 * charges.getCharge(storeId, chargeId, polling), with the store id taken from
 * the token. There is no Mockito in this SDK, so the seam used is the SDK's own
 * HttpCallback -- the same hook the generated tests use via HttpCallbackCatcher
 * -- to capture the request URL that was actually built. Those cases need the
 * mock server and are skipped (not failed) when BASE_URL is unset.
 *
 * Note the SDK test harness injects UNIVAPAY_CLIENT_SDK_JWT_TOKEN=test-jwt,
 * which is not a JWT at all, so a test resting on the shared env client would
 * silently exercise only the failure path. Hence the locally built clients.
 *
 * This is the Java half of a contract that is expected to exist in all seven
 * SDKs; keep the case table aligned when porting.
 */

package com.univapay.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.Assume.assumeNotNull;

import com.univapay.api.apis.ChargesApi;
import com.univapay.api.authentication.BearerAuthModel;
import com.univapay.api.http.client.HttpCallback;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.http.response.ApiResponse;
import com.univapay.api.models.Charge;
import io.apimatic.coreinterfaces.http.Context;
import io.apimatic.coreinterfaces.http.request.Request;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.UUID;
import java.util.concurrent.CompletionException;
import org.junit.Test;

public class ClientGetChargeTest {

    private static final String MERCHANT_ID = "11ec8e24-0ecf-2c5a-923c-331b915dc311";
    private static final String STORE_ID = "11ec8e24-b133-6c68-b54d-971717202e9b";
    private static final UUID CHARGE_ID =
            UUID.fromString("11ec8e24-c5f5-6f2e-b9b0-1f4d3c6a9e10");

    /** Captures the URL of every request the SDK builds, before it is sent. */
    private static final class UrlCatcher implements HttpCallback {
        private String url;

        @Override
        public void onBeforeRequest(Request request) {
            // getUrl() strips the query string, and `polling` travels in it, so
            // read the full URL off the concrete request where one is available.
            this.url = request instanceof HttpRequest
                    ? ((HttpRequest) request).getQueryUrl()
                    : request.getUrl();
        }

        @Override
        public void onAfterResponse(Context context) {
            // Nothing to do here -- the request URL is what this test asserts on.
        }

        String getUrl() {
            return url;
        }
    }

    /** Builds a JWT carrying payloadJson. Header and signature are inert -- nothing verifies them. */
    private static String jwt(String payloadJson) {
        Base64.Encoder encoder = Base64.getUrlEncoder().withoutPadding();
        String header = encoder.encodeToString(
                "{\"alg\":\"HS256\",\"typ\":\"JWT\"}".getBytes(StandardCharsets.UTF_8));
        String payload = encoder.encodeToString(payloadJson.getBytes(StandardCharsets.UTF_8));
        return header + "." + payload + ".c2ln";
    }

    private static final String STORE_TOKEN = jwt(
            "{\"merchant_id\":\"" + MERCHANT_ID + "\",\"store_id\":\"" + STORE_ID + "\"}");
    private static final String MERCHANT_TOKEN =
            jwt("{\"merchant_id\":\"" + MERCHANT_ID + "\"}");

    private static UnivapayClientSdkClient clientWith(String jwtToken, UrlCatcher catcher) {
        UnivapayClientSdkClient.Builder builder = new UnivapayClientSdkClient.Builder();
        if (jwtToken != null) {
            builder.bearerAuthCredentials(
                    new BearerAuthModel.Builder("not-a-real-secret", jwtToken).build());
        }
        if (catcher != null) {
            builder.httpCallback(catcher);
        }
        String baseUrl = System.getenv("BASE_URL");
        if (baseUrl != null) {
            builder.baseUrl(baseUrl);
        }
        return builder.build();
    }

    private static UnivapayClientSdkClient clientWith(String jwtToken) {
        return clientWith(jwtToken, null);
    }

    // ── The guard: no usable store_id ───────────────────────────────────────
    // Offline. No request is attempted, so these run without a mock server.

    @Test
    public void merchantLevelTokenThrows() {
        assertGuardTrips(MERCHANT_TOKEN);
    }

    @Test
    public void noCredentialsThrows() {
        assertGuardTrips(null);
    }

    @Test
    public void malformedTokenThrows() {
        assertGuardTrips("not.a-jwt");
    }

    @Test
    public void nonUuidStoreIdThrows() {
        assertGuardTrips(
                jwt("{\"merchant_id\":\"" + MERCHANT_ID + "\",\"store_id\":\"store-1\"}"));
    }

    /** The guard must trip before a request is built, on both the sync and async forms. */
    private static void assertGuardTrips(String jwtToken) {
        UrlCatcher catcher = new UrlCatcher();
        UnivapayClientSdkClient watched = clientWith(jwtToken, catcher);

        assertNull("precondition: this token carries no store id", watched.getCurrentStoreId());

        try {
            watched.getCharge(CHARGE_ID);
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("store-level App Token"));
        } catch (Exception e) {
            fail("expected IllegalStateException, got " + e.getClass().getName());
        }

        try {
            watched.getChargeAsync(CHARGE_ID);
            fail("expected IllegalStateException from the async form too");
        } catch (IllegalStateException expected) {
            assertTrue(expected.getMessage().contains("store-level App Token"));
        }

        assertNull("no request may be built when the store id is missing", catcher.getUrl());
    }

    @Test
    public void messageNamesTheFixAndNeverTheCredential() {
        try {
            clientWith(MERCHANT_TOKEN).getCharge(CHARGE_ID);
            fail("expected IllegalStateException");
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            assertTrue(message.contains("store-level App Token"));
            assertTrue(message.contains("getCharge(storeId, chargeId)"));
            assertFalse(message.contains(MERCHANT_TOKEN));
            assertFalse(message.contains(MERCHANT_ID));
            assertFalse(message.contains(STORE_ID));
        } catch (Exception e) {
            fail("expected IllegalStateException, got " + e.getClass().getName());
        }
    }

    // ── The delegation: store id taken from the token ───────────────────────
    // These build a real request, so they need the mock server.

    @Test
    public void delegatesWithTheStoreIdFromTheToken() throws Exception {
        assumeNotNull(System.getenv("BASE_URL"));
        UrlCatcher catcher = new UrlCatcher();
        UnivapayClientSdkClient client = clientWith(STORE_TOKEN, catcher);

        ApiResponse<Charge> response = client.getCharge(CHARGE_ID);

        assertNotNull(response);
        assertEquals(200, response.getStatusCode());
        assertTrue("request must be scoped to the token's store: " + catcher.getUrl(),
                catcher.getUrl().contains("/stores/" + STORE_ID + "/charges/" + CHARGE_ID));
    }

    @Test
    public void forwardsThePollingFlag() throws Exception {
        assumeNotNull(System.getenv("BASE_URL"));
        UrlCatcher catcher = new UrlCatcher();

        clientWith(STORE_TOKEN, catcher).getCharge(CHARGE_ID, true);

        assertTrue("polling must reach the query string: " + catcher.getUrl(),
                catcher.getUrl().contains("polling=true"));
    }

    @Test
    public void asyncFormDelegatesToo() throws Exception {
        assumeNotNull(System.getenv("BASE_URL"));
        UrlCatcher catcher = new UrlCatcher();
        UnivapayClientSdkClient client = clientWith(STORE_TOKEN, catcher);

        ApiResponse<Charge> response;
        try {
            response = client.getChargeAsync(CHARGE_ID).join();
        } catch (CompletionException e) {
            throw new AssertionError("async call failed", e.getCause());
        }

        assertNotNull(response);
        assertTrue(catcher.getUrl().contains("/stores/" + STORE_ID + "/charges/" + CHARGE_ID));
    }

    @Test
    public void behavesIdenticallyToTheControllerCall() throws Exception {
        assumeNotNull(System.getenv("BASE_URL"));
        UnivapayClientSdkClient client = clientWith(STORE_TOKEN);
        ChargesApi controller = client.getChargesApi();

        ApiResponse<Charge> viaShortcut = client.getCharge(CHARGE_ID);
        ApiResponse<Charge> viaController =
                controller.getCharge(UUID.fromString(STORE_ID), CHARGE_ID, null);

        assertEquals(viaController.getStatusCode(), viaShortcut.getStatusCode());
        assertEquals(viaController.getResult().getId(), viaShortcut.getResult().getId());
    }
}
