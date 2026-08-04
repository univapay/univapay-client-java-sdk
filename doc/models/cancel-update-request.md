
# Cancel Update Request

Request body for updating a cancel. Only `metadata` is settable by merchants. All fields are optional; omitted fields are left unchanged.

*This model accepts additional fields of type Object.*

## Structure

`CancelUpdateRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Metadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getMetadata() | setMetadata(GenericMetadata metadata) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CancelUpdateRequest;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;

CancelUpdateRequest cancelUpdateRequest = new CancelUpdateRequest.Builder()
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .univapayName("univapay-name8")
        .univapayPhoneNumber("univapay-phone-number2")
    .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
            "String4"
        ))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

