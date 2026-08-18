
# Checkout Info

Merchant/store checkout configuration: enabled payment methods and their limits, installment/subscription plan settings, convenience-store and bank-transfer settings, widget theme, and per-brand feature support. Returned in full on every call — there is no partial-update or list variant.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutInfo`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mode` | [`CheckoutMode`](../../doc/models/checkout-mode.md) | Optional | Store processing mode reflected in the checkout configuration: `live` and `test` reflect the credential used to authenticate, while `live_test` is reserved for privileged callers testing against live-mode data. | CheckoutMode getMode() | setMode(CheckoutMode mode) |
| `RecurringTokenPrivilege` | [`CheckoutRecurringTokenPrivilege`](../../doc/models/checkout-recurring-token-privilege.md) | Optional | Level of recurring-charge privilege granted to transaction tokens created under this store: `none` disallows recurring use, `bounded` allows a limited number of recurring charges, and `infinite` allows unlimited recurring charges. | CheckoutRecurringTokenPrivilege getRecurringTokenPrivilege() | setRecurringTokenPrivilege(CheckoutRecurringTokenPrivilege recurringTokenPrivilege) |
| `Name` | `String` | Optional | Store display name. | String getName() | setName(String name) |
| `CardConfiguration` | [`CheckoutCardConfiguration`](../../doc/models/checkout-card-configuration.md) | Optional | Card payment settings applied to checkout. | CheckoutCardConfiguration getCardConfiguration() | setCardConfiguration(CheckoutCardConfiguration cardConfiguration) |
| `SubscriptionConfiguration` | [`CheckoutSubscriptionConfiguration`](../../doc/models/checkout-subscription-configuration.md) | Optional | Univapay-hosted subscription feature toggle. | CheckoutSubscriptionConfiguration getSubscriptionConfiguration() | setSubscriptionConfiguration(CheckoutSubscriptionConfiguration subscriptionConfiguration) |
| `InstallmentsConfiguration` | [`CheckoutInstallmentsConfiguration`](../../doc/models/checkout-installments-configuration.md) | Optional | Installment plan configuration applied to checkout. | CheckoutInstallmentsConfiguration getInstallmentsConfiguration() | setInstallmentsConfiguration(CheckoutInstallmentsConfiguration installmentsConfiguration) |
| `SubscriptionPlanConfiguration` | [`CheckoutSubscriptionPlanConfiguration`](../../doc/models/checkout-subscription-plan-configuration.md) | Optional | Univapay-side subscription plan configuration applied to checkout. | CheckoutSubscriptionPlanConfiguration getSubscriptionPlanConfiguration() | setSubscriptionPlanConfiguration(CheckoutSubscriptionPlanConfiguration subscriptionPlanConfiguration) |
| `CheckoutConfiguration` | [`CheckoutEcConfiguration`](../../doc/models/checkout-ec-configuration.md) | Optional | EC checkout feature toggles for hosted email receipts and product line items. | CheckoutEcConfiguration getCheckoutConfiguration() | setCheckoutConfiguration(CheckoutEcConfiguration checkoutConfiguration) |
| `QrScanConfiguration` | [`CheckoutQrScanConfiguration`](../../doc/models/checkout-qr-scan-configuration.md) | Optional | QR-scan (CPM) payment settings applied to checkout. | CheckoutQrScanConfiguration getQrScanConfiguration() | setQrScanConfiguration(CheckoutQrScanConfiguration qrScanConfiguration) |
| `ConvenienceConfiguration` | [`CheckoutConvenienceConfiguration`](../../doc/models/checkout-convenience-configuration.md) | Optional | Convenience-store (konbini) payment settings applied to checkout. | CheckoutConvenienceConfiguration getConvenienceConfiguration() | setConvenienceConfiguration(CheckoutConvenienceConfiguration convenienceConfiguration) |
| `PaidyConfiguration` | [`CheckoutPaidyConfiguration`](../../doc/models/checkout-paidy-configuration.md) | Optional | Paidy payment feature toggle. | CheckoutPaidyConfiguration getPaidyConfiguration() | setPaidyConfiguration(CheckoutPaidyConfiguration paidyConfiguration) |
| `PaidyPublicKey` | `String` | Optional | Public key used to initialize the Paidy widget. `null` when Paidy is not configured for this store. | String getPaidyPublicKey() | setPaidyPublicKey(String paidyPublicKey) |
| `LogoImage` | `String` | Optional | URL of the store's checkout logo image. `null` when no logo is configured. Note: this response field is `logo_image`, but the corresponding store-configuration update field is `logo_url` — the two names do not round-trip automatically. | String getLogoImage() | setLogoImage(String logoImage) |
| `Theme` | [`CheckoutTheme`](../../doc/models/checkout-theme.md) | Optional | Widget theme applied to checkout. | CheckoutTheme getTheme() | setTheme(CheckoutTheme theme) |
| `RecurringCardChargeCvvConfirmation` | [`RecurringCvvConfirmation`](../../doc/models/recurring-cvv-confirmation.md) | Optional | CVV re-confirmation policy applied to recurring card charges (subscriptions and tokens with recurring privilege). | RecurringCvvConfirmation getRecurringCardChargeCvvConfirmation() | setRecurringCardChargeCvvConfirmation(RecurringCvvConfirmation recurringCardChargeCvvConfirmation) |
| `OnlineConfiguration` | [`CheckoutOnlineConfiguration`](../../doc/models/checkout-online-configuration.md) | Optional | Online redirect/wallet payment feature toggle. | CheckoutOnlineConfiguration getOnlineConfiguration() | setOnlineConfiguration(CheckoutOnlineConfiguration onlineConfiguration) |
| `BankTransferConfiguration` | [`CheckoutBankTransferConfiguration`](../../doc/models/checkout-bank-transfer-configuration.md) | Optional | Bank transfer (振込) payment settings applied to checkout. | CheckoutBankTransferConfiguration getBankTransferConfiguration() | setBankTransferConfiguration(CheckoutBankTransferConfiguration bankTransferConfiguration) |
| `SupportedBrands` | [`List<CheckoutSupportedBrand>`](../../doc/models/checkout-supported-brand.md) | Optional | Feature support and capability flags for every payment-type / brand combination the store can accept. | List<CheckoutSupportedBrand> getSupportedBrands() | setSupportedBrands(List<CheckoutSupportedBrand> supportedBrands) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutCardConfiguration;
import com.univapay.api.models.CheckoutInfo;
import com.univapay.api.models.CheckoutMode;
import com.univapay.api.models.CheckoutPaymentType;
import com.univapay.api.models.CheckoutRecurringTokenPrivilege;
import com.univapay.api.models.CheckoutSubscriptionConfiguration;
import com.univapay.api.models.CheckoutSupportedBrand;
import java.io.IOException;
import java.util.Arrays;

CheckoutInfo checkoutInfo = new CheckoutInfo.Builder()
    .mode(CheckoutMode.TEST)
    .recurringTokenPrivilege(CheckoutRecurringTokenPrivilege.NONE)
    .name("Test store")
    .cardConfiguration(new CheckoutCardConfiguration.Builder()
        .enabled(false)
        .debitEnabled(false)
        .prepaidEnabled(false)
        .debitAuthorizationEnabled(false)
        .prepaidAuthorizationEnabled(false)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .subscriptionConfiguration(new CheckoutSubscriptionConfiguration.Builder()
        .enabled(false)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .supportedBrands(Arrays.asList(
        new CheckoutSupportedBrand.Builder()
            .paymentType(CheckoutPaymentType.CARD)
            .brand("visa")
            .cardBrand("visa")
            .qrBrand("qr_brand4")
            .onlineBrand("online_brand2")
            .dynamicInfo(false)
            .supportAuthCapture(true)
            .requiresFullName(false)
            .requiresCvv(true)
            .countriesAllowed(null)
            .supportedCurrencies(null)
            .cvvAuth(false)
            .installmentCapable(true)
            .mcpCapable(false)
            .mcpOnly(false)
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new CheckoutSupportedBrand.Builder()
            .paymentType(CheckoutPaymentType.QR_MERCHANT)
            .brand("alipay_merchant_qr")
            .cardBrand("card_brand4")
            .qrBrand("alipay_merchant_qr")
            .onlineBrand("online_brand2")
            .dynamicInfo(false)
            .supportAuthCapture(false)
            .requiresFullName(false)
            .requiresCvv(false)
            .countriesAllowed(null)
            .supportedCurrencies(null)
            .cvvAuth(false)
            .installmentCapable(false)
            .mcpCapable(false)
            .mcpOnly(false)
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

