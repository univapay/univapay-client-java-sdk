
# Subscription Payment

Represents a single scheduled or historical payment for a subscription.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionPayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier. | UUID getId() | setId(UUID id) |
| `DueDate` | `LocalDate` | Optional | Scheduled due date. | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `ZoneId` | `String` | Optional | IANA Timezone ID. | String getZoneId() | setZoneId(String zoneId) |
| `Amount` | `Integer` | Optional | Amount in the smallest currency unit. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AmountFormatted` | `Double` | Optional | Amount formatted for display. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `IsPaid` | `Boolean` | Optional | Indicates whether this specific payment cycle has been successfully charged. | Boolean getIsPaid() | setIsPaid(Boolean isPaid) |
| `IsLastPayment` | `Boolean` | Optional | Indicates if this is the final payment in a limited-cycle subscription. | Boolean getIsLastPayment() | setIsLastPayment(Boolean isLastPayment) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.SubscriptionPayment;
import java.io.IOException;
import java.util.UUID;

SubscriptionPayment subscriptionPayment = new SubscriptionPayment.Builder()
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
    .build();
```

