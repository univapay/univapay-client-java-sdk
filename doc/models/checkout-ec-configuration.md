
# Checkout Ec Configuration

EC checkout feature toggles for hosted email receipts and product line items.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutEcConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `EcEmail` | [`CheckoutEcEmailConfiguration`](../../doc/models/checkout-ec-email-configuration.md) | Optional | Email-related EC checkout settings. | CheckoutEcEmailConfiguration getEcEmail() | setEcEmail(CheckoutEcEmailConfiguration ecEmail) |
| `EcProducts` | [`CheckoutEcProductsConfiguration`](../../doc/models/checkout-ec-products-configuration.md) | Optional | Product-related EC checkout settings. | CheckoutEcProductsConfiguration getEcProducts() | setEcProducts(CheckoutEcProductsConfiguration ecProducts) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutEcConfiguration;
import com.univapay.api.models.CheckoutEcEmailConfiguration;
import com.univapay.api.models.CheckoutEcProductsConfiguration;
import java.io.IOException;

CheckoutEcConfiguration checkoutEcConfiguration = new CheckoutEcConfiguration.Builder()
    .ecEmail(new CheckoutEcEmailConfiguration.Builder()
        .enabled(false)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .ecProducts(new CheckoutEcProductsConfiguration.Builder()
        .enabled(false)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

