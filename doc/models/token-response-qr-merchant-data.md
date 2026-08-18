
# Token Response Qr Merchant Data

Token Response Qr Merchant Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseQrMerchantData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `QrImageUrl` | `String` | Required | QR code payload to be rendered by the consumer (content varies by brand — may be a URL or an opaque code). Some brands return an image URL; others (e.g. convenience-store QR brands) return an opaque numeric code with no URL structure. Populated asynchronously shortly after token/charge creation — `null` until then. | String getQrImageUrl() | setQrImageUrl(String qrImageUrl) |
| `Brand` | `String` | Optional | The QR-MPM brand this code was generated for. | String getBrand() | setBrand(String brand) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponseQrMerchantData;

TokenResponseQrMerchantData tokenResponseQrMerchantData = new TokenResponseQrMerchantData.Builder(
    "71001234567890202604141200450"
)
.brand("pay_pay_merchant")
.build();
```

