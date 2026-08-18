
# Checkout Supported Brand

Feature support and capability flags for a single payment-type / brand combination the store can accept.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutSupportedBrand`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentType` | [`CheckoutPaymentType`](../../doc/models/checkout-payment-type.md) | Optional | Payment type identifier used throughout the checkout configuration. | CheckoutPaymentType getPaymentType() | setPaymentType(CheckoutPaymentType paymentType) |
| `Brand` | `String` | Optional | Brand identifier for `payment_type`. For `card` and `apple_pay`, one of the common `CardBrand` values (`visa`, `mastercard`, `american_express`, `maestro`, `discover`, `jcb`, `diners_club`, `private_label`, `unionpay`) or an `unmapped_<raw value>` fallback. For `qr_scan`, a QR-CPM brand (e.g. `pay_pay`, `we_chat`, `qq`, `line_pay`, `au_pay`, `alipay_china`). For `qr_merchant`, a QR-MPM brand (e.g. `rakuten_pay_merchant`, `alipay_merchant_qr`, `pay_pay_merchant`, `d_barai_mpm`, `we_chat_mpm`). For `online`, an online-redirect brand (e.g. `alipay_online`, `pay_pay_online`, `we_chat_online`, `d_barai_online`, `kakaopay`). For `konbini`, a convenience-store brand (e.g. `seven_eleven`, `family_mart`, `lawson`). For `paidy` and `bank_transfer`, the payment type's own identifier. The full brand catalogue is large and gateway-dependent — treat this as an open string, not a fixed set. | String getBrand() | setBrand(String brand) |
| `CardBrand` | `String` | Optional | Legacy alias of `brand`. Present only when `payment_type` is `card` or `apple_pay`. | String getCardBrand() | setCardBrand(String cardBrand) |
| `QrBrand` | `String` | Optional | Legacy alias of `brand`. Present only when `payment_type` is `qr_merchant`. | String getQrBrand() | setQrBrand(String qrBrand) |
| `OnlineBrand` | `String` | Optional | Legacy alias of `brand`. Present only when `payment_type` is `online`. | String getOnlineBrand() | setOnlineBrand(String onlineBrand) |
| `DynamicInfo` | `Boolean` | Optional | Whether the brand's supported feature set is resolved dynamically. | Boolean getDynamicInfo() | setDynamicInfo(Boolean dynamicInfo) |
| `SupportAuthCapture` | `Boolean` | Optional | Whether the brand supports separate authorization and capture. | Boolean getSupportAuthCapture() | setSupportAuthCapture(Boolean supportAuthCapture) |
| `RequiresFullName` | `Boolean` | Optional | Whether the brand requires the cardholder's full name. | Boolean getRequiresFullName() | setRequiresFullName(Boolean requiresFullName) |
| `RequiresCvv` | `Boolean` | Optional | Whether the brand requires a CVV. | Boolean getRequiresCvv() | setRequiresCvv(Boolean requiresCvv) |
| `CountriesAllowed` | `List<String>` | Optional | ISO 3166-1 alpha-2 country codes allowed for this brand. `null` when unrestricted. | List<String> getCountriesAllowed() | setCountriesAllowed(List<String> countriesAllowed) |
| `SupportedCurrencies` | `List<String>` | Optional | ISO-4217 currency codes supported by this brand. `null` when unrestricted. | List<String> getSupportedCurrencies() | setSupportedCurrencies(List<String> supportedCurrencies) |
| `CvvAuth` | `Boolean` | Optional | Whether this brand supports CVV-only authorization. | Boolean getCvvAuth() | setCvvAuth(Boolean cvvAuth) |
| `InstallmentCapable` | `Boolean` | Optional | Whether this brand supports installment plans. | Boolean getInstallmentCapable() | setInstallmentCapable(Boolean installmentCapable) |
| `McpCapable` | `Boolean` | Optional | Whether this brand supports multi-currency pricing. | Boolean getMcpCapable() | setMcpCapable(Boolean mcpCapable) |
| `McpOnly` | `Boolean` | Optional | Whether this brand is only available through multi-currency pricing. | Boolean getMcpOnly() | setMcpOnly(Boolean mcpOnly) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutPaymentType;
import com.univapay.api.models.CheckoutSupportedBrand;
import java.io.IOException;

CheckoutSupportedBrand checkoutSupportedBrand = new CheckoutSupportedBrand.Builder()
    .paymentType(CheckoutPaymentType.CARD)
    .brand("visa")
    .cardBrand("visa")
    .qrBrand("alipay_merchant_qr")
    .onlineBrand("alipay_online")
    .dynamicInfo(false)
    .supportAuthCapture(true)
    .requiresFullName(false)
    .requiresCvv(true)
    .cvvAuth(false)
    .installmentCapable(true)
    .mcpCapable(false)
    .mcpOnly(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

