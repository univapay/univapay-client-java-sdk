/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.events;

import com.univapay.api.events.utilities.HttpRequestFactory;
import com.univapay.api.events.webhooks.CustomsHandler;
import com.univapay.api.events.webhooks.CustomsParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.CustomsDeclarationWebhookCallback;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class CustomsHandlerTests
{
    @Test
    public void onCustomsDeclarationFinished_CustomsHandler_ReturnsCustomsDeclarationFinishedEvent()
    {
        // Arrange
        String body = "{\"id\":\"11ef0000-0000-4000-8000-000000000001\",\"event\":\"customs_declaration_finished\",\"data\":{\"id\":\"11ef0000-0000-4000-8000-000000000040\",\"charge_id\":\"11ef0000-0000-4000-8000-000000000001\",\"merchant_id\":\"11ef0000-0000-4000-8000-000000000020\",\"store_id\":\"11ef0000-0000-4000-8000-000000000022\",\"mode\":\"test\",\"gateway\":\"wechat_online\",\"declaration\":{\"customs\":\"TOKYO\",\"merchant_customs_no\":\"1234567890\",\"certificate_id\":\"AB1234567\",\"certificate_name\":\"TARO YAMADA\"},\"declaration_result\":{\"approving_authority\":\"TOKYO\",\"trade_id\":\"wx_trade_12345\",\"transaction_id\":\"wx_txn_12345\",\"charge_transaction_id\":\"wx_charge_12345\"},\"status\":\"successful\",\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"platform_id\":\"00000550-0000-0000-0000-000000000000\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}},\"created_on\":\"2026-04-09T07:35:50.000000Z\",\"exampleAdditionalProperty\":{\"key1\":\"val1\",\"key2\":\"val2\"}}";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = CustomsHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new CustomsParsingResult.SomeCases<Boolean>() {
                @Override
                public Boolean customsDeclarationFinished(CustomsDeclarationWebhookCallback customsDeclarationFinished) {
                    return true;
                }
            })
        ).join();

        // Assert
        assertTrue(result);
    }

    @Test
    public void onUnknown_CustomsHandler_ReturnsUnknownEvent()
    {
        // Arrange
        String body = "null";

        HttpRequest httpRequest = HttpRequestFactory.createPostRequestWithBody(body);

        // Act
        Boolean result = CustomsHandler.parseEventAsync(httpRequest).thenApply(parsingResult ->
            parsingResult.matchSome(new CustomsParsingResult.SomeCases<Boolean>() {
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