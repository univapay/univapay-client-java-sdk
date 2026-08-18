
# Checkout Qr Scan Configuration

QR-scan (CPM) payment settings applied to checkout.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutQrScanConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether QR-scan payments are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `ForbiddenQrScanGateways` | `List<String>` | Optional | QR-scan gateways disabled for the merchant. Common values include `alipay`, `alipay_plus`, `pay_pay`, `we_chat`, `univapay`, and `test`. `null` when no gateway is forbidden. | List<String> getForbiddenQrScanGateways() | setForbiddenQrScanGateways(List<String> forbiddenQrScanGateways) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutQrScanConfiguration;
import java.io.IOException;
import java.util.Arrays;

CheckoutQrScanConfiguration checkoutQrScanConfiguration = new CheckoutQrScanConfiguration.Builder()
    .enabled(true)
    .forbiddenQrScanGateways(Arrays.asList(
        "forbidden_qr_scan_gateways1",
        "forbidden_qr_scan_gateways0"
    ))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

