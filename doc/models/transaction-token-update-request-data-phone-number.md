
# Transaction Token Update Request Data Phone Number

Transaction Token Update Request Data Phone Number schema.

*This model accepts additional fields of type Object.*

## Structure

`TransactionTokenUpdateRequestDataPhoneNumber`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CountryCode` | `String` | Optional | Telephone country code. | String getCountryCode() | setCountryCode(String countryCode) |
| `LocalNumber` | `String` | Optional | Local phone number. | String getLocalNumber() | setLocalNumber(String localNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TransactionTokenUpdateRequestDataPhoneNumber;

TransactionTokenUpdateRequestDataPhoneNumber transactionTokenUpdateRequestDataPhoneNumber = new TransactionTokenUpdateRequestDataPhoneNumber.Builder()
    .countryCode("81")
    .localNumber("08012341234")
    .build();
```

