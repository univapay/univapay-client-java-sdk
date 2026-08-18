
# Token Create Online Data

Token Create Online Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreateOnlineData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Brand` | [`BaseOnlineDataBrand`](../../doc/models/base-online-data-brand.md) | Required | Base Online Data Brand schema. `alipay_china`, `alipay_hk`, `gcash`, `dana`, `truemoney`, `kakaopay`, `tng`, `rabbit_line_pay`, `bpi`, `boost`, `tinaba`, `naver_pay`, `toss_pay`, `maya`, `grab_sg`, `kredivo_id`, `k_plus`, and `kaspi_kz` are Alipay+ regional wallets routed through the `alipay_plus_online` gateway family. | BaseOnlineDataBrand getBrand() | setBrand(BaseOnlineDataBrand brand) |
| `CallMethod` | [`BaseOnlineDataCallMethod`](../../doc/models/base-online-data-call-method.md) | Required | Base Online Data Call Method schema. | BaseOnlineDataCallMethod getCallMethod() | setCallMethod(BaseOnlineDataCallMethod callMethod) |
| `OsType` | [`BaseOnlineDataOsType`](../../doc/models/base-online-data-os-type.md) | Optional | Base Online Data Os Type schema. | BaseOnlineDataOsType getOsType() | setOsType(BaseOnlineDataOsType osType) |
| `UserIdentifier` | `String` | Optional | Consumer specific identifier required by some gateways for fraud prevention. | String getUserIdentifier() | setUserIdentifier(String userIdentifier) |
| `UserIdentifierSource` | [`BaseOnlineDataUserIdentifierSource`](../../doc/models/base-online-data-user-identifier-source.md) | Optional | The source of the user identifier | BaseOnlineDataUserIdentifierSource getUserIdentifierSource() | setUserIdentifierSource(BaseOnlineDataUserIdentifierSource userIdentifierSource) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.BaseOnlineDataBrand;
import com.univapay.api.models.BaseOnlineDataCallMethod;
import com.univapay.api.models.TokenCreateOnlineData;

TokenCreateOnlineData tokenCreateOnlineData = new TokenCreateOnlineData.Builder(
    BaseOnlineDataBrand.WE_CHAT_ONLINE,
    BaseOnlineDataCallMethod.WEB
)
.userIdentifier("wechat_open_id_12345")
.build();
```

