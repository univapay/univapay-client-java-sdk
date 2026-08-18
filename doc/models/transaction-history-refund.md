
# Transaction History Refund

A single refund issued against the charge this row describes.

*This model accepts additional fields of type Object.*

## Structure

`TransactionHistoryRefund`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RefundId` | `UUID` | Optional | Unique identifier of the refund. | UUID getRefundId() | setRefundId(UUID refundId) |
| `Amount` | `Integer` | Optional | Refunded amount, in the currency's minor unit. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AmountFormatted` | `Double` | Optional | Refunded amount, formatted per the currency's display scale. | Double getAmountFormatted() | setAmountFormatted(Double amountFormatted) |
| `Status` | [`TransactionHistoryRefundStatus`](../../doc/models/transaction-history-refund-status.md) | Optional | Status of a single refund entry. | TransactionHistoryRefundStatus getStatus() | setStatus(TransactionHistoryRefundStatus status) |
| `Reason` | [`TransactionHistoryRefundReason`](../../doc/models/transaction-history-refund-reason.md) | Optional | Reason code for a refund. | TransactionHistoryRefundReason getReason() | setReason(TransactionHistoryRefundReason reason) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TransactionHistoryRefund;
import com.univapay.api.models.TransactionHistoryRefundReason;
import com.univapay.api.models.TransactionHistoryRefundStatus;
import java.io.IOException;
import java.util.UUID;

TransactionHistoryRefund transactionHistoryRefund = new TransactionHistoryRefund.Builder()
    .refundId(UUID.fromString("11ef0000-0000-4000-8000-000000000010"))
    .amount(500)
    .currency("JPY")
    .amountFormatted(500D)
    .status(TransactionHistoryRefundStatus.SUCCESSFUL)
    .reason(TransactionHistoryRefundReason.CUSTOMER_REQUEST)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

