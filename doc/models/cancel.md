
# Cancel

Represents a cancellation request for a charge.

*This model accepts additional fields of type Object.*

## Structure

`Cancel`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier for the cancel. | UUID getId() | setId(UUID id) |
| `ChargeId` | `UUID` | Optional | ID of the charge this cancel is associated with. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `StoreId` | `UUID` | Optional | ID of the store. | UUID getStoreId() | setStoreId(UUID storeId) |
| `Status` | [`CancelStatus`](../../doc/models/cancel-status.md) | Optional | Current status of the cancel operation. | CancelStatus getStatus() | setStatus(CancelStatus status) |
| `Error` | [`PaymentError`](../../doc/models/payment-error.md) | Optional | Payment error details, or null if successful. | PaymentError getError() | setError(PaymentError error) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Mode` | [`ChargeMode`](../../doc/models/charge-mode.md) | Optional | Charge Mode schema. | ChargeMode getMode() | setMode(ChargeMode mode) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the cancel was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the cancel was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Cancel;
import com.univapay.api.models.CancelStatus;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.PaymentError;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;
import java.util.UUID;

Cancel cancel = new Cancel.Builder()
    .id(UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef1234567890"))
    .chargeId(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
    .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
    .status(CancelStatus.PENDING)
    .error(new PaymentError.Builder()
        .code(301)
        .message("Card number error.")
        .detail("The provided card number failed validation.")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .univapayName("univapay-name8")
        .univapayPhoneNumber("univapay-phone-number2")
    .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
            "String4"
        ))
        .build())
    .mode(ChargeMode.LIVE)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:36:00.000000Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

