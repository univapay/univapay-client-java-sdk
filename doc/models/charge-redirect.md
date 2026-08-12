
# Charge Redirect

Charge Redirect schema.

*This model accepts additional fields of type Object.*

## Structure

`ChargeRedirect`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Endpoint` | `String` | Optional | Endpoint value. | String getEndpoint() | setEndpoint(String endpoint) |
| `RedirectId` | `UUID` | Optional | Redirect identifier. | UUID getRedirectId() | setRedirectId(UUID redirectId) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeRedirect;

ChargeRedirect chargeRedirect = new ChargeRedirect.Builder()
    .build();
```

