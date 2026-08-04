
# Token Create Card Data Three Ds

Token Create Card Data Three Ds schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreateCardDataThreeDs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enabled value. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `RedirectEndpoint` | `String` | Optional | Redirect endpoint URL. | String getRedirectEndpoint() | setRedirectEndpoint(String redirectEndpoint) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TokenCreateCardDataThreeDs;
import java.io.IOException;

TokenCreateCardDataThreeDs tokenCreateCardDataThreeDs = new TokenCreateCardDataThreeDs.Builder()
    .enabled(false)
    .redirectEndpoint("redirect_endpoint0")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

