
# Webhook Callback Envelope

Common wrapper POSTed to your webhook URL for every event. The `data` field contains the domain object relevant to the event type.

*This model accepts additional fields of type Object.*

## Structure

`WebhookCallbackEnvelope`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Required | Unique ID of this webhook delivery. | UUID getId() | setId(UUID id) |
| `Event` | [`WebhookTrigger`](../../doc/models/webhook-trigger.md) | Required | Event type that triggers a webhook notification. | WebhookTrigger getEvent() | setEvent(WebhookTrigger event) |
| `CreatedOn` | `LocalDateTime` | Required | Timestamp when the event was fired. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.WebhookCallbackEnvelope;
import com.univapay.api.models.WebhookTrigger;
import java.io.IOException;
import java.util.UUID;

WebhookCallbackEnvelope webhookCallbackEnvelope = new WebhookCallbackEnvelope.Builder(
    UUID.fromString("11ef0000-0000-4000-8000-000000000001"),
    WebhookTrigger.CHARGE_FINISHED,
    DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z")
)
.additionalProperty("data", ApiHelper.deserialize("{\"id\":\"6efb4e5c-690a-40f3-a4f1-0e19c5f84e98\",\"created_on\":\"2024-06-26T01:51:30.000000Z\"}"))
.build();
```

