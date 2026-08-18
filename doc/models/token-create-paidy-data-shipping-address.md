
# Token Create Paidy Data Shipping Address

Shipping address for a Paidy token. `zip` is required; the server additionally requires at least one of `line1`, `line2`, `city`, or `state` to be present (not enforceable at the schema level).

*This model accepts additional fields of type Object.*

## Structure

`TokenCreatePaidyDataShippingAddress`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Zip` | `String` | Required | Japanese postal code (e.g., '105-0011'). | String getZip() | setZip(String zip) |
| `Line1` | `String` | Optional | Primary street address line. | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | Secondary street address line. | String getLine2() | setLine2(String line2) |
| `City` | `String` | Optional | City or locality. | String getCity() | setCity(String city) |
| `State` | `String` | Optional | State or prefecture. | String getState() | setState(String state) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenCreatePaidyDataShippingAddress;

TokenCreatePaidyDataShippingAddress tokenCreatePaidyDataShippingAddress = new TokenCreatePaidyDataShippingAddress.Builder(
    "105-0011"
)
.line1("1-1-1")
.city("Minato")
.state("Tokyo")
.build();
```

