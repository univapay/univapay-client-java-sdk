/*
 * Custom test (not auto-generated): pins the App Token claim-decoding contract
 * behind getCurrentMerchantId() / getCurrentStoreId().
 *
 * This contract is implemented seven times -- once per SDK -- and has already
 * drifted twice: the Python SDK accepted non-canonical UUIDs that the others
 * rejected, and the TypeScript SDK rejected a payload segment carrying '='
 * padding that the others accepted. Neither was caught by a test, because none
 * existed.
 *
 * So the cases below are deliberately a *shared table*: keep them identical in
 * all seven SDKs. The failure being guarded against is the languages disagreeing
 * with each other, which no single-language suite can see.
 *
 * Everything here is synthetic and offline -- no network, no environment, no
 * real credential. It must pass in CI, where no token is configured.
 */

package com.univapay.api;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.univapay.api.authentication.BearerAuthModel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;
import org.junit.Test;

public class AppJwtTest {

    private static final String MERCHANT_ID = "11ec8e24-0ecf-2c5a-923c-331b915dc311";
    private static final String STORE_ID = "11ec8e24-b133-6c68-b54d-971717202e9b";

    /** Builds a JWT carrying payloadJson. Header and signature are inert -- nothing verifies them. */
    private static String jwt(String payloadJson) {
        return jwt(payloadJson, false);
    }

    private static String jwt(String payloadJson, boolean padded) {
        Base64.Encoder encoder = padded
                ? Base64.getUrlEncoder()
                : Base64.getUrlEncoder().withoutPadding();
        String header = Base64.getUrlEncoder().withoutPadding()
                .encodeToString("{\"alg\":\"HS256\",\"typ\":\"JWT\"}".getBytes(StandardCharsets.UTF_8));
        String payload = encoder.encodeToString(payloadJson.getBytes(StandardCharsets.UTF_8));
        return header + "." + payload + ".c2ln";
    }

    /** A payload carrying store_id with the given raw JSON value (quotes included by the caller). */
    private static String storeIdPayload(String rawJsonValue) {
        return "{\"store_id\":" + rawJsonValue + "}";
    }

    private static String quoted(String value) {
        return "\"" + value + "\"";
    }

    private static UnivapayClientSdkClient clientWith(String jwtToken) {
        return new UnivapayClientSdkClient.Builder()
                .bearerAuthCredentials(
                        new BearerAuthModel.Builder("not-a-real-secret", jwtToken).build())
                .build();
    }

    @Test
    public void readsBothIdsFromStoreLevelToken() {
        UnivapayClientSdkClient client = clientWith(jwt(
                "{\"merchant_id\":" + quoted(MERCHANT_ID) + ",\"store_id\":" + quoted(STORE_ID) + "}"));

        assertEquals(UUID.fromString(MERCHANT_ID), client.getCurrentMerchantId());
        assertEquals(UUID.fromString(STORE_ID), client.getCurrentStoreId());
    }

    @Test
    public void readsMerchantFromMerchantLevelTokenAndReportsNoStore() {
        // A merchant-level token carries no store_id claim at all. Null here is
        // the correct answer, not a decoding failure.
        UnivapayClientSdkClient client =
                clientWith(jwt("{\"merchant_id\":" + quoted(MERCHANT_ID) + "}"));

        assertEquals(UUID.fromString(MERCHANT_ID), client.getCurrentMerchantId());
        assertNull(client.getCurrentStoreId());
    }

    @Test
    public void acceptsPayloadSegmentThatCarriesPadding() {
        // base64url is normally unpadded, but some producers keep the '=' padding.
        // The TypeScript SDK once rejected exactly this, making it the only one of
        // the seven to return null for a padded -- but still valid -- token.
        UnivapayClientSdkClient client = clientWith(jwt(
                "{\"merchant_id\":" + quoted(MERCHANT_ID) + ",\"store_id\":" + quoted(STORE_ID) + "}",
                true));

        assertEquals(UUID.fromString(MERCHANT_ID), client.getCurrentMerchantId());
        assertEquals(UUID.fromString(STORE_ID), client.getCurrentStoreId());
    }

    @Test
    public void returnsNullNeverThrowsForUnusableInput() {
        String[][] cases = {
            {"a claim that is JSON null", jwt(storeIdPayload("null"))},
            {"a claim that is not a string", jwt(storeIdPayload("42"))},
            {"an undashed 32-character UUID", jwt(storeIdPayload(quoted(STORE_ID.replace("-", ""))))},
            {"a braced UUID", jwt(storeIdPayload(quoted("{" + STORE_ID + "}")))},
            {"a urn:uuid: prefixed UUID", jwt(storeIdPayload(quoted("urn:uuid:" + STORE_ID)))},
            {"short hex groups (1-1-1-1-1)", jwt(storeIdPayload(quoted("1-1-1-1-1")))},
            // \\n in the Java source is the two characters backslash-n in the JSON,
            // which decodes to a real trailing newline in the claim value.
            {"a UUID with a trailing newline", jwt(storeIdPayload(quoted(STORE_ID + "\\n")))},
            {"a UUID padded with spaces", jwt(storeIdPayload(quoted(" " + STORE_ID + " ")))},
            {"a two-segment token", "aGRy.c2ln"},
            {"a payload that is not base64url", "aGRy.!!!!.c2ln"},
            {"a payload that is a JSON array", jwt("[1,2]")},
            {"a payload that is not JSON", jwt("definitely not json")},
            {"an empty string", ""},
            // The Authorization header value is {secret}.{jwt} -- four segments once
            // split. Pasting that whole value into the jwtToken field is the mistake
            // the guide warns about, and it must degrade to null, not to a wrong id.
            {"the combined {secret}.{jwt} header value",
                "c2VjcmV0." + jwt(storeIdPayload(quoted(STORE_ID)))},
        };

        List<String> failures = new ArrayList<>();
        for (String[] testCase : cases) {
            String label = testCase[0];
            try {
                UUID storeId = clientWith(testCase[1]).getCurrentStoreId();
                if (storeId != null) {
                    failures.add(label + " -> expected null but got " + storeId);
                }
            } catch (RuntimeException e) {
                failures.add(label + " -> threw " + e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }

        assertTrue("cases that did not degrade to null:\n  " + String.join("\n  ", failures),
                failures.isEmpty());
    }

    @Test
    public void returnsNullWhenNoCredentialsConfigured() {
        UnivapayClientSdkClient client = new UnivapayClientSdkClient.Builder().build();

        assertNull(client.getCurrentMerchantId());
        assertNull(client.getCurrentStoreId());
    }
}
