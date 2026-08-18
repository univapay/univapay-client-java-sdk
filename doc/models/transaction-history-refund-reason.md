
# Transaction History Refund Reason

Reason code for a refund.

## Enumeration

`TransactionHistoryRefundReason`

## Fields

| Name |
|  --- |
| `DUPLICATE` |
| `FRAUD` |
| `CUSTOMER_REQUEST` |
| `SYSTEM_FAILURE` |
| `CHARGEBACK` |
| `CHARGEBACK_FEE_EXEMPT` |
| `CHARGEBACK_REVERSE` |

## Example

```java
import com.univapay.api.models.TransactionHistoryRefundReason;

TransactionHistoryRefundReason transactionHistoryRefundReason = TransactionHistoryRefundReason.CHARGEBACK;
```

