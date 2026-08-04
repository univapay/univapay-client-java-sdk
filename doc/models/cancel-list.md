
# Cancel List

Paginated list of cancels.

*This model accepts additional fields of type Object.*

## Structure

`CancelList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<Cancel>`](../../doc/models/cancel.md) | Optional | List of resources. | List<Cancel> getItems() | setItems(List<Cancel> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Cancel;
import com.univapay.api.models.CancelList;
import com.univapay.api.models.CancelStatus;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.PaymentError;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

CancelList cancelList = new CancelList.Builder()
    .items(Arrays.asList(
        new Cancel.Builder()
            .id(UUID.fromString("a1b2c3d4-e5f6-7890-abcd-ef1234567890"))
            .chargeId(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
            .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
            .status(CancelStatus.SUCCESSFUL)
            .error(new PaymentError.Builder()
                .code(24)
                .message("message4")
                .detail("detail0")
            .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                .build())
            .metadata(new GenericMetadata.Builder()
                .orderId("ORD-987")
                .build())
            .mode(ChargeMode.LIVE)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:36:00.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new Cancel.Builder()
            .id(UUID.fromString("b2c3d4e5-f6a7-8901-bcde-f23456789012"))
            .chargeId(UUID.fromString("7fac5f6d-7a1b-51e4-b5f2-1f2ad6f95fa9"))
            .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
            .status(CancelStatus.SUCCESSFUL)
            .error(new PaymentError.Builder()
                .code(24)
                .message("message4")
                .detail("detail0")
            .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                .build())
            .metadata(new GenericMetadata.Builder()
                .orderId("ORD-988")
                .build())
            .mode(ChargeMode.LIVE)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T10:00:00.000000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T10:00:12.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

