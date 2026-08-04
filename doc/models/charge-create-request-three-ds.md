
# Charge Create Request Three Ds

Charge Create Request Three Ds schema.

*This model accepts additional fields of type Object.*

## Structure

`ChargeCreateRequestThreeDs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RedirectEndpoint` | `String` | Optional | URL to redirect the customer to after 3DS authentication. | String getRedirectEndpoint() | setRedirectEndpoint(String redirectEndpoint) |
| `Mode` | [`ChargeCreateRequestThreeDsMode`](../../doc/models/charge-create-request-three-ds-mode.md) | Optional | 3D-Secure authentication type. App Token Secret is required to use 'skip'.<br><br>**Default**: `ChargeCreateRequestThreeDsMode.NORMAL` | ChargeCreateRequestThreeDsMode getMode() | setMode(ChargeCreateRequestThreeDsMode mode) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.ChargeCreateRequestThreeDs;
import com.univapay.api.models.ChargeCreateRequestThreeDsMode;
import java.io.IOException;

ChargeCreateRequestThreeDs chargeCreateRequestThreeDs = new ChargeCreateRequestThreeDs.Builder()
    .redirectEndpoint("redirect_endpoint8")
    .mode(ChargeCreateRequestThreeDsMode.NORMAL)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

