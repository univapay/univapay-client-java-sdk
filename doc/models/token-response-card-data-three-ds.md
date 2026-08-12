
# Token Response Card Data Three Ds

Token Response Card Data Three Ds schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseCardDataThreeDs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enabled value. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `Status` | [`TokenResponseCardDataThreeDsStatus`](../../doc/models/token-response-card-data-three-ds-status.md) | Optional | Token Response Card Data Three Ds Status schema. | TokenResponseCardDataThreeDsStatus getStatus() | setStatus(TokenResponseCardDataThreeDsStatus status) |
| `RedirectEndpoint` | `String` | Optional | Redirect endpoint URL. | String getRedirectEndpoint() | setRedirectEndpoint(String redirectEndpoint) |
| `RedirectId` | `UUID` | Optional | Redirect identifier. | UUID getRedirectId() | setRedirectId(UUID redirectId) |
| `Exempted` | `Boolean` | Optional | Indicates if the 3DS check was exempted. When creating charge 3DS check will not be required. | Boolean getExempted() | setExempted(Boolean exempted) |
| `Error` | [`PaymentError`](../../doc/models/payment-error.md) | Optional | Payment error details, or null if successful. | PaymentError getError() | setError(PaymentError error) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponseCardDataThreeDs;
import com.univapay.api.models.TokenResponseCardDataThreeDsStatus;

TokenResponseCardDataThreeDs tokenResponseCardDataThreeDs = new TokenResponseCardDataThreeDs.Builder()
    .enabled(true)
    .status(TokenResponseCardDataThreeDsStatus.SUCCESSFUL)
    .redirectEndpoint(null)
    .redirectId(null)
    .exempted(false)
    .error(null)
    .build();
```

