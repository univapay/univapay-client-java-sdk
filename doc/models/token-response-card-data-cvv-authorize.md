
# Token Response Card Data Cvv Authorize

Token Response Card Data Cvv Authorize schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseCardDataCvvAuthorize`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enabled value. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Status` | `String` | Optional | Current status of the resource. | String getStatus() | setStatus(String status) |
| `ChargeId` | `UUID` | Optional | Charge identifier. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `CredentialsId` | `UUID` | Optional | Credentials identifier. | UUID getCredentialsId() | setCredentialsId(UUID credentialsId) |
| `Currency` | `String` | Optional | ISO-4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TokenResponseCardDataCvvAuthorize;
import java.io.IOException;

TokenResponseCardDataCvvAuthorize tokenResponseCardDataCvvAuthorize = new TokenResponseCardDataCvvAuthorize.Builder()
    .enabled(true)
    .status("successful")
    .chargeId(null)
    .credentialsId(null)
    .currency("JPY")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

