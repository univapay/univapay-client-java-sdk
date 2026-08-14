
# Transaction Token Create Request

Request payload for creating a transaction token, which represents a payment method to charge against.

*This model accepts additional fields of type Object.*

## Structure

`TransactionTokenCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentType` | [`TransactionTokenCreateRequestPaymentType`](../../doc/models/transaction-token-create-request-payment-type.md) | Required | Transaction Token Create Request Payment Type schema. | TransactionTokenCreateRequestPaymentType getPaymentType() | setPaymentType(TransactionTokenCreateRequestPaymentType paymentType) |
| `Type` | [`TransactionTokenCreateRequestType`](../../doc/models/transaction-token-create-request-type.md) | Required | Transaction Token Create Request Type schema. | TransactionTokenCreateRequestType getType() | setType(TransactionTokenCreateRequestType type) |
| `Email` | `String` | Optional | Customer email address. | String getEmail() | setEmail(String email) |
| `UsageLimit` | `String` | Optional | Usage limit applied to the token. | String getUsageLimit() | setUsageLimit(String usageLimit) |
| `IpAddress` | `String` | Optional | Consumer's IPv4 address. **Required** when `data.brand` is `we_chat_online` and `data.call_method` is `web` or `http_get`. | String getIpAddress() | setIpAddress(String ipAddress) |
| `Metadata` | [`TransactionTokenCreateRequestMetadata`](../../doc/models/transaction-token-create-request-metadata.md) | Optional | A free-form dictionary for custom metadata. | TransactionTokenCreateRequestMetadata getMetadata() | setMetadata(TransactionTokenCreateRequestMetadata metadata) |
| `Data` | [`TransactionTokenCreateRequestData`](../../doc/models/containers/transaction-token-create-request-data.md) | Required | Transaction Token Create Request Data schema. | TransactionTokenCreateRequestData getData() | setData(TransactionTokenCreateRequestData data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TokenCreateCardData;
import com.univapay.api.models.TransactionTokenCreateRequest;
import com.univapay.api.models.TransactionTokenCreateRequestMetadata;
import com.univapay.api.models.TransactionTokenCreateRequestPaymentType;
import com.univapay.api.models.TransactionTokenCreateRequestType;
import com.univapay.api.models.containers.TransactionTokenCreateMetadataProps;
import com.univapay.api.models.containers.TransactionTokenCreateRequestData;
import java.io.IOException;
import java.util.UUID;

TransactionTokenCreateRequest transactionTokenCreateRequest = new TransactionTokenCreateRequest.Builder(
    TransactionTokenCreateRequestPaymentType.CARD,
    TransactionTokenCreateRequestType.ONE_TIME,
    TransactionTokenCreateRequestData.fromTokenCreateCardData(
        new TokenCreateCardData.Builder(
            "4242424242424242",
            "12",
            "2026"
        )
        .cardholder("cardholder4")
        .cvv("cvv6")
        .line1("line10")
        .line2("line22")
        .state("state6")
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build()
    )
)
.email("user@example.com")
.usageLimit("daily")
.ipAddress("198.51.100.14")
.metadata(new TransactionTokenCreateRequestMetadata.Builder()
        .univapayReferenceId("ref-998877")
        .univapayCustomerId(UUID.fromString("0fd29949-07d5-4a91-8eaf-fbce0897d944"))
        .univapayName("univapay-name8")
        .univapayPhoneNumber("univapay-phone-number2")
    .additionalProperty("exampleAdditionalProperty", TransactionTokenCreateMetadataProps.fromString(
            "String8"
        ))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

