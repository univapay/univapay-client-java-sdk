/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.events;

import com.univapay.api.events.utilities.HttpRequestFactory;
import com.univapay.api.events.webhooks.BankTransferHandler;
import com.univapay.api.events.webhooks.BankTransferParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.BankTransferStatusWebhookCallback;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class BankTransferHandlerTests
{
    @Test
    public void onBankTransferStatusUpdated_BankTransferHandler_ReturnsBankTransferStatusUpdatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"bank_transfer_status_updated\",\"data\":{\"id\":\"11ef0000-0000-4000-8000-000000000002\",\"charge_id\":\"11ef0000-0000-4000-8000-000000000001\",\"payment_status\":\"exact\",\"latest_deposit_date\":\"2026-04-09T07:35:50.000000Z\",\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"latest_deposit_amount\":1000,\"balance\":0,\"currency\":\"JPY\",\"amount\":1000,\"amount_difference\":0,\"token_metadata\":{\"order_id\":\"12345\"},\"charge_metadata\":{\"order_id\":\"order_12345\"},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = BankTransferHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new BankTransferParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean bankTransferStatusUpdated(BankTransferStatusWebhookCallback bankTransferStatusUpdated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onUnknown_BankTransferHandler_ReturnsUnknownEvent()
    {
        // Arrange
        String body = "null";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = BankTransferHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new BankTransferParsingResult.SomeCases<Boolean>() {
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