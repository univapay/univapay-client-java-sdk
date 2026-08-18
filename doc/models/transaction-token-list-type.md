
# Transaction Token List Type

Filterable token types for token listings. `one_time` tokens cannot be filtered on and are excluded from this enum.

## Enumeration

`TransactionTokenListType`

## Fields

| Name |
|  --- |
| `SUBSCRIPTION` |
| `RECURRING` |

## Example

```java
import com.univapay.api.models.TransactionTokenListType;

TransactionTokenListType transactionTokenListType = TransactionTokenListType.SUBSCRIPTION;
```

