
# Customs Declaration Create Request

Request body for creating a customs declaration. Backend currently accepts this shape only for WeChat Online and WeChat MPM charges.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customs` | `String` | Required | WeChat customs authority code used for the declaration. | String getCustoms() | setCustoms(String customs) |
| `MerchantCustomsNo` | `String` | Required | Merchant customs registration number. | String getMerchantCustomsNo() | setMerchantCustomsNo(String merchantCustomsNo) |
| `CertificateId` | `String` | Required | Customer certificate or passport identifier used by customs. | String getCertificateId() | setCertificateId(String certificateId) |
| `CertificateName` | `String` | Required | Customer name exactly as shown on the certificate. | String getCertificateName() | setCertificateName(String certificateName) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CustomsDeclarationCreateRequest;
import java.io.IOException;

CustomsDeclarationCreateRequest customsDeclarationCreateRequest = new CustomsDeclarationCreateRequest.Builder(
    "TOKYO",
    "1234567890",
    "AB1234567",
    "TARO YAMADA"
)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

