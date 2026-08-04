
# Three Ds Issuer Token

3-D Secure issuer token payload.

*This model accepts additional fields of type Object.*

## Structure

`ThreeDsIssuerToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentType` | `String` | Required, Constant | Only 'card' is supported for 3-D Secure issuer tokens.<br><br>**Value**: `"card"` | String getPaymentType() | setPaymentType(String paymentType) |
| `IssuerToken` | `String` | Required | The 3-D Secure authentication URL to which the client must send the request. | String getIssuerToken() | setIssuerToken(String issuerToken) |
| `CallMethod` | `String` | Required, Constant | Execution method. Currently, only 'http_post' is supported.<br><br>**Value**: `"http_post"` | String getCallMethod() | setCallMethod(String callMethod) |
| `Payload` | [`IssuerTokenPayload`](../../doc/models/issuer-token-payload.md) | Optional | Key-value pairs required to complete the payment action, or null if not applicable. Used when `call_method` is `http_post`. When present, this JSON must be converted by the client to match the expected `content_type` (e.g., transformed into an `application/x-www-form-urlencoded` string) before sending the POST request. | IssuerTokenPayload getPayload() | setPayload(IssuerTokenPayload payload) |
| `ContentType` | `String` | Required | The expected content type of the payload required by the card issuer's endpoint  (e.g., 'application/x-www-form-urlencoded; charset=UTF-8'). | String getContentType() | setContentType(String contentType) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.IssuerTokenPayload;
import com.univapay.api.models.ThreeDsIssuerToken;
import java.io.IOException;

ThreeDsIssuerToken threeDsIssuerToken = new ThreeDsIssuerToken.Builder(
    "card",
    "https://example.com/resource",
    "http_post",
    "application/x-www-form-urlencoded; charset=UTF-8"
)
.payload(new IssuerTokenPayload.Builder()
        .requestData("example")
        .sSpcd("sSpcd6")
        .sCptok("sCptok0")
        .sTerkn("sTerkn6")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

