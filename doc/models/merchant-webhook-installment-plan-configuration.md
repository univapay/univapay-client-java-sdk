
# Merchant Webhook Installment Plan Configuration

Installment plan configuration.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookInstallmentPlanConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables installment plan features for eligible payments. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `CardProcessor` | [`CardProcessorInstallmentConfig`](../../doc/models/card-processor-installment-config.md) | Optional | Card-processor capabilities available for installment payments. | CardProcessorInstallmentConfig getCardProcessor() | setCardProcessor(CardProcessorInstallmentConfig cardProcessor) |
| `SupportedPaymentTypes` | `List<String>` | Optional | Payment types that can use installment plans. | List<String> getSupportedPaymentTypes() | setSupportedPaymentTypes(List<String> supportedPaymentTypes) |
| `MinChargeAmount` | [`MerchantWebhookMoneyAmount`](../../doc/models/merchant-webhook-money-amount.md) | Optional | Monetary amount object serialized by backend config models. | MerchantWebhookMoneyAmount getMinChargeAmount() | setMinChargeAmount(MerchantWebhookMoneyAmount minChargeAmount) |
| `MaxPayoutPeriod` | `String` | Optional | Maximum payout delay allowed for installment settlements. | String getMaxPayoutPeriod() | setMaxPayoutPeriod(String maxPayoutPeriod) |
| `OnlyWithProcessor` | `Boolean` | Optional | Restricts installment use to processor-backed flows. | Boolean getOnlyWithProcessor() | setOnlyWithProcessor(Boolean onlyWithProcessor) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CardProcessorInstallmentConfig;
import com.univapay.api.models.MerchantWebhookInstallmentPlanConfiguration;
import com.univapay.api.models.MerchantWebhookMoneyAmount;
import java.io.IOException;
import java.util.Arrays;

MerchantWebhookInstallmentPlanConfiguration merchantWebhookInstallmentPlanConfiguration = new MerchantWebhookInstallmentPlanConfiguration.Builder()
    .enabled(true)
    .cardProcessor(new CardProcessorInstallmentConfig.Builder()
        .revolving(true)
        .fixedCycle(true)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .supportedPaymentTypes(Arrays.asList(
        "card"
    ))
    .minChargeAmount(new MerchantWebhookMoneyAmount.Builder()
        .amount(3000)
        .currency("JPY")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .maxPayoutPeriod("P12M")
    .onlyWithProcessor(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

