
# Subscription Simulation Plan Settings

Cycle-limiting plan configuration used to simulate an installment plan or a Univapay-side subscription plan.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionSimulationPlanSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanType` | [`SimulationPlanSettingsType`](../../doc/models/simulation-plan-settings-type.md) | Optional | Plan type selector. | SimulationPlanSettingsType getPlanType() | setPlanType(SimulationPlanSettingsType planType) |
| `FixedCycles` | `Integer` | Optional | Number of cycles for the fixed_cycles plan. Must be greater than 1. | Integer getFixedCycles() | setFixedCycles(Integer fixedCycles) |
| `FixedCycleAmount` | `Integer` | Optional | Total target amount for the fixed_cycle_amount plan. Must not exceed the requested amount. | Integer getFixedCycleAmount() | setFixedCycleAmount(Integer fixedCycleAmount) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionSimulationPlanSettings;

SubscriptionSimulationPlanSettings subscriptionSimulationPlanSettings = new SubscriptionSimulationPlanSettings.Builder()
    .build();
```

