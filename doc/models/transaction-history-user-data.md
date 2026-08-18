
# Transaction History User Data

Payment-type-specific details for this row. This is a single flat object covering every payment type — the fields actually populated depend on `payment_type` (documented per field below). Fields not applicable to a given payment type are omitted.

*This model accepts additional fields of type Object.*

## Structure

`TransactionHistoryUserData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | [`TransactionHistoryType`](../../doc/models/transaction-history-type.md) | Optional | Whether this row represents a charge or a refund. | TransactionHistoryType getType() | setType(TransactionHistoryType type) |
| `CardholderName` | `String` | Optional | Cardholder name. Present for `card` and `apple_pay` rows only. | String getCardholderName() | setCardholderName(String cardholderName) |
| `CardholderEmailAddress` | `String` | Optional | Cardholder/customer email address. Present for every payment type except `konbini`'s legacy alias fields; always non-null for `bank_transfer` rows, nullable for every other type. | String getCardholderEmailAddress() | setCardholderEmailAddress(String cardholderEmailAddress) |
| `CardholderPhoneNumber` | `String` | Optional | Cardholder phone number. Present for `paidy` rows only. | String getCardholderPhoneNumber() | setCardholderPhoneNumber(String cardholderPhoneNumber) |
| `CustomerName` | `String` | Optional | Customer name as entered at checkout. Present for `konbini` rows only (empty string when not provided). | String getCustomerName() | setCustomerName(String customerName) |
| `ConvenienceStore` | `String` | Optional | Legacy duplicate of `brand`. Present for `konbini` rows only. | String getConvenienceStore() | setConvenienceStore(String convenienceStore) |
| `Brand` | `String` | Optional | Raw brand identifier for the payment method. Present for every payment type; the value set is payment-type-specific (e.g. card brands for `card`/`apple_pay`, QR brands for `qr_scan`/`qr_merchant`, online-wallet brands for `online`, convenience-store brands for `konbini`, `paidy` for `paidy` rows). Nullable for `qr_scan`, `qr_merchant`, and `online`; always non-null for the other types. | String getBrand() | setBrand(String brand) |
| `Gateway` | `String` | Optional | Raw gateway identifier that processed the payment. Present for every payment type. | String getGateway() | setGateway(String gateway) |
| `ServiceProvider` | [`TransactionHistoryServiceProvider`](../../doc/models/transaction-history-service-provider.md) | Optional | Service provider, or `null` when not reported. | TransactionHistoryServiceProvider getServiceProvider() | setServiceProvider(TransactionHistoryServiceProvider serviceProvider) |
| `Refunds` | [`List<TransactionHistoryRefund>`](../../doc/models/transaction-history-refund.md) | Optional | Refunds issued against this charge. Present for charge rows only (`type: charge`); absent for refund rows. | List<TransactionHistoryRefund> getRefunds() | setRefunds(List<TransactionHistoryRefund> refunds) |
| `Reason` | [`TransactionHistoryRefundReason`](../../doc/models/transaction-history-refund-reason.md) | Optional | Refund reason, or `null` when unset. | TransactionHistoryRefundReason getReason() | setReason(TransactionHistoryRefundReason reason) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TransactionHistoryRefund;
import com.univapay.api.models.TransactionHistoryRefundStatus;
import com.univapay.api.models.TransactionHistoryServiceProvider;
import com.univapay.api.models.TransactionHistoryType;
import com.univapay.api.models.TransactionHistoryUserData;
import java.util.Arrays;
import java.util.UUID;

TransactionHistoryUserData transactionHistoryUserData = new TransactionHistoryUserData.Builder()
    .type(TransactionHistoryType.CHARGE)
    .cardholderName("Some Guy")
    .cardholderEmailAddress("test4@univapay.com")
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
            .build()
    ))
    .build();
```

