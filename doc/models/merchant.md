
# Merchant

Merchant resource returned by the backend `FullMerchantWithGroupRoles` formatter for merchant-authenticated callers.

*This model accepts additional fields of type Object.*

## Structure

`Merchant`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Merchant identifier. | UUID getId() | setId(UUID id) |
| `VerificationDataId` | `UUID` | Optional | Verification data identifier associated with the merchant. | UUID getVerificationDataId() | setVerificationDataId(UUID verificationDataId) |
| `Name` | `String` | Optional | Merchant display name. | String getName() | setName(String name) |
| `Email` | `String` | Optional | Primary merchant email address. | String getEmail() | setEmail(String email) |
| `NotificationEmail` | `String` | Optional | Merchant notification email address. | String getNotificationEmail() | setNotificationEmail(String notificationEmail) |
| `FinanceNotificationEmail` | `String` | Optional | Merchant finance notification email address. | String getFinanceNotificationEmail() | setFinanceNotificationEmail(String financeNotificationEmail) |
| `Verified` | `Boolean` | Optional | Whether the merchant has completed verification. | Boolean getVerified() | setVerified(Boolean verified) |
| `Configuration` | [`MerchantWebhookConfiguration`](../../doc/models/merchant-webhook-configuration.md) | Optional | Merchant configuration snapshot as serialized by the backend. | MerchantWebhookConfiguration getConfiguration() | setConfiguration(MerchantWebhookConfiguration configuration) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the merchant was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.CardProcessorInstallmentConfig;
import com.univapay.api.models.Merchant;
import com.univapay.api.models.MerchantWebhookBankTransferConfiguration;
import com.univapay.api.models.MerchantWebhookCardBrandPercentFees;
import com.univapay.api.models.MerchantWebhookCardConfiguration;
import com.univapay.api.models.MerchantWebhookConfiguration;
import com.univapay.api.models.MerchantWebhookConvenienceConfiguration;
import com.univapay.api.models.MerchantWebhookInstallmentPlanConfiguration;
import com.univapay.api.models.MerchantWebhookLimitRefundBySalesConfiguration;
import com.univapay.api.models.MerchantWebhookMoneyAmount;
import com.univapay.api.models.MerchantWebhookOnlineConfiguration;
import com.univapay.api.models.MerchantWebhookPaidyConfiguration;
import com.univapay.api.models.MerchantWebhookQrScanConfiguration;
import com.univapay.api.models.MerchantWebhookRecurringCvvConfirmationConfig;
import com.univapay.api.models.MerchantWebhookRecurringTokenConfiguration;
import com.univapay.api.models.MerchantWebhookSecurityConfiguration;
import com.univapay.api.models.MerchantWebhookUserTransactionsConfiguration;
import com.univapay.api.models.RestrictIpAfterFailedChargeConfig;
import java.util.Arrays;
import java.util.UUID;

Merchant merchant = new Merchant.Builder()
    .id(UUID.fromString("11ef0000-0000-4000-8000-000000000020"))
    .verificationDataId(UUID.fromString("11ef0000-0000-4000-8000-000000000021"))
    .name("Example Merchant")
    .email("owner@example.com")
    .notificationEmail("alerts@example.com")
    .financeNotificationEmail("finance@example.com")
    .verified(true)
    .configuration(new MerchantWebhookConfiguration.Builder()
        .percentFee(3.6D)
        .country("JP")
        .language("ja")
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
        .userTransactionsConfiguration(new MerchantWebhookUserTransactionsConfiguration.Builder()
            .enabled(true)
            .notifyCustomer(true)
            .notifyOnWebhookFailure(true)
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
        .cardBrandPercentFees(new MerchantWebhookCardBrandPercentFees.Builder()
            .visa(3.6D)
            .mastercard(3.6D)
            .jcb(3.8D)
            .build())
        .cardConfiguration(new MerchantWebhookCardConfiguration.Builder()
            .enabled(true)
            .debitEnabled(true)
            .prepaidEnabled(false)
            .threeDsRequired(true)
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
        .onlineConfiguration(new MerchantWebhookOnlineConfiguration.Builder()
            .enabled(true)
            .build())
        .bankTransferConfiguration(new MerchantWebhookBankTransferConfiguration.Builder()
            .enabled(true)
            .matchAmount(true)
            .expiration("P7D")
            .build())
        .build())
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .build();
```

