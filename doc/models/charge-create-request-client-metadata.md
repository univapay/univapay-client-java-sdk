
# Charge Create Request Client Metadata

Charge Create Request Client Metadata schema.

*This model accepts additional fields of type Object.*

## Structure

`ChargeCreateRequestClientMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `IpAddress` | `String` | Optional | Consumer's IPv4 address. | String getIpAddress() | setIpAddress(String ipAddress) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.ChargeCreateRequestClientMetadata;
import java.io.IOException;

ChargeCreateRequestClientMetadata chargeCreateRequestClientMetadata = new ChargeCreateRequestClientMetadata.Builder()
    .ipAddress("198.51.100.14")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

