
# Generic Metadata

A free-form dictionary for custom metadata.

*This model accepts additional fields of type [GenericMetadataValue](../../doc/models/containers/generic-metadata-value.md).*

## Structure

`GenericMetadata`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `OrderId` | `String` | Optional | Example of a custom metadata key. | String getOrderId() | setOrderId(String orderId) |
| `UnivapayName` | `String` | Optional | Consumer name passed to payment processors that require it (e.g., konbini, bank transfer). | String getUnivapayName() | setUnivapayName(String univapayName) |
| `UnivapayPhoneNumber` | `String` | Optional | Consumer phone number passed to payment processors that require it. | String getUnivapayPhoneNumber() | setUnivapayPhoneNumber(String univapayPhoneNumber) |
| `AdditionalProperties` | [`Map<String, GenericMetadataValue>`](../../doc/models/containers/generic-metadata-value.md) | Optional | Allowed values for metadata properties. Values may be a string, number, boolean, null, or an array of any of the above — but not a nested object; the server rejects metadata whose direct property values are JSON objects. | GenericMetadataValue getAdditionalProperty(String key) | additionalProperty(String key, GenericMetadataValue value) |

## Example

```java
import com.univapay.api.models.GenericMetadata;

GenericMetadata genericMetadata = new GenericMetadata.Builder()
    .orderId("12345")
    .build();
```

