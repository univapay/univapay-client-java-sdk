
# Cancel Create Request

Request body to create a cancel for a charge. Only `metadata` is accepted; all other fields are determined server-side. The charge must be in a cancellable state.

*This model accepts additional fields of type Object.*

## Structure

`CancelCreateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.CancelCreateRequest;
import com.univapay.api.models.GenericMetadata;

CancelCreateRequest cancelCreateRequest = new CancelCreateRequest.Builder()
    .metadata(new GenericMetadata.Builder()
        .orderId("ORD-987")
        .build())
    .build();
```

