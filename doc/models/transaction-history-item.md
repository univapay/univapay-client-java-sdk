
# Transaction History Item

A single charge or refund row in the merchant's transaction history.

*This model accepts additional fields of type Object.*

## Structure

`TransactionHistoryItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `StoreId` | `UUID` | Optional | Store identifier. | UUID getStoreId() | setStoreId(UUID storeId) |
| `ResourceId` | `UUID` | Optional | ID of the underlying resource — a charge ID for charge rows, a refund ID for refund rows. | UUID getResourceId() | setResourceId(UUID resourceId) |
| `ChargeId` | `UUID` | Optional | ID of the originating charge. `null` for charge rows; set for refund rows. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `Amount` | `Integer` | Optional | Amount, in the currency's minor unit. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AmountFormatted` | `Double` | Optional | Amount, formatted per the currency's display scale. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `Type` | [`TransactionHistoryType`](../../doc/models/transaction-history-type.md) | Optional | Whether this row represents a charge or a refund. | TransactionHistoryType getType() | setType(TransactionHistoryType type) |
| `Status` | [`TransactionHistoryStatus`](../../doc/models/transaction-history-status.md) | Optional | Status of the underlying resource. Charge rows use the full set of values; refund rows only ever report `pending`, `successful`, `failed`, or `error`. | TransactionHistoryStatus getStatus() | setStatus(TransactionHistoryStatus status) |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the underlying resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Mode` | [`TransactionHistoryMode`](../../doc/models/transaction-history-mode.md) | Optional | Environment mode: `live` and `test` reflect the credential used to authenticate, while `live_test` is reserved for privileged callers testing against live-mode data. | TransactionHistoryMode getMode() | setMode(TransactionHistoryMode mode) |
| `MerchantName` | `String` | Optional | Merchant display name. | String getMerchantName() | setMerchantName(String merchantName) |
| `StoreName` | `String` | Optional | Store display name. | String getStoreName() | setStoreName(String storeName) |
| `PaymentType` | [`TransactionHistoryPaymentType`](../../doc/models/transaction-history-payment-type.md) | Optional | The payment method used for the underlying charge. | TransactionHistoryPaymentType getPaymentType() | setPaymentType(TransactionHistoryPaymentType paymentType) |
| `UserData` | [`TransactionHistoryUserData`](../../doc/models/transaction-history-user-data.md) | Optional | Payment-type-specific details for this row. This is a single flat object covering every payment type — the fields actually populated depend on `payment_type` (documented per field below). Fields not applicable to a given payment type are omitted. | TransactionHistoryUserData getUserData() | setUserData(TransactionHistoryUserData userData) |
| `BankTransferPaymentStatus` | [`BankTransferPaymentStatus`](../../doc/models/bank-transfer-payment-status.md) | Optional | Bank transfer payment status, or `null` when not applicable. | BankTransferPaymentStatus getBankTransferPaymentStatus() | setBankTransferPaymentStatus(BankTransferPaymentStatus bankTransferPaymentStatus) |
| `BankTransferLatestDepositDate` | `LocalDateTime` | Optional | Timestamp of the most recent deposit matched against a bank transfer charge. `null` when not applicable. | LocalDateTime getBankTransferLatestDepositDate() | setBankTransferLatestDepositDate(LocalDateTime bankTransferLatestDepositDate) |
| `McpTokenId` | `UUID` | Optional | ID of the multi-currency-pricing token used, when applicable. `null` when not applicable. | UUID getMcpTokenId() | setMcpTokenId(UUID mcpTokenId) |
| `ChargeType` | [`TransactionHistoryChargeType`](../../doc/models/transaction-history-charge-type.md) | Optional | Charge type, or `null` when not applicable. | TransactionHistoryChargeType getChargeType() | setChargeType(TransactionHistoryChargeType chargeType) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.BankTransferPaymentStatus;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.TransactionHistoryChargeType;
import com.univapay.api.models.TransactionHistoryItem;
import com.univapay.api.models.TransactionHistoryMode;
import com.univapay.api.models.TransactionHistoryPaymentType;
import com.univapay.api.models.TransactionHistoryRefund;
import com.univapay.api.models.TransactionHistoryRefundStatus;
import com.univapay.api.models.TransactionHistoryServiceProvider;
import com.univapay.api.models.TransactionHistoryStatus;
import com.univapay.api.models.TransactionHistoryType;
import com.univapay.api.models.TransactionHistoryUserData;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

TransactionHistoryItem transactionHistoryItem = new TransactionHistoryItem.Builder()
    .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
    .resourceId(UUID.fromString("11ef0000-0000-4000-8000-000000000070"))
    .chargeId(UUID.fromString("000017d4-0000-0000-0000-000000000000"))
    .amount(1000)
    .currency("JPY")
    .amountFormatted(1000D)
    .type(TransactionHistoryType.CHARGE)
    .status(TransactionHistoryStatus.SUCCESSFUL)
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .univapayName("univapay-name8")
        .univapayPhoneNumber("univapay-phone-number2")
    .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
            "String4"
        ))
        .build())
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-05-01T12:34:56.789Z"))
    .mode(TransactionHistoryMode.TEST)
    .merchantName("Test merchant")
    .storeName("Test store")
    .paymentType(TransactionHistoryPaymentType.CARD)
    .userData(new TransactionHistoryUserData.Builder()
        .type(TransactionHistoryType.CHARGE)
        .cardholderName("Some Guy")
        .cardholderEmailAddress("test4@univapay.com")
        .cardholderPhoneNumber("cardholder_phone_number4")
        .customerName("customer_name8")
        .brand("visa")
        .gateway("test")
        .serviceProvider(TransactionHistoryServiceProvider.CREDIT)
        .refunds(Arrays.asList(
            new TransactionHistoryRefund.Builder()
                .refundId(UUID.fromString("11ef0000-0000-4000-8000-000000000010"))
                .amount(500)
                .currency("JPY")
                .amountFormatted(500D)
                .status(TransactionHistoryRefundStatus.SUCCESSFUL)
            .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                .build()
        ))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .bankTransferPaymentStatus(BankTransferPaymentStatus.EXACT)
    .chargeType(TransactionHistoryChargeType.NORMAL)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

