
# Token Response Qr Scan Data

Token Response Qr Scan Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseQrScanData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Brand` | `String` | Required | QR-CPM brand detected from the scanned code (e.g. `pay_pay`, `we_chat`, `qq`, `line_pay`, `au_pay`, `alipay_china`). This is an open value set — new brands may appear without notice. Returned as `null` when the scanned code could not be parsed into a known brand. | String getBrand() | setBrand(String brand) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponseQrScanData;

TokenResponseQrScanData tokenResponseQrScanData = new TokenResponseQrScanData.Builder(
    "pay_pay"
)
.build();
```

