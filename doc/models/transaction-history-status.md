
# Transaction History Status

Status of the underlying resource. Charge rows use the full set of values; refund rows only ever report `pending`, `successful`, `failed`, or `error`.

## Enumeration

`TransactionHistoryStatus`

## Fields

| Name |
|  --- |
| `PENDING` |
| `AUTHORIZED` |
| `SUCCESSFUL` |
| `FAILED` |
| `ERROR` |
| `CANCELED` |
| `AWAITING` |

## Example

```java
import com.univapay.api.models.TransactionHistoryStatus;

TransactionHistoryStatus transactionHistoryStatus = TransactionHistoryStatus.FAILED;
```

