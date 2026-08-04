
# Base Online Data

Base Online Data schema.

*This model accepts additional fields of type Object.*

## Structure

`BaseOnlineData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Brand` | [`BaseOnlineDataBrand`](../../doc/models/base-online-data-brand.md) | Optional | Base Online Data Brand schema. | BaseOnlineDataBrand getBrand() | setBrand(BaseOnlineDataBrand brand) |
| `CallMethod` | [`BaseOnlineDataCallMethod`](../../doc/models/base-online-data-call-method.md) | Optional | Base Online Data Call Method schema. | BaseOnlineDataCallMethod getCallMethod() | setCallMethod(BaseOnlineDataCallMethod callMethod) |
| `OsType` | [`BaseOnlineDataOsType`](../../doc/models/base-online-data-os-type.md) | Optional | Base Online Data Os Type schema. | BaseOnlineDataOsType getOsType() | setOsType(BaseOnlineDataOsType osType) |
| `UserIdentifier` | `String` | Optional | Consumer specific identifier required by some gateways for fraud prevention. | String getUserIdentifier() | setUserIdentifier(String userIdentifier) |
| `UserIdentifierSource` | [`BaseOnlineDataUserIdentifierSource`](../../doc/models/base-online-data-user-identifier-source.md) | Optional | The source of the user identifier | BaseOnlineDataUserIdentifierSource getUserIdentifierSource() | setUserIdentifierSource(BaseOnlineDataUserIdentifierSource userIdentifierSource) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.BaseOnlineData;
import com.univapay.api.models.BaseOnlineDataBrand;
import com.univapay.api.models.BaseOnlineDataCallMethod;
import com.univapay.api.models.BaseOnlineDataOsType;
import com.univapay.api.models.BaseOnlineDataUserIdentifierSource;
import java.io.IOException;

BaseOnlineData baseOnlineData = new BaseOnlineData.Builder()
    .brand(BaseOnlineDataBrand.PAY_PAY_ONLINE)
    .callMethod(BaseOnlineDataCallMethod.WEB)
    .osType(BaseOnlineDataOsType.ANDROID)
    .userIdentifier("user_identifier4")
    .userIdentifierSource(BaseOnlineDataUserIdentifierSource.PROVIDED)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

