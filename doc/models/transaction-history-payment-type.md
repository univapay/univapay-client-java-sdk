
# Transaction History Payment Type

The payment method used for the underlying charge.

## Enumeration

`TransactionHistoryPaymentType`

## Fields

| Name |
|  --- |
| `CARD` |
| `QR_SCAN` |
| `QR_MERCHANT` |
| `KONBINI` |
| `APPLE_PAY` |
| `PAIDY` |
| `ONLINE` |
| `BANK_TRANSFER` |

## Example

```java
import com.univapay.api.models.TransactionHistoryPaymentType;

TransactionHistoryPaymentType transactionHistoryPaymentType = TransactionHistoryPaymentType.QR_MERCHANT;
```

