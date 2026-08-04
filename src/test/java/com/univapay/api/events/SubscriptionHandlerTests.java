/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.events;

import com.univapay.api.events.utilities.HttpRequestFactory;
import com.univapay.api.events.webhooks.SubscriptionHandler;
import com.univapay.api.events.webhooks.SubscriptionParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.SubscriptionWebhookEvent;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SubscriptionHandlerTests
{
    @Test
    public void onSubscriptionCreated_SubscriptionHandler_ReturnsSubscriptionCreatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"subscription_created\",\"data\":{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\",\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":\"on_next_payment\"},\"only_direct_currency\":false,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\",\"period\":\"monthly\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new SubscriptionParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean subscriptionCreated(SubscriptionWebhookEvent subscriptionCreated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onSubscriptionPayment_SubscriptionHandler_ReturnsSubscriptionPaymentEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"subscription_payment\",\"data\":{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\",\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":\"on_next_payment\"},\"only_direct_currency\":false,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\",\"period\":\"monthly\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new SubscriptionParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean subscriptionPayment(SubscriptionWebhookEvent subscriptionPayment) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onSubscriptionCompleted_SubscriptionHandler_ReturnsSubscriptionCompletedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"subscription_completed\",\"data\":{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\",\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":\"on_next_payment\"},\"only_direct_currency\":false,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\",\"period\":\"monthly\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new SubscriptionParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean subscriptionCompleted(SubscriptionWebhookEvent subscriptionCompleted) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onSubscriptionFailure_SubscriptionHandler_ReturnsSubscriptionFailureEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"subscription_failure\",\"data\":{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\",\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":\"on_next_payment\"},\"only_direct_currency\":false,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\",\"period\":\"monthly\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new SubscriptionParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean subscriptionFailure(SubscriptionWebhookEvent subscriptionFailure) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onSubscriptionCanceled_SubscriptionHandler_ReturnsSubscriptionCanceledEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"subscription_canceled\",\"data\":{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\",\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":\"on_next_payment\"},\"only_direct_currency\":false,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\",\"period\":\"monthly\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new SubscriptionParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean subscriptionCanceled(SubscriptionWebhookEvent subscriptionCanceled) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onSubscriptionSuspended_SubscriptionHandler_ReturnsSubscriptionSuspendedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"subscription_suspended\",\"data\":{\"id\":\"11ef335e-9aa5-c54a-8313-7f9847da313a\",\"store_id\":\"11edf541-c42d-653c-8c3d-dfe0a55f95c0\",\"transaction_token_id\":\"11ef32a7-3a71-8662-803f-1bc27702eeec\",\"amount\":1250,\"currency\":\"USD\",\"amount_formatted\":12.5,\"schedule_settings\":{\"start_on\":\"2024-07-01\",\"zone_id\":\"Asia/Tokyo\",\"preserve_end_of_month\":false,\"retry_interval\":\"P7D\",\"termination_mode\":\"on_next_payment\"},\"only_direct_currency\":false,\"first_charge_authorization_only\":false,\"status\":\"current\",\"metadata\":{\"order_id\":\"12345\"},\"mode\":\"test\",\"created_on\":\"2024-06-26T01:51:28.627023Z\",\"period\":\"monthly\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new SubscriptionParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean subscriptionSuspended(SubscriptionWebhookEvent subscriptionSuspended) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onUnknown_SubscriptionHandler_ReturnsUnknownEvent()
    {
        // Arrange
        String body = "null";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new SubscriptionParsingResult.SomeCases<Boolean>() {
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