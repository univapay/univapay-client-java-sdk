
# Subscription Payment List

Paginated list of subscription payments.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionPaymentList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<SubscriptionPayment>`](../../doc/models/subscription-payment.md) | Optional | List of resources. | List<SubscriptionPayment> getItems() | setItems(List<SubscriptionPayment> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.SubscriptionPayment;
import com.univapay.api.models.SubscriptionPaymentList;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

SubscriptionPaymentList subscriptionPaymentList = new SubscriptionPaymentList.Builder()
    .items(Arrays.asList(
        new SubscriptionPayment.Builder()
            .id(UUID.fromString("11e89a0a-8cee-d660-b984-3fcaaed46e7c"))
            .dueDate(DateTimeHelper.fromSimpleDate("2018-08-21"))
            .zoneId("Asia/Tokyo")
            .amount(10000)
            .currency("JPY")
            .amountFormatted(10000D)
            .isPaid(false)
            .isLastPayment(false)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2018-08-07T06:24:33.961256Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2018-08-07T06:24:33.961256Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new SubscriptionPayment.Builder()
            .id(UUID.fromString("11e89a0a-8cc5-2662-9460-2b14b1a601ba"))
            .dueDate(DateTimeHelper.fromSimpleDate("2018-08-07"))
            .zoneId("Asia/Tokyo")
            .amount(1000)
            .currency("JPY")
            .amountFormatted(1000D)
            .isPaid(true)
            .isLastPayment(false)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2018-08-07T06:24:33.646223Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2018-08-07T06:24:33.887760Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

