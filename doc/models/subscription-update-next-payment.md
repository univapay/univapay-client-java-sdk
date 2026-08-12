
# Subscription Update Next Payment

Fields that can be updated on the next scheduled payment.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionUpdateNextPayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DueDate` | `LocalDate` | Optional | Next payment date (YYYY-MM-DD).  Note: Only available for merchants permitted to edit next payment dates. | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `Amount` | `Integer` | Optional | Next payment amount. Not available for limited-cycle subscriptions.  Only available for permitted merchants.  This does not change subsequent cycle amounts. | Integer getAmount() | setAmount(Integer amount) |
| `TerminateWithStatus` | [`SubscriptionTerminateWithStatus`](../../doc/models/subscription-terminate-with-status.md) | Optional | Schedule a status transition on a payment's due date. Set to `suspended` or `canceled` to schedule termination. Send `null` to cancel a previously scheduled transition. | SubscriptionTerminateWithStatus getTerminateWithStatus() | setTerminateWithStatus(SubscriptionTerminateWithStatus terminateWithStatus) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionUpdateNextPayment;

SubscriptionUpdateNextPayment subscriptionUpdateNextPayment = new SubscriptionUpdateNextPayment.Builder()
    .build();
```

