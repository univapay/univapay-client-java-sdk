## Charge Handler

Charge lifecycle events.

Events in this group are uniquely identified by the `event` field.

## Events

Events available in this group. Subscribe to receive webhook notifications when these events occur.

| Name | Description | Event Identifier |
|  --- | --- | --- |
| [chargeUpdated](../../../doc/events/webhooks/charge/charge-updated.md) | Fired whenever a charge transitions to a new status (e.g., `pending` → `awaiting`). The `data` field contains the full Charge object at the time of the event. | charge_updated |
| [chargeFinished](../../../doc/events/webhooks/charge/charge-finished.md) | Fired when a charge reaches a terminal status (`successful`, `failed`, `error`). The `data` field contains the full Charge object. | charge_finished |

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
import com.univapay.api.events.webhooks.ChargeHandler;
import com.univapay.api.events.webhooks.ChargeParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.ChargeWebhookEvent;

@RestController
public class ChargeController {

    @PostMapping("/charge")
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
                    return MessageFormat.format("ChargeUpdated event received {0}", chargeUpdated.toString());
                }

                @Override
                public String chargeFinished(ChargeWebhookEvent chargeFinished) {
                    return MessageFormat.format("ChargeFinished event received {0}", chargeFinished.toString());
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

