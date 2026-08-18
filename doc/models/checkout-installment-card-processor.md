
# Checkout Installment Card Processor

Card-processor capabilities available for installment payments.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutInstallmentCardProcessor`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Revolving` | `Boolean` | Optional | Whether revolving installment payments are allowed. | Boolean getRevolving() | setRevolving(Boolean revolving) |
| `FixedCycle` | `Boolean` | Optional | Whether fixed-cycle installment payments are allowed. | Boolean getFixedCycle() | setFixedCycle(Boolean fixedCycle) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutInstallmentCardProcessor;
import java.io.IOException;

CheckoutInstallmentCardProcessor checkoutInstallmentCardProcessor = new CheckoutInstallmentCardProcessor.Builder()
    .revolving(true)
    .fixedCycle(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

