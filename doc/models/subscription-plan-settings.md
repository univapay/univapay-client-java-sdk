
# Subscription Plan Settings

Configuration for limited-cycle subscriptions (Univapay side).

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionPlanSettings`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanType` | [`PlanSettingsType`](../../doc/models/plan-settings-type.md) | Optional | Plan type selector. | PlanSettingsType getPlanType() | setPlanType(PlanSettingsType planType) |
| `FixedCycles` | `Integer` | Optional | Number of cycles for fixed_cycles plan. | Integer getFixedCycles() | setFixedCycles(Integer fixedCycles) |
| `FixedCycleAmount` | `Integer` | Optional | Total target amount for fixed_cycle_amount plan. | Integer getFixedCycleAmount() | setFixedCycleAmount(Integer fixedCycleAmount) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.PlanSettingsType;
import com.univapay.api.models.SubscriptionPlanSettings;
import java.io.IOException;

SubscriptionPlanSettings subscriptionPlanSettings = new SubscriptionPlanSettings.Builder()
    .planType(PlanSettingsType.FIXED_CYCLES)
    .fixedCycles(240)
    .fixedCycleAmount(50)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

