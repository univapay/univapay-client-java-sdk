
# Direct Debit Bank Transfer Create Request

Request payload for scheduling a transfer against an active bank account.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitBankTransferCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `long` | Required | Transfer amount in JPY. Must be a positive, non-zero whole number.<br><br>**Constraints**: `>= 1` | long getAmount() | setAmount(long amount) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.DirectDebitBankTransferCreateRequest;
import java.io.IOException;

DirectDebitBankTransferCreateRequest directDebitBankTransferCreateRequest = new DirectDebitBankTransferCreateRequest.Builder(
    1000L
)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

