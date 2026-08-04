
# Refund Create Request

Request body for creating a refund against a successful charge. Konbini and bank transfer charges cannot be refunded.

*This model accepts additional fields of type Object.*

## Structure

`RefundCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Amount to refund in the smallest currency unit. Must be greater than 0 and not exceed the charged amount. Partial refunds are supported for most payment methods. | int getAmount() | setAmount(int amount) |
| `Currency` | `String` | Required | ISO-4217 currency code. Must exactly match the currency of the original charge. | String getCurrency() | setCurrency(String currency) |
| `Reason` | [`RefundReasonRequest`](../../doc/models/refund-reason-request.md) | Optional | The reason for the refund (merchant-settable values). `duplicate`: A duplicate charge was made. `fraud`: The charge is fraudulent. `customer_request`: The customer requested the refund. | RefundReasonRequest getReason() | setReason(RefundReasonRequest reason) |
| `Message` | `String` | Optional | Optional free-text note about the reason for the refund. | String getMessage() | setMessage(String message) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.RefundCreateRequest;
import com.univapay.api.models.RefundReasonRequest;
import java.io.IOException;

RefundCreateRequest refundCreateRequest = new RefundCreateRequest.Builder(
    1000,
    "JPY"
)
.reason(RefundReasonRequest.CUSTOMER_REQUEST)
.message("Customer returned item")
.metadata(null)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

