
# Merchant Webhook Convenience Configuration

Convenience-store payment settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookConvenienceConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables convenience-store payments. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Expiration` | `String` | Optional | ISO-8601 duration before convenience payment expiry. | String getExpiration() | setExpiration(String expiration) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.MerchantWebhookConvenienceConfiguration;
import java.io.IOException;

MerchantWebhookConvenienceConfiguration merchantWebhookConvenienceConfiguration = new MerchantWebhookConvenienceConfiguration.Builder()
    .enabled(true)
    .expiration("P3D")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

