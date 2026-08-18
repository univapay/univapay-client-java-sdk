
# Recurring Cvv Confirmation

CVV re-confirmation policy applied to recurring card charges (subscriptions and tokens with recurring privilege).

*This model accepts additional fields of type Object.*

## Structure

`RecurringCvvConfirmation`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether CVV re-confirmation is required for recurring card charges. Resolves to `false` when not configured. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Threshold` | [`List<CheckoutMoneyAmount>`](../../doc/models/checkout-money-amount.md) | Optional | Amount thresholds above which CVV re-confirmation is required. `null` when no threshold is configured. | List<CheckoutMoneyAmount> getThreshold() | setThreshold(List<CheckoutMoneyAmount> threshold) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutMoneyAmount;
import com.univapay.api.models.RecurringCvvConfirmation;
import java.io.IOException;
import java.util.Arrays;

RecurringCvvConfirmation recurringCvvConfirmation = new RecurringCvvConfirmation.Builder()
    .enabled(false)
    .threshold(Arrays.asList(
        null,
        new CheckoutMoneyAmount.Builder()
            .build()
    ))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

