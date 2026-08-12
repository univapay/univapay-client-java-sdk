
# Charge Create Request Redirect

Charge Create Request Redirect schema.

*This model accepts additional fields of type Object.*

## Structure

`ChargeCreateRequestRedirect`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Endpoint` | `String` | Optional | URL to redirect the customer to after payment completion. | String getEndpoint() | setEndpoint(String endpoint) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeCreateRequestRedirect;

ChargeCreateRequestRedirect chargeCreateRequestRedirect = new ChargeCreateRequestRedirect.Builder()
    .build();
```

