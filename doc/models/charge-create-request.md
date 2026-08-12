
# Charge Create Request

Request payload for creating a charge.

*This model accepts additional fields of type Object.*

## Structure

`ChargeCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionTokenId` | `UUID` | Required | Transaction token identifier. | UUID getTransactionTokenId() | setTransactionTokenId(UUID transactionTokenId) |
| `Amount` | `int` | Required | The charge amount. | int getAmount() | setAmount(int amount) |
| `Currency` | `String` | Required | ISO-4217 currency code.<br><br>**Default**: `"JPY"` | String getCurrency() | setCurrency(String currency) |
| `Capture` | `Boolean` | Optional | If false, creates an Authorization only (Hold).<br><br>**Default**: `true` | Boolean getCapture() | setCapture(Boolean capture) |
| `CaptureAt` | `LocalDateTime` | Optional | Auto-capture date for cards, or payment deadline for Konbini/Bank. Note: Time specification is ignored for 7-Eleven, Seicomart, and PayEasy. | LocalDateTime getCaptureAt() | setCaptureAt(LocalDateTime captureAt) |
| `MerchantTransactionId` | `String` | Optional | Unique transaction ID for the merchant.  Required/used by specific brands like we_chat, we_chat_mpm, and we_chat_online.<br><br>**Constraints**: *Maximum Length*: `32` | String getMerchantTransactionId() | setMerchantTransactionId(String merchantTransactionId) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `ClientMetadata` | [`ChargeCreateRequestClientMetadata`](../../doc/models/charge-create-request-client-metadata.md) | Optional | Charge Create Request Client Metadata schema. | ChargeCreateRequestClientMetadata getClientMetadata() | setClientMetadata(ChargeCreateRequestClientMetadata clientMetadata) |
| `Redirect` | [`ChargeCreateRequestRedirect`](../../doc/models/charge-create-request-redirect.md) | Optional | Charge Create Request Redirect schema. | ChargeCreateRequestRedirect getRedirect() | setRedirect(ChargeCreateRequestRedirect redirect) |
| `ThreeDs` | [`ChargeCreateRequestThreeDs`](../../doc/models/charge-create-request-three-ds.md) | Optional | Charge Create Request Three Ds schema. | ChargeCreateRequestThreeDs getThreeDs() | setThreeDs(ChargeCreateRequestThreeDs threeDs) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeCreateRequest;
import java.util.UUID;

ChargeCreateRequest chargeCreateRequest = new ChargeCreateRequest.Builder(
    UUID.fromString("af834c88-7a8f-47ac-aee9-0386a0f98b0d"),
    1000,
    "JPY"
)
.build();
```

