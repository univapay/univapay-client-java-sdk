
# Webhook Create Request

Request body to create a new store-level webhook subscription.

*This model accepts additional fields of type Object.*

## Structure

`WebhookCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Triggers` | [`List<WebhookTrigger>`](../../doc/models/webhook-trigger.md) | Required | List of event types that trigger this webhook. Must be non-empty and contain only events valid for the store level. | List<WebhookTrigger> getTriggers() | setTriggers(List<WebhookTrigger> triggers) |
| `Url` | `String` | Required | The URL to POST webhook payloads to. | String getUrl() | setUrl(String url) |
| `AuthToken` | `String` | Optional | Optional bearer token sent in the `Authorization` header of webhook requests. | String getAuthToken() | setAuthToken(String authToken) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.WebhookCreateRequest;
import com.univapay.api.models.WebhookTrigger;
import java.io.IOException;
import java.util.Arrays;

WebhookCreateRequest webhookCreateRequest = new WebhookCreateRequest.Builder(
    Arrays.asList(
        WebhookTrigger.CHARGE_FINISHED
    ),
    "https://example.com/webhooks/payments"
)
.authToken("my-secret-token")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

