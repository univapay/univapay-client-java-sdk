## Customs Handler

Customs declaration lifecycle events.

Events in this group are uniquely identified by the `event` field.

## Events

Events available in this group. Subscribe to receive webhook notifications when these events occur.

| Name | Description | Event Identifier |
|  --- | --- | --- |
| [customsDeclarationFinished](../../../doc/events/webhooks/customs/customs-declaration-finished.md) | Fired when a customs declaration associated with a charge reaches a terminal state. The `data` field contains the CustomsDeclaration resource returned by the backend formatter. | customs_declaration_finished |

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
import com.univapay.api.events.webhooks.CustomsHandler;
import com.univapay.api.events.webhooks.CustomsParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.CustomsDeclarationWebhookCallback;

@RestController
public class CustomsController {

    @PostMapping("/customs")
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

        String result = CustomsHandler.parseEventAsync(httpRequest).thenApply(customsParsingResult ->
            customsParsingResult.matchSome(new CustomsParsingResult.SomeCases<String>() {
                @Override
                public String customsDeclarationFinished(CustomsDeclarationWebhookCallback customsDeclarationFinished) {
                    return MessageFormat.format("CustomsDeclarationFinished event received {0}", customsDeclarationFinished.toString());
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

