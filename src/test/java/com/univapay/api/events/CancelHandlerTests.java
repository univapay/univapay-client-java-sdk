/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.events;

import com.univapay.api.events.utilities.HttpRequestFactory;
import com.univapay.api.events.webhooks.CancelHandler;
import com.univapay.api.events.webhooks.CancelParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.CancelWebhookCallback;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CancelHandlerTests
{
    @Test
    public void onCancelFinished_CancelHandler_ReturnsCancelFinishedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"cancel_finished\",\"data\":{\"id\":\"a1b2c3d4-e5f6-7890-abcd-ef1234567890\",\"charge_id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"status\":\"successful\",\"error\":null,\"metadata\":{\"order_id\":\"order_12345\"},\"mode\":\"live\",\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:36:00.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = CancelHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new CancelParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean cancelFinished(CancelWebhookCallback cancelFinished) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onUnknown_CancelHandler_ReturnsUnknownEvent()
    {
        // Arrange
        String body = "null";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = CancelHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new CancelParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean unknown() {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }
}