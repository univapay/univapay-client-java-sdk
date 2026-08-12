
# Webhook Event

Represents a single delivery attempt of a webhook event, including the payload sent and the delivery outcome.

*This model accepts additional fields of type Object.*

## Structure

`WebhookEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier for the webhook event. | UUID getId() | setId(UUID id) |
| `WebhookId` | `UUID` | Optional | ID of the parent webhook. | UUID getWebhookId() | setWebhookId(UUID webhookId) |
| `Event` | [`WebhookTrigger`](../../doc/models/webhook-trigger.md) | Optional | Event type that triggers a webhook notification. | WebhookTrigger getEvent() | setEvent(WebhookTrigger event) |
| `Data` | `Object` | Optional | Domain object payload for webhook deliveries. The actual structure depends on the event type — see each webhook callback schema for the specific payload shape. | Object getData() | setData(Object data) |
| `Successful` | `Boolean` | Optional | Whether the webhook delivery was acknowledged (HTTP 2xx). | Boolean getSuccessful() | setSuccessful(Boolean successful) |
| `FiredOn` | `LocalDateTime` | Optional | Timestamp when the webhook was dispatched. | LocalDateTime getFiredOn() | setFiredOn(LocalDateTime firedOn) |
| `ErrorMessage` | `String` | Optional | Error message if delivery failed. | String getErrorMessage() | setErrorMessage(String errorMessage) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the event was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.WebhookEvent;

WebhookEvent webhookEvent = new WebhookEvent.Builder()
    .build();
```

