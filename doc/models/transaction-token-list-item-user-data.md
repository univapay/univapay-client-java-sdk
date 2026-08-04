
# Transaction Token List Item User Data

Transaction Token List Item User Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TransactionTokenListItemUserData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardholderName` | `String` | Optional | Cardholder name value. | String getCardholderName() | setCardholderName(String cardholderName) |
| `Email` | `String` | Optional | Customer email address. | String getEmail() | setEmail(String email) |
| `Brand` | `String` | Optional | Brand or network name. | String getBrand() | setBrand(String brand) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TransactionTokenListItemUserData;
import java.io.IOException;

TransactionTokenListItemUserData transactionTokenListItemUserData = new TransactionTokenListItemUserData.Builder()
    .cardholderName("TARO YAMADA")
    .email("user@example.com")
    .brand("visa")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

