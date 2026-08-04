
# Merchant Webhook Limit Refund by Sales Configuration

Refund-limiting configuration based on sales history.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookLimitRefundBySalesConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables sales-based refund limit checks. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Period` | `String` | Optional | Sales aggregation period used to evaluate refund limits. | String getPeriod() | setPeriod(String period) |
| `RollingWindow` | `Boolean` | Optional | Uses a rolling window instead of fixed calendar periods. | Boolean getRollingWindow() | setRollingWindow(Boolean rollingWindow) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.MerchantWebhookLimitRefundBySalesConfiguration;
import java.io.IOException;

MerchantWebhookLimitRefundBySalesConfiguration merchantWebhookLimitRefundBySalesConfiguration = new MerchantWebhookLimitRefundBySalesConfiguration.Builder()
    .enabled(true)
    .period("monthly")
    .rollingWindow(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

