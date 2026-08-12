
# Cancel Webhook Callback Extension

Cancel-specific webhook payload extension.

*This model accepts additional fields of type Object.*

## Structure

`CancelWebhookCallbackExtension`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`Cancel`](../../doc/models/cancel.md) | Optional | Represents a cancellation request for a charge. | Cancel getData() | setData(Cancel data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Cancel;
import com.univapay.api.models.CancelStatus;
import com.univapay.api.models.CancelWebhookCallbackExtension;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import java.util.UUID;

CancelWebhookCallbackExtension cancelWebhookCallbackExtension = new CancelWebhookCallbackExtension.Builder()
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
        .build())
    .build();
```

