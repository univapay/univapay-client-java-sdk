
# Bank Transfer Status Webhook Callback

Webhook envelope whose `data` payload is a BankTransferStatusData resource.

*This model accepts additional fields of type Object.*

## Structure

`BankTransferStatusWebhookCallback`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | [`BankTransferEvent`](../../doc/models/bank-transfer-event.md) | Optional | Event type discriminator — always `bank_transfer_status_updated` for this callback. | BankTransferEvent getEvent() | setEvent(BankTransferEvent event) |
| `Id` | `UUID` | Required | Unique ID of this webhook delivery. | UUID getId() | setId(UUID id) |
| `CreatedOn` | `LocalDateTime` | Required | Timestamp when the event was fired. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Data` | [`BankTransferStatusData`](../../doc/models/bank-transfer-status-data.md) | Optional | Data payload for `bank_transfer_status_updated` webhook events. Contains the bank transfer extension fields inlined alongside amount and metadata. | BankTransferStatusData getData() | setData(BankTransferStatusData data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.BankTransferEvent;
import com.univapay.api.models.BankTransferPaymentStatus;
import com.univapay.api.models.BankTransferStatusData;
import com.univapay.api.models.BankTransferStatusWebhookCallback;
import com.univapay.api.models.GenericMetadata;
import java.io.IOException;
import java.util.UUID;

BankTransferStatusWebhookCallback bankTransferStatusWebhookCallback = new BankTransferStatusWebhookCallback.Builder(
    UUID.fromString("11ef0000-0000-4000-8000-000000000001"),
    DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z")
)
.event(BankTransferEvent.BANK_TRANSFER_STATUS_UPDATED)
.data(new BankTransferStatusData.Builder()
        .id(UUID.fromString("11ef0000-0000-4000-8000-000000000002"))
        .chargeId(UUID.fromString("11ef0000-0000-4000-8000-000000000001"))
        .paymentStatus(BankTransferPaymentStatus.EXACT)
        .latestDepositDate(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .latestDepositAmount(1000)
        .balance(0)
        .currency("JPY")
        .amount(1000)
        .amountDifference(0)
        .tokenMetadata(new GenericMetadata.Builder()
            .orderId("12345")
            .build())
        .chargeMetadata(new GenericMetadata.Builder()
            .orderId("order_12345")
            .build())
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

