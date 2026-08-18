
# Transaction History Service Provider

The processor or service provider that handled the payment.

## Enumeration

`TransactionHistoryServiceProvider`

## Fields

| Name |
|  --- |
| `CREDIT` |
| `CONVENIENCE` |
| `BANK_TRANSFER` |
| `PAIDY` |
| `PAY_PAY` |
| `ALIPAY` |
| `WE_CHAT` |
| `DOCOMO` |
| `MERCARI` |
| `AU` |
| `RAKUTEN` |
| `BARTONG` |
| `JKOPAY` |
| `GINKO_PAY` |
| `AEON_PAY` |
| `EROMNET` |
| `TEST` |

## Example

```java
import com.univapay.api.models.TransactionHistoryServiceProvider;

TransactionHistoryServiceProvider transactionHistoryServiceProvider = TransactionHistoryServiceProvider.MERCARI;
```

