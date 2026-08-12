
# Subscription Create Request

Request payload for creating a subscription.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionTokenId` | `UUID` | Required | Transaction token ID authorized for recurring payments. | UUID getTransactionTokenId() | setTransactionTokenId(UUID transactionTokenId) |
| `Amount` | `int` | Required | Amount to be charged in each cycle. | int getAmount() | setAmount(int amount) |
| `Currency` | `String` | Required | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `InitialAmount` | `Integer` | Optional | Optional different amount for the first charge. | Integer getInitialAmount() | setInitialAmount(Integer initialAmount) |
| `Period` | [`SubscriptionPeriod`](../../doc/models/subscription-period.md) | Optional | Subscription Period schema. | SubscriptionPeriod getPeriod() | setPeriod(SubscriptionPeriod period) |
| `CyclicalPeriod` | `String` | Optional | ISO-8601 Duration for custom frequency (e.g., P3D, P2M).  Cannot be used if 'period' is specified. | String getCyclicalPeriod() | setCyclicalPeriod(String cyclicalPeriod) |
| `ScheduleSettings` | [`SubscriptionScheduleSettings`](../../doc/models/subscription-schedule-settings.md) | Optional | Schedule settings applied to a subscription. | SubscriptionScheduleSettings getScheduleSettings() | setScheduleSettings(SubscriptionScheduleSettings scheduleSettings) |
| `InstallmentPlan` | [`SubscriptionInstallmentPlan`](../../doc/models/subscription-installment-plan.md) | Optional | Configuration for credit card company side installments. | SubscriptionInstallmentPlan getInstallmentPlan() | setInstallmentPlan(SubscriptionInstallmentPlan installmentPlan) |
| `SubscriptionPlan` | [`SubscriptionPlanSettings`](../../doc/models/subscription-plan-settings.md) | Optional | Configuration for limited-cycle subscriptions (Univapay side). | SubscriptionPlanSettings getSubscriptionPlan() | setSubscriptionPlan(SubscriptionPlanSettings subscriptionPlan) |
| `FirstChargeAuthorizationOnly` | `Boolean` | Optional | If true, the first charge will only be an authorization (Hold).<br><br>**Default**: `false` | Boolean getFirstChargeAuthorizationOnly() | setFirstChargeAuthorizationOnly(Boolean firstChargeAuthorizationOnly) |
| `FirstChargeCaptureAfter` | `String` | Optional | ISO-8601 Duration for auto-capture if authorization only is true.  Allowed days: P1D to P6D. | String getFirstChargeCaptureAfter() | setFirstChargeCaptureAfter(String firstChargeCaptureAfter) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `ThreeDs` | [`ChargeCreateRequestThreeDs`](../../doc/models/charge-create-request-three-ds.md) | Optional | Charge Create Request Three Ds schema. | ChargeCreateRequestThreeDs getThreeDs() | setThreeDs(ChargeCreateRequestThreeDs threeDs) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionCreateRequest;
import com.univapay.api.models.SubscriptionPeriod;
import java.util.UUID;

SubscriptionCreateRequest subscriptionCreateRequest = new SubscriptionCreateRequest.Builder(
    UUID.fromString("11ef32a7-3a71-8662-803f-1bc27702eeec"),
    1250,
    "USD"
)
.period(SubscriptionPeriod.MONTHLY)
.build();
```

