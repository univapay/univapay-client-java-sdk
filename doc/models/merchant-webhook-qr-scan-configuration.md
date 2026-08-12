
# Merchant Webhook Qr Scan Configuration

QR scan payment settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookQrScanConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables QR scan payments. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `ForbiddenQrScanGateways` | `List<String>` | Optional | QR scan gateways disabled for the merchant. | List<String> getForbiddenQrScanGateways() | setForbiddenQrScanGateways(List<String> forbiddenQrScanGateways) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookQrScanConfiguration;
import java.util.Arrays;

MerchantWebhookQrScanConfiguration merchantWebhookQrScanConfiguration = new MerchantWebhookQrScanConfiguration.Builder()
    .enabled(true)
    .forbiddenQrScanGateways(Arrays.asList(
        "wechat"
    ))
    .build();
```

