
# Refund Webhook Callback

Webhook envelope whose `data` payload is a Refund resource.

*This model accepts additional fields of type Object.*

## Structure

`RefundWebhookCallback`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | [`RefundEvent`](../../doc/models/refund-event.md) | Optional | Event type discriminator — always `refund_finished` for this callback. | RefundEvent getEvent() | setEvent(RefundEvent event) |
| `Id` | `UUID` | Required | Unique ID of this webhook delivery. | UUID getId() | setId(UUID id) |
| `CreatedOn` | `LocalDateTime` | Required | Timestamp when the event was fired. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Data` | [`Refund`](../../doc/models/refund.md) | Optional | Represents a refund issued against a charge. | Refund getData() | setData(Refund data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.Refund;
import com.univapay.api.models.RefundEvent;
import com.univapay.api.models.RefundReasonResponse;
import com.univapay.api.models.RefundStatus;
import com.univapay.api.models.RefundWebhookCallback;
import java.io.IOException;
import java.util.UUID;

RefundWebhookCallback refundWebhookCallback = new RefundWebhookCallback.Builder(
    UUID.fromString("11ef0000-0000-4000-8000-000000000001"),
    DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z")
)
.event(RefundEvent.REFUND_FINISHED)
.data(new Refund.Builder()
        .id(UUID.fromString("b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6"))
        .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
        .chargeId(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
        .status(RefundStatus.SUCCESSFUL)
        .amount(1000)
        .currency("JPY")
        .amountFormatted(1000D)
        .reason(RefundReasonResponse.CUSTOMER_REQUEST)
        .message("Customer returned item")
        .error(null)
        .metadata(new GenericMetadata.Builder()
            .orderId("order_12345")
            .build())
        .mode(ChargeMode.LIVE)
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:36:00.000000Z"))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

