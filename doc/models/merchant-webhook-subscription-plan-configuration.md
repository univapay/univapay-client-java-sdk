
# Merchant Webhook Subscription Plan Configuration

Subscription plan configuration.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookSubscriptionPlanConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables limited-cycle subscription plans. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `FixedCycle` | `Boolean` | Optional | Allows plans limited by a fixed number of cycles. | Boolean getFixedCycle() | setFixedCycle(Boolean fixedCycle) |
| `FixedCycleAmount` | `Boolean` | Optional | Allows plans limited by a total target amount. | Boolean getFixedCycleAmount() | setFixedCycleAmount(Boolean fixedCycleAmount) |
| `SupportedPaymentTypes` | `List<String>` | Optional | Payment types that can use subscription plans. | List<String> getSupportedPaymentTypes() | setSupportedPaymentTypes(List<String> supportedPaymentTypes) |
| `MinChargeAmount` | [`MerchantWebhookMoneyAmount`](../../doc/models/merchant-webhook-money-amount.md) | Optional | Monetary amount object serialized by backend config models. | MerchantWebhookMoneyAmount getMinChargeAmount() | setMinChargeAmount(MerchantWebhookMoneyAmount minChargeAmount) |
| `MaxPayoutPeriod` | `String` | Optional | Maximum payout delay allowed for subscription plan settlements. | String getMaxPayoutPeriod() | setMaxPayoutPeriod(String maxPayoutPeriod) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookMoneyAmount;
import com.univapay.api.models.MerchantWebhookSubscriptionPlanConfiguration;
import java.util.Arrays;

MerchantWebhookSubscriptionPlanConfiguration merchantWebhookSubscriptionPlanConfiguration = new MerchantWebhookSubscriptionPlanConfiguration.Builder()
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
    .build();
```

