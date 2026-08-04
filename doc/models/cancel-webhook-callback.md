
# Cancel Webhook Callback

Webhook envelope whose `data` payload is a Cancel resource.

*This model accepts additional fields of type Object.*

## Structure

`CancelWebhookCallback`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Event` | [`CancelEvent`](../../doc/models/cancel-event.md) | Optional | Event type discriminator — always `cancel_finished` for this callback. | CancelEvent getEvent() | setEvent(CancelEvent event) |
| `Id` | `UUID` | Required | Unique ID of this webhook delivery. | UUID getId() | setId(UUID id) |
| `CreatedOn` | `LocalDateTime` | Required | Timestamp when the event was fired. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Data` | [`Cancel`](../../doc/models/cancel.md) | Optional | Represents a cancellation request for a charge. | Cancel getData() | setData(Cancel data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Cancel;
import com.univapay.api.models.CancelEvent;
import com.univapay.api.models.CancelStatus;
import com.univapay.api.models.CancelWebhookCallback;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import java.io.IOException;
import java.util.UUID;

CancelWebhookCallback cancelWebhookCallback = new CancelWebhookCallback.Builder(
    UUID.fromString("11ef0000-0000-4000-8000-000000000001"),
    DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z")
)
.event(CancelEvent.CANCEL_FINISHED)
.data(new Cancel.Builder()
        .id(UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef1234567890"))
        .chargeId(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
        .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
        .status(CancelStatus.SUCCESSFUL)
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

