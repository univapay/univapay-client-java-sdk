
# Transaction Token Create Request Metadata

A free-form dictionary for custom metadata.

*This model accepts additional fields of type [TransactionTokenCreateMetadataProps](../../doc/models/containers/transaction-token-create-metadata-props.md).*

## Structure

`TransactionTokenCreateRequestMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UnivapayReferenceId` | `String` | Optional | Any arbitrary value (Free format). | String getUnivapayReferenceId() | setUnivapayReferenceId(String univapayReferenceId) |
| `UnivapayCustomerId` | `UUID` | Optional | Customer ID. | UUID getUnivapayCustomerId() | setUnivapayCustomerId(UUID univapayCustomerId) |
| `UnivapayName` | `String` | Optional | Consumer name passed to payment processors that require it (e.g., konbini, bank transfer). | String getUnivapayName() | setUnivapayName(String univapayName) |
| `UnivapayPhoneNumber` | `String` | Optional | Consumer phone number passed to payment processors that require it. | String getUnivapayPhoneNumber() | setUnivapayPhoneNumber(String univapayPhoneNumber) |
| `AdditionalProperties` | [`Map<String, TransactionTokenCreateMetadataProps>`](../../doc/models/containers/transaction-token-create-metadata-props.md) | Optional | Transaction Token Create Metadata Props schema. | TransactionTokenCreateMetadataProps getAdditionalProperty(String key) | additionalProperty(String key, TransactionTokenCreateMetadataProps value) |

## Example

```java
import com.univapay.api.models.TransactionTokenCreateRequestMetadata;
import java.util.UUID;

TransactionTokenCreateRequestMetadata transactionTokenCreateRequestMetadata = new TransactionTokenCreateRequestMetadata.Builder()
    .univapayReferenceId("ref-998877")
    .univapayCustomerId(UUID.fromString("0fd29949-07d5-4a91-8eaf-fbce0897d944"))
    .build();
```

