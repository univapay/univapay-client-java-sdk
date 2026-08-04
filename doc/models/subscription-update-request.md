
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
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Status` | [`SubscriptionUpdateStatus`](../../doc/models/subscription-update-status.md) | Optional | Update the subscription status.  `suspended`: Pause the subscription.  `unpaid`: Resume a suspended subscription. | SubscriptionUpdateStatus getStatus() | setStatus(SubscriptionUpdateStatus status) |
| `ScheduleSettings` | [`SubscriptionUpdateScheduleSettings`](../../doc/models/subscription-update-schedule-settings.md) | Optional | Schedule settings that can be updated on a subscription. | SubscriptionUpdateScheduleSettings getScheduleSettings() | setScheduleSettings(SubscriptionUpdateScheduleSettings scheduleSettings) |
| `NextPayment` | [`SubscriptionUpdateNextPayment`](../../doc/models/subscription-update-next-payment.md) | Optional | Fields that can be updated on the next scheduled payment. | SubscriptionUpdateNextPayment getNextPayment() | setNextPayment(SubscriptionUpdateNextPayment nextPayment) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.SubscriptionTerminationMode;
import com.univapay.api.models.SubscriptionUpdateNextPayment;
import com.univapay.api.models.SubscriptionUpdateRequest;
import com.univapay.api.models.SubscriptionUpdateScheduleSettings;
import com.univapay.api.models.SubscriptionUpdateStatus;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;
import java.util.UUID;

SubscriptionUpdateRequest subscriptionUpdateRequest = new SubscriptionUpdateRequest.Builder()
    .transactionTokenId(UUID.fromString("11ef3362-3700-c54a-9baa-6f7e6527c9d9"))
    .amount(230)
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .univapayName("univapay-name8")
        .univapayPhoneNumber("univapay-phone-number2")
    .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
            "String4"
        ))
        .build())
    .status(SubscriptionUpdateStatus.SUSPENDED)
    .scheduleSettings(new SubscriptionUpdateScheduleSettings.Builder()
        .terminationMode(SubscriptionTerminationMode.ON_NEXT_PAYMENT)
        .startOn(DateTimeHelper.fromRfc8601DateTime("2016-03-13T12:52:32.123Z"))
        .retryInterval("retry_interval2")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .nextPayment(new SubscriptionUpdateNextPayment.Builder()
        .dueDate(DateTimeHelper.fromSimpleDate("2030-01-01"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

