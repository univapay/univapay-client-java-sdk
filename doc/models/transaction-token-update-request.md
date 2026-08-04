
# Transaction Token Update Request

Request payload for updating a transaction token.

*This model accepts additional fields of type Object.*

## Structure

`TransactionTokenUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Email` | `String` | Optional | Customer email address. | String getEmail() | setEmail(String email) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Data` | [`TransactionTokenUpdateRequestData`](../../doc/models/transaction-token-update-request-data.md) | Optional | Transaction Token Update Request Data schema. | TransactionTokenUpdateRequestData getData() | setData(TransactionTokenUpdateRequestData data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.TransactionTokenUpdateRequest;
import com.univapay.api.models.TransactionTokenUpdateRequestData;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;

TransactionTokenUpdateRequest transactionTokenUpdateRequest = new TransactionTokenUpdateRequest.Builder()
    .email("new_email@test.com")
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .univapayName("univapay-name8")
        .univapayPhoneNumber("univapay-phone-number2")
    .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
            "String4"
        ))
        .build())
    .data(new TransactionTokenUpdateRequestData.Builder()
        .cvv("123")
        .cardholder("TARO YAMADA")
        .cardNumber("card_number6")
        .expMonth(12)
        .expYear(2028)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

