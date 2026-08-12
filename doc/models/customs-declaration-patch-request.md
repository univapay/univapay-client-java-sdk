
# Customs Declaration Patch Request

Request body for updating a customs declaration. Backend patch handling keeps the original `customs`, `certificate_id`, and `certificate_name` values and only accepts a new `merchant_customs_no`.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationPatchRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MerchantCustomsNo` | `String` | Required | Updated merchant customs registration number. | String getMerchantCustomsNo() | setMerchantCustomsNo(String merchantCustomsNo) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.CustomsDeclarationPatchRequest;

CustomsDeclarationPatchRequest customsDeclarationPatchRequest = new CustomsDeclarationPatchRequest.Builder(
    "1234567891"
)
.build();
```

