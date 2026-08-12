
# Customs Declaration Webhook Declaration

WeChat customs declaration payload returned by the backend formatter.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationWebhookDeclaration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Customs` | `String` | Optional | WeChat customs authority code. | String getCustoms() | setCustoms(String customs) |
| `MerchantCustomsNo` | `String` | Optional | Merchant customs registration number. | String getMerchantCustomsNo() | setMerchantCustomsNo(String merchantCustomsNo) |
| `CertificateId` | `String` | Optional | Customer certificate or passport identifier. | String getCertificateId() | setCertificateId(String certificateId) |
| `CertificateName` | `String` | Optional | Customer name as provided to customs. | String getCertificateName() | setCertificateName(String certificateName) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.CustomsDeclarationWebhookDeclaration;

CustomsDeclarationWebhookDeclaration customsDeclarationWebhookDeclaration = new CustomsDeclarationWebhookDeclaration.Builder()
    .customs("TOKYO")
    .merchantCustomsNo("1234567890")
    .certificateId("AB1234567")
    .certificateName("TARO YAMADA")
    .build();
```

