
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
import com.univapay.api.ApiHelper;
import com.univapay.api.models.ChargeRedirect;
import java.io.IOException;
import java.util.UUID;

ChargeRedirect chargeRedirect = new ChargeRedirect.Builder()
    .endpoint("endpoint8")
    .redirectId(UUID.fromString("00001874-0000-0000-0000-000000000000"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

