
# Checkout Installments Configuration

Installment plan configuration applied to checkout.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutInstallmentsConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether installment plans are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `CardProcessor` | [`CheckoutInstallmentCardProcessor`](../../doc/models/checkout-installment-card-processor.md) | Optional | Card-processor capabilities available for installment payments. | CheckoutInstallmentCardProcessor getCardProcessor() | setCardProcessor(CheckoutInstallmentCardProcessor cardProcessor) |
| `SupportedPaymentTypes` | [`List<CheckoutPaymentType>`](../../doc/models/checkout-payment-type.md) | Optional | Payment types eligible for installment plans. | List<CheckoutPaymentType> getSupportedPaymentTypes() | setSupportedPaymentTypes(List<CheckoutPaymentType> supportedPaymentTypes) |
| `MinChargeAmount` | [`CheckoutMoneyAmount`](../../doc/models/checkout-money-amount.md) | Optional | Minimum charge amount eligible for installment plans. `null` when unrestricted. | CheckoutMoneyAmount getMinChargeAmount() | setMinChargeAmount(CheckoutMoneyAmount minChargeAmount) |
| `MaxPayoutPeriod` | `String` | Optional | ISO-8601 period bounding the maximum payout delay for installment settlements. `null` when unrestricted. | String getMaxPayoutPeriod() | setMaxPayoutPeriod(String maxPayoutPeriod) |
| `OnlyWithProcessor` | `Boolean` | Optional | Whether installment plans are restricted to processor-backed flows. Always `true` — retained for backwards compatibility. | Boolean getOnlyWithProcessor() | setOnlyWithProcessor(Boolean onlyWithProcessor) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutInstallmentCardProcessor;
import com.univapay.api.models.CheckoutInstallmentsConfiguration;
import com.univapay.api.models.CheckoutPaymentType;
import java.io.IOException;
import java.util.Arrays;

CheckoutInstallmentsConfiguration checkoutInstallmentsConfiguration = new CheckoutInstallmentsConfiguration.Builder()
    .enabled(true)
    .cardProcessor(new CheckoutInstallmentCardProcessor.Builder()
        .revolving(false)
        .fixedCycle(false)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .supportedPaymentTypes(Arrays.asList(
        CheckoutPaymentType.CARD
    ))
    .minChargeAmount(null)
    .maxPayoutPeriod("max_payout_period8")
    .onlyWithProcessor(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

