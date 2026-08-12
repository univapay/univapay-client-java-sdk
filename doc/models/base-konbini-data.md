
# Base Konbini Data

Base Konbini Data schema.

*This model accepts additional fields of type Object.*

## Structure

`BaseKonbiniData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerName` | `String` | Optional | Customer name. | String getCustomerName() | setCustomerName(String customerName) |
| `ConvenienceStore` | [`BaseKonbiniDataConvenienceStore`](../../doc/models/base-konbini-data-convenience-store.md) | Optional | Base Konbini Data Convenience Store schema. | BaseKonbiniDataConvenienceStore getConvenienceStore() | setConvenienceStore(BaseKonbiniDataConvenienceStore convenienceStore) |
| `ExpirationPeriod` | `String` | Optional | ISO-8601 Duration (e.g., 'P7D'). Default is 30 days. | String getExpirationPeriod() | setExpirationPeriod(String expirationPeriod) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.BaseKonbiniData;
import com.univapay.api.models.BaseKonbiniDataConvenienceStore;

BaseKonbiniData baseKonbiniData = new BaseKonbiniData.Builder()
    .customerName("Taro Yamada")
    .convenienceStore(BaseKonbiniDataConvenienceStore.SEVEN_ELEVEN)
    .expirationPeriod("P7D")
    .build();
```

