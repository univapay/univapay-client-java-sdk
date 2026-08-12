
# Merchant Webhook Subscription Configuration

Subscription feature configuration.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookSubscriptionConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables subscription payments. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `FailedChargesToCancel` | `Integer` | Optional | Number of failed charges allowed before cancellation. | Integer getFailedChargesToCancel() | setFailedChargesToCancel(Integer failedChargesToCancel) |
| `SuspendOnCancel` | `Boolean` | Optional | Suspends the subscription when its latest charge is canceled. | Boolean getSuspendOnCancel() | setSuspendOnCancel(Boolean suspendOnCancel) |
| `AllowMerchantAmountPatch` | `Boolean` | Optional | Allows merchants to update scheduled subscription amounts. | Boolean getAllowMerchantAmountPatch() | setAllowMerchantAmountPatch(Boolean allowMerchantAmountPatch) |
| `AllowMerchantDueDatePatch` | `Boolean` | Optional | Allows merchants to update scheduled subscription due dates. | Boolean getAllowMerchantDueDatePatch() | setAllowMerchantDueDatePatch(Boolean allowMerchantDueDatePatch) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookSubscriptionConfiguration;

MerchantWebhookSubscriptionConfiguration merchantWebhookSubscriptionConfiguration = new MerchantWebhookSubscriptionConfiguration.Builder()
    .enabled(true)
    .failedChargesToCancel(3)
    .suspendOnCancel(true)
    .allowMerchantAmountPatch(false)
    .allowMerchantDueDatePatch(false)
    .build();
```

