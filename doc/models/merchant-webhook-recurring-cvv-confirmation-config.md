
# Merchant Webhook Recurring Cvv Confirmation Config

CVV confirmation rules for recurring token charges.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookRecurringCvvConfirmationConfig`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables recurring-charge CVV confirmation checks. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Threshold` | [`List<MerchantWebhookMoneyAmount>`](../../doc/models/merchant-webhook-money-amount.md) | Optional | Amount thresholds that trigger CVV confirmation. | List<MerchantWebhookMoneyAmount> getThreshold() | setThreshold(List<MerchantWebhookMoneyAmount> threshold) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookRecurringCvvConfirmationConfig;

MerchantWebhookRecurringCvvConfirmationConfig merchantWebhookRecurringCvvConfirmationConfig = new MerchantWebhookRecurringCvvConfirmationConfig.Builder()
    .enabled(false)
    .build();
```

