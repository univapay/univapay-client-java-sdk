
# Subscription Canceled

Fired when a subscription is cancelled before all payments complete. The `data` field contains the full Subscription object.

## Headers

This event's request contains the following headers.

| Name | Description |
|  --- | --- |
| Idempotency-Key | An optional idempotency key to prevent double charges and duplicate operations. We recommend a randomly generated UUID (v4). |
| Content-Type |  |

## Payload Type

This event's request payload is of type [SubscriptionWebhookEvent](../../../../doc/models/subscription-webhook-event.md).

## Payload Example

```json
{
  "id": "11ef0000-0000-4000-8000-000000000001",
  "event": "subscription_canceled",
  "data": {
    "id": "11ef335e-9aa5-c54a-8313-7f9847da313a",
    "store_id": "11edf541-c42d-653c-8c3d-dfe0a55f95c0",
    "transaction_token_id": "11ef32a7-3a71-8662-803f-1bc27702eeec",
    "amount": 1250,
    "currency": "USD",
    "amount_formatted": 12.5,
    "schedule_settings": {
      "start_on": "2024-07-01",
      "zone_id": "Asia/Tokyo",
      "preserve_end_of_month": false,
      "retry_interval": "P7D",
      "termination_mode": "on_next_payment"
    },
    "only_direct_currency": false,
    "first_charge_authorization_only": false,
    "status": "current",
    "metadata": {
      "order_id": "12345"
    },
    "mode": "test",
    "created_on": "2024-06-26T01:51:28.627023Z",
    "period": "monthly",
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
import com.univapay.api.events.webhooks.SubscriptionHandler;
import com.univapay.api.events.webhooks.SubscriptionParsingResult;
import com.univapay.api.http.request.HttpRequest;
import com.univapay.api.models.SubscriptionWebhookEvent;

@RestController
public class SubscriptionController {

    @PostMapping("/subscription")
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

        String result = SubscriptionHandler.parseEventAsync(httpRequest).thenApply(subscriptionParsingResult ->
            subscriptionParsingResult.matchSome(new SubscriptionParsingResult.SomeCases<String>() {
                @Override
                public String subscriptionCanceled(SubscriptionWebhookEvent subscriptionCanceled) {
                    return MessageFormat.format("SubscriptionCanceled event received {0}", subscriptionCanceled.toString());
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

