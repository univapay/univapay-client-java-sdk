
# Refund List

Paginated list of refunds.

*This model accepts additional fields of type Object.*

## Structure

`RefundList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<Refund>`](../../doc/models/refund.md) | Optional | List of resources. | List<Refund> getItems() | setItems(List<Refund> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `TotalHits` | `Integer` | Optional | Total number of matching resources. | Integer getTotalHits() | setTotalHits(Integer totalHits) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.PaymentError;
import com.univapay.api.models.Refund;
import com.univapay.api.models.RefundList;
import com.univapay.api.models.RefundReasonResponse;
import com.univapay.api.models.RefundStatus;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

RefundList refundList = new RefundList.Builder()
    .items(Arrays.asList(
        new Refund.Builder()
            .id(UUID.fromString("b4d9fea9-c9b3-4e76-a25d-b61f7e4821b6"))
            .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
            .chargeId(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
            .status(RefundStatus.SUCCESSFUL)
            .amount(1000)
            .currency("JPY")
            .amountFormatted(1000D)
            .reason(RefundReasonResponse.CUSTOMER_REQUEST)
            .message("Customer returned item")
            .error(new PaymentError.Builder()
                .build())
            .metadata(new GenericMetadata.Builder()
                .build())
            .mode(ChargeMode.LIVE)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:36:00.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new Refund.Builder()
            .id(UUID.fromString("c5e0afb0-dac4-5f87-b36e-c72f8f5932c7"))
            .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
            .chargeId(UUID.fromString("7fac5f6d-7a1b-51e4-b5f2-1f2ad6f95fa9"))
            .status(RefundStatus.PENDING)
            .amount(2500)
            .currency("JPY")
            .amountFormatted(2500D)
            .reason(RefundReasonResponse.DUPLICATE)
            .message("Duplicate charge")
            .error(new PaymentError.Builder()
                .build())
            .metadata(new GenericMetadata.Builder()
                .orderId("ORD-1002")
                .build())
            .mode(ChargeMode.LIVE)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T10:00:00.000000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T10:00:05.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
    .totalHits(2)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

