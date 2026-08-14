
# Direct Debit Bank Transfer

A single scheduled pull of funds from a registered bank account. The bank account details are copied onto the transfer at registration time, so later edits to the account do not change past transfers.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitBankTransfer`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier of a direct debit bank transfer (振替ID).<br><br>**Constraints**: *Pattern*: `^[0-9]+$` | String getId() | setId(String id) |
| `LegacyStoreId` | `String` | Optional | Identifier of the merchant in the legacy direct debit system.<br><br>**Constraints**: *Pattern*: `^[0-9]+$` | String getLegacyStoreId() | setLegacyStoreId(String legacyStoreId) |
| `MerchantId` | `UUID` | Optional | The merchant that owns this transfer. | UUID getMerchantId() | setMerchantId(UUID merchantId) |
| `BankAccountId` | `String` | Optional | Unique identifier of a direct debit bank account (銀行口座ID).<br><br>**Constraints**: *Pattern*: `^[0-9]+$` | String getBankAccountId() | setBankAccountId(String bankAccountId) |
| `UserNumber` | `String` | Optional | The merchant's own membership number for the consumer (会員番号). Alphanumeric.<br><br>**Constraints**: *Pattern*: `^[a-zA-Z0-9]+$` | String getUserNumber() | setUserNumber(String userNumber) |
| `BankCode` | `String` | Optional | Four-digit code identifying the consumer's bank (銀行コード).<br><br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4`, *Pattern*: `^[0-9]{4}$` | String getBankCode() | setBankCode(String bankCode) |
| `BankName` | `String` | Optional | Bank name in half-width katakana (銀行名).<br><br>**Constraints**: *Maximum Length*: `15` | String getBankName() | setBankName(String bankName) |
| `BranchCode` | `String` | Optional | Three-digit code identifying the bank branch (支店コード).<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3`, *Pattern*: `^[0-9]{3}$` | String getBranchCode() | setBranchCode(String branchCode) |
| `BankAccountType` | [`DirectDebitBankAccountType`](../../doc/models/direct-debit-bank-account-type.md) | Optional | Deposit account type (預金種類) — `regular` (普通), `current` (当座), `savings` (貯蓄) or `others` (その他). | DirectDebitBankAccountType getBankAccountType() | setBankAccountType(DirectDebitBankAccountType bankAccountType) |
| `BankAccountName` | `String` | Optional | Account holder name (口座名義), in half-width katakana. Full-width characters are rejected by the bank.<br><br>**Constraints**: *Maximum Length*: `30`, *Pattern*: `^[A-Z0-9ｱ-ﾝﾞﾟ().\- ]{1,30}$` | String getBankAccountName() | setBankAccountName(String bankAccountName) |
| `BankAccountNumber` | `String` | Optional | Seven-digit account number (口座番号).<br><br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{7}$` | String getBankAccountNumber() | setBankAccountNumber(String bankAccountNumber) |
| `Amount` | `Long` | Optional | Transfer amount in JPY. Must be a positive, non-zero whole number.<br><br>**Constraints**: `>= 1` | Long getAmount() | setAmount(Long amount) |
| `DebitDate` | [`DirectDebitDebitDate`](../../doc/models/direct-debit-debit-date.md) | Optional | Monthly debit cycle — funds are pulled on either the 14th or the 27th. | DirectDebitDebitDate getDebitDate() | setDebitDate(DirectDebitDebitDate debitDate) |
| `CalculatedDebitDate` | `LocalDate` | Optional | The actual business day on which funds are pulled (計算された振替日), derived from the debit cycle. | LocalDate getCalculatedDebitDate() | setCalculatedDebitDate(LocalDate calculatedDebitDate) |
| `Lock` | [`DirectDebitBankTransferLock`](../../doc/models/direct-debit-bank-transfer-lock.md) | Optional | Whether the transfer can still be edited. Transfers are `unlocked` until the upload deadline for their debit cycle passes, after which they are `locked` and can no longer be changed or deleted. | DirectDebitBankTransferLock getLock() | setLock(DirectDebitBankTransferLock lock) |
| `Status` | [`DirectDebitBankTransferStatus`](../../doc/models/direct-debit-bank-transfer-status.md) | Optional | Transfer state. `awaiting` until the bank reports back, then `successful` or `failed`. Results are reflected days after the debit date, not immediately. | DirectDebitBankTransferStatus getStatus() | setStatus(DirectDebitBankTransferStatus status) |
| `Error` | [`DirectDebitBankTransferError`](../../doc/models/direct-debit-bank-transfer-error.md) | Optional | Failure reason, or null while the transfer is awaiting a result or has succeeded. | DirectDebitBankTransferError getError() | setError(DirectDebitBankTransferError error) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.DirectDebitBankAccountType;
import com.univapay.api.models.DirectDebitBankTransfer;
import com.univapay.api.models.DirectDebitBankTransferError;
import com.univapay.api.models.DirectDebitBankTransferLock;
import com.univapay.api.models.DirectDebitBankTransferStatus;
import com.univapay.api.models.DirectDebitDebitDate;
import java.io.IOException;
import java.util.UUID;

DirectDebitBankTransfer directDebitBankTransfer = new DirectDebitBankTransfer.Builder()
    .id("2594976")
    .legacyStoreId("1283794")
    .merchantId(UUID.fromString("01234567-89ab-cdef-0123-456789abcdef"))
    .bankAccountId("1098116")
    .userNumber("SD02688328")
    .bankCode("0012")
    .bankName("ﾗｸﾃﾝｷﾞﾝｺｳ")
    .branchCode("120")
    .bankAccountType(DirectDebitBankAccountType.REGULAR)
    .bankAccountName("ﾀﾅｶﾕﾐｺ")
    .bankAccountNumber("1234567")
    .amount(1000L)
    .debitDate(DirectDebitDebitDate.FOURTEEN)
    .calculatedDebitDate(DateTimeHelper.fromSimpleDate("2026-03-14"))
    .lock(DirectDebitBankTransferLock.UNLOCKED)
    .status(DirectDebitBankTransferStatus.AWAITING)
    .error(DirectDebitBankTransferError.INSUFFICIENT_FUNDS)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000Z"))
    .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

