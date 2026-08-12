
# Token Response Bank Transfer Data

Token Response Bank Transfer Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseBankTransferData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Brand` | `String` | Optional | The bank brand identifier (e.g., 'aozora_bank'). | String getBrand() | setBrand(String brand) |
| `ExpirationPeriod` | `String` | Optional | ISO 8601 duration format (e.g., 'PT168H'). | String getExpirationPeriod() | setExpirationPeriod(String expirationPeriod) |
| `ExpirationTimeShift` | `String` | Optional | Time shift applied to the expiration, typically pushing it to the end of the day  in a specific timezone (e.g., '23:59:59+09:00'). | String getExpirationTimeShift() | setExpirationTimeShift(String expirationTimeShift) |
| `BankCode` | `String` | Optional | Bank code value. | String getBankCode() | setBankCode(String bankCode) |
| `BankName` | `String` | Optional | Bank name value. | String getBankName() | setBankName(String bankName) |
| `BranchCode` | `String` | Optional | Bank branch code. | String getBranchCode() | setBranchCode(String branchCode) |
| `BranchName` | `String` | Optional | Bank branch name. | String getBranchName() | setBranchName(String branchName) |
| `AccountNumber` | `String` | Optional | Bank account number. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AccountHolderName` | `String` | Optional | Bank account holder name. | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponseBankTransferData;

TokenResponseBankTransferData tokenResponseBankTransferData = new TokenResponseBankTransferData.Builder()
    .brand("aozora_bank")
    .expirationPeriod("PT168H")
    .expirationTimeShift("23:59:59+09:00")
    .bankCode("0310")
    .bankName("GMOあおぞらネット銀行")
    .branchCode("123")
    .branchName("Test Branch")
    .accountNumber("1234567")
    .accountHolderName("TARO YAMADA")
    .build();
```

