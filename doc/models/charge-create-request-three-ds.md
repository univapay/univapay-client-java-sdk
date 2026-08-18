
# Charge Create Request Three Ds

Charge Create Request Three Ds schema. Either supply `mode` (and optionally `redirect_endpoint`) to have Univapay run 3DS, or supply all six external-MPI fields (`authentication_value` through `transaction_status`) when 3DS authentication was already completed outside of Univapay — in that case `mode` is set to `provided` automatically and must not be sent.

*This model accepts additional fields of type Object.*

## Structure

`ChargeCreateRequestThreeDs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `RedirectEndpoint` | `String` | Optional | URL to redirect the customer to after 3DS authentication. | String getRedirectEndpoint() | setRedirectEndpoint(String redirectEndpoint) |
| `Mode` | [`ChargeCreateRequestThreeDsMode`](../../doc/models/charge-create-request-three-ds-mode.md) | Optional | 3D-Secure authentication type. App Token Secret is required to use 'skip'. `if_available` enforces 3DS only if credentials are available for the recurring token and it has not already completed 3DS. `provided` is set automatically by the server when external MPI authentication data (`authentication_value`, `eci`, etc.) is submitted on the request and cannot be set manually. When omitted, the store's default 3DS policy applies — do not assume 'normal'. | ChargeCreateRequestThreeDsMode getMode() | setMode(ChargeCreateRequestThreeDsMode mode) |
| `AuthenticationValue` | `String` | Optional | External MPI: the cardholder authentication value (CAVV/AAV) returned by the 3-D Secure directory server. Submit together with `eci`, `ds_transaction_id`, `server_transaction_id`, `message_version`, and `transaction_status` to provide externally completed 3DS authentication data — either all six fields must be present, or none of them. | String getAuthenticationValue() | setAuthenticationValue(String authenticationValue) |
| `Eci` | `String` | Optional | External MPI: the two-digit Electronic Commerce Indicator returned by the directory server. Submit together with the other external MPI fields. | String getEci() | setEci(String eci) |
| `DsTransactionId` | `String` | Optional | External MPI: the directory server transaction ID. Submit together with the other external MPI fields. | String getDsTransactionId() | setDsTransactionId(String dsTransactionId) |
| `ServerTransactionId` | `String` | Optional | External MPI: the 3DS server transaction ID. Submit together with the other external MPI fields. | String getServerTransactionId() | setServerTransactionId(String serverTransactionId) |
| `MessageVersion` | `String` | Optional | External MPI: the 3-D Secure protocol message version (e.g., '2.1.0', '2.2.0'). Submit together with the other external MPI fields. | String getMessageVersion() | setMessageVersion(String messageVersion) |
| `TransactionStatus` | `String` | Optional | External MPI: the 3-D Secure directory server transaction status. Only a successful authentication status is accepted. Submit together with the other external MPI fields. | String getTransactionStatus() | setTransactionStatus(String transactionStatus) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.ChargeCreateRequestThreeDs;

ChargeCreateRequestThreeDs chargeCreateRequestThreeDs = new ChargeCreateRequestThreeDs.Builder()
    .build();
```

