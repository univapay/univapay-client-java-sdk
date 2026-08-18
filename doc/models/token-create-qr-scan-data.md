
# Token Create Qr Scan Data

Token Create Qr Scan Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreateQrScanData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ScannedQr` | `String` | Required | The QR/barcode payload scanned from the customer's payment app (Customer-Presented Mode). Only valid when `type` is `one_time` — the server rejects `subscription`/`recurring` token types for this payment type. | String getScannedQr() | setScannedQr(String scannedQr) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenCreateQrScanData;

TokenCreateQrScanData tokenCreateQrScanData = new TokenCreateQrScanData.Builder(
    "091234567890123456789012345"
)
.build();
```

