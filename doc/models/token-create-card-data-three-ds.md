
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
import com.univapay.api.models.TokenCreateCardDataThreeDs;

TokenCreateCardDataThreeDs tokenCreateCardDataThreeDs = new TokenCreateCardDataThreeDs.Builder()
    .build();
```

