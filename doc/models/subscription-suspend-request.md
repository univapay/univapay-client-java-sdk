
# Subscription Suspend Request

Request body for suspending a subscription. The `schedule_settings.termination_mode`  field controls when the suspension takes effect.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionSuspendRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ScheduleSettings` | [`SuspendScheduleSettings`](../../doc/models/suspend-schedule-settings.md) | Optional | Schedule-related settings. | SuspendScheduleSettings getScheduleSettings() | setScheduleSettings(SuspendScheduleSettings scheduleSettings) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionSuspendRequest;
import com.univapay.api.models.SubscriptionTerminationMode;
import com.univapay.api.models.SuspendScheduleSettings;

SubscriptionSuspendRequest subscriptionSuspendRequest = new SubscriptionSuspendRequest.Builder()
    .scheduleSettings(new SuspendScheduleSettings.Builder()
        .terminationMode(SubscriptionTerminationMode.ON_NEXT_PAYMENT)
        .build())
    .build();
```

