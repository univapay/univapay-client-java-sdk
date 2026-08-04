
# Subscription Installment Plan

Configuration for credit card company side installments.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionInstallmentPlan`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PlanType` | [`InstallmentPlanType`](../../doc/models/installment-plan-type.md) | Optional | Plan type selector. | InstallmentPlanType getPlanType() | setPlanType(InstallmentPlanType planType) |
| `FixedCycles` | [`InstallmentFixedCycles`](../../doc/models/installment-fixed-cycles.md) | Optional | Required if plan_type is fixed_cycles. | InstallmentFixedCycles getFixedCycles() | setFixedCycles(InstallmentFixedCycles fixedCycles) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.InstallmentFixedCycles;
import com.univapay.api.models.InstallmentPlanType;
import com.univapay.api.models.SubscriptionInstallmentPlan;
import java.io.IOException;

SubscriptionInstallmentPlan subscriptionInstallmentPlan = new SubscriptionInstallmentPlan.Builder()
    .planType(InstallmentPlanType.REVOLVING)
    .fixedCycles(InstallmentFixedCycles.CYCLES_3)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

