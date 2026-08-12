
# Merchant Webhook Limit Charge by Card Configuration

Per-card velocity limit configuration.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookLimitChargeByCardConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `QuantityOfCharges` | `Integer` | Optional | Maximum number of charges allowed in the time window. | Integer getQuantityOfCharges() | setQuantityOfCharges(Integer quantityOfCharges) |
| `DurationWindow` | `String` | Optional | ISO-8601 duration for the rolling window. | String getDurationWindow() | setDurationWindow(String durationWindow) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookLimitChargeByCardConfiguration;

MerchantWebhookLimitChargeByCardConfiguration merchantWebhookLimitChargeByCardConfiguration = new MerchantWebhookLimitChargeByCardConfiguration.Builder()
    .quantityOfCharges(5)
    .durationWindow("PT24H")
    .build();
```

