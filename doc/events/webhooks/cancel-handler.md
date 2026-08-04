## Cancel Handler

Cancel lifecycle events.

Events in this group are uniquely identified by the `event` field.

## Events

Events available in this group. Subscribe to receive webhook notifications when these events occur.

| Name | Description | Event Identifier |
|  --- | --- | --- |
| [cancelFinished](../../../doc/events/webhooks/cancel/cancel-finished.md) | Fired when a cancellation request reaches a terminal status (`successful`, `failed`, `error`). The `data` field contains the full Cancel object. | cancel_finished |

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
import com.univapay.api.events.webhooks.CancelHandler;
import com.univapay.api.events.webhooks.CancelParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.CancelWebhookCallback;

@RestController
public class CancelController {

    @PostMapping("/cancel")
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

        String result = CancelHandler.parseEventAsync(httpRequest).thenApply(cancelParsingResult ->
            cancelParsingResult.matchSome(new CancelParsingResult.SomeCases<String>() {
                @Override
                public String cancelFinished(CancelWebhookCallback cancelFinished) {
                    return MessageFormat.format("CancelFinished event received {0}", cancelFinished.toString());
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

