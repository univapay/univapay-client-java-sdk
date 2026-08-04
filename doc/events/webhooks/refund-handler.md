## Refund Handler

Refund lifecycle events.

Events in this group are uniquely identified by the `event` field.

## Events

Events available in this group. Subscribe to receive webhook notifications when these events occur.

| Name | Description | Event Identifier |
|  --- | --- | --- |
| [refundFinished](../../../doc/events/webhooks/refund/refund-finished.md) | Fired when a refund reaches a terminal status (`successful`, `failed`, `error`). The `data` field contains the full Refund object. | refund_finished |

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
import com.univapay.api.events.webhooks.RefundHandler;
import com.univapay.api.events.webhooks.RefundParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.RefundWebhookCallback;

@RestController
public class RefundController {

    @PostMapping("/refund")
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

        String result = RefundHandler.parseEventAsync(httpRequest).thenApply(refundParsingResult ->
            refundParsingResult.matchSome(new RefundParsingResult.SomeCases<String>() {
                @Override
                public String refundFinished(RefundWebhookCallback refundFinished) {
                    return MessageFormat.format("RefundFinished event received {0}", refundFinished.toString());
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

