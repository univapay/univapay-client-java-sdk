
# Checkout Convenience Configuration

Convenience-store (konbini) payment settings applied to checkout.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutConvenienceConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether convenience-store payments are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Expiration` | `String` | Optional | ISO-8601 duration before a convenience-store payment expires. | String getExpiration() | setExpiration(String expiration) |
| `ExpirationTimeShift` | [`ExpirationTimeShift`](../../doc/models/expiration-time-shift.md) | Optional | Time-of-day override applied when calculating expirations, shared by convenience-store and bank-transfer configuration. | ExpirationTimeShift getExpirationTimeShift() | setExpirationTimeShift(ExpirationTimeShift expirationTimeShift) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutConvenienceConfiguration;
import com.univapay.api.models.ExpirationTimeShift;
import java.io.IOException;

CheckoutConvenienceConfiguration checkoutConvenienceConfiguration = new CheckoutConvenienceConfiguration.Builder()
    .enabled(true)
    .expiration("PT720H")
    .expirationTimeShift(new ExpirationTimeShift.Builder()
        .value("value4")
        .enabled(false)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

