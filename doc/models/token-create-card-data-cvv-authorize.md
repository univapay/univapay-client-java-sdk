
# Token Create Card Data Cvv Authorize

Token Create Card Data Cvv Authorize schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreateCardDataCvvAuthorize`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enabled value.<br><br>**Default**: `false` | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenCreateCardDataCvvAuthorize;

TokenCreateCardDataCvvAuthorize tokenCreateCardDataCvvAuthorize = new TokenCreateCardDataCvvAuthorize.Builder()
    .enabled(false)
    .currency("JPY")
    .build();
```

