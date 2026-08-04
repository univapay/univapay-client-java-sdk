## Subscription Handler

Subscription lifecycle events.

Events in this group are uniquely identified by the `event` field.

## Events

Events available in this group. Subscribe to receive webhook notifications when these events occur.

| Name | Description | Event Identifier |
|  --- | --- | --- |
| [subscriptionCreated](../../../doc/events/webhooks/subscription/subscription-created.md) | Fired when a new subscription is created and its first payment has been initiated. The `data` field contains the full Subscription object. | subscription_created |
| [subscriptionPayment](../../../doc/events/webhooks/subscription/subscription-payment.md) | Fired when a scheduled subscription payment is successfully processed. The `data` field contains the full Subscription object. | subscription_payment |
| [subscriptionCompleted](../../../doc/events/webhooks/subscription/subscription-completed.md) | Fired when a subscription completes all of its scheduled payments. The `data` field contains the full Subscription object. | subscription_completed |
| [subscriptionFailure](../../../doc/events/webhooks/subscription/subscription-failure.md) | Fired when a scheduled subscription payment fails. The `data` field contains the full Subscription object. | subscription_failure |
| [subscriptionCanceled](../../../doc/events/webhooks/subscription/subscription-canceled.md) | Fired when a subscription is cancelled before all payments complete. The `data` field contains the full Subscription object. | subscription_canceled |
| [subscriptionSuspended](../../../doc/events/webhooks/subscription/subscription-suspended.md) | Fired when a subscription is suspended (paused). The `data` field contains the full Subscription object. | subscription_suspended |

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
                public String subscriptionCreated(SubscriptionWebhookEvent subscriptionCreated) {
                    return MessageFormat.format("SubscriptionCreated event received {0}", subscriptionCreated.toString());
                }

                @Override
                public String subscriptionPayment(SubscriptionWebhookEvent subscriptionPayment) {
                    return MessageFormat.format("SubscriptionPayment event received {0}", subscriptionPayment.toString());
                }

                @Override
                public String subscriptionCompleted(SubscriptionWebhookEvent subscriptionCompleted) {
                    return MessageFormat.format("SubscriptionCompleted event received {0}", subscriptionCompleted.toString());
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

