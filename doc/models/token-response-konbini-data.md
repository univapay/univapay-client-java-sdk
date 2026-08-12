
# Token Response Konbini Data

Token Response Konbini Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseKonbiniData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerName` | `String` | Optional | Customer name. | String getCustomerName() | setCustomerName(String customerName) |
| `ConvenienceStore` | [`BaseKonbiniDataConvenienceStore`](../../doc/models/base-konbini-data-convenience-store.md) | Optional | Base Konbini Data Convenience Store schema. | BaseKonbiniDataConvenienceStore getConvenienceStore() | setConvenienceStore(BaseKonbiniDataConvenienceStore convenienceStore) |
| `ExpirationPeriod` | `String` | Optional | ISO-8601 Duration (e.g., 'P7D'). Default is 30 days. | String getExpirationPeriod() | setExpirationPeriod(String expirationPeriod) |
| `ExpirationTimeShift` | `String` | Optional | Time shift applied to the expiration, typically pushing it to the end of the day in a specific timezone (e.g., '23:59:59.999999+09:00'). | String getExpirationTimeShift() | setExpirationTimeShift(String expirationTimeShift) |
| `PhoneNumber` | [`TokenResponsePhoneNumber`](../../doc/models/token-response-phone-number.md) | Optional | Token Response Phone Number schema. | TokenResponsePhoneNumber getPhoneNumber() | setPhoneNumber(TokenResponsePhoneNumber phoneNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.BaseKonbiniDataConvenienceStore;
import com.univapay.api.models.TokenResponseKonbiniData;
import com.univapay.api.models.TokenResponsePhoneNumber;

TokenResponseKonbiniData tokenResponseKonbiniData = new TokenResponseKonbiniData.Builder()
    .customerName("Taro Yamada")
    .convenienceStore(BaseKonbiniDataConvenienceStore.SEVEN_ELEVEN)
    .expirationPeriod("P7D")
    .expirationTimeShift(null)
    .phoneNumber(new TokenResponsePhoneNumber.Builder()
        .countryCode(81)
        .localNumber("08012341234")
        .build())
    .build();
```

