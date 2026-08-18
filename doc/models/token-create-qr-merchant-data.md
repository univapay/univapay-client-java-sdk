
# Token Create Qr Merchant Data

Token Create Qr Merchant Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreateQrMerchantData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Brand` | `String` | Required | The QR-MPM brand to generate a merchant-presented-mode code for. Validated strictly server-side against a supported brand list. Common values include `rakuten_pay_merchant`, `alipay_merchant_qr`, `pay_pay_merchant`, `d_barai_mpm`, `we_chat_mpm`. Treat this as an open value set — the server may add brands over time. | String getBrand() | setBrand(String brand) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenCreateQrMerchantData;

TokenCreateQrMerchantData tokenCreateQrMerchantData = new TokenCreateQrMerchantData.Builder(
    "pay_pay_merchant"
)
.build();
```

