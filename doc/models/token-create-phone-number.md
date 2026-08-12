
# Token Create Phone Number

Token Create Phone Number schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreatePhoneNumber`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryCode` | `String` | Required | Country code as string (e.g., '1' or '81'). | String getCountryCode() | setCountryCode(String countryCode) |
| `LocalNumber` | `String` | Required | Local phone number.<br><br>**Constraints**: *Maximum Length*: `15` | String getLocalNumber() | setLocalNumber(String localNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenCreatePhoneNumber;

TokenCreatePhoneNumber tokenCreatePhoneNumber = new TokenCreatePhoneNumber.Builder(
    "81",
    "08012341234"
)
.build();
```

