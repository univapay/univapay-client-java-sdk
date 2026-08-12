
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
import com.univapay.api.models.BaseOnlineData;

BaseOnlineData baseOnlineData = new BaseOnlineData.Builder()
    .build();
```

