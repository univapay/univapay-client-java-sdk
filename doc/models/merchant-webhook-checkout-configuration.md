
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
import com.univapay.api.ApiHelper;
import com.univapay.api.models.MerchantWebhookCheckoutConfiguration;
import com.univapay.api.models.MerchantWebhookCheckoutToggle;
import java.io.IOException;

MerchantWebhookCheckoutConfiguration merchantWebhookCheckoutConfiguration = new MerchantWebhookCheckoutConfiguration.Builder()
    .ecEmail(new MerchantWebhookCheckoutToggle.Builder()
        .enabled(true)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .ecProducts(new MerchantWebhookCheckoutToggle.Builder()
        .enabled(true)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

