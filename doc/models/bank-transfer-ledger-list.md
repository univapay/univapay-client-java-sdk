
# Bank Transfer Ledger List

Paginated list of bank transfer ledger entries.

*This model accepts additional fields of type Object.*

## Structure

`BankTransferLedgerList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<BankTransferLedger>`](../../doc/models/bank-transfer-ledger.md) | Optional | List of resources. | List<BankTransferLedger> getItems() | setItems(List<BankTransferLedger> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `TotalHits` | `Integer` | Optional | Total number of matching resources. | Integer getTotalHits() | setTotalHits(Integer totalHits) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.BankTransferLedger;
import com.univapay.api.models.BankTransferLedgerBankLedgerType;
import com.univapay.api.models.BankTransferLedgerList;
import com.univapay.api.models.BankTransferLedgerMode;
import java.io.IOException;
import java.util.Arrays;

BankTransferLedgerList bankTransferLedgerList = new BankTransferLedgerList.Builder()
    .items(Arrays.asList(
        new BankTransferLedger.Builder()
            .bankLedgerType(BankTransferLedgerBankLedgerType.PAYMENT)
            .amount(1000)
            .balance(0)
            .virtualBankAccountHolderName("test holder name")
            .virtualBankAccountNumber("1234567")
            .virtualAccountId("test account id")
            .transactionDate(DateTimeHelper.fromSimpleDate("2024-06-25"))
            .transactionTimestamp(DateTimeHelper.fromRfc8601DateTime("2024-06-25T07:29:16.367347Z"))
            .mode(BankTransferLedgerMode.TEST)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-06-25T07:29:16.373181Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new BankTransferLedger.Builder()
            .bankLedgerType(BankTransferLedgerBankLedgerType.DEPOSIT)
            .amount(1000)
            .balance(1000)
            .virtualBankAccountHolderName("test holder name")
            .virtualBankAccountNumber("1234567")
            .virtualAccountId("test account id")
            .transactionDate(DateTimeHelper.fromSimpleDate("2024-06-25"))
            .transactionTimestamp(DateTimeHelper.fromRfc8601DateTime("2024-06-25T07:29:16.36731Z"))
            .mode(BankTransferLedgerMode.TEST)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-06-25T07:29:16.368093Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
    .totalHits(2)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

