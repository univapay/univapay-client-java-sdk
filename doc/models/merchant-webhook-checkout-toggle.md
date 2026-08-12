
# Merchant Webhook Checkout Toggle

Checkout feature toggle.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookCheckoutToggle`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables this checkout field in hosted payment flows. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookCheckoutToggle;

MerchantWebhookCheckoutToggle merchantWebhookCheckoutToggle = new MerchantWebhookCheckoutToggle.Builder()
    .enabled(true)
    .build();
```

