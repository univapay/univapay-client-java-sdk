
# Checkout Paidy Configuration

Paidy payment feature toggle.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutPaidyConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether Paidy payments are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutPaidyConfiguration;
import java.io.IOException;

CheckoutPaidyConfiguration checkoutPaidyConfiguration = new CheckoutPaidyConfiguration.Builder()
    .enabled(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

