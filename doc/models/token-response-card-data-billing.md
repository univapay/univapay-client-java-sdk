
# Token Response Card Data Billing

Token Response Card Data Billing schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseCardDataBilling`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Line1` | `String` | Optional | Primary street address line. | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | Secondary street address line. | String getLine2() | setLine2(String line2) |
| `State` | `String` | Optional | State or prefecture. | String getState() | setState(String state) |
| `City` | `String` | Optional | City or locality. | String getCity() | setCity(String city) |
| `Country` | `String` | Optional | Country code. | String getCountry() | setCountry(String country) |
| `Zip` | `String` | Optional | Postal code. | String getZip() | setZip(String zip) |
| `PhoneNumber` | [`TokenResponsePhoneNumber`](../../doc/models/token-response-phone-number.md) | Optional | Token Response Phone Number schema. | TokenResponsePhoneNumber getPhoneNumber() | setPhoneNumber(TokenResponsePhoneNumber phoneNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponseCardDataBilling;
import com.univapay.api.models.TokenResponsePhoneNumber;

TokenResponseCardDataBilling tokenResponseCardDataBilling = new TokenResponseCardDataBilling.Builder()
    .line1("1-1-1")
    .line2("Shibakoen")
    .state("Tokyo")
    .city("Minato")
    .country("JP")
    .zip("105-0011")
    .phoneNumber(new TokenResponsePhoneNumber.Builder()
        .countryCode(81)
        .localNumber("08012341234")
        .build())
    .build();
```

