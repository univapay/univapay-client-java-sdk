
# Bank Transfer Ledger

Single bank transfer ledger entry associated with a charge.

*This model accepts additional fields of type Object.*

## Structure

`BankTransferLedger`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `BankLedgerType` | [`BankTransferLedgerBankLedgerType`](../../doc/models/bank-transfer-ledger-bank-ledger-type.md) | Optional | Bank Transfer Ledger Bank Ledger Type schema. | BankTransferLedgerBankLedgerType getBankLedgerType() | setBankLedgerType(BankTransferLedgerBankLedgerType bankLedgerType) |
| `Amount` | `Integer` | Optional | Amount in the smallest currency unit. | Integer getAmount() | setAmount(Integer amount) |
| `Balance` | `Integer` | Optional | Current balance in the smallest currency unit. | Integer getBalance() | setBalance(Integer balance) |
| `VirtualBankAccountHolderName` | `String` | Optional | Virtual bank account holder name. | String getVirtualBankAccountHolderName() | setVirtualBankAccountHolderName(String virtualBankAccountHolderName) |
| `VirtualBankAccountNumber` | `String` | Optional | Virtual bank account number. | String getVirtualBankAccountNumber() | setVirtualBankAccountNumber(String virtualBankAccountNumber) |
| `VirtualAccountId` | `String` | Optional | Virtual account id value. | String getVirtualAccountId() | setVirtualAccountId(String virtualAccountId) |
| `TransactionDate` | `LocalDate` | Optional | Transaction date. | LocalDate getTransactionDate() | setTransactionDate(LocalDate transactionDate) |
| `TransactionTimestamp` | `LocalDateTime` | Optional | Transaction timestamp. | LocalDateTime getTransactionTimestamp() | setTransactionTimestamp(LocalDateTime transactionTimestamp) |
| `Mode` | [`BankTransferLedgerMode`](../../doc/models/bank-transfer-ledger-mode.md) | Optional | Bank Transfer Ledger Mode schema. | BankTransferLedgerMode getMode() | setMode(BankTransferLedgerMode mode) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.BankTransferLedger;
import com.univapay.api.models.BankTransferLedgerBankLedgerType;
import com.univapay.api.models.BankTransferLedgerMode;
import java.io.IOException;

BankTransferLedger bankTransferLedger = new BankTransferLedger.Builder()
    .bankLedgerType(BankTransferLedgerBankLedgerType.DEPOSIT)
    .amount(1000)
    .balance(1000)
    .virtualBankAccountHolderName("TARO YAMADA")
    .virtualBankAccountNumber("1234567")
    .virtualAccountId("va_12345")
    .transactionDate(DateTimeHelper.fromSimpleDate("2026-04-09"))
    .transactionTimestamp(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
    .mode(BankTransferLedgerMode.LIVE)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

