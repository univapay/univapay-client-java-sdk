
# Merchant Webhook Security Configuration

Merchant-level fraud and refund safety settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookSecurityConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CardChargeCooldown` | `String` | Optional | ISO-8601 duration between card charge attempts. | String getCardChargeCooldown() | setCardChargeCooldown(String cardChargeCooldown) |
| `SubscriptionCooldown` | `String` | Optional | ISO-8601 duration between subscription charge attempts. | String getSubscriptionCooldown() | setSubscriptionCooldown(String subscriptionCooldown) |
| `IdempotentCardChargeCooldown` | `String` | Optional | ISO-8601 duration for reusing an idempotent card charge key. | String getIdempotentCardChargeCooldown() | setIdempotentCardChargeCooldown(String idempotentCardChargeCooldown) |
| `IdempotentSubscriptionCooldown` | `String` | Optional | ISO-8601 duration for reusing an idempotent subscription key. | String getIdempotentSubscriptionCooldown() | setIdempotentSubscriptionCooldown(String idempotentSubscriptionCooldown) |
| `RestrictIpAfterFailedCharge` | [`RestrictIpAfterFailedChargeConfig`](../../doc/models/restrict-ip-after-failed-charge-config.md) | Optional | IP restriction policy applied after repeated failed charges. | RestrictIpAfterFailedChargeConfig getRestrictIpAfterFailedCharge() | setRestrictIpAfterFailedCharge(RestrictIpAfterFailedChargeConfig restrictIpAfterFailedCharge) |
| `InspectSuspiciousLoginAfter` | `String` | Optional | Look-back period used to review suspicious login activity. | String getInspectSuspiciousLoginAfter() | setInspectSuspiciousLoginAfter(String inspectSuspiciousLoginAfter) |
| `RefundPercentLimit` | `Double` | Optional | Maximum refund-to-sales percentage allowed before restriction. | Double getRefundPercentLimit() | setRefundPercentLimit(Double refundPercentLimit) |
| `LimitChargeByCardConfiguration` | [`MerchantWebhookLimitChargeByCardConfiguration`](../../doc/models/merchant-webhook-limit-charge-by-card-configuration.md) | Optional | Per-card velocity limit configuration. | MerchantWebhookLimitChargeByCardConfiguration getLimitChargeByCardConfiguration() | setLimitChargeByCardConfiguration(MerchantWebhookLimitChargeByCardConfiguration limitChargeByCardConfiguration) |
| `ConfirmationRequired` | `Boolean` | Optional | Requires confirmation before protected refund actions proceed. | Boolean getConfirmationRequired() | setConfirmationRequired(Boolean confirmationRequired) |
| `MinRefundThreshold` | `Integer` | Optional | Minimum refund amount, in minor units, subject to confirmation checks. | Integer getMinRefundThreshold() | setMinRefundThreshold(Integer minRefundThreshold) |
| `LimitRefundBySales` | [`MerchantWebhookLimitRefundBySalesConfiguration`](../../doc/models/merchant-webhook-limit-refund-by-sales-configuration.md) | Optional | Refund-limiting configuration based on sales history. | MerchantWebhookLimitRefundBySalesConfiguration getLimitRefundBySales() | setLimitRefundBySales(MerchantWebhookLimitRefundBySalesConfiguration limitRefundBySales) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookLimitRefundBySalesConfiguration;
import com.univapay.api.models.MerchantWebhookSecurityConfiguration;
import com.univapay.api.models.RestrictIpAfterFailedChargeConfig;

MerchantWebhookSecurityConfiguration merchantWebhookSecurityConfiguration = new MerchantWebhookSecurityConfiguration.Builder()
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
    .build();
```

