
# Subscription Update Schedule Settings

Schedule settings that can be updated on a subscription.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionUpdateScheduleSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TerminationMode` | [`SubscriptionTerminationMode`](../../doc/models/subscription-termination-mode.md) | Optional | Subscription Termination Mode schema.<br><br>**Default**: `SubscriptionTerminationMode.IMMEDIATE` | SubscriptionTerminationMode getTerminationMode() | setTerminationMode(SubscriptionTerminationMode terminationMode) |
| `StartOn` | `LocalDate` | Optional | Subscription start date (YYYY-MM-DD). Used to change the first actual charge date for subscriptions that initially only registered a payment method. Must be in the future; only available before the subscription has more than one paid payment. | LocalDate getStartOn() | setStartOn(LocalDate startOn) |
| `PreserveEndOfMonth` | `Boolean` | Optional | If true, subsequent charges will always occur on the last day of the month. | Boolean getPreserveEndOfMonth() | setPreserveEndOfMonth(Boolean preserveEndOfMonth) |
| `RetryInterval` | `String` | Optional | ISO-8601 Duration for retry interval if payment fails  (e.g., P3D for 3 days, PT48H for 48 hours). | String getRetryInterval() | setRetryInterval(String retryInterval) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionUpdateScheduleSettings;

SubscriptionUpdateScheduleSettings subscriptionUpdateScheduleSettings = new SubscriptionUpdateScheduleSettings.Builder()
    .build();
```

