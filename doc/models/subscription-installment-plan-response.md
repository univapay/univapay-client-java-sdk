
# Subscription Installment Plan Response

Installment plan applied to the subscription, as returned by the API. Covers both card-network installment plans (`revolving`, `fixed_cycles`) and legacy fixed-amount installment plans (`fixed_cycle_amount`).

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionInstallmentPlanResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanType` | [`CombinedPlanType`](../../doc/models/combined-plan-type.md) | Optional | Plan type selector. | CombinedPlanType getPlanType() | setPlanType(CombinedPlanType planType) |
| `FixedCycles` | [`CombinedInstallmentFixedCycles`](../../doc/models/combined-installment-fixed-cycles.md) | Optional | Number of installment cycles. Present when plan_type is fixed_cycles. | CombinedInstallmentFixedCycles getFixedCycles() | setFixedCycles(CombinedInstallmentFixedCycles fixedCycles) |
| `FixedCyclesAmount` | `Integer` | Optional | Total target amount for the fixed_cycle_amount plan type, in the smallest currency unit. Present when plan_type is fixed_cycle_amount. Note the plural `fixed_cycles_amount` key differs from `subscription_plan`'s singular `fixed_cycle_amount`. | Integer getFixedCyclesAmount() | setFixedCyclesAmount(Integer fixedCyclesAmount) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionInstallmentPlanResponse;

SubscriptionInstallmentPlanResponse subscriptionInstallmentPlanResponse = new SubscriptionInstallmentPlanResponse.Builder()
    .build();
```

