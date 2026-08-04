
# Issuer Token Payload

A dictionary containing necessary key-value pairs for sending the request.

*This model accepts additional fields of type Object.*

## Structure

`IssuerTokenPayload`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RequestData` | `String` | Optional | Generic payload key used by most payment providers. | String getRequestData() | setRequestData(String requestData) |
| `SSpcd` | `String` | Optional | d-barai payment service code. | String getSSpcd() | setSSpcd(String sSpcd) |
| `SCptok` | `String` | Optional | d-barai coupon token. | String getSCptok() | setSCptok(String sCptok) |
| `STerkn` | `String` | Optional | d-barai terminal key. | String getSTerkn() | setSTerkn(String sTerkn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.IssuerTokenPayload;
import java.io.IOException;

IssuerTokenPayload issuerTokenPayload = new IssuerTokenPayload.Builder()
    .requestData("request_data2")
    .sSpcd("sSpcd2")
    .sCptok("sCptok4")
    .sTerkn("sTerkn2")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

