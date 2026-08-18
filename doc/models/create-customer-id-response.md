
# Create Customer Id Response

Response payload returned after deriving a deterministic customer ID.

*This model accepts additional fields of type Object.*

## Structure

`CreateCustomerIdResponse`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerId` | `UUID` | Optional | Deterministic UUID derived from the store and the supplied local `customer_id`. Identical for repeated calls with the same inputs. | UUID getCustomerId() | setCustomerId(UUID customerId) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.CreateCustomerIdResponse;
import java.util.UUID;

CreateCustomerIdResponse createCustomerIdResponse = new CreateCustomerIdResponse.Builder()
    .customerId(UUID.fromString("8a3f1b8e-2c1a-4b7a-9c2e-6f6b6f6e2b10"))
    .build();
```

