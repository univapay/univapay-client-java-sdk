
# Subscription

The Subscription object represents a recurring payment schedule.

*This model accepts additional fields of type Object.*

## Structure

`Subscription`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier. | UUID getId() | setId(UUID id) |
| `StoreId` | `UUID` | Optional | Store identifier. | UUID getStoreId() | setStoreId(UUID storeId) |
| `TransactionTokenId` | `UUID` | Optional | Transaction token identifier. | UUID getTransactionTokenId() | setTransactionTokenId(UUID transactionTokenId) |
| `Amount` | `Integer` | Optional | Amount in the smallest currency unit. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AmountFormatted` | `Double` | Optional | Amount formatted for display. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `InitialAmount` | `Integer` | Optional | Initial amount in the smallest currency unit. | Integer getInitialAmount() | setInitialAmount(Integer initialAmount) |
| `InitialAmountFormatted` | `Double` | Optional | Initial amount formatted for display. | Double getInitialAmountFormatted() | setInitialAmountFormatted(Double initialAmountFormatted) |
| `SubsequentCyclesStart` | `LocalDateTime` | Optional | Timestamp when recurring cycles begin. | LocalDateTime getSubsequentCyclesStart() | setSubsequentCyclesStart(LocalDateTime subsequentCyclesStart) |
| `ScheduleSettings` | [`SubscriptionScheduleSettings`](../../doc/models/subscription-schedule-settings.md) | Optional | Schedule settings applied to a subscription. | SubscriptionScheduleSettings getScheduleSettings() | setScheduleSettings(SubscriptionScheduleSettings scheduleSettings) |
| `OnlyDirectCurrency` | `Boolean` | Optional | Whether only direct currency processing is allowed. | Boolean getOnlyDirectCurrency() | setOnlyDirectCurrency(Boolean onlyDirectCurrency) |
| `FirstChargeCaptureAfter` | `String` | Optional | ISO-8601 Duration (e.g., P3D). | String getFirstChargeCaptureAfter() | setFirstChargeCaptureAfter(String firstChargeCaptureAfter) |
| `FirstChargeAuthorizationOnly` | `Boolean` | Optional | Whether the first charge is authorization-only. | Boolean getFirstChargeAuthorizationOnly() | setFirstChargeAuthorizationOnly(Boolean firstChargeAuthorizationOnly) |
| `Status` | [`SubscriptionStatus`](../../doc/models/subscription-status.md) | Optional | Subscription Status schema. | SubscriptionStatus getStatus() | setStatus(SubscriptionStatus status) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Mode` | [`ChargeMode`](../../doc/models/charge-mode.md) | Optional | Charge Mode schema. | ChargeMode getMode() | setMode(ChargeMode mode) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `ThreeDs` | [`SubscriptionThreeDs`](../../doc/models/subscription-three-ds.md) | Optional | 3-D Secure configuration and redirect details applied to the subscription's payments. | SubscriptionThreeDs getThreeDs() | setThreeDs(SubscriptionThreeDs threeDs) |
| `Period` | [`SubscriptionPeriod`](../../doc/models/subscription-period.md) | Optional | Subscription Period schema. | SubscriptionPeriod getPeriod() | setPeriod(SubscriptionPeriod period) |
| `CyclicalPeriod` | `String` | Optional | ISO-8601 Duration for a custom billing frequency (e.g., P3D, P1M), returned instead of `period` when the subscription uses a custom cycle length rather than one of the fixed period presets. Mutually exclusive with `period` — exactly one of the two is present. | String getCyclicalPeriod() | setCyclicalPeriod(String cyclicalPeriod) |
| `NextPayment` | [`SubscriptionNextPayment`](../../doc/models/subscription-next-payment.md) | Optional | Next scheduled payment details for a subscription. | SubscriptionNextPayment getNextPayment() | setNextPayment(SubscriptionNextPayment nextPayment) |
| `CyclesLeft` | `Integer` | Optional | Number of remaining billing cycles before the subscription completes. Only present for cycle-limited plans (`subscription_plan` or `installment_plan`); `null` for indefinite subscriptions.<br><br>**Constraints**: `>= 0` | Integer getCyclesLeft() | setCyclesLeft(Integer cyclesLeft) |
| `SubscriptionPlan` | [`SubscriptionPlanSettings`](../../doc/models/subscription-plan-settings.md) | Optional | Configuration for limited-cycle subscriptions (Univapay side). | SubscriptionPlanSettings getSubscriptionPlan() | setSubscriptionPlan(SubscriptionPlanSettings subscriptionPlan) |
| `InstallmentPlan` | [`SubscriptionInstallmentPlanResponse`](../../doc/models/subscription-installment-plan-response.md) | Optional | Installment plan applied to the subscription, as returned by the API. Covers both card-network installment plans (`revolving`, `fixed_cycles`) and legacy fixed-amount installment plans (`fixed_cycle_amount`). | SubscriptionInstallmentPlanResponse getInstallmentPlan() | setInstallmentPlan(SubscriptionInstallmentPlanResponse installmentPlan) |
| `ChargeId` | `UUID` | Optional | Identifier of the charge associated with the subscription's installment plan. Only present when `installment_plan` is set. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `AmountLeft` | `Integer` | Optional | Remaining amount to be charged over the life of the plan, in the smallest currency unit. Only present for cycle-limited plans.<br><br>**Constraints**: `>= 0` | Integer getAmountLeft() | setAmountLeft(Integer amountLeft) |
| `AmountLeftFormatted` | `Double` | Optional | `amount_left` formatted for display. | Double getAmountLeftFormatted() | setAmountLeftFormatted(Double amountLeftFormatted) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.CombinedInstallmentFixedCycles;
import com.univapay.api.models.CombinedPlanType;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.PlanSettingsType;
import com.univapay.api.models.Subscription;
import com.univapay.api.models.SubscriptionInstallmentPlanResponse;
import com.univapay.api.models.SubscriptionNextPayment;
import com.univapay.api.models.SubscriptionPeriod;
import com.univapay.api.models.SubscriptionPlanSettings;
import com.univapay.api.models.SubscriptionScheduleSettings;
import com.univapay.api.models.SubscriptionStatus;
import com.univapay.api.models.SubscriptionTerminationMode;
import com.univapay.api.models.SubscriptionThreeDs;
import com.univapay.api.models.SubscriptionThreeDsMode;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;
import java.util.UUID;

Subscription subscription = new Subscription.Builder()
    .id(UUID.fromString("11ef335e-9aa5-c54a-8313-7f9847da313a"))
    .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
    .transactionTokenId(UUID.fromString("11ef32a7-3a71-8662-803f-1bc27702eeec"))
    .amount(1250)
    .currency("USD")
    .amountFormatted(12.5D)
    .scheduleSettings(new SubscriptionScheduleSettings.Builder()
        .startOn(DateTimeHelper.fromSimpleDate("2016-03-13"))
        .zoneId("zone_id8")
        .preserveEndOfMonth(false)
        .retryInterval("retry_interval2")
        .terminationMode(SubscriptionTerminationMode.IMMEDIATE)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .onlyDirectCurrency(false)
    .firstChargeAuthorizationOnly(false)
    .status(SubscriptionStatus.CURRENT)
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .univapayName("univapay-name8")
        .univapayPhoneNumber("univapay-phone-number2")
    .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
            "String4"
        ))
        .build())
    .mode(ChargeMode.LIVE)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-06-26T01:51:28.627023Z"))
    .threeDs(new SubscriptionThreeDs.Builder()
        .mode(SubscriptionThreeDsMode.NORMAL)
        .redirectEndpoint("redirect_endpoint8")
        .redirectId(UUID.fromString("000023a4-0000-0000-0000-000000000000"))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .period(SubscriptionPeriod.MONTHLY)
    .nextPayment(new SubscriptionNextPayment.Builder()
        .id(UUID.fromString("00000110-0000-0000-0000-000000000000"))
        .dueDate(DateTimeHelper.fromSimpleDate("2016-03-13"))
        .zoneId("zone_id8")
        .amount(126)
        .currency("currency8")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .subscriptionPlan(new SubscriptionPlanSettings.Builder()
        .planType(PlanSettingsType.FIXED_CYCLES)
        .fixedCycles(46)
        .fixedCycleAmount(112)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .installmentPlan(new SubscriptionInstallmentPlanResponse.Builder()
        .planType(CombinedPlanType.FIXED_CYCLES)
        .fixedCycles(CombinedInstallmentFixedCycles.CYCLES_12)
        .fixedCyclesAmount(198)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

