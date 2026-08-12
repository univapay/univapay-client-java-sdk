
# Charge Capture Request

Request payload for capturing an authorized charge.

*This model accepts additional fields of type Object.*

## Structure

`ChargeCaptureRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `int` | Required | The amount to capture. Must be less than or equal to the authorized amount. | int getAmount() | setAmount(int amount) |
| `Currency` | `String` | Required | ISO-4217 currency code. Must exactly match the currency used during authorization. | String getCurrency() | setCurrency(String currency) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeCaptureRequest;

ChargeCaptureRequest chargeCaptureRequest = new ChargeCaptureRequest.Builder(
    1000,
    "JPY"
)
.build();
```

