
# Checkout Subscription Plan Configuration

Univapay-side subscription plan configuration applied to checkout.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutSubscriptionPlanConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether subscription plans are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `FixedCycle` | `Boolean` | Optional | Whether fixed-cycle subscription plans are allowed. | Boolean getFixedCycle() | setFixedCycle(Boolean fixedCycle) |
| `FixedCycleAmount` | `Boolean` | Optional | Whether fixed-cycle-amount subscription plans are allowed. | Boolean getFixedCycleAmount() | setFixedCycleAmount(Boolean fixedCycleAmount) |
| `SupportedPaymentTypes` | [`List<CheckoutPaymentType>`](../../doc/models/checkout-payment-type.md) | Optional | Payment types eligible for subscription plans. | List<CheckoutPaymentType> getSupportedPaymentTypes() | setSupportedPaymentTypes(List<CheckoutPaymentType> supportedPaymentTypes) |
| `MinChargeAmount` | [`CheckoutMoneyAmount`](../../doc/models/checkout-money-amount.md) | Optional | Minimum charge amount eligible for subscription plans. `null` when unrestricted. | CheckoutMoneyAmount getMinChargeAmount() | setMinChargeAmount(CheckoutMoneyAmount minChargeAmount) |
| `MaxPayoutPeriod` | `String` | Optional | ISO-8601 period bounding the maximum payout delay for subscription settlements. `null` when unrestricted. | String getMaxPayoutPeriod() | setMaxPayoutPeriod(String maxPayoutPeriod) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutPaymentType;
import com.univapay.api.models.CheckoutSubscriptionPlanConfiguration;
import java.io.IOException;
import java.util.Arrays;

CheckoutSubscriptionPlanConfiguration checkoutSubscriptionPlanConfiguration = new CheckoutSubscriptionPlanConfiguration.Builder()
    .enabled(true)
    .fixedCycle(true)
    .fixedCycleAmount(true)
    .supportedPaymentTypes(Arrays.asList(
        CheckoutPaymentType.CARD
    ))
    .minChargeAmount(null)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

