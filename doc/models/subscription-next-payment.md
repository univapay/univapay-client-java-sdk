
# Subscription Next Payment

Next scheduled payment details for a subscription.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionNextPayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier. | UUID getId() | setId(UUID id) |
| `DueDate` | `LocalDate` | Optional | Scheduled due date. | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `ZoneId` | `String` | Optional | IANA timezone identifier. | String getZoneId() | setZoneId(String zoneId) |
| `Amount` | `Integer` | Optional | Amount in the smallest currency unit. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AmountFormatted` | `Double` | Optional | Amount formatted for display. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `IsPaid` | `Boolean` | Optional | Whether the payment has been paid. | Boolean getIsPaid() | setIsPaid(Boolean isPaid) |
| `IsLastPayment` | `Boolean` | Optional | Whether this is the final payment in the schedule. | Boolean getIsLastPayment() | setIsLastPayment(Boolean isLastPayment) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `RetryDate` | `LocalDate` | Optional | Scheduled retry date. | LocalDate getRetryDate() | setRetryDate(LocalDate retryDate) |
| `TerminateWithStatus` | [`SubscriptionTerminateWithStatus`](../../doc/models/subscription-terminate-with-status.md) | Optional | Schedule a status transition on a payment's due date. Set to `suspended` or `canceled` to schedule termination. Send `null` to cancel a previously scheduled transition. | SubscriptionTerminateWithStatus getTerminateWithStatus() | setTerminateWithStatus(SubscriptionTerminateWithStatus terminateWithStatus) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.SubscriptionNextPayment;
import java.io.IOException;
import java.util.UUID;

SubscriptionNextPayment subscriptionNextPayment = new SubscriptionNextPayment.Builder()
    .id(UUID.fromString("00000e0e-0000-0000-0000-000000000000"))
    .dueDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
    .zoneId("zone_id4")
    .amount(176)
    .currency("currency8")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

