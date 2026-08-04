
# Issuer Token

Issuer token or bank transfer instruction payload.

*This model accepts additional fields of type Object.*

## Structure

`IssuerToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaymentType` | [`IssuerTokenPaymentType`](../../doc/models/issuer-token-payment-type.md) | Required | The type of payment method for the charge. | IssuerTokenPaymentType getPaymentType() | setPaymentType(IssuerTokenPaymentType paymentType) |
| `IssuerToken` | `String` | Optional | (Online) The token or payment URL provided by the payment provider for the consumer to execute. | String getIssuerToken() | setIssuerToken(String issuerToken) |
| `CallMethod` | [`IssuerTokenCallMethod`](../../doc/models/issuer-token-call-method.md) | Optional | (Online) How the client should execute the token.  - `sdk` / `app`: Direct use in native app environments/SDKs. - `web`: Direct use in special extended browser environments. - `http_get` / `http_post`: Execute directly in a new browser window or iframe. | IssuerTokenCallMethod getCallMethod() | setCallMethod(IssuerTokenCallMethod callMethod) |
| `Payload` | [`IssuerTokenPayload`](../../doc/models/issuer-token-payload.md) | Optional | Key-value pairs required to complete the payment action, or null if not applicable. Used when `call_method` is `http_post`. When present, this JSON must be converted by the client to match the expected `content_type` (e.g., transformed into an `application/x-www-form-urlencoded` string) before sending the POST request. | IssuerTokenPayload getPayload() | setPayload(IssuerTokenPayload payload) |
| `AccountId` | `String` | Optional | (Bank Transfer) Unique ID of the bank account issued by the connected system. | String getAccountId() | setAccountId(String accountId) |
| `BranchCode` | `String` | Optional | (Bank Transfer) Branch code. | String getBranchCode() | setBranchCode(String branchCode) |
| `BranchName` | `String` | Optional | (Bank Transfer) Branch name. | String getBranchName() | setBranchName(String branchName) |
| `AccountHolderName` | `String` | Optional | (Bank Transfer) Account holder name. | String getAccountHolderName() | setAccountHolderName(String accountHolderName) |
| `AccountNumber` | `String` | Optional | (Bank Transfer) Account number. | String getAccountNumber() | setAccountNumber(String accountNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.IssuerToken;
import com.univapay.api.models.IssuerTokenCallMethod;
import com.univapay.api.models.IssuerTokenPayload;
import com.univapay.api.models.IssuerTokenPaymentType;
import java.io.IOException;

IssuerToken issuerToken = new IssuerToken.Builder(
    IssuerTokenPaymentType.ONLINE
)
.issuerToken("https://example.com/payments/issuer")
.callMethod(IssuerTokenCallMethod.HTTP_POST)
.payload(new IssuerTokenPayload.Builder()
        .requestData("example")
        .sSpcd("sSpcd6")
        .sCptok("sCptok0")
        .sTerkn("sTerkn6")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.accountId("account_id2")
.branchCode("branch_code8")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

