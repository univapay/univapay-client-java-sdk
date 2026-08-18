
# Card Limit

Per-card spending limit enforced on card payments, evaluated over a rolling duration.

*This model accepts additional fields of type Object.*

## Structure

`CardLimit`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | Maximum amount a single card may charge within `duration`. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AmountFormatted` | `Double` | Optional | Limit amount formatted for display. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `Duration` | `String` | Optional | ISO-8601 period over which the limit is evaluated (e.g. P1M). | String getDuration() | setDuration(String duration) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CardLimit;
import java.io.IOException;

CardLimit cardLimit = new CardLimit.Builder()
    .amount(100000)
    .currency("JPY")
    .amountFormatted(100000D)
    .duration("P1M")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

