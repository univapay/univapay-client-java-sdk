
# Charge Three Ds

Charge Three Ds schema.

*This model accepts additional fields of type Object.*

## Structure

`ChargeThreeDs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RedirectEndpoint` | `String` | Optional | Redirect endpoint URL. | String getRedirectEndpoint() | setRedirectEndpoint(String redirectEndpoint) |
| `Mode` | `String` | Optional | Processing mode for the resource. | String getMode() | setMode(String mode) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeThreeDs;

ChargeThreeDs chargeThreeDs = new ChargeThreeDs.Builder()
    .build();
```

