
# Token Response Paidy Data Shipping Address

Shipping address returned for a Paidy token.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponsePaidyDataShippingAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Zip` | `String` | Optional | Japanese postal code. | String getZip() | setZip(String zip) |
| `Line1` | `String` | Optional | Primary street address line. | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | Secondary street address line. | String getLine2() | setLine2(String line2) |
| `City` | `String` | Optional | City or locality. | String getCity() | setCity(String city) |
| `State` | `String` | Optional | State or prefecture. | String getState() | setState(String state) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponsePaidyDataShippingAddress;

TokenResponsePaidyDataShippingAddress tokenResponsePaidyDataShippingAddress = new TokenResponsePaidyDataShippingAddress.Builder()
    .zip("105-0011")
    .line1("1-1-1")
    .city("Minato")
    .state("Tokyo")
    .build();
```

