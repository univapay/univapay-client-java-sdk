
# Suspend Schedule Settings

Schedule-related settings.

*This model accepts additional fields of type Object.*

## Structure

`SuspendScheduleSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TerminationMode` | [`SubscriptionTerminationMode`](../../doc/models/subscription-termination-mode.md) | Optional | Subscription Termination Mode schema.<br><br>**Default**: `SubscriptionTerminationMode.IMMEDIATE` | SubscriptionTerminationMode getTerminationMode() | setTerminationMode(SubscriptionTerminationMode terminationMode) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.SubscriptionTerminationMode;
import com.univapay.api.models.SuspendScheduleSettings;
import java.io.IOException;

SuspendScheduleSettings suspendScheduleSettings = new SuspendScheduleSettings.Builder()
    .terminationMode(SubscriptionTerminationMode.IMMEDIATE)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

