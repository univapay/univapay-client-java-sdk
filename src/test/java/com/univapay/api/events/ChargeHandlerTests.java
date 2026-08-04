/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.events;

import com.univapay.api.events.utilities.HttpRequestFactory;
import com.univapay.api.events.webhooks.ChargeHandler;
import com.univapay.api.events.webhooks.ChargeParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.ChargeWebhookEvent;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class ChargeHandlerTests
{
    @Test
    public void onChargeUpdated_ChargeHandler_ReturnsChargeUpdatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"charge_updated\",\"data\":{\"id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"requested_amount\":1250,\"requested_currency\":\"USD\",\"requested_amount_formatted\":12.5,\"charged_amount\":1250,\"charged_currency\":\"USD\",\"charged_amount_formatted\":12.5,\"only_direct_currency\":false,\"status\":\"successful\",\"error\":null,\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:30.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = ChargeHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new ChargeParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean chargeUpdated(ChargeWebhookEvent chargeUpdated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onChargeFinished_ChargeHandler_ReturnsChargeFinishedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"charge_finished\",\"data\":{\"id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"transaction_token_type\":\"recurring\",\"subscription_id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"requested_amount\":1250,\"requested_currency\":\"USD\",\"requested_amount_formatted\":12.5,\"charged_amount\":1250,\"charged_currency\":\"USD\",\"charged_amount_formatted\":12.5,\"only_direct_currency\":false,\"status\":\"successful\",\"error\":null,\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:30.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = ChargeHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new ChargeParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean chargeFinished(ChargeWebhookEvent chargeFinished) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onUnknown_ChargeHandler_ReturnsUnknownEvent()
    {
        // Arrange
        String body = "null";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = ChargeHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new ChargeParsingResult.SomeCases<Boolean>() {
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