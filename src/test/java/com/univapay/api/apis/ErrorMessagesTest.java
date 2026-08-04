/*
 * Custom test (not auto-generated): verifies APIMatic dynamic error messages.
 *
 * Forces Prism to return the 400 BadRequest example via a `Prefer: code=400`
 * interceptor and asserts:
 *   1. the thrown exception's MESSAGE is interpolated from the response body
 *      (contains the templated `code`), proving the x-operation-settings
 *      ErrorTemplates took effect;
 *   2. the full typed `errors[]` array is still accessible on the exception,
 *      proving the array is not lost (templates only shape the message string).
 */

package com.univapay.api.apis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.univapay.api.UnivapayClientSdkClient;
import com.univapay.api.exceptions.ApiErrorException;
import org.junit.Test;

public class ErrorMessagesTest extends BaseApiTest {

    @Test
    public void testDynamicErrorMessageAndErrorsArray() throws Exception {
        // Build a one-off client with Prefer: code=400 so Prism returns the 400 response.
        okhttp3.OkHttpClient preferClient = new okhttp3.OkHttpClient.Builder()
                .addInterceptor(chain -> chain.proceed(
                        chain.request().newBuilder()
                                .header("Prefer", "code=400")
                                .build()))
                .build();

        UnivapayClientSdkClient preferredClient = createConfiguration().newBuilder()
                .httpCallback(httpResponse)
                .httpClientConfig(cfg -> cfg.httpClientInstance(preferClient, true))
                .build();
        ChargesApi preferredController = preferredClient.getChargesApi();

        try {
            preferredController.createCharge(null, null);
            fail("Expected ApiErrorException for a 400 response");
        } catch (ApiErrorException e) {
            // 1. Dynamic message: the template prefix only exists if the
            //    ErrorTemplate was interpolated at runtime.
            assertTrue(e.getMessage().contains("HTTP 400 Bad Request"));
            assertTrue(e.getMessage().contains("VALIDATION_ERROR"));

            // 2. Array preserved: full typed errors[] is readable off the exception.
            assertNotNull(e.getErrors());
            assertTrue(e.getErrors().size() >= 1);
            assertEquals("INVALID_CARD_NUMBER", e.getErrors().get(0).getReason());
        }
    }
}
