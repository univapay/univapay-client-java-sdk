
# Expiration Time Shift

Time-of-day override applied when calculating expirations, shared by convenience-store and bank-transfer configuration.

*This model accepts additional fields of type Object.*

## Structure

`ExpirationTimeShift`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Value` | `String` | Optional | ISO-8601 offset time (HH:mm:ssXXX) that overrides the expiration cutoff. Omitted entirely when no override is configured. | String getValue() | setValue(String value) |
| `Enabled` | `Boolean` | Optional | Whether the time-of-day override is applied. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.ExpirationTimeShift;
import java.io.IOException;

ExpirationTimeShift expirationTimeShift = new ExpirationTimeShift.Builder()
    .value("23:59:59+09:00")
    .enabled(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

