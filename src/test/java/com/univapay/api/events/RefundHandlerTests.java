/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.events;

import com.univapay.api.events.utilities.HttpRequestFactory;
import com.univapay.api.events.webhooks.RefundHandler;
import com.univapay.api.events.webhooks.RefundParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.RefundWebhookCallback;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class RefundHandlerTests
{
    @Test
    public void onRefundFinished_RefundHandler_ReturnsRefundFinishedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"refund_finished\",\"data\":{\"id\":\"b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6\",\"store_id\":\"76cf4a64-02bc-4cb3-9a28-74622e5928a1\",\"charge_id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"status\":\"successful\",\"amount\":1000,\"currency\":\"JPY\",\"amount_formatted\":1000,\"reason\":\"customer_request\",\"message\":\"Customer returned item\",\"error\":null,\"metadata\":{\"order_id\":\"order_12345\"},\"mode\":\"live\",\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:36:00.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = RefundHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new RefundParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean refundFinished(RefundWebhookCallback refundFinished) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onUnknown_RefundHandler_ReturnsUnknownEvent()
    {
        // Arrange
        String body = "null";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = RefundHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new RefundParsingResult.SomeCases<Boolean>() {
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