
# Direct Debit Merchant Configuration

The merchant's effective direct debit configuration.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitMerchantConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `LegacyId` | `String` | Optional | Identifier of the merchant in the legacy direct debit system.<br><br>**Constraints**: *Pattern*: `^[0-9]+$` | String getLegacyId() | setLegacyId(String legacyId) |
| `Enabled` | `Boolean` | Optional | Whether direct debit is enabled for this merchant. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `DebitDate` | [`DirectDebitDebitDate`](../../doc/models/direct-debit-debit-date.md) | Optional | Monthly debit cycle — funds are pulled on either the 14th or the 27th. | DirectDebitDebitDate getDebitDate() | setDebitDate(DirectDebitDebitDate debitDate) |
| `ConsignorCode` | `String` | Optional | Consignor code (委託者コード) assigned by the collecting bank.<br><br>**Constraints**: *Minimum Length*: `6`, *Maximum Length*: `6`, *Pattern*: `^[0-9]{6}$` | String getConsignorCode() | setConsignorCode(String consignorCode) |
| `Classifier` | `String` | Optional | Transfer classification code (区分) agreed with the collecting bank.<br><br>**Constraints**: *Minimum Length*: `2`, *Maximum Length*: `2`, *Pattern*: `^[0-9]{2}$` | String getClassifier() | setClassifier(String classifier) |
| `Signature` | `String` | Optional | Name printed on the consumer's bank statement (印字名), in half-width katakana. | String getSignature() | setSignature(String signature) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.DirectDebitDebitDate;
import com.univapay.api.models.DirectDebitMerchantConfiguration;
import java.io.IOException;

DirectDebitMerchantConfiguration directDebitMerchantConfiguration = new DirectDebitMerchantConfiguration.Builder()
    .legacyId("1283794")
    .enabled(true)
    .debitDate(DirectDebitDebitDate.FOURTEEN)
    .consignorCode("135456")
    .classifier("99")
    .signature("モモサン")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

