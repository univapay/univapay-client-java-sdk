
# Token Response Card Data Cvv Authorize Check

Token Response Card Data Cvv Authorize Check schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseCardDataCvvAuthorizeCheck`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Status` | `String` | Optional | Current status of the resource. | String getStatus() | setStatus(String status) |
| `ChargeId` | `UUID` | Optional | Charge identifier. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `Date` | `LocalDateTime` | Optional | Date value. | LocalDateTime getDate() | setDate(LocalDateTime date) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.TokenResponseCardDataCvvAuthorizeCheck;
import java.io.IOException;

TokenResponseCardDataCvvAuthorizeCheck tokenResponseCardDataCvvAuthorizeCheck = new TokenResponseCardDataCvvAuthorizeCheck.Builder()
    .status("successful")
    .chargeId(null)
    .date(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

