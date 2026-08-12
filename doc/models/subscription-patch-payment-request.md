
# Subscription Patch Payment Request

Request body for updating a scheduled payment. All fields are optional. Omitted fields are left unchanged.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionPatchPaymentRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DueDate` | `LocalDate` | Optional | New due date for this payment (YYYY-MM-DD).  Only available to merchants with permission to edit payment dates. | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `IsPaid` | `Boolean` | Optional | Mark this payment as paid. Setting to `true` will trigger scheduling  of the next payment in the cycle. | Boolean getIsPaid() | setIsPaid(Boolean isPaid) |
| `TerminateWithStatus` | [`SubscriptionTerminateWithStatus`](../../doc/models/subscription-terminate-with-status.md) | Optional | Schedule a status transition on a payment's due date. Set to `suspended` or `canceled` to schedule termination. Send `null` to cancel a previously scheduled transition. | SubscriptionTerminateWithStatus getTerminateWithStatus() | setTerminateWithStatus(SubscriptionTerminateWithStatus terminateWithStatus) |
| `RetryInterval` | `String` | Optional | ISO-8601 Duration override for the retry interval on a scheduled payment (for example `P3D`). Send `null` to clear. | String getRetryInterval() | setRetryInterval(String retryInterval) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.SubscriptionPatchPaymentRequest;

SubscriptionPatchPaymentRequest subscriptionPatchPaymentRequest = new SubscriptionPatchPaymentRequest.Builder()
    .dueDate(DateTimeHelper.fromSimpleDate("2026-09-01"))
    .isPaid(false)
    .terminateWithStatus(null)
    .retryInterval("P3D")
    .build();
```

