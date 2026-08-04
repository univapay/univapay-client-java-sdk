
# Subscription List

Paginated list of subscriptions.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<SubscriptionListItem>`](../../doc/models/subscription-list-item.md) | Optional | List of resources. | List<SubscriptionListItem> getItems() | setItems(List<SubscriptionListItem> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `TotalHits` | `Integer` | Optional | Total number of matching resources. | Integer getTotalHits() | setTotalHits(Integer totalHits) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.SubscriptionList;
import com.univapay.api.models.SubscriptionListItem;
import com.univapay.api.models.SubscriptionStatus;
import com.univapay.api.models.SubscriptionUserData;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

SubscriptionList subscriptionList = new SubscriptionList.Builder()
    .items(Arrays.asList(
        new SubscriptionListItem.Builder()
            .id(UUID.fromString("11ef3410-aaaa-4bcd-8e1f-1a2b3c4d5e60"))
            .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
            .transactionTokenId(UUID.fromString("11ef3413-dddd-4ef0-b142-4d5e6f809193"))
            .amount(1250)
            .currency("USD")
            .amountFormatted(12.5D)
            .status(SubscriptionStatus.CURRENT)
            .merchantName("管理画面ガイド")
            .storeName("管理画面ガイド_TEST店舗")
            .paymentType("card")
            .nextPaymentDate(DateTimeHelper.fromSimpleDate("2024-07-26"))
            .userData(new SubscriptionUserData.Builder()
                .type("charge")
                .cardholderName("taro yamada")
                .email("taro@test.com")
                .brand("visa")
                .build())
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new SubscriptionListItem.Builder()
            .id(UUID.fromString("11ef3411-bbbb-4cde-9f20-2b3c4d5e6f71"))
            .storeId(UUID.fromString("22af6520-d53e-764d-9d4e-ef01b66fa6d1"))
            .transactionTokenId(UUID.fromString("11ef3414-eeee-4f01-c253-5e6f80919204"))
            .amount(3000)
            .currency("JPY")
            .amountFormatted(3000D)
            .status(SubscriptionStatus.CURRENT)
            .merchantName("管理画面ガイド")
            .storeName("管理画面ガイド_Online店舗")
            .paymentType("card")
            .nextPaymentDate(DateTimeHelper.fromSimpleDate("2024-08-10"))
            .userData(new SubscriptionUserData.Builder()
                .type("charge")
                .cardholderName("hanako suzuki")
                .email("hanako@test.com")
                .brand("mastercard")
                .build())
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
    .totalHits(2)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

