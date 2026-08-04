## Bank-Transfer Handler

Bank transfer status update events.

Events in this group are uniquely identified by the `event` field.

## Events

Events available in this group. Subscribe to receive webhook notifications when these events occur.

| Name | Description | Event Identifier |
|  --- | --- | --- |
| [bankTransferStatusUpdated](../../../doc/events/webhooks/bank_transfer/bank-transfer-status-updated.md) | Fired when the payment status of a bank transfer charge changes (e.g., when a deposit is received and matched against the expected amount). The `data` field contains a `BankTransferStatusData` object with the extension record, deposit amounts, and originating charge/token metadata. | bank_transfer_status_updated |

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
import com.univapay.api.events.webhooks.BankTransferHandler;
import com.univapay.api.events.webhooks.BankTransferParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.BankTransferStatusWebhookCallback;

@RestController
public class BankTransferController {

    @PostMapping("/bank-transfer")
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

        String result = BankTransferHandler.parseEventAsync(httpRequest).thenApply(bankTransferParsingResult ->
            bankTransferParsingResult.matchSome(new BankTransferParsingResult.SomeCases<String>() {
                @Override
                public String bankTransferStatusUpdated(BankTransferStatusWebhookCallback bankTransferStatusUpdated) {
                    return MessageFormat.format("BankTransferStatusUpdated event received {0}", bankTransferStatusUpdated.toString());
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

