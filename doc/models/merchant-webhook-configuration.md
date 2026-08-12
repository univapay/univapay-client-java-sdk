
# Merchant Webhook Configuration

Merchant configuration object serialized by gyron-payments-api.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PercentFee` | `Double` | Optional | Default percent fee applied when no card-brand override exists. | Double getPercentFee() | setPercentFee(Double percentFee) |
| `FlatFees` | [`List<MerchantWebhookMoneyAmount>`](../../doc/models/merchant-webhook-money-amount.md) | Optional | Flat fee overrides by currency. | List<MerchantWebhookMoneyAmount> getFlatFees() | setFlatFees(List<MerchantWebhookMoneyAmount> flatFees) |
| `LogoUrl` | `String` | Optional | Merchant logo URL. | String getLogoUrl() | setLogoUrl(String logoUrl) |
| `Country` | `String` | Optional | Merchant country code. | String getCountry() | setCountry(String country) |
| `Language` | `String` | Optional | Merchant default language. | String getLanguage() | setLanguage(String language) |
| `DisplayTimeZone` | `String` | Optional | Merchant display time zone. | String getDisplayTimeZone() | setDisplayTimeZone(String displayTimeZone) |
| `MinTransferPayout` | [`MerchantWebhookMoneyAmount`](../../doc/models/merchant-webhook-money-amount.md) | Optional | Monetary amount object serialized by backend config models. | MerchantWebhookMoneyAmount getMinTransferPayout() | setMinTransferPayout(MerchantWebhookMoneyAmount minTransferPayout) |
| `MinimumChargeAmounts` | [`List<MerchantWebhookMoneyAmount>`](../../doc/models/merchant-webhook-money-amount.md) | Optional | Minimum allowed charge amounts by currency. | List<MerchantWebhookMoneyAmount> getMinimumChargeAmounts() | setMinimumChargeAmounts(List<MerchantWebhookMoneyAmount> minimumChargeAmounts) |
| `MaximumChargeAmounts` | [`List<MerchantWebhookMoneyAmount>`](../../doc/models/merchant-webhook-money-amount.md) | Optional | Maximum allowed charge amounts by currency. | List<MerchantWebhookMoneyAmount> getMaximumChargeAmounts() | setMaximumChargeAmounts(List<MerchantWebhookMoneyAmount> maximumChargeAmounts) |
| `TransferSchedule` | [`MerchantWebhookTransferScheduleConfiguration`](../../doc/models/merchant-webhook-transfer-schedule-configuration.md) | Optional | Transfer schedule configuration inherited by the merchant. | MerchantWebhookTransferScheduleConfiguration getTransferSchedule() | setTransferSchedule(MerchantWebhookTransferScheduleConfiguration transferSchedule) |
| `UserTransactionsConfiguration` | [`MerchantWebhookUserTransactionsConfiguration`](../../doc/models/merchant-webhook-user-transactions-configuration.md) | Optional | Merchant transaction notification settings. | MerchantWebhookUserTransactionsConfiguration getUserTransactionsConfiguration() | setUserTransactionsConfiguration(MerchantWebhookUserTransactionsConfiguration userTransactionsConfiguration) |
| `RecurringTokenConfiguration` | [`MerchantWebhookRecurringTokenConfiguration`](../../doc/models/merchant-webhook-recurring-token-configuration.md) | Optional | Recurring token configuration inherited by the merchant. | MerchantWebhookRecurringTokenConfiguration getRecurringTokenConfiguration() | setRecurringTokenConfiguration(MerchantWebhookRecurringTokenConfiguration recurringTokenConfiguration) |
| `SecurityConfiguration` | [`MerchantWebhookSecurityConfiguration`](../../doc/models/merchant-webhook-security-configuration.md) | Optional | Merchant-level fraud and refund safety settings. | MerchantWebhookSecurityConfiguration getSecurityConfiguration() | setSecurityConfiguration(MerchantWebhookSecurityConfiguration securityConfiguration) |
| `CheckoutConfiguration` | [`MerchantWebhookCheckoutConfiguration`](../../doc/models/merchant-webhook-checkout-configuration.md) | Optional | Checkout field collection settings. | MerchantWebhookCheckoutConfiguration getCheckoutConfiguration() | setCheckoutConfiguration(MerchantWebhookCheckoutConfiguration checkoutConfiguration) |
| `InstallmentsConfiguration` | [`MerchantWebhookInstallmentPlanConfiguration`](../../doc/models/merchant-webhook-installment-plan-configuration.md) | Optional | Installment plan configuration. | MerchantWebhookInstallmentPlanConfiguration getInstallmentsConfiguration() | setInstallmentsConfiguration(MerchantWebhookInstallmentPlanConfiguration installmentsConfiguration) |
| `SubscriptionPlanConfiguration` | [`MerchantWebhookSubscriptionPlanConfiguration`](../../doc/models/merchant-webhook-subscription-plan-configuration.md) | Optional | Subscription plan configuration. | MerchantWebhookSubscriptionPlanConfiguration getSubscriptionPlanConfiguration() | setSubscriptionPlanConfiguration(MerchantWebhookSubscriptionPlanConfiguration subscriptionPlanConfiguration) |
| `CardBrandPercentFees` | [`MerchantWebhookCardBrandPercentFees`](../../doc/models/merchant-webhook-card-brand-percent-fees.md) | Optional | Per-card-brand percent fee overrides. | MerchantWebhookCardBrandPercentFees getCardBrandPercentFees() | setCardBrandPercentFees(MerchantWebhookCardBrandPercentFees cardBrandPercentFees) |
| `SubscriptionConfiguration` | [`MerchantWebhookSubscriptionConfiguration`](../../doc/models/merchant-webhook-subscription-configuration.md) | Optional | Subscription feature configuration. | MerchantWebhookSubscriptionConfiguration getSubscriptionConfiguration() | setSubscriptionConfiguration(MerchantWebhookSubscriptionConfiguration subscriptionConfiguration) |
| `CustomerManagementConfiguration` | [`MerchantWebhookCustomerManagementConfiguration`](../../doc/models/merchant-webhook-customer-management-configuration.md) | Optional | Customer-management defaults. | MerchantWebhookCustomerManagementConfiguration getCustomerManagementConfiguration() | setCustomerManagementConfiguration(MerchantWebhookCustomerManagementConfiguration customerManagementConfiguration) |
| `DescriptorProvidedConfiguration` | `Boolean` | Optional | Whether statement descriptors can be provided by merchants. | Boolean getDescriptorProvidedConfiguration() | setDescriptorProvidedConfiguration(Boolean descriptorProvidedConfiguration) |
| `CardConfiguration` | [`MerchantWebhookCardConfiguration`](../../doc/models/merchant-webhook-card-configuration.md) | Optional | Card payment settings. | MerchantWebhookCardConfiguration getCardConfiguration() | setCardConfiguration(MerchantWebhookCardConfiguration cardConfiguration) |
| `QrScanConfiguration` | [`MerchantWebhookQrScanConfiguration`](../../doc/models/merchant-webhook-qr-scan-configuration.md) | Optional | QR scan payment settings. | MerchantWebhookQrScanConfiguration getQrScanConfiguration() | setQrScanConfiguration(MerchantWebhookQrScanConfiguration qrScanConfiguration) |
| `ConvenienceConfiguration` | [`MerchantWebhookConvenienceConfiguration`](../../doc/models/merchant-webhook-convenience-configuration.md) | Optional | Convenience-store payment settings. | MerchantWebhookConvenienceConfiguration getConvenienceConfiguration() | setConvenienceConfiguration(MerchantWebhookConvenienceConfiguration convenienceConfiguration) |
| `PaidyConfiguration` | [`MerchantWebhookPaidyConfiguration`](../../doc/models/merchant-webhook-paidy-configuration.md) | Optional | Paidy payment settings. | MerchantWebhookPaidyConfiguration getPaidyConfiguration() | setPaidyConfiguration(MerchantWebhookPaidyConfiguration paidyConfiguration) |
| `QrMerchantConfiguration` | [`MerchantWebhookQrMerchantConfiguration`](../../doc/models/merchant-webhook-qr-merchant-configuration.md) | Optional | QR merchant payment settings. | MerchantWebhookQrMerchantConfiguration getQrMerchantConfiguration() | setQrMerchantConfiguration(MerchantWebhookQrMerchantConfiguration qrMerchantConfiguration) |
| `OnlineConfiguration` | [`MerchantWebhookOnlineConfiguration`](../../doc/models/merchant-webhook-online-configuration.md) | Optional | Online payment settings. | MerchantWebhookOnlineConfiguration getOnlineConfiguration() | setOnlineConfiguration(MerchantWebhookOnlineConfiguration onlineConfiguration) |
| `BankTransferConfiguration` | [`MerchantWebhookBankTransferConfiguration`](../../doc/models/merchant-webhook-bank-transfer-configuration.md) | Optional | Bank transfer payment settings. | MerchantWebhookBankTransferConfiguration getBankTransferConfiguration() | setBankTransferConfiguration(MerchantWebhookBankTransferConfiguration bankTransferConfiguration) |
| `PlatformCredentialsEnabled` | `Boolean` | Optional | Whether platform credentials are enabled. | Boolean getPlatformCredentialsEnabled() | setPlatformCredentialsEnabled(Boolean platformCredentialsEnabled) |
| `TaggedPlatformCredentialsEnabled` | `Boolean` | Optional | Whether tagged platform credentials are enabled. | Boolean getTaggedPlatformCredentialsEnabled() | setTaggedPlatformCredentialsEnabled(Boolean taggedPlatformCredentialsEnabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.CardProcessorInstallmentConfig;
import com.univapay.api.models.MerchantWebhookBankTransferConfiguration;
import com.univapay.api.models.MerchantWebhookCardBrandPercentFees;
import com.univapay.api.models.MerchantWebhookCardConfiguration;
import com.univapay.api.models.MerchantWebhookCheckoutConfiguration;
import com.univapay.api.models.MerchantWebhookCheckoutToggle;
import com.univapay.api.models.MerchantWebhookConfiguration;
import com.univapay.api.models.MerchantWebhookConvenienceConfiguration;
import com.univapay.api.models.MerchantWebhookCustomerManagementConfiguration;
import com.univapay.api.models.MerchantWebhookInstallmentPlanConfiguration;
import com.univapay.api.models.MerchantWebhookLimitRefundBySalesConfiguration;
import com.univapay.api.models.MerchantWebhookMoneyAmount;
import com.univapay.api.models.MerchantWebhookOnlineConfiguration;
import com.univapay.api.models.MerchantWebhookPaidyConfiguration;
import com.univapay.api.models.MerchantWebhookQrMerchantConfiguration;
import com.univapay.api.models.MerchantWebhookQrScanConfiguration;
import com.univapay.api.models.MerchantWebhookRecurringCvvConfirmationConfig;
import com.univapay.api.models.MerchantWebhookRecurringTokenConfiguration;
import com.univapay.api.models.MerchantWebhookSecurityConfiguration;
import com.univapay.api.models.MerchantWebhookSubscriptionConfiguration;
import com.univapay.api.models.MerchantWebhookSubscriptionPlanConfiguration;
import com.univapay.api.models.MerchantWebhookTransferScheduleConfiguration;
import com.univapay.api.models.MerchantWebhookUserTransactionsConfiguration;
import com.univapay.api.models.RestrictIpAfterFailedChargeConfig;
import java.util.Arrays;

MerchantWebhookConfiguration merchantWebhookConfiguration = new MerchantWebhookConfiguration.Builder()
    .percentFee(3.6D)
    .flatFees(Arrays.asList(
        new MerchantWebhookMoneyAmount.Builder()
            .amount(100)
            .currency("JPY")
            .build()
    ))
    .country("JP")
    .language("ja")
    .displayTimeZone("Asia/Tokyo")
    .minTransferPayout(new MerchantWebhookMoneyAmount.Builder()
        .amount(5000)
        .currency("JPY")
        .build())
    .minimumChargeAmounts(Arrays.asList(
        new MerchantWebhookMoneyAmount.Builder()
            .amount(100)
            .currency("JPY")
            .build()
    ))
    .maximumChargeAmounts(Arrays.asList(
        new MerchantWebhookMoneyAmount.Builder()
            .amount(100000)
            .currency("JPY")
            .build()
    ))
    .transferSchedule(new MerchantWebhookTransferScheduleConfiguration.Builder()
        .waitPeriod("P7D")
        .period("weekly")
        .fullPeriodRequired(false)
        .weeklyClosingDay("sunday")
        .weeklyPayoutDay("friday")
        .build())
    .userTransactionsConfiguration(new MerchantWebhookUserTransactionsConfiguration.Builder()
        .enabled(true)
        .notifyCustomer(true)
        .notifyOnWebhookFailure(true)
        .notifyOnWebhookDisabled(true)
        .notifyOnSubscriptions(true)
        .build())
    .recurringTokenConfiguration(new MerchantWebhookRecurringTokenConfiguration.Builder()
        .recurringType("infinite")
        .chargeWaitPeriod("P7D")
        .cardChargeCvvConfirmation(new MerchantWebhookRecurringCvvConfirmationConfig.Builder()
            .enabled(false)
            .build())
        .build())
    .securityConfiguration(new MerchantWebhookSecurityConfiguration.Builder()
        .cardChargeCooldown("PT5M")
        .subscriptionCooldown("PT10M")
        .restrictIpAfterFailedCharge(new RestrictIpAfterFailedChargeConfig.Builder()
            .enabled(true)
            .count(5)
            .cooldown("PT1H")
            .build())
        .refundPercentLimit(100D)
        .confirmationRequired(false)
        .minRefundThreshold(100)
        .limitRefundBySales(new MerchantWebhookLimitRefundBySalesConfiguration.Builder()
            .enabled(true)
            .period("monthly")
            .rollingWindow(true)
            .build())
        .build())
    .checkoutConfiguration(new MerchantWebhookCheckoutConfiguration.Builder()
        .ecEmail(new MerchantWebhookCheckoutToggle.Builder()
            .enabled(true)
            .build())
        .ecProducts(new MerchantWebhookCheckoutToggle.Builder()
            .enabled(true)
            .build())
        .build())
    .installmentsConfiguration(new MerchantWebhookInstallmentPlanConfiguration.Builder()
        .enabled(true)
        .cardProcessor(new CardProcessorInstallmentConfig.Builder()
            .revolving(true)
            .fixedCycle(true)
            .build())
        .supportedPaymentTypes(Arrays.asList(
            "card"
        ))
        .minChargeAmount(new MerchantWebhookMoneyAmount.Builder()
            .amount(3000)
            .currency("JPY")
            .build())
        .maxPayoutPeriod("P12M")
        .onlyWithProcessor(true)
        .build())
    .subscriptionPlanConfiguration(new MerchantWebhookSubscriptionPlanConfiguration.Builder()
        .enabled(true)
        .fixedCycle(true)
        .fixedCycleAmount(true)
        .supportedPaymentTypes(Arrays.asList(
            "card"
        ))
        .minChargeAmount(new MerchantWebhookMoneyAmount.Builder()
            .amount(3000)
            .currency("JPY")
            .build())
        .maxPayoutPeriod("P12M")
        .build())
    .cardBrandPercentFees(new MerchantWebhookCardBrandPercentFees.Builder()
        .visa(3.6D)
        .mastercard(3.6D)
        .jcb(3.8D)
        .build())
    .subscriptionConfiguration(new MerchantWebhookSubscriptionConfiguration.Builder()
        .enabled(true)
        .failedChargesToCancel(3)
        .suspendOnCancel(true)
        .allowMerchantAmountPatch(false)
        .allowMerchantDueDatePatch(false)
        .build())
    .customerManagementConfiguration(new MerchantWebhookCustomerManagementConfiguration.Builder()
        .enabled(true)
        .defaultRoles(Arrays.asList(
            "end_user"
        ))
        .defaultMode("live")
        .build())
    .descriptorProvidedConfiguration(false)
    .cardConfiguration(new MerchantWebhookCardConfiguration.Builder()
        .enabled(true)
        .debitEnabled(true)
        .prepaidEnabled(false)
        .foreignCardsAllowed(false)
        .threeDsRequired(true)
        .allowDirectTokenCreation(false)
        .build())
    .qrScanConfiguration(new MerchantWebhookQrScanConfiguration.Builder()
        .enabled(true)
        .forbiddenQrScanGateways(Arrays.asList(
            "wechat"
        ))
        .build())
    .convenienceConfiguration(new MerchantWebhookConvenienceConfiguration.Builder()
        .enabled(true)
        .expiration("P3D")
        .build())
    .paidyConfiguration(new MerchantWebhookPaidyConfiguration.Builder()
        .enabled(false)
        .build())
    .qrMerchantConfiguration(new MerchantWebhookQrMerchantConfiguration.Builder()
        .enabled(false)
        .build())
    .onlineConfiguration(new MerchantWebhookOnlineConfiguration.Builder()
        .enabled(true)
        .build())
    .bankTransferConfiguration(new MerchantWebhookBankTransferConfiguration.Builder()
        .enabled(true)
        .matchAmount(true)
        .expiration("P7D")
        .virtualBankAccountsThreshold(50)
        .virtualBankAccountsFetchCount(25)
        .defaultExtensionPeriod("P3D")
        .maximumExtensionPeriod("P30D")
        .automaticExtensionEnabled(true)
        .chargeRequestNotificationEnabled(true)
        .depositReceivedNotificationEnabled(true)
        .remindNotificationPeriod("P2D")
        .remindNotificationEnabled(true)
        .build())
    .platformCredentialsEnabled(true)
    .taggedPlatformCredentialsEnabled(false)
    .build();
```

