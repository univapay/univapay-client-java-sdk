
# Store List Item

Store row returned by store list queries.

*This model accepts additional fields of type Object.*

## Structure

`StoreListItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Store identifier. | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Store display name. | String getName() | setName(String name) |
| `MerchantName` | `String` | Optional | Merchant display name associated with the store row. | String getMerchantName() | setMerchantName(String merchantName) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the store was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.StoreListItem;
import java.util.UUID;

StoreListItem storeListItem = new StoreListItem.Builder()
    .id(UUID.fromString("11ef0000-0000-4000-8000-000000000022"))
    .name("Tokyo Store")
    .merchantName("Example Merchant")
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .build();
```

