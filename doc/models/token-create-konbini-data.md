
# Token Create Konbini Data

Token Create Konbini Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreateKonbiniData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `CustomerName` | `String` | Required | Customer name. | String getCustomerName() | setCustomerName(String customerName) |
| `ConvenienceStore` | [`BaseKonbiniDataConvenienceStore`](../../doc/models/base-konbini-data-convenience-store.md) | Required | Base Konbini Data Convenience Store schema. | BaseKonbiniDataConvenienceStore getConvenienceStore() | setConvenienceStore(BaseKonbiniDataConvenienceStore convenienceStore) |
| `ExpirationPeriod` | `String` | Optional | ISO-8601 Duration (e.g., 'P7D'). Default is 30 days. | String getExpirationPeriod() | setExpirationPeriod(String expirationPeriod) |
| `PhoneNumber` | [`TokenCreatePhoneNumber`](../../doc/models/token-create-phone-number.md) | Required | Token Create Phone Number schema. | TokenCreatePhoneNumber getPhoneNumber() | setPhoneNumber(TokenCreatePhoneNumber phoneNumber) |
| `ExpirationTimeShift` | `String` | Optional | Expiration time shift value. | String getExpirationTimeShift() | setExpirationTimeShift(String expirationTimeShift) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.BaseKonbiniDataConvenienceStore;
import com.univapay.api.models.TokenCreateKonbiniData;
import com.univapay.api.models.TokenCreatePhoneNumber;
import java.io.IOException;

TokenCreateKonbiniData tokenCreateKonbiniData = new TokenCreateKonbiniData.Builder(
    "Taro Yamada",
    BaseKonbiniDataConvenienceStore.SEVEN_ELEVEN,
    new TokenCreatePhoneNumber.Builder(
        "81",
        "08012341234"
    )
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build()
)
.expirationPeriod("P7D")
.expirationTimeShift("23:59:59+09:00")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

