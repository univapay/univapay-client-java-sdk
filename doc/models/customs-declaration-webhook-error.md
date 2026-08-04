
# Customs Declaration Webhook Error

Error payload returned when customs declaration processing fails.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationWebhookError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Code` | `Integer` | Optional | Backend customs declaration error code. | Integer getCode() | setCode(Integer code) |
| `Message` | `String` | Optional | Human-readable backend error name. | String getMessage() | setMessage(String message) |
| `Details` | `String` | Optional | Optional backend-provided detail string. | String getDetails() | setDetails(String details) |
| `Others` | [`List<CustomsDeclarationWebhookOtherError>`](../../doc/models/customs-declaration-webhook-other-error.md) | Optional | Additional nested error records returned by the backend. | List<CustomsDeclarationWebhookOtherError> getOthers() | setOthers(List<CustomsDeclarationWebhookOtherError> others) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CustomsDeclarationWebhookError;
import com.univapay.api.models.CustomsDeclarationWebhookOtherError;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

CustomsDeclarationWebhookError customsDeclarationWebhookError = new CustomsDeclarationWebhookError.Builder()
    .code(601)
    .message("There was a processing error")
    .details("Missing customs registration")
    .others(Arrays.asList(
        new CustomsDeclarationWebhookOtherError.Builder()
            .type("related_item")
            .credentialsId(UUID.fromString("000013b6-0000-0000-0000-000000000000"))
            .message(Arrays.asList(
                "message4",
                "message5",
                "message6"
            ))
            .itemName("charge")
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

