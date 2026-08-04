
# Subscription Schedule Settings

Schedule settings applied to a subscription.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionScheduleSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StartOn` | `LocalDate` | Optional | Date when the recurring schedule starts (YYYY-MM-DD). | LocalDate getStartOn() | setStartOn(LocalDate startOn) |
| `ZoneId` | `String` | Optional | IANA Timezone ID. | String getZoneId() | setZoneId(String zoneId) |
| `PreserveEndOfMonth` | `Boolean` | Optional | If true, subsequent charges will always occur on the last day of the month. | Boolean getPreserveEndOfMonth() | setPreserveEndOfMonth(Boolean preserveEndOfMonth) |
| `RetryInterval` | `String` | Optional | ISO-8601 Duration for retry interval if payment fails (e.g., P5D). | String getRetryInterval() | setRetryInterval(String retryInterval) |
| `TerminationMode` | [`SubscriptionTerminationMode`](../../doc/models/subscription-termination-mode.md) | Optional | Subscription Termination Mode schema.<br><br>**Default**: `SubscriptionTerminationMode.IMMEDIATE` | SubscriptionTerminationMode getTerminationMode() | setTerminationMode(SubscriptionTerminationMode terminationMode) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.SubscriptionScheduleSettings;
import com.univapay.api.models.SubscriptionTerminationMode;
import java.io.IOException;

SubscriptionScheduleSettings subscriptionScheduleSettings = new SubscriptionScheduleSettings.Builder()
    .startOn(DateTimeHelper.fromSimpleDate("2016-03-13"))
    .zoneId("zone_id0")
    .preserveEndOfMonth(false)
    .retryInterval("retry_interval4")
    .terminationMode(SubscriptionTerminationMode.IMMEDIATE)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

