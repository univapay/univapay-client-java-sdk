
# Enable Token Three Ds Request

Request payload for enabling 3DS on a recurring token. Both the body and `redirect_endpoint` are optional.

*This model accepts additional fields of type Object.*

## Structure

`EnableTokenThreeDsRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RedirectEndpoint` | `String` | Optional | URL to redirect the customer to after 3DS authentication. | String getRedirectEndpoint() | setRedirectEndpoint(String redirectEndpoint) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.EnableTokenThreeDsRequest;

EnableTokenThreeDsRequest enableTokenThreeDsRequest = new EnableTokenThreeDsRequest.Builder()
    .build();
```

