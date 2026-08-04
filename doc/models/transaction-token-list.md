
# Transaction Token List

Paginated list of transaction tokens.

*This model accepts additional fields of type Object.*

## Structure

`TransactionTokenList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<TransactionTokenListItem>`](../../doc/models/transaction-token-list-item.md) | Optional | List of resources. | List<TransactionTokenListItem> getItems() | setItems(List<TransactionTokenListItem> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `TotalHits` | `Integer` | Optional | Total number of matching resources. | Integer getTotalHits() | setTotalHits(Integer totalHits) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.TransactionTokenList;
import com.univapay.api.models.TransactionTokenListItem;
import com.univapay.api.models.TransactionTokenListItemUserData;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

TransactionTokenList transactionTokenList = new TransactionTokenList.Builder()
    .items(Arrays.asList(
        new TransactionTokenListItem.Builder()
            .id(UUID.fromString("2fe23e45-f95d-4c95-9963-739070096443"))
            .storeId(UUID.fromString("79e9504e-96d8-46ed-8d22-2e8b36238605"))
            .merchantName("Test Merchant")
            .storeName("Tokyo Store")
            .email("taro@example.com")
            .paymentType("card")
            .active(true)
            .mode("live")
            .type("recurring")
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
            .userData(new TransactionTokenListItemUserData.Builder()
                .cardholderName("TARO YAMADA")
                .email("taro@example.com")
                .build())
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new TransactionTokenListItem.Builder()
            .id(UUID.fromString("3af34f56-a06e-4d06-aa74-84a181107554"))
            .storeId(UUID.fromString("8bfa615f-a7e9-47fe-9e33-3f9c47349716"))
            .merchantName("Test Merchant")
            .storeName("Osaka Store")
            .email("hanako@example.com")
            .paymentType("card")
            .active(true)
            .mode("live")
            .type("one_time")
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T10:20:11Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T10:20:11Z"))
            .userData(new TransactionTokenListItemUserData.Builder()
                .cardholderName("HANAKO SUZUKI")
                .email("hanako@example.com")
                .build())
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
    .totalHits(2)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

