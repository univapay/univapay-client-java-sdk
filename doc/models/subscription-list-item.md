
# Subscription List Item

Subscription entry returned in list responses.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionListItem`

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
| `Period` | [`SubscriptionPeriod`](../../doc/models/subscription-period.md) | Optional | Subscription Period schema. | SubscriptionPeriod getPeriod() | setPeriod(SubscriptionPeriod period) |
| `NextPayment` | [`SubscriptionNextPayment`](../../doc/models/subscription-next-payment.md) | Optional | Next scheduled payment details for a subscription. | SubscriptionNextPayment getNextPayment() | setNextPayment(SubscriptionNextPayment nextPayment) |
| `MerchantName` | `String` | Optional | Merchant display name. | String getMerchantName() | setMerchantName(String merchantName) |
| `StoreName` | `String` | Optional | Store display name. | String getStoreName() | setStoreName(String storeName) |
| `PaymentType` | `String` | Optional | Payment method type. | String getPaymentType() | setPaymentType(String paymentType) |
| `NextPaymentDate` | `LocalDate` | Optional | Next payment date value. | LocalDate getNextPaymentDate() | setNextPaymentDate(LocalDate nextPaymentDate) |
| `UserData` | [`SubscriptionUserData`](../../doc/models/subscription-user-data.md) | Optional | Customer-facing payment method summary data. | SubscriptionUserData getUserData() | setUserData(SubscriptionUserData userData) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.SubscriptionListItem;
import com.univapay.api.models.SubscriptionStatus;
import com.univapay.api.models.SubscriptionUserData;
import java.io.IOException;
import java.util.UUID;

SubscriptionListItem subscriptionListItem = new SubscriptionListItem.Builder()
    .id(UUID.fromString("11ef335e-9aa5-c54a-8313-7f9847da313a"))
    .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
    .transactionTokenId(UUID.fromString("11ef32a7-3a71-8662-803f-1bc27702eeec"))
    .amount(1250)
    .currency("USD")
    .amountFormatted(12.5D)
    .status(SubscriptionStatus.CURRENT)
    .merchantName("管理画面ガイド")
    .storeName("管理画面ガイド_TEST店舗")
    .paymentType("card")
    .nextPaymentDate(DateTimeHelper.fromSimpleDate("2024-07-26"))
    .userData(new SubscriptionUserData.Builder()
        .type("charge")
        .cardholderName("taro yamada")
        .email("test@test.com")
        .brand("visa")
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

