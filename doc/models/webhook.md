
# Webhook

Represents a webhook subscription. Webhooks send event notifications to a specified URL when triggered by payment events.

*This model accepts additional fields of type Object.*

## Structure

`Webhook`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier for the webhook. | UUID getId() | setId(UUID id) |
| `StoreId` | `UUID` | Optional | ID of the store this webhook belongs to (null for merchant-level webhooks). | UUID getStoreId() | setStoreId(UUID storeId) |
| `MerchantId` | `UUID` | Optional | ID of the merchant this webhook belongs to. | UUID getMerchantId() | setMerchantId(UUID merchantId) |
| `Triggers` | [`List<WebhookTrigger>`](../../doc/models/webhook-trigger.md) | Optional | List of event types that trigger this webhook. | List<WebhookTrigger> getTriggers() | setTriggers(List<WebhookTrigger> triggers) |
| `Url` | `String` | Optional | The endpoint URL that receives webhook POST requests. | String getUrl() | setUrl(String url) |
| `AuthToken` | `String` | Optional | Optional bearer token included in the `Authorization` header of webhook requests. Used to authenticate the webhook receiver. | String getAuthToken() | setAuthToken(String authToken) |
| `Active` | `Boolean` | Optional | Whether this webhook is currently active and receiving events. | Boolean getActive() | setActive(Boolean active) |
| `IsIntegration` | `Boolean` | Optional | Admin-only flag. Indicates this webhook is used for platform integration purposes. Not settable by merchants. | Boolean getIsIntegration() | setIsIntegration(Boolean isIntegration) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the webhook was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the webhook was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Webhook;
import com.univapay.api.models.WebhookTrigger;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

Webhook webhook = new Webhook.Builder()
    .id(UUID.fromString("d3e4f5a6-b7c8-9012-def0-123456789abc"))
    .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
    .merchantId(UUID.fromString("01234567-89ab-cdef-0123-456789abcdef"))
    .triggers(Arrays.asList(
        WebhookTrigger.CHARGE_FINISHED,
        WebhookTrigger.REFUND_FINISHED
    ))
    .url("https://example.com/webhooks/payments")
    .authToken("my-secret-token")
    .active(true)
    .isIntegration(false)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-01T00:00:00.000000Z"))
    .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-02T00:00:00.000000Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

