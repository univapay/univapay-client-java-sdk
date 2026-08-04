
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
import com.univapay.api.ApiHelper;
import com.univapay.api.models.ChargeThreeDs;
import java.io.IOException;

ChargeThreeDs chargeThreeDs = new ChargeThreeDs.Builder()
    .redirectEndpoint("redirect_endpoint0")
    .mode("mode6")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

