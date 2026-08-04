
# Refund

Represents a refund issued against a charge.

*This model accepts additional fields of type Object.*

## Structure

`Refund`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier. | UUID getId() | setId(UUID id) |
| `StoreId` | `UUID` | Optional | Store identifier. | UUID getStoreId() | setStoreId(UUID storeId) |
| `ChargeId` | `UUID` | Optional | Charge identifier. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `Status` | [`RefundStatus`](../../doc/models/refund-status.md) | Optional | Current status of the refund. `pending`: The refund has been created and is being processed. `successful`: The refund was processed successfully. `failed`: The refund was rejected by the gateway. `error`: An unexpected error occurred during processing. | RefundStatus getStatus() | setStatus(RefundStatus status) |
| `Amount` | `Integer` | Optional | Refund amount in the smallest currency unit (e.g., cents for USD, yen for JPY). | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. Must match the charged currency. | String getCurrency() | setCurrency(String currency) |
| `AmountFormatted` | `Double` | Optional | Refund amount formatted for display. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `Reason` | [`RefundReasonResponse`](../../doc/models/refund-reason-response.md) | Optional | Refund reason returned by the API, or `null` when unset. | RefundReasonResponse getReason() | setReason(RefundReasonResponse reason) |
| `Message` | `String` | Optional | Optional free-text note about the refund. | String getMessage() | setMessage(String message) |
| `Error` | [`PaymentError`](../../doc/models/payment-error.md) | Optional | Payment error details, or null if successful. | PaymentError getError() | setError(PaymentError error) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Mode` | [`ChargeMode`](../../doc/models/charge-mode.md) | Optional | Charge Mode schema. | ChargeMode getMode() | setMode(ChargeMode mode) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.PaymentError;
import com.univapay.api.models.Refund;
import com.univapay.api.models.RefundReasonResponse;
import com.univapay.api.models.RefundStatus;
import java.io.IOException;
import java.util.UUID;

Refund refund = new Refund.Builder()
    .id(UUID.fromString("b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6"))
    .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
    .chargeId(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
    .status(RefundStatus.PENDING)
    .amount(1000)
    .currency("JPY")
    .amountFormatted(1000D)
    .reason(RefundReasonResponse.CUSTOMER_REQUEST)
    .message("Customer returned item")
    .error(new PaymentError.Builder()
        .code(301)
        .message("Card number error.")
        .detail("The provided card number failed validation.")
        .build())
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .build())
    .mode(ChargeMode.LIVE)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
    .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:36:00Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

