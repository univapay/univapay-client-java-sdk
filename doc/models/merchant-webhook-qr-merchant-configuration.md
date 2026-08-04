
# Merchant Webhook Qr Merchant Configuration

QR merchant payment settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookQrMerchantConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables QR merchant payment flows. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.MerchantWebhookQrMerchantConfiguration;
import java.io.IOException;

MerchantWebhookQrMerchantConfiguration merchantWebhookQrMerchantConfiguration = new MerchantWebhookQrMerchantConfiguration.Builder()
    .enabled(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

