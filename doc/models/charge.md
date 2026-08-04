
# Charge

Charge resource returned by the payments API.

*This model accepts additional fields of type Object.*

## Structure

`Charge`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier. | UUID getId() | setId(UUID id) |
| `StoreId` | `UUID` | Optional | Store identifier. | UUID getStoreId() | setStoreId(UUID storeId) |
| `TransactionTokenId` | `UUID` | Optional | Transaction token identifier. | UUID getTransactionTokenId() | setTransactionTokenId(UUID transactionTokenId) |
| `TransactionTokenType` | [`ChargeTransactionTokenType`](../../doc/models/charge-transaction-token-type.md) | Optional | Charge Transaction Token Type schema. | ChargeTransactionTokenType getTransactionTokenType() | setTransactionTokenType(ChargeTransactionTokenType transactionTokenType) |
| `SubscriptionId` | `UUID` | Optional | Subscription identifier. | UUID getSubscriptionId() | setSubscriptionId(UUID subscriptionId) |
| `MerchantTransactionId` | `String` | Optional | Merchant-defined transaction identifier. | String getMerchantTransactionId() | setMerchantTransactionId(String merchantTransactionId) |
| `RequestedAmount` | `Integer` | Optional | Requested amount in the smallest currency unit. | Integer getRequestedAmount() | setRequestedAmount(Integer requestedAmount) |
| `RequestedCurrency` | `String` | Optional | Requested ISO-4217 currency code. | String getRequestedCurrency() | setRequestedCurrency(String requestedCurrency) |
| `RequestedAmountFormatted` | `Double` | Optional | Requested amount formatted for display. | Double getRequestedAmountFormatted() | setRequestedAmountFormatted(Double requestedAmountFormatted) |
| `ChargedAmount` | `Integer` | Optional | Charged amount in the smallest currency unit. | Integer getChargedAmount() | setChargedAmount(Integer chargedAmount) |
| `ChargedCurrency` | `String` | Optional | Charged ISO-4217 currency code. | String getChargedCurrency() | setChargedCurrency(String chargedCurrency) |
| `ChargedAmountFormatted` | `Double` | Optional | Charged amount formatted for display. | Double getChargedAmountFormatted() | setChargedAmountFormatted(Double chargedAmountFormatted) |
| `FeeAmount` | `Integer` | Optional | Fee amount in the smallest currency unit. | Integer getFeeAmount() | setFeeAmount(Integer feeAmount) |
| `FeeCurrency` | `String` | Optional | Fee ISO-4217 currency code. | String getFeeCurrency() | setFeeCurrency(String feeCurrency) |
| `FeeAmountFormatted` | `Double` | Optional | Fee amount formatted for display. | Double getFeeAmountFormatted() | setFeeAmountFormatted(Double feeAmountFormatted) |
| `OnlyDirectCurrency` | `Boolean` | Optional | Whether only direct currency processing is allowed. | Boolean getOnlyDirectCurrency() | setOnlyDirectCurrency(Boolean onlyDirectCurrency) |
| `CaptureAt` | `LocalDateTime` | Optional | Timestamp when capture should occur. | LocalDateTime getCaptureAt() | setCaptureAt(LocalDateTime captureAt) |
| `Descriptor` | `String` | Optional | Billing descriptor. | String getDescriptor() | setDescriptor(String descriptor) |
| `DescriptorPhoneNumber` | `String` | Optional | Billing descriptor phone number. | String getDescriptorPhoneNumber() | setDescriptorPhoneNumber(String descriptorPhoneNumber) |
| `Status` | [`ChargeStatus`](../../doc/models/charge-status.md) | Optional | Charge Status schema. | ChargeStatus getStatus() | setStatus(ChargeStatus status) |
| `Error` | [`PaymentError`](../../doc/models/payment-error.md) | Optional | Payment error details, or null if successful. | PaymentError getError() | setError(PaymentError error) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `Mode` | [`ChargeMode`](../../doc/models/charge-mode.md) | Optional | Charge Mode schema. | ChargeMode getMode() | setMode(ChargeMode mode) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `MerchantName` | `String` | Optional | Merchant display name. | String getMerchantName() | setMerchantName(String merchantName) |
| `StoreName` | `String` | Optional | Store display name. | String getStoreName() | setStoreName(String storeName) |
| `Redirect` | [`ChargeRedirect`](../../doc/models/charge-redirect.md) | Optional | Charge Redirect schema. | ChargeRedirect getRedirect() | setRedirect(ChargeRedirect redirect) |
| `ThreeDs` | [`ChargeThreeDs`](../../doc/models/charge-three-ds.md) | Optional | Charge Three Ds schema. | ChargeThreeDs getThreeDs() | setThreeDs(ChargeThreeDs threeDs) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Charge;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.ChargeRedirect;
import com.univapay.api.models.ChargeStatus;
import com.univapay.api.models.ChargeThreeDs;
import com.univapay.api.models.ChargeTransactionTokenType;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.PaymentError;
import java.io.IOException;
import java.util.UUID;

Charge charge = new Charge.Builder()
    .id(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
    .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
    .transactionTokenId(UUID.fromString("af834c88-7a8f-47ac-aee9-0386a0f98b0d"))
    .transactionTokenType(ChargeTransactionTokenType.ONE_TIME)
    .subscriptionId(UUID.fromString("11ef0000-0000-4000-8000-000000000001"))
    .merchantTransactionId("ORD-998877")
    .requestedAmount(1000)
    .requestedCurrency("JPY")
    .requestedAmountFormatted(1000D)
    .chargedAmount(1000)
    .chargedCurrency("JPY")
    .chargedAmountFormatted(1000D)
    .feeAmount(30)
    .feeCurrency("JPY")
    .feeAmountFormatted(30D)
    .onlyDirectCurrency(false)
    .captureAt(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .descriptor("UNIVAPAY TEST")
    .descriptorPhoneNumber("0312345678")
    .status(ChargeStatus.PENDING)
    .error(new PaymentError.Builder()
        .code(301)
        .message("Card number error.")
        .detail("The provided card number failed validation.")
        .build())
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .build())
    .mode(ChargeMode.LIVE)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
    .merchantName("Test Merchant")
    .storeName("Tokyo Store")
    .redirect(new ChargeRedirect.Builder()
        .build())
    .threeDs(new ChargeThreeDs.Builder()
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

