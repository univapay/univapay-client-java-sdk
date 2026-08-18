
# Charge Capture Request

Request payload for capturing an authorized charge. Both fields are optional; omit the entire body to capture the full outstanding amount.

*This model accepts additional fields of type Object.*

## Structure

`ChargeCaptureRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | The amount to capture. Must be less than or equal to the authorized amount. If omitted, the full outstanding authorized amount is captured. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. Must exactly match the currency used during authorization. If omitted, defaults to the currency originally requested on the charge. | String getCurrency() | setCurrency(String currency) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeCaptureRequest;

ChargeCaptureRequest chargeCaptureRequest = new ChargeCaptureRequest.Builder()
    .amount(1000)
    .currency("JPY")
    .build();
```

