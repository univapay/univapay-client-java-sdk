
# Refund Webhook Callback Extension

Refund-specific webhook payload extension.

*This model accepts additional fields of type Object.*

## Structure

`RefundWebhookCallbackExtension`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`Refund`](../../doc/models/refund.md) | Optional | Represents a refund issued against a charge. | Refund getData() | setData(Refund data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.Refund;
import com.univapay.api.models.RefundReasonResponse;
import com.univapay.api.models.RefundStatus;
import com.univapay.api.models.RefundWebhookCallbackExtension;
import java.util.UUID;

RefundWebhookCallbackExtension refundWebhookCallbackExtension = new RefundWebhookCallbackExtension.Builder()
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
        .build())
    .build();
```

