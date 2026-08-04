
# Card Processor Installment Config

Card-processor capabilities available for installment payments.

*This model accepts additional fields of type Object.*

## Structure

`CardProcessorInstallmentConfig`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Revolving` | `Boolean` | Optional | Allows revolving payments through supported processors. | Boolean getRevolving() | setRevolving(Boolean revolving) |
| `FixedCycle` | `Boolean` | Optional | Allows fixed-cycle installment payments through supported processors. | Boolean getFixedCycle() | setFixedCycle(Boolean fixedCycle) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CardProcessorInstallmentConfig;
import java.io.IOException;

CardProcessorInstallmentConfig cardProcessorInstallmentConfig = new CardProcessorInstallmentConfig.Builder()
    .revolving(true)
    .fixedCycle(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

