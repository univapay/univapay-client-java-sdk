
# Merchant Webhook Paidy Configuration

Paidy payment settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookPaidyConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables Paidy payments. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookPaidyConfiguration;

MerchantWebhookPaidyConfiguration merchantWebhookPaidyConfiguration = new MerchantWebhookPaidyConfiguration.Builder()
    .enabled(false)
    .build();
```

