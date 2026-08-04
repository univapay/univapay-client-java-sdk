
# Bank Transfer Status Updated

Fired when the payment status of a bank transfer charge changes (e.g., when a deposit is received and matched against the expected amount). The `data` field contains a `BankTransferStatusData` object with the extension record, deposit amounts, and originating charge/token metadata.

## Headers

This event's request contains the following headers.

| Name | Description |
|  --- | --- |
| Idempotency-Key | An optional idempotency key to prevent double charges and duplicate operations. We recommend a randomly generated UUID (v4). |
| Content-Type |  |

## Payload Type

This event's request payload is of type [BankTransferStatusWebhookCallback](../../../../doc/models/bank-transfer-status-webhook-callback.md).

## Payload Example

```json
{
  "id": "11ef0000-0000-4000-8000-000000000001",
  "event": "bank_transfer_status_updated",
  "data": {
    "id": "11ef0000-0000-4000-8000-000000000002",
    "charge_id": "11ef0000-0000-4000-8000-000000000001",
    "payment_status": "exact",
    "latest_deposit_date": "2026-04-09T07:35:50.000000Z",
    "created_on": "2026-04-09T07:35:50.000000Z",
    "latest_deposit_amount": 1000,
    "balance": 0,
    "currency": "JPY",
    "amount": 1000,
    "amount_difference": 0,
    "token_metadata": {
      "order_id": "12345"
    },
    "charge_metadata": {
      "order_id": "order_12345"
    },
    "exampleAdditionalProperty": {
      "key1": "val1",
      "key2": "val2"
    }
  },
  "created_on": "2026-04-09T07:35:50.000000Z",
  "exampleAdditionalProperty": {
    "key1": "val1",
    "key2": "val2"
  }
}
```

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

## Accepted Server Responses

The server should responds with one of the following status codes:

| Status Code | Description |
|  --- | --- |
| 200 | Return 200 to acknowledge receipt of the event. Returns an empty JSON object. |

