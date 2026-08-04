
# Webhook List

Paginated list of webhooks.

*This model accepts additional fields of type Object.*

## Structure

`WebhookList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<Webhook>`](../../doc/models/webhook.md) | Optional | List of resources. | List<Webhook> getItems() | setItems(List<Webhook> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Webhook;
import com.univapay.api.models.WebhookList;
import com.univapay.api.models.WebhookTrigger;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

WebhookList webhookList = new WebhookList.Builder()
    .items(Arrays.asList(
        new Webhook.Builder()
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
            .build(),
        new Webhook.Builder()
            .id(UUID.fromString("e4f5a6b7-c8d9-0123-ef01-23456789abcd"))
            .storeId(UUID.fromString("76cf4a64-02bc-4cb3-9a28-74622e5928a1"))
            .merchantId(UUID.fromString("01234567-89ab-cdef-0123-456789abcdef"))
            .triggers(Arrays.asList(
                WebhookTrigger.SUBSCRIPTION_PAYMENT,
                WebhookTrigger.SUBSCRIPTION_FAILURE
            ))
            .url("https://example.com/webhooks/subscriptions")
            .authToken(null)
            .active(true)
            .isIntegration(false)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-03T08:30:00.000000Z"))
            .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-03T08:30:00.000000Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

