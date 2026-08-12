
# Merchant Webhook Transfer Schedule Configuration

Transfer schedule configuration inherited by the merchant.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookTransferScheduleConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `WaitPeriod` | `String` | Optional | ISO-8601 period before charges become payable. | String getWaitPeriod() | setWaitPeriod(String waitPeriod) |
| `Period` | `String` | Optional | Transfer period selected for payouts. | String getPeriod() | setPeriod(String period) |
| `FullPeriodRequired` | `Boolean` | Optional | Whether the first transfer period must be fully completed. | Boolean getFullPeriodRequired() | setFullPeriodRequired(Boolean fullPeriodRequired) |
| `DayOfWeek` | `String` | Optional | Payout day of week when using weekly schedules. | String getDayOfWeek() | setDayOfWeek(String dayOfWeek) |
| `WeekOfMonth` | `Integer` | Optional | Week of month used by monthly schedules. | Integer getWeekOfMonth() | setWeekOfMonth(Integer weekOfMonth) |
| `DayOfMonth` | `Integer` | Optional | Day of month used by monthly schedules. | Integer getDayOfMonth() | setDayOfMonth(Integer dayOfMonth) |
| `WeeklyClosingDay` | `String` | Optional | Weekly closing day for balance aggregation. | String getWeeklyClosingDay() | setWeeklyClosingDay(String weeklyClosingDay) |
| `WeeklyPayoutDay` | `String` | Optional | Weekly payout day. | String getWeeklyPayoutDay() | setWeeklyPayoutDay(String weeklyPayoutDay) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookTransferScheduleConfiguration;

MerchantWebhookTransferScheduleConfiguration merchantWebhookTransferScheduleConfiguration = new MerchantWebhookTransferScheduleConfiguration.Builder()
    .waitPeriod("P7D")
    .period("weekly")
    .fullPeriodRequired(false)
    .weeklyClosingDay("sunday")
    .weeklyPayoutDay("friday")
    .build();
```

