
# Refund Update Request

Request body for updating a refund. All fields are optional. Omitted fields are left unchanged.

*This model accepts additional fields of type Object.*

## Structure

`RefundUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Message` | `String` | Optional | Update or clear the refund note. Send `null` to remove. | String getMessage() | setMessage(String message) |
| `Reason` | [`RefundReasonRequest`](../../doc/models/refund-reason-request.md) | Optional | Merchant-settable refund reason, or `null` to remove it during update. | RefundReasonRequest getReason() | setReason(RefundReasonRequest reason) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.RefundUpdateRequest;

RefundUpdateRequest refundUpdateRequest = new RefundUpdateRequest.Builder()
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .build())
    .message("Updated reason note")
    .build();
```

