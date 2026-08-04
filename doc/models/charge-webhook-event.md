
# Charge Webhook Event

Webhook envelope for charge lifecycle events. Fired as `charge_updated` whenever a charge transitions to a new status (e.g., `pending` → `awaiting`), and as `charge_finished` when a charge reaches a terminal status (`successful`, `failed`, `error`). The `data` field contains the full Charge object at the time of the event.

*This model accepts additional fields of type Object.*

## Structure

`ChargeWebhookEvent`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Required | Unique ID of this webhook delivery. | UUID getId() | setId(UUID id) |
| `Event` | [`ChargeEvent`](../../doc/models/charge-event.md) | Required | Event type discriminator — `charge_updated` or `charge_finished`. | ChargeEvent getEvent() | setEvent(ChargeEvent event) |
| `Data` | [`Charge`](../../doc/models/charge.md) | Optional | Charge resource returned by the payments API. | Charge getData() | setData(Charge data) |
| `CreatedOn` | `LocalDateTime` | Required | Timestamp when the event was fired. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Charge;
import com.univapay.api.models.ChargeEvent;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.ChargeStatus;
import com.univapay.api.models.ChargeTransactionTokenType;
import com.univapay.api.models.ChargeWebhookEvent;
import java.io.IOException;
import java.util.UUID;

ChargeWebhookEvent chargeWebhookEvent = new ChargeWebhookEvent.Builder(
    UUID.fromString("11ef0000-0000-4000-8000-000000000001"),
    ChargeEvent.CHARGE_UPDATED,
    DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z")
)
.data(new Charge.Builder()
        .id(UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98"))
        .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
        .transactionTokenId(UUID.fromString("11ef32a7-3a71-8662-803f-1bc27702eeec"))
        .transactionTokenType(ChargeTransactionTokenType.RECURRING)
        .subscriptionId(UUID.fromString("11ef335e-9aa5-c54a-8313-7f9847da313a"))
        .requestedAmount(1250)
        .requestedCurrency("USD")
        .requestedAmountFormatted(12.5D)
        .chargedAmount(1250)
        .chargedCurrency("USD")
        .chargedAmountFormatted(12.5D)
        .onlyDirectCurrency(false)
        .status(ChargeStatus.SUCCESSFUL)
        .error(null)
        .mode(ChargeMode.TEST)
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-06-26T01:51:30.000000Z"))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

