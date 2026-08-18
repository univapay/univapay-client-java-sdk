/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.events;

import com.univapay.api.events.utilities.HttpRequestFactory;
import com.univapay.api.events.webhooks.TokenHandler;
import com.univapay.api.events.webhooks.TokenParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.TokenWebhookEvent;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class TokenHandlerTests
{
    @Test
    public void onTokenCreated_TokenHandler_ReturnsTokenCreatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"token_created\",\"data\":{\"id\":\"6426bbd2-17bd-41bf-883b-1fe970db48ee\",\"store_id\":\"fc264608-9a9e-495e-844e-a08129a81af4\",\"email\":\"test@univapay.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"recurring\",\"confirmed\":true,\"metadata\":{\"customer_id\":\"cust_12345\"},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\",\"data\":{\"card\":{\"cardholder\":\"TARO YAMADA\",\"exp_month\":12,\"exp_year\":2026,\"brand\":\"visa\",\"last_four\":\"4242\",\"card_bin\":\"card_bin0\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"cvv_authorize\":{\"enabled\":true,\"status\":\"current\",\"charge_id\":null,\"credentials_id\":null,\"currency\":\"JPY\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"billing\":null,\"cvv_authorize_check\":null,\"three_ds\":null,\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean tokenCreated(TokenWebhookEvent tokenCreated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onTokenUpdated_TokenHandler_ReturnsTokenUpdatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"token_updated\",\"data\":{\"id\":\"6426bbd2-17bd-41bf-883b-1fe970db48ee\",\"store_id\":\"fc264608-9a9e-495e-844e-a08129a81af4\",\"email\":\"test@univapay.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"recurring\",\"confirmed\":true,\"metadata\":{\"customer_id\":\"cust_12345\"},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\",\"data\":{\"card\":{\"cardholder\":\"TARO YAMADA\",\"exp_month\":12,\"exp_year\":2026,\"brand\":\"visa\",\"last_four\":\"4242\",\"card_bin\":\"card_bin0\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"cvv_authorize\":{\"enabled\":true,\"status\":\"current\",\"charge_id\":null,\"credentials_id\":null,\"currency\":\"JPY\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"billing\":null,\"cvv_authorize_check\":null,\"three_ds\":null,\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean tokenUpdated(TokenWebhookEvent tokenUpdated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onTokenThreeDsUpdated_TokenHandler_ReturnsTokenThreeDsUpdatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"token_three_d_s_updated\",\"data\":{\"id\":\"6426bbd2-17bd-41bf-883b-1fe970db48ee\",\"store_id\":\"fc264608-9a9e-495e-844e-a08129a81af4\",\"email\":\"test@univapay.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"recurring\",\"confirmed\":true,\"metadata\":{\"customer_id\":\"cust_12345\"},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\",\"data\":{\"card\":{\"cardholder\":\"TARO YAMADA\",\"exp_month\":12,\"exp_year\":2026,\"brand\":\"visa\",\"last_four\":\"4242\",\"card_bin\":\"card_bin0\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"cvv_authorize\":{\"enabled\":true,\"status\":\"current\",\"charge_id\":null,\"credentials_id\":null,\"currency\":\"JPY\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"billing\":null,\"cvv_authorize_check\":null,\"three_ds\":null,\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean tokenThreeDsUpdated(TokenWebhookEvent tokenThreeDsUpdated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onTokenCvvAuthUpdated_TokenHandler_ReturnsTokenCvvAuthUpdatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"token_cvv_auth_updated\",\"data\":{\"id\":\"6426bbd2-17bd-41bf-883b-1fe970db48ee\",\"store_id\":\"fc264608-9a9e-495e-844e-a08129a81af4\",\"email\":\"test@univapay.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"recurring\",\"confirmed\":true,\"metadata\":{\"customer_id\":\"cust_12345\"},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\",\"data\":{\"card\":{\"cardholder\":\"TARO YAMADA\",\"exp_month\":12,\"exp_year\":2026,\"brand\":\"visa\",\"last_four\":\"4242\",\"card_bin\":\"card_bin0\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"cvv_authorize\":{\"enabled\":true,\"status\":\"current\",\"charge_id\":null,\"credentials_id\":null,\"currency\":\"JPY\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"billing\":null,\"cvv_authorize_check\":null,\"three_ds\":null,\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean tokenCvvAuthUpdated(TokenWebhookEvent tokenCvvAuthUpdated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onTokenCvvAuthCheckUpdated_TokenHandler_ReturnsTokenCvvAuthCheckUpdatedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"token_cvv_auth_check_updated\",\"data\":{\"id\":\"6426bbd2-17bd-41bf-883b-1fe970db48ee\",\"store_id\":\"fc264608-9a9e-495e-844e-a08129a81af4\",\"email\":\"test@univapay.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"recurring\",\"confirmed\":true,\"metadata\":{\"customer_id\":\"cust_12345\"},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\",\"data\":{\"card\":{\"cardholder\":\"TARO YAMADA\",\"exp_month\":12,\"exp_year\":2026,\"brand\":\"visa\",\"last_four\":\"4242\",\"card_bin\":\"card_bin0\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"cvv_authorize\":{\"enabled\":true,\"status\":\"current\",\"charge_id\":null,\"credentials_id\":null,\"currency\":\"JPY\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"billing\":null,\"cvv_authorize_check\":null,\"three_ds\":null,\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean tokenCvvAuthCheckUpdated(TokenWebhookEvent tokenCvvAuthCheckUpdated) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onTokenReplaced_TokenHandler_ReturnsTokenReplacedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"token_replaced\",\"data\":{\"id\":\"6426bbd2-17bd-41bf-883b-1fe970db48ee\",\"store_id\":\"fc264608-9a9e-495e-844e-a08129a81af4\",\"email\":\"test@univapay.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"recurring\",\"confirmed\":true,\"metadata\":{\"customer_id\":\"cust_12345\"},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\",\"data\":{\"card\":{\"cardholder\":\"TARO YAMADA\",\"exp_month\":12,\"exp_year\":2026,\"brand\":\"visa\",\"last_four\":\"4242\",\"card_bin\":\"card_bin0\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"cvv_authorize\":{\"enabled\":true,\"status\":\"current\",\"charge_id\":null,\"credentials_id\":null,\"currency\":\"JPY\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"billing\":null,\"cvv_authorize_check\":null,\"three_ds\":null,\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean tokenReplaced(TokenWebhookEvent tokenReplaced) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onRecurringTokenDeleted_TokenHandler_ReturnsRecurringTokenDeletedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"recurring_token_deleted\",\"data\":{\"id\":\"6426bbd2-17bd-41bf-883b-1fe970db48ee\",\"store_id\":\"fc264608-9a9e-495e-844e-a08129a81af4\",\"email\":\"test@univapay.com\",\"payment_type\":\"card\",\"active\":true,\"mode\":\"live\",\"type\":\"recurring\",\"confirmed\":true,\"metadata\":{\"customer_id\":\"cust_12345\"},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"updated_on\":\"2026-04-09T07:35:50.000000Z\",\"data\":{\"card\":{\"cardholder\":\"TARO YAMADA\",\"exp_month\":12,\"exp_year\":2026,\"brand\":\"visa\",\"last_four\":\"4242\",\"card_bin\":\"card_bin0\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"cvv_authorize\":{\"enabled\":true,\"status\":\"current\",\"charge_id\":null,\"credentials_id\":null,\"currency\":\"JPY\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"billing\":null,\"cvv_authorize_check\":null,\"three_ds\":null,\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean recurringTokenDeleted(TokenWebhookEvent recurringTokenDeleted) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onUnknown_TokenHandler_ReturnsUnknownEvent()
    {
        // Arrange
        String body = "null";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = TokenHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new TokenParsingResult.SomeCases<Boolean>() {
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