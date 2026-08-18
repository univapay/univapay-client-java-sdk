
# Checkout Ec Products Configuration

Product-related EC checkout settings.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutEcProductsConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether EC product line items are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutEcProductsConfiguration;
import java.io.IOException;

CheckoutEcProductsConfiguration checkoutEcProductsConfiguration = new CheckoutEcProductsConfiguration.Builder()
    .enabled(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

