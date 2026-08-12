
# Merchant Webhook Checkout Configuration

Checkout field collection settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookCheckoutConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EcEmail` | [`MerchantWebhookCheckoutToggle`](../../doc/models/merchant-webhook-checkout-toggle.md) | Optional | Checkout feature toggle. | MerchantWebhookCheckoutToggle getEcEmail() | setEcEmail(MerchantWebhookCheckoutToggle ecEmail) |
| `EcProducts` | [`MerchantWebhookCheckoutToggle`](../../doc/models/merchant-webhook-checkout-toggle.md) | Optional | Checkout feature toggle. | MerchantWebhookCheckoutToggle getEcProducts() | setEcProducts(MerchantWebhookCheckoutToggle ecProducts) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookCheckoutConfiguration;
import com.univapay.api.models.MerchantWebhookCheckoutToggle;

MerchantWebhookCheckoutConfiguration merchantWebhookCheckoutConfiguration = new MerchantWebhookCheckoutConfiguration.Builder()
    .ecEmail(new MerchantWebhookCheckoutToggle.Builder()
        .enabled(true)
        .build())
    .ecProducts(new MerchantWebhookCheckoutToggle.Builder()
        .enabled(true)
        .build())
    .build();
```

