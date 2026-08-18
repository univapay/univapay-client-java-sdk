
# Subscription Update Request

Request payload for updating a subscription.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionTokenId` | `UUID` | Optional | Transaction token ID used for the subscription.  Can be changed to update the payment method (e.g., when a card expires).  Allowed only when the status is `unconfirmed`, `unpaid`, `current`, or `suspended`. | UUID getTransactionTokenId() | setTransactionTokenId(UUID transactionTokenId) |
| `Amount` | `Integer` | Optional | The recurring charge amount (applied to the cycle after the next one).  Not available for limited-cycle subscriptions.  To change the immediate next payment amount, update `next_payment.amount` instead. | Integer getAmount() | setAmount(Integer amount) |
| `Period` | [`SubscriptionPeriod`](../../doc/models/subscription-period.md) | Optional | Subscription Period schema. | SubscriptionPeriod getPeriod() | setPeriod(SubscriptionPeriod period) |
| `CyclicalPeriod` | `String` | Optional | ISO-8601 Duration for custom frequency (e.g., P3D, P2M). Cannot be used together with `period`. Only allowed before the subscription's first payment has been paid. | String getCyclicalPeriod() | setCyclicalPeriod(String cyclicalPeriod) |
| `InitialAmount` | `Integer` | Optional | Different amount for the first charge. Only allowed while the subscription status is still editable (before it has started) and requires the App Token Secret. | Integer getInitialAmount() | setInitialAmount(Integer initialAmount) |
| `SubscriptionPlan` | [`SubscriptionPlanSettings`](../../doc/models/subscription-plan-settings.md) | Optional | Configuration for limited-cycle subscriptions (Univapay side). | SubscriptionPlanSettings getSubscriptionPlan() | setSubscriptionPlan(SubscriptionPlanSettings subscriptionPlan) |
| `InstallmentPlan` | [`SubscriptionInstallmentPlan`](../../doc/models/subscription-installment-plan.md) | Optional | Configuration for credit card company side installments. | SubscriptionInstallmentPlan getInstallmentPlan() | setInstallmentPlan(SubscriptionInstallmentPlan installmentPlan) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Status` | [`SubscriptionUpdateStatus`](../../doc/models/subscription-update-status.md) | Optional | Update the subscription status.  `suspended`: Pause the subscription.  `unpaid`: Resume a suspended subscription. | SubscriptionUpdateStatus getStatus() | setStatus(SubscriptionUpdateStatus status) |
| `ScheduleSettings` | [`SubscriptionUpdateScheduleSettings`](../../doc/models/subscription-update-schedule-settings.md) | Optional | Schedule settings that can be updated on a subscription. | SubscriptionUpdateScheduleSettings getScheduleSettings() | setScheduleSettings(SubscriptionUpdateScheduleSettings scheduleSettings) |
| `NextPayment` | [`SubscriptionUpdateNextPayment`](../../doc/models/subscription-update-next-payment.md) | Optional | Fields that can be updated on the next scheduled payment. | SubscriptionUpdateNextPayment getNextPayment() | setNextPayment(SubscriptionUpdateNextPayment nextPayment) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.SubscriptionTerminationMode;
import com.univapay.api.models.SubscriptionUpdateNextPayment;
import com.univapay.api.models.SubscriptionUpdateRequest;
import com.univapay.api.models.SubscriptionUpdateScheduleSettings;
import java.util.UUID;

SubscriptionUpdateRequest subscriptionUpdateRequest = new SubscriptionUpdateRequest.Builder()
    .transactionTokenId(UUID.fromString("11ef3362-3700-c54a-9baa-6f7e6527c9d9"))
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .build())
    .scheduleSettings(new SubscriptionUpdateScheduleSettings.Builder()
        .terminationMode(SubscriptionTerminationMode.ON_NEXT_PAYMENT)
        .build())
    .nextPayment(new SubscriptionUpdateNextPayment.Builder()
        .dueDate(DateTimeHelper.fromSimpleDate("2030-01-01"))
        .build())
    .build();
```

