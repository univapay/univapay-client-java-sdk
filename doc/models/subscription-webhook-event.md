
# Subscription Webhook Event

Webhook envelope for subscription lifecycle events. Fired as `subscription_created` when a subscription is created and its first payment initiated, `subscription_payment` when a scheduled payment processes successfully, `subscription_completed` when all scheduled payments complete, `subscription_failure` when a scheduled payment fails, `subscription_canceled` when a subscription is cancelled before all payments complete, and `subscription_suspended` when a subscription is paused. The `data` field contains the full Subscription object at the time of the event.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionWebhookEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Required | Unique ID of this webhook delivery. | UUID getId() | setId(UUID id) |
| `Event` | [`SubscriptionEvent`](../../doc/models/subscription-event.md) | Required | Event type discriminator — `subscription_created`, `subscription_payment`, `subscription_completed`, `subscription_failure`, `subscription_canceled`, or `subscription_suspended`. | SubscriptionEvent getEvent() | setEvent(SubscriptionEvent event) |
| `Data` | [`Subscription`](../../doc/models/subscription.md) | Optional | The Subscription object represents a recurring payment schedule. | Subscription getData() | setData(Subscription data) |
| `CreatedOn` | `LocalDateTime` | Required | Timestamp when the event was fired. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.Subscription;
import com.univapay.api.models.SubscriptionEvent;
import com.univapay.api.models.SubscriptionPeriod;
import com.univapay.api.models.SubscriptionScheduleSettings;
import com.univapay.api.models.SubscriptionStatus;
import com.univapay.api.models.SubscriptionTerminationMode;
import com.univapay.api.models.SubscriptionWebhookEvent;
import java.util.UUID;

SubscriptionWebhookEvent subscriptionWebhookEvent = new SubscriptionWebhookEvent.Builder(
    UUID.fromString("11ef0000-0000-4000-8000-000000000001"),
    SubscriptionEvent.SUBSCRIPTION_CREATED,
    DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z")
)
.data(new Subscription.Builder()
        .id(UUID.fromString("11ef335e-9aa5-c54a-8313-7f9847da313a"))
        .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
        .transactionTokenId(UUID.fromString("11ef32a7-3a71-8662-803f-1bc27702eeec"))
        .amount(1250)
        .currency("USD")
        .amountFormatted(12.5D)
        .scheduleSettings(new SubscriptionScheduleSettings.Builder()
            .startOn(DateTimeHelper.fromSimpleDate("2024-07-01"))
            .zoneId("Asia/Tokyo")
            .preserveEndOfMonth(false)
            .retryInterval("P7D")
            .terminationMode(SubscriptionTerminationMode.ON_NEXT_PAYMENT)
            .build())
        .onlyDirectCurrency(false)
        .firstChargeAuthorizationOnly(false)
        .status(SubscriptionStatus.CURRENT)
        .metadata(new GenericMetadata.Builder()
            .orderId("12345")
            .build())
        .mode(ChargeMode.TEST)
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-06-26T01:51:28.627023Z"))
        .period(SubscriptionPeriod.MONTHLY)
        .build())
.build();
```

