/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */
package com.univapay.api.framework_integrations.webhooks.apps;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.stream.Collectors;
import com.univapay.api.events.webhooks.ChargeHandler;
import com.univapay.api.events.webhooks.ChargeParsingResult;
import com.univapay.api.http.request.HttpRequest;
import org.springframework.http.RequestEntity;
import java.util.Map;
import com.univapay.api.models.ChargeWebhookEvent;

@RestController
public class ChargeRequestEntityController {

    @PostMapping("/charge-request-entity")
    public ResponseEntity<String> receiveEvent(RequestEntity<?> request) {

        // Create the HttpRequest from the incoming Request
        HttpRequest httpRequest = HttpRequest.fromSpringRequest(
                request.getHeaders().entrySet().stream().collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue
                )),
                request.getMethod() != null ? request.getMethod().name() : null,
                request.getBody(),
                request.getUrl().toString()
        );

        String result = ChargeHandler.parseEventAsync(httpRequest).thenApply(chargeParsingResult ->
            chargeParsingResult.matchSome(new ChargeParsingResult.SomeCases<String>() {
                @Override
                public String chargeUpdated(ChargeWebhookEvent chargeUpdated) {
                    return "ChargeUpdated event received";
                }

            })
        ).join();

        return ResponseEntity.status(200).body(result);
    }
}