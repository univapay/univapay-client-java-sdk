
# Create Customer Id Request

Request payload for deriving a deterministic customer ID.

*This model accepts additional fields of type Object.*

## Structure

`CreateCustomerIdRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerId` | `String` | Required | The merchant's own local identifier for the customer, used as the seed for a deterministic per-store UUID.<br><br>**Constraints**: *Minimum Length*: `1`, *Maximum Length*: `64` | String getCustomerId() | setCustomerId(String customerId) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.CreateCustomerIdRequest;

CreateCustomerIdRequest createCustomerIdRequest = new CreateCustomerIdRequest.Builder(
    "local-customer-1902"
)
.build();
```

