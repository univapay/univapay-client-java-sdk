
# Direct Debit Bank Account List

Paginated list of direct debit bank accounts.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitBankAccountList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<DirectDebitBankAccount>`](../../doc/models/direct-debit-bank-account.md) | Optional | List of resources. | List<DirectDebitBankAccount> getItems() | setItems(List<DirectDebitBankAccount> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.DirectDebitBankAccount;
import com.univapay.api.models.DirectDebitBankAccountList;
import com.univapay.api.models.DirectDebitBankAccountStatus;
import com.univapay.api.models.DirectDebitBankAccountType;
import com.univapay.api.models.DirectDebitRegistrationOrigin;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

DirectDebitBankAccountList directDebitBankAccountList = new DirectDebitBankAccountList.Builder()
    .items(Arrays.asList(
        new DirectDebitBankAccount.Builder()
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
            .build(),
        new DirectDebitBankAccount.Builder()
            .id("1098117")
            .legacyStoreId("1283794")
            .merchantId(UUID.fromString("01234567-89ab-cdef-0123-456789abcdef"))
            .userNumber("SD02688329")
            .bankCode("0009")
            .bankName("ﾐﾂｲｽﾐﾄﾓ")
            .branchCode("221")
            .bankAccountType(DirectDebitBankAccountType.CURRENT)
            .bankAccountName("ｽｽﾞｷﾀﾛｳ")
            .bankAccountNumber("7654321")
            .registrationOrigin(DirectDebitRegistrationOrigin.ANYWHERE)
            .status(DirectDebitBankAccountStatus.INACTIVE)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T09:12:04.000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-12T11:03:41.000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

