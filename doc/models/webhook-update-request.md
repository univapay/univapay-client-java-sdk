
# Webhook Update Request

Request body for updating a webhook. All fields are optional. Omitted fields are left unchanged.

*This model accepts additional fields of type Object.*

## Structure

`WebhookUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Triggers` | [`List<WebhookTrigger>`](../../doc/models/webhook-trigger.md) | Optional | Replace the trigger list. Must be non-empty if provided. | List<WebhookTrigger> getTriggers() | setTriggers(List<WebhookTrigger> triggers) |
| `Url` | `String` | Optional | Update the webhook endpoint URL. | String getUrl() | setUrl(String url) |
| `AuthToken` | `String` | Optional | Update or clear the auth token. Send `null` to remove. | String getAuthToken() | setAuthToken(String authToken) |
| `Active` | `Boolean` | Optional | Enable or disable the webhook. | Boolean getActive() | setActive(Boolean active) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.WebhookTrigger;
import com.univapay.api.models.WebhookUpdateRequest;
import java.io.IOException;
import java.util.Arrays;

WebhookUpdateRequest webhookUpdateRequest = new WebhookUpdateRequest.Builder()
    .triggers(Arrays.asList(
        WebhookTrigger.SUBSCRIPTION_CREATED,
        WebhookTrigger.BANK_TRANSFER_STATUS_UPDATED
    ))
    .url("url6")
    .authToken("auth_token8")
    .active(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

