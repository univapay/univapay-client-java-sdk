
# Direct Debit Bank Transfer Patch Request

Request payload for changing a transfer's amount. Only permitted while the transfer is unlocked.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitBankTransferPatchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `long` | Required | Transfer amount in JPY. Must be a positive, non-zero whole number.<br><br>**Constraints**: `>= 1` | long getAmount() | setAmount(long amount) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.DirectDebitBankTransferPatchRequest;
import java.io.IOException;

DirectDebitBankTransferPatchRequest directDebitBankTransferPatchRequest = new DirectDebitBankTransferPatchRequest.Builder(
    1000L
)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

