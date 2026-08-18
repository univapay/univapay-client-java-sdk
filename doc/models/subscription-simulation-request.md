
# Subscription Simulation Request

Request payload for simulating a subscription payment schedule without creating a live subscription. Specify exactly one of 'period' or 'cyclical_period' to define the billing frequency. 'installment_plan' and 'subscription_plan' are mutually exclusive — specify at most one to model a limited-cycle schedule.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionSimulationRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | Amount to be charged in each cycle. Must be a positive integer.<br><br>**Constraints**: `>= 1` | int getAmount() | setAmount(int amount) |
| `Currency` | `String` | Required | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `PaymentType` | [`TransactionTokenPaymentType`](../../doc/models/transaction-token-payment-type.md) | Required | Transaction Token Payment Type schema. | TransactionTokenPaymentType getPaymentType() | setPaymentType(TransactionTokenPaymentType paymentType) |
| `InitialAmount` | `Integer` | Optional | Optional different amount for the first charge. Must be zero or greater.<br><br>**Constraints**: `>= 0` | Integer getInitialAmount() | setInitialAmount(Integer initialAmount) |
| `Period` | [`SubscriptionSimulationPeriod`](../../doc/models/subscription-simulation-period.md) | Optional | Billing frequency for the simulated schedule. Includes `bimonthly`, which is not offered on `SubscriptionPeriod` for live subscription creation. | SubscriptionSimulationPeriod getPeriod() | setPeriod(SubscriptionSimulationPeriod period) |
| `CyclicalPeriod` | `String` | Optional | ISO-8601 Duration for custom frequency (e.g., P3D, P2M). Cannot be used together with 'period' — specify exactly one of the two. | String getCyclicalPeriod() | setCyclicalPeriod(String cyclicalPeriod) |
| `ScheduleSettings` | [`SubscriptionScheduleSettings`](../../doc/models/subscription-schedule-settings.md) | Required | Schedule settings applied to a subscription. | SubscriptionScheduleSettings getScheduleSettings() | setScheduleSettings(SubscriptionScheduleSettings scheduleSettings) |
| `InstallmentPlan` | [`SubscriptionSimulationPlanSettings`](../../doc/models/subscription-simulation-plan-settings.md) | Optional | Cycle-limiting plan configuration used to simulate an installment plan or a Univapay-side subscription plan. | SubscriptionSimulationPlanSettings getInstallmentPlan() | setInstallmentPlan(SubscriptionSimulationPlanSettings installmentPlan) |
| `SubscriptionPlan` | [`SubscriptionSimulationPlanSettings`](../../doc/models/subscription-simulation-plan-settings.md) | Optional | Cycle-limiting plan configuration used to simulate an installment plan or a Univapay-side subscription plan. | SubscriptionSimulationPlanSettings getSubscriptionPlan() | setSubscriptionPlan(SubscriptionSimulationPlanSettings subscriptionPlan) |
| `OnlyDirectCurrency` | `Boolean` | Optional | Whether only direct currency processing is allowed. | Boolean getOnlyDirectCurrency() | setOnlyDirectCurrency(Boolean onlyDirectCurrency) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionScheduleSettings;
import com.univapay.api.models.SubscriptionSimulationPeriod;
import com.univapay.api.models.SubscriptionSimulationRequest;
import com.univapay.api.models.TransactionTokenPaymentType;

SubscriptionSimulationRequest subscriptionSimulationRequest = new SubscriptionSimulationRequest.Builder(
    1000,
    "JPY",
    TransactionTokenPaymentType.CARD,
    new SubscriptionScheduleSettings.Builder()
        .zoneId("Asia/Tokyo")
        .build()
)
.period(SubscriptionSimulationPeriod.MONTHLY)
.build();
```

