
# Merchant Webhook Online Configuration

Online payment settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookOnlineConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables online redirect and wallet payment flows. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.MerchantWebhookOnlineConfiguration;
import java.io.IOException;

MerchantWebhookOnlineConfiguration merchantWebhookOnlineConfiguration = new MerchantWebhookOnlineConfiguration.Builder()
    .enabled(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

