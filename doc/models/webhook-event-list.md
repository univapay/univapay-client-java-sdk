
# Webhook Event List

Paginated list of webhook events.

*This model accepts additional fields of type Object.*

## Structure

`WebhookEventList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<WebhookEvent>`](../../doc/models/webhook-event.md) | Optional | List of resources. | List<WebhookEvent> getItems() | setItems(List<WebhookEvent> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.WebhookEvent;
import com.univapay.api.models.WebhookEventList;
import com.univapay.api.models.WebhookTrigger;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

WebhookEventList webhookEventList = new WebhookEventList.Builder()
    .items(Arrays.asList(
        new WebhookEvent.Builder()
            .id(UUID.fromString("e1f2a3b4-c5d6-7890-efab-123456789cde"))
            .webhookId(UUID.fromString("d3e4f5a6-b7c8-9012-def0-123456789abc"))
            .event(WebhookTrigger.CHARGE_FINISHED)
            .data(ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .successful(true)
            .firedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:36:00.000000Z"))
            .errorMessage(null)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new WebhookEvent.Builder()
            .id(UUID.fromString("f2a3b4c5-d6e7-8901-fabc-23456789cdef"))
            .webhookId(UUID.fromString("d3e4f5a6-b7c8-9012-def0-123456789abc"))
            .event(WebhookTrigger.REFUND_FINISHED)
            .data(ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .successful(true)
            .firedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T11:00:05.000000Z"))
            .errorMessage(null)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-10T11:00:00.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

