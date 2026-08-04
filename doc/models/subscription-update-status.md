
# Subscription Update Status

Update the subscription status.  `suspended`: Pause the subscription.  `unpaid`: Resume a suspended subscription.

## Enumeration

`SubscriptionUpdateStatus`

## Fields

| Name |
|  --- |
| `SUSPENDED` |
| `UNPAID` |

## Example

```java
import com.univapay.api.models.SubscriptionUpdateStatus;

SubscriptionUpdateStatus subscriptionUpdateStatus = SubscriptionUpdateStatus.SUSPENDED;
```

