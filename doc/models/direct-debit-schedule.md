
# Direct Debit Schedule

The key dates for one debit cycle. Use these to work out whether the current month's registration window is still open.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitSchedule`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MerchantBankAccountTransferDate` | `LocalDate` | Optional | The date funds are pulled from consumer accounts (指定振替日). | LocalDate getMerchantBankAccountTransferDate() | setMerchantBankAccountTransferDate(LocalDate merchantBankAccountTransferDate) |
| `MerchantBankAccountRegistrationDeadline` | `LocalDate` | Optional | The date by which the bank must receive the signed direct debit mandate (振替依頼書到着期限). | LocalDate getMerchantBankAccountRegistrationDeadline() | setMerchantBankAccountRegistrationDeadline(LocalDate merchantBankAccountRegistrationDeadline) |
| `MerchantBankTransferUploadDeadline` | `LocalDate` | Optional | The last date transfers can be registered or edited for this cycle (振替データアップロード期限). After this, transfers lock. | LocalDate getMerchantBankTransferUploadDeadline() | setMerchantBankTransferUploadDeadline(LocalDate merchantBankTransferUploadDeadline) |
| `PlatformResultRegistrationDate` | `LocalDate` | Optional | The date transfer results are reflected on the platform (振替結果反映日). | LocalDate getPlatformResultRegistrationDate() | setPlatformResultRegistrationDate(LocalDate platformResultRegistrationDate) |
| `PlatformScheduledPayout` | `LocalDate` | Optional | The date collected funds are paid out to the merchant (支払日). | LocalDate getPlatformScheduledPayout() | setPlatformScheduledPayout(LocalDate platformScheduledPayout) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.DirectDebitSchedule;
import java.io.IOException;

DirectDebitSchedule directDebitSchedule = new DirectDebitSchedule.Builder()
    .merchantBankAccountTransferDate(DateTimeHelper.fromSimpleDate("2026-03-14"))
    .merchantBankAccountRegistrationDeadline(DateTimeHelper.fromSimpleDate("2026-02-20"))
    .merchantBankTransferUploadDeadline(DateTimeHelper.fromSimpleDate("2026-03-04"))
    .platformResultRegistrationDate(DateTimeHelper.fromSimpleDate("2026-03-24"))
    .platformScheduledPayout(DateTimeHelper.fromSimpleDate("2026-03-31"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

