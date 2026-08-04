
# Store List

Paginated store search result.

*This model accepts additional fields of type Object.*

## Structure

`StoreList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<StoreListItem>`](../../doc/models/store-list-item.md) | Optional | Store rows matching the current filter set. | List<StoreListItem> getItems() | setItems(List<StoreListItem> items) |
| `HasMore` | `Boolean` | Optional | Whether another page is available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `TotalHits` | `Integer` | Optional | Total number of matching stores when available. | Integer getTotalHits() | setTotalHits(Integer totalHits) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.StoreList;
import com.univapay.api.models.StoreListItem;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

StoreList storeList = new StoreList.Builder()
    .items(Arrays.asList(
        new StoreListItem.Builder()
            .id(UUID.fromString("11ef0000-0000-4000-8000-000000000022"))
            .name("Tokyo Store")
            .merchantName("Example Merchant")
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new StoreListItem.Builder()
            .id(UUID.fromString("11ef0000-0000-4000-8000-000000000023"))
            .name("Osaka Store")
            .merchantName("Example Merchant")
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T09:12:30.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
    .totalHits(2)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

