
# Token Create Card Data

Token Create Card Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreateCardData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Cardholder` | `String` | Optional | Cardholder name. | String getCardholder() | setCardholder(String cardholder) |
| `CardNumber` | `String` | Required | Card number. | String getCardNumber() | setCardNumber(String cardNumber) |
| `ExpMonth` | `String` | Required | Card expiration month. | String getExpMonth() | setExpMonth(String expMonth) |
| `ExpYear` | `String` | Required | Card expiration year. | String getExpYear() | setExpYear(String expYear) |
| `Cvv` | `String` | Optional | Card security code. | String getCvv() | setCvv(String cvv) |
| `Line1` | `String` | Optional | Primary street address line. | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | Secondary street address line. | String getLine2() | setLine2(String line2) |
| `State` | `String` | Optional | State or prefecture. | String getState() | setState(String state) |
| `City` | `String` | Optional | City or locality. | String getCity() | setCity(String city) |
| `Country` | `String` | Optional | Country code. | String getCountry() | setCountry(String country) |
| `Zip` | `String` | Optional | Postal code. | String getZip() | setZip(String zip) |
| `PhoneNumber` | [`TokenCreatePhoneNumber`](../../doc/models/token-create-phone-number.md) | Optional | Token Create Phone Number schema. | TokenCreatePhoneNumber getPhoneNumber() | setPhoneNumber(TokenCreatePhoneNumber phoneNumber) |
| `CvvAuthorize` | [`TokenCreateCardDataCvvAuthorize`](../../doc/models/token-create-card-data-cvv-authorize.md) | Optional | Token Create Card Data Cvv Authorize schema. | TokenCreateCardDataCvvAuthorize getCvvAuthorize() | setCvvAuthorize(TokenCreateCardDataCvvAuthorize cvvAuthorize) |
| `ThreeDs` | [`TokenCreateCardDataThreeDs`](../../doc/models/token-create-card-data-three-ds.md) | Optional | Token Create Card Data Three Ds schema. | TokenCreateCardDataThreeDs getThreeDs() | setThreeDs(TokenCreateCardDataThreeDs threeDs) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TokenCreateCardData;
import java.io.IOException;

TokenCreateCardData tokenCreateCardData = new TokenCreateCardData.Builder(
    "4242424242424242",
    "12",
    "2026"
)
.cardholder("cardholder8")
.cvv("cvv0")
.line1("line14")
.line2("line26")
.state("state2")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

