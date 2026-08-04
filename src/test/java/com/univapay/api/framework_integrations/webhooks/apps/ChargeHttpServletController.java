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
import org.springframework.web.bind.annotation.RequestBody;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import com.univapay.api.models.ChargeWebhookEvent;

@RestController
public class ChargeHttpServletController {

    @PostMapping("/charge-http-servlet")
    public ResponseEntity<String> receiveEvent(
            HttpServletRequest request,
            @RequestBody(required = false) String body) {

        // Create the HttpRequest from the incoming Request
        HttpRequest httpRequest = HttpRequest.fromHttpServletRequest(
                Collections.list(request.getHeaderNames()).stream().collect(Collectors.toMap(
                        h -> h,
                        h -> Collections.list(request.getHeaders(h))
                )),
                request.getParameterMap(),
                request.getRequestURL(),
                request.getQueryString(),
                request.getMethod(),
                body
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