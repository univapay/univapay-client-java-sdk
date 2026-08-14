
# Direct Debit Bank Account Create Request

Request payload for registering a consumer bank account for direct debit.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitBankAccountCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `UserNumber` | `String` | Required | The merchant's own membership number for the consumer (会員番号). Alphanumeric.<br><br>**Constraints**: *Pattern*: `^[a-zA-Z0-9]+$` | String getUserNumber() | setUserNumber(String userNumber) |
| `BankCode` | `String` | Required | Four-digit code identifying the consumer's bank (銀行コード).<br><br>**Constraints**: *Minimum Length*: `4`, *Maximum Length*: `4`, *Pattern*: `^[0-9]{4}$` | String getBankCode() | setBankCode(String bankCode) |
| `BankName` | `String` | Required | Bank name in half-width katakana (銀行名).<br><br>**Constraints**: *Maximum Length*: `15` | String getBankName() | setBankName(String bankName) |
| `BranchCode` | `String` | Required | Three-digit code identifying the bank branch (支店コード).<br><br>**Constraints**: *Minimum Length*: `3`, *Maximum Length*: `3`, *Pattern*: `^[0-9]{3}$` | String getBranchCode() | setBranchCode(String branchCode) |
| `BankAccountType` | [`DirectDebitBankAccountType`](../../doc/models/direct-debit-bank-account-type.md) | Required | Deposit account type (預金種類) — `regular` (普通), `current` (当座), `savings` (貯蓄) or `others` (その他). | DirectDebitBankAccountType getBankAccountType() | setBankAccountType(DirectDebitBankAccountType bankAccountType) |
| `BankAccountName` | `String` | Required | Account holder name (口座名義), in half-width katakana. Full-width characters are rejected by the bank.<br><br>**Constraints**: *Maximum Length*: `30`, *Pattern*: `^[A-Z0-9ｱ-ﾝﾞﾟ().\- ]{1,30}$` | String getBankAccountName() | setBankAccountName(String bankAccountName) |
| `BankAccountNumber` | `String` | Required | Seven-digit account number (口座番号).<br><br>**Constraints**: *Minimum Length*: `7`, *Maximum Length*: `7`, *Pattern*: `^[0-9]{7}$` | String getBankAccountNumber() | setBankAccountNumber(String bankAccountNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.DirectDebitBankAccountCreateRequest;
import com.univapay.api.models.DirectDebitBankAccountType;
import java.io.IOException;

DirectDebitBankAccountCreateRequest directDebitBankAccountCreateRequest = new DirectDebitBankAccountCreateRequest.Builder(
    "SD02688328",
    "0012",
    "ﾗｸﾃﾝｷﾞﾝｺｳ",
    "120",
    DirectDebitBankAccountType.REGULAR,
    "ﾀﾅｶﾕﾐｺ",
    "1234567"
)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

