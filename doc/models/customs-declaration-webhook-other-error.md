
# Customs Declaration Webhook Other Error

Nested customs-processing error entry returned in `others`.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationWebhookOtherError`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | Backend other-error type. | String getType() | setType(String type) |
| `CredentialsId` | `UUID` | Optional | Gateway credentials involved in the error when applicable. | UUID getCredentialsId() | setCredentialsId(UUID credentialsId) |
| `Message` | `List<String>` | Optional | Additional reason values for `not_selected_reasons`. | List<String> getMessage() | setMessage(List<String> message) |
| `ItemName` | `String` | Optional | Related item name for `related_item`. | String getItemName() | setItemName(String itemName) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CustomsDeclarationWebhookOtherError;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

CustomsDeclarationWebhookOtherError customsDeclarationWebhookOtherError = new CustomsDeclarationWebhookOtherError.Builder()
    .type("related_item")
    .credentialsId(UUID.fromString("00000b8c-0000-0000-0000-000000000000"))
    .message(Arrays.asList(
        "message4",
        "message3"
    ))
    .itemName("charge")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

