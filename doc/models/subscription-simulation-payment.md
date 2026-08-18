
# Subscription Simulation Payment

A single scheduled payment produced by the subscription plan simulation.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionSimulationPayment`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `DueDate` | `LocalDate` | Optional | Scheduled due date for this simulated payment (YYYY-MM-DD). | LocalDate getDueDate() | setDueDate(LocalDate dueDate) |
| `ZoneId` | `String` | Optional | IANA timezone identifier used to resolve the due date. | String getZoneId() | setZoneId(String zoneId) |
| `Amount` | `Integer` | Optional | Amount to be charged on this cycle, in the smallest currency unit.<br><br>**Constraints**: `>= 0` | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `IsPaid` | `Boolean` | Optional | Always `false` for simulated payments — no real payment has been made. | Boolean getIsPaid() | setIsPaid(Boolean isPaid) |
| `IsLastPayment` | `Boolean` | Optional | Whether this is the final payment in the simulated schedule. | Boolean getIsLastPayment() | setIsLastPayment(Boolean isLastPayment) |
| `SuccessfulPaymentDate` | `LocalDate` | Optional | Always `null` for simulated payments — populated only once a real payment settles. | LocalDate getSuccessfulPaymentDate() | setSuccessfulPaymentDate(LocalDate successfulPaymentDate) |
| `TerminateWithStatus` | [`TerminateWithStatus`](../../doc/models/terminate-with-status.md) | Optional | The status the subscription would transition to on this payment's due date, if a termination is scheduled. `null` when no termination applies. | TerminateWithStatus getTerminateWithStatus() | setTerminateWithStatus(TerminateWithStatus terminateWithStatus) |
| `RetryInterval` | `String` | Optional | ISO-8601 Duration for the retry interval applied if this payment fails (e.g., P5D). `null` if no retry interval is configured. | String getRetryInterval() | setRetryInterval(String retryInterval) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionSimulationPayment;

SubscriptionSimulationPayment subscriptionSimulationPayment = new SubscriptionSimulationPayment.Builder()
    .build();
```

