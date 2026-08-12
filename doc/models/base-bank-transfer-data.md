
# Base Bank Transfer Data

Base Bank Transfer Data schema.

*This model accepts additional fields of type Object.*

## Structure

`BaseBankTransferData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Brand` | `String` | Optional | The bank brand identifier (e.g., 'aozora_bank'). | String getBrand() | setBrand(String brand) |
| `ExpirationPeriod` | `String` | Optional | ISO 8601 duration format (e.g., 'PT168H'). | String getExpirationPeriod() | setExpirationPeriod(String expirationPeriod) |
| `ExpirationTimeShift` | `String` | Optional | Time shift applied to the expiration, typically pushing it to the end of the day  in a specific timezone (e.g., '23:59:59+09:00'). | String getExpirationTimeShift() | setExpirationTimeShift(String expirationTimeShift) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.BaseBankTransferData;

BaseBankTransferData baseBankTransferData = new BaseBankTransferData.Builder()
    .brand("aozora_bank")
    .expirationPeriod("PT168H")
    .expirationTimeShift("23:59:59+09:00")
    .build();
```

