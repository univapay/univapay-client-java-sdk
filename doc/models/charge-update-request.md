
# Charge Update Request

Request payload for updating charge metadata.

*This model accepts additional fields of type Object.*

## Structure

`ChargeUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeUpdateRequest;
import com.univapay.api.models.GenericMetadata;

ChargeUpdateRequest chargeUpdateRequest = new ChargeUpdateRequest.Builder()
    .metadata(new GenericMetadata.Builder()
        .orderId("12347")
        .build())
    .build();
```

