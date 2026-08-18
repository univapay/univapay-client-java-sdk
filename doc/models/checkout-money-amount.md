
# Checkout Money Amount

Monetary amount used by checkout configuration limits and thresholds.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutMoneyAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | Amount in the smallest unit of the currency. | Integer getAmount() | setAmount(Integer amount) |
| `AmountFormatted` | `Double` | Optional | Amount formatted for display. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutMoneyAmount;
import java.io.IOException;

CheckoutMoneyAmount checkoutMoneyAmount = new CheckoutMoneyAmount.Builder()
    .amount(1000)
    .amountFormatted(1000D)
    .currency("JPY")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

