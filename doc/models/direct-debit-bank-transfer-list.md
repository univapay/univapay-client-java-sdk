
# Direct Debit Bank Transfer List

Paginated list of direct debit bank transfers.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitBankTransferList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<DirectDebitBankTransfer>`](../../doc/models/direct-debit-bank-transfer.md) | Optional | List of resources. | List<DirectDebitBankTransfer> getItems() | setItems(List<DirectDebitBankTransfer> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.DirectDebitBankAccountType;
import com.univapay.api.models.DirectDebitBankTransfer;
import com.univapay.api.models.DirectDebitBankTransferError;
import com.univapay.api.models.DirectDebitBankTransferList;
import com.univapay.api.models.DirectDebitBankTransferLock;
import com.univapay.api.models.DirectDebitBankTransferStatus;
import com.univapay.api.models.DirectDebitDebitDate;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

DirectDebitBankTransferList directDebitBankTransferList = new DirectDebitBankTransferList.Builder()
    .items(Arrays.asList(
        new DirectDebitBankTransfer.Builder()
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
            .error(null)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new DirectDebitBankTransfer.Builder()
            .id("2594977")
            .legacyStoreId("1283794")
            .merchantId(UUID.fromString("01234567-89ab-cdef-0123-456789abcdef"))
            .bankAccountId("1098117")
            .userNumber("SD02688329")
            .bankCode("0009")
            .bankName("ﾐﾂｲｽﾐﾄﾓ")
            .branchCode("221")
            .bankAccountType(DirectDebitBankAccountType.CURRENT)
            .bankAccountName("ｽｽﾞｷﾀﾛｳ")
            .bankAccountNumber("7654321")
            .amount(1850L)
            .debitDate(DirectDebitDebitDate.TWENTY_SEVEN)
            .calculatedDebitDate(DateTimeHelper.fromSimpleDate("2026-03-27"))
            .lock(DirectDebitBankTransferLock.LOCKED)
            .status(DirectDebitBankTransferStatus.FAILED)
            .error(DirectDebitBankTransferError.INSUFFICIENT_FUNDS)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T09:12:04.000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-12T11:03:41.000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

