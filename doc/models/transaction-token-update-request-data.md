
# Transaction Token Update Request Data

Transaction Token Update Request Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TransactionTokenUpdateRequestData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Cvv` | `String` | Optional | Update if RECURRING_USAGE_REQUIRES_CVV error occurs. | String getCvv() | setCvv(String cvv) |
| `Cardholder` | `String` | Optional | Cardholder name. | String getCardholder() | setCardholder(String cardholder) |
| `CardNumber` | `String` | Optional | Card number. | String getCardNumber() | setCardNumber(String cardNumber) |
| `ExpMonth` | `Integer` | Optional | Card expiration month. | Integer getExpMonth() | setExpMonth(Integer expMonth) |
| `ExpYear` | `Integer` | Optional | Card expiration year. | Integer getExpYear() | setExpYear(Integer expYear) |
| `Line1` | `String` | Optional | Primary street address line. | String getLine1() | setLine1(String line1) |
| `Line2` | `String` | Optional | Secondary street address line. | String getLine2() | setLine2(String line2) |
| `State` | `String` | Optional | State or prefecture. | String getState() | setState(String state) |
| `City` | `String` | Optional | City or locality. | String getCity() | setCity(String city) |
| `Country` | `String` | Optional | Country code. | String getCountry() | setCountry(String country) |
| `Zip` | `String` | Optional | Postal code. | String getZip() | setZip(String zip) |
| `PhoneNumber` | [`TransactionTokenUpdateRequestDataPhoneNumber`](../../doc/models/transaction-token-update-request-data-phone-number.md) | Optional | Transaction Token Update Request Data Phone Number schema. | TransactionTokenUpdateRequestDataPhoneNumber getPhoneNumber() | setPhoneNumber(TransactionTokenUpdateRequestDataPhoneNumber phoneNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TransactionTokenUpdateRequestData;
import com.univapay.api.models.TransactionTokenUpdateRequestDataPhoneNumber;
import java.io.IOException;

TransactionTokenUpdateRequestData transactionTokenUpdateRequestData = new TransactionTokenUpdateRequestData.Builder()
    .cvv("123")
    .cardholder("TARO YAMADA")
    .cardNumber("4242424242424242")
    .expMonth(12)
    .expYear(2026)
    .line1("1-1-1")
    .line2("Shibakoen")
    .state("Tokyo")
    .city("Minato")
    .country("JP")
    .zip("105-0011")
    .phoneNumber(new TransactionTokenUpdateRequestDataPhoneNumber.Builder()
        .countryCode("81")
        .localNumber("08012341234")
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

