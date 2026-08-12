
# Token Response Phone Number

Token Response Phone Number schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponsePhoneNumber`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryCode` | `Integer` | Optional | Returned as an integer in the response. | Integer getCountryCode() | setCountryCode(Integer countryCode) |
| `LocalNumber` | `String` | Optional | Local phone number. | String getLocalNumber() | setLocalNumber(String localNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponsePhoneNumber;

TokenResponsePhoneNumber tokenResponsePhoneNumber = new TokenResponsePhoneNumber.Builder()
    .countryCode(81)
    .localNumber("08012341234")
    .build();
```

