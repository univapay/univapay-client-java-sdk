
# Token Webhook Event

Webhook envelope for transaction token lifecycle events. Fired as `token_created` when a token is created, `token_updated` on metadata changes, `token_three_d_s_updated` on 3-D Secure data changes, `token_cvv_auth_updated` on CVV authorization changes, `token_cvv_auth_check_updated` on CVV auth check changes, `token_replaced` when a token is replaced by a new one (e.g., after a card update), and `recurring_token_deleted` when a recurring token is deleted. The `data` field contains the full TransactionToken object at the time of the event.

*This model accepts additional fields of type Object.*

## Structure

`TokenWebhookEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Required | Unique ID of this webhook delivery. | UUID getId() | setId(UUID id) |
| `Event` | [`TokenEvent`](../../doc/models/token-event.md) | Required | Event type discriminator — `token_created`, `token_updated`, `token_three_d_s_updated`, `token_cvv_auth_updated`, `token_cvv_auth_check_updated`, `token_replaced`, or `recurring_token_deleted`. | TokenEvent getEvent() | setEvent(TokenEvent event) |
| `Data` | [`TransactionToken`](../../doc/models/transaction-token.md) | Optional | Stored transaction token resource. | TransactionToken getData() | setData(TransactionToken data) |
| `CreatedOn` | `LocalDateTime` | Required | Timestamp when the event was fired. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.TokenEvent;
import com.univapay.api.models.TokenWebhookEvent;
import com.univapay.api.models.TransactionToken;
import com.univapay.api.models.TransactionTokenMode;
import com.univapay.api.models.TransactionTokenPaymentType;
import com.univapay.api.models.TransactionTokenType;
import com.univapay.api.models.containers.TransactionTokenMetadataAdditionalProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.UUID;

TokenWebhookEvent tokenWebhookEvent = new TokenWebhookEvent.Builder(
    UUID.fromString("11ef0000-0000-4000-8000-000000000001"),
    TokenEvent.TOKEN_CREATED,
    DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z")
)
.data(new TransactionToken.Builder()
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .paymentType(TransactionTokenPaymentType.CARD)
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.RECURRING)
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
            put("customer_id", );
        }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

