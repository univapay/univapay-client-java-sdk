
# Merchant Webhook Recurring Token Configuration

Recurring token configuration inherited by the merchant.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookRecurringTokenConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RecurringType` | `String` | Optional | Merchant recurring-token privilege. | String getRecurringType() | setRecurringType(String recurringType) |
| `ChargeWaitPeriod` | `String` | Optional | ISO-8601 duration to wait before first recurring charge. | String getChargeWaitPeriod() | setChargeWaitPeriod(String chargeWaitPeriod) |
| `CardChargeCvvConfirmation` | [`MerchantWebhookRecurringCvvConfirmationConfig`](../../doc/models/merchant-webhook-recurring-cvv-confirmation-config.md) | Optional | CVV confirmation rules for recurring token charges. | MerchantWebhookRecurringCvvConfirmationConfig getCardChargeCvvConfirmation() | setCardChargeCvvConfirmation(MerchantWebhookRecurringCvvConfirmationConfig cardChargeCvvConfirmation) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.MerchantWebhookRecurringCvvConfirmationConfig;
import com.univapay.api.models.MerchantWebhookRecurringTokenConfiguration;
import java.io.IOException;
import java.util.Arrays;

MerchantWebhookRecurringTokenConfiguration merchantWebhookRecurringTokenConfiguration = new MerchantWebhookRecurringTokenConfiguration.Builder()
    .recurringType("infinite")
    .chargeWaitPeriod("P7D")
    .cardChargeCvvConfirmation(new MerchantWebhookRecurringCvvConfirmationConfig.Builder()
        .enabled(false)
        .threshold(Arrays.asList(
            null
        ))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

