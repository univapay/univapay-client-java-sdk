
# Direct Debit Bank Account

A consumer bank account registered for direct debit.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitBankAccount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `String` | Optional | Unique identifier of a direct debit bank account (銀行口座ID).<br><br>**Constraints**: *Pattern*: `^[0-9]+$` | String getId() | setId(String id) |
| `LegacyStoreId` | `String` | Optional | Identifier of the merchant in the legacy direct debit system.<br><br>**Constraints**: *Pattern*: `^[0-9]+$` | String getLegacyStoreId() | setLegacyStoreId(String legacyStoreId) |
| `MerchantId` | `UUID` | Optional | The merchant that owns this bank account. | UUID getMerchantId() | setMerchantId(UUID merchantId) |
| `UserNumber` | `String` | Optional | The merchant's own membership number for the consumer (会員番号). Alphanumeric.<br><br>**Constraints**: *Pattern*: `^[a-zA-Z0-9]+$` | String getUserNumber() | setUserNumber(String userNumber) |
| `BankCode` | `String` | Optional | Four-digit code identifying the consumer's bank (銀行コード).<br><br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4`, *Pattern*: `^[0-9]{4}$` | String getBankCode() | setBankCode(String bankCode) |
| `BankName` | `String` | Optional | Bank name in half-width katakana (銀行名).<br><br>**Constraints**: *Maximum Length*: `15` | String getBankName() | setBankName(String bankName) |
| `BranchCode` | `String` | Optional | Three-digit code identifying the bank branch (支店コード).<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3`, *Pattern*: `^[0-9]{3}$` | String getBranchCode() | setBranchCode(String branchCode) |
| `BankAccountType` | [`DirectDebitBankAccountType`](../../doc/models/direct-debit-bank-account-type.md) | Optional | Deposit account type (預金種類) — `regular` (普通), `current` (当座), `savings` (貯蓄) or `others` (その他). | DirectDebitBankAccountType getBankAccountType() | setBankAccountType(DirectDebitBankAccountType bankAccountType) |
| `BankAccountName` | `String` | Optional | Account holder name (口座名義), in half-width katakana. Full-width characters are rejected by the bank.<br><br>**Constraints**: *Maximum Length*: `30`, *Pattern*: `^[A-Z0-9ｱ-ﾝﾞﾟ().\- ]{1,30}$` | String getBankAccountName() | setBankAccountName(String bankAccountName) |
| `BankAccountNumber` | `String` | Optional | Seven-digit account number (口座番号).<br><br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{7}$` | String getBankAccountNumber() | setBankAccountNumber(String bankAccountNumber) |
| `RegistrationOrigin` | [`DirectDebitRegistrationOrigin`](../../doc/models/direct-debit-registration-origin.md) | Optional | Where the bank account was registered from — `merchant_console` for the merchant dashboard, `anywhere` otherwise. | DirectDebitRegistrationOrigin getRegistrationOrigin() | setRegistrationOrigin(DirectDebitRegistrationOrigin registrationOrigin) |
| `Status` | [`DirectDebitBankAccountStatus`](../../doc/models/direct-debit-bank-account-status.md) | Optional | Bank account state (有効・無効・登録失敗). Only an `active` account can have transfers registered against it. `registration_failed` means the bank rejected the account details. | DirectDebitBankAccountStatus getStatus() | setStatus(DirectDebitBankAccountStatus status) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.DirectDebitBankAccount;
import com.univapay.api.models.DirectDebitBankAccountStatus;
import com.univapay.api.models.DirectDebitBankAccountType;
import com.univapay.api.models.DirectDebitRegistrationOrigin;
import java.io.IOException;
import java.util.UUID;

DirectDebitBankAccount directDebitBankAccount = new DirectDebitBankAccount.Builder()
    .id("1098116")
    .legacyStoreId("1283794")
    .merchantId(UUID.fromString("01234567-89ab-cdef-0123-456789abcdef"))
    .userNumber("SD02688328")
    .bankCode("0012")
    .bankName("ﾗｸﾃﾝｷﾞﾝｺｳ")
    .branchCode("120")
    .bankAccountType(DirectDebitBankAccountType.REGULAR)
    .bankAccountName("ﾀﾅｶﾕﾐｺ")
    .bankAccountNumber("1234567")
    .registrationOrigin(DirectDebitRegistrationOrigin.MERCHANT_CONSOLE)
    .status(DirectDebitBankAccountStatus.ACTIVE)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000Z"))
    .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

