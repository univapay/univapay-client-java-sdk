
# Restrict Ip After Failed Charge Config

IP restriction policy applied after repeated failed charges.

*This model accepts additional fields of type Object.*

## Structure

`RestrictIpAfterFailedChargeConfig`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables temporary IP restrictions after repeated failures. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Count` | `Integer` | Optional | Number of failed charges allowed before restriction starts. | Integer getCount() | setCount(Integer count) |
| `Cooldown` | `String` | Optional | ISO-8601 duration that the IP restriction remains active. | String getCooldown() | setCooldown(String cooldown) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.RestrictIpAfterFailedChargeConfig;
import java.io.IOException;

RestrictIpAfterFailedChargeConfig restrictIpAfterFailedChargeConfig = new RestrictIpAfterFailedChargeConfig.Builder()
    .enabled(true)
    .count(5)
    .cooldown("PT1H")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

