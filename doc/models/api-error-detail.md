
# Api Error Detail

Structured detail entry describing a single API validation or business error.

*This model accepts additional fields of type Object.*

## Structure

`ApiErrorDetail`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Field` | `String` | Optional | The field name of the parameter that caused the error (lower_snake_case). | String getField() | setField(String field) |
| `Reason` | `String` | Optional | Detailed reason for the nested error (UPPER_SNAKE_CASE or English description). | String getReason() | setReason(String reason) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.ApiErrorDetail;
import java.io.IOException;

ApiErrorDetail apiErrorDetail = new ApiErrorDetail.Builder()
    .field("card_number")
    .reason("INVALID_CARD_NUMBER")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

