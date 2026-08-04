## Token Handler

Transaction token lifecycle events.

Events in this group are uniquely identified by the `event` field.

## Events

Events available in this group. Subscribe to receive webhook notifications when these events occur.

| Name | Description | Event Identifier |
|  --- | --- | --- |
| [tokenCreated](../../../doc/events/webhooks/token/token-created.md) | Fired when a new transaction token is created. The `data` field contains the full TransactionToken object. | token_created |
| [tokenUpdated](../../../doc/events/webhooks/token/token-updated.md) | Fired when a transaction token is updated (e.g., metadata change). The `data` field contains the full TransactionToken object. | token_updated |
| [tokenThreeDsUpdated](../../../doc/events/webhooks/token/token-three-ds-updated.md) | Fired when the 3-D Secure data associated with a token is updated. The `data` field contains the full TransactionToken object. | token_three_d_s_updated |
| [tokenCvvAuthUpdated](../../../doc/events/webhooks/token/token-cvv-auth-updated.md) | Fired when the CVV authorization result for a token is updated. The `data` field contains the full TransactionToken object. | token_cvv_auth_updated |
| [tokenCvvAuthCheckUpdated](../../../doc/events/webhooks/token/token-cvv-auth-check-updated.md) | Fired when the CVV auth check status for a token changes. The `data` field contains the full TransactionToken object. | token_cvv_auth_check_updated |
| [tokenReplaced](../../../doc/events/webhooks/token/token-replaced.md) | Fired when a transaction token is replaced by a new token (e.g., after card update). The `data` field contains the replacement TransactionToken object. | token_replaced |
| [recurringTokenDeleted](../../../doc/events/webhooks/token/recurring-token-deleted.md) | Fired when a recurring transaction token is deleted. The `data` field contains the deleted TransactionToken object. | recurring_token_deleted |

## SDK Usage Example

```java
package com.example.eventslistener;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletRequest;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.stream.Collectors;
import com.univapay.api.events.webhooks.TokenHandler;
import com.univapay.api.events.webhooks.TokenParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.TokenWebhookEvent;

@RestController
public class TokenController {

    @PostMapping("/token")
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

        String result = TokenHandler.parseEventAsync(httpRequest).thenApply(tokenParsingResult ->
            tokenParsingResult.matchSome(new TokenParsingResult.SomeCases<String>() {
                @Override
                public String tokenCreated(TokenWebhookEvent tokenCreated) {
                    return MessageFormat.format("TokenCreated event received {0}", tokenCreated.toString());
                }

                @Override
                public String tokenUpdated(TokenWebhookEvent tokenUpdated) {
                    return MessageFormat.format("TokenUpdated event received {0}", tokenUpdated.toString());
                }

                @Override
                public String tokenThreeDsUpdated(TokenWebhookEvent tokenThreeDsUpdated) {
                    return MessageFormat.format("TokenThreeDsUpdated event received {0}", tokenThreeDsUpdated.toString());
                }

                @Override
                public String unknown() {
                    return "Unknown event received";
                }

            })
        ).join();

        return ResponseEntity.status(200).body(result);
    }
}
```

