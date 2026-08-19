
# Subscription Three Ds

3-D Secure configuration and redirect details applied to the subscription's payments.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionThreeDs`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Mode` | [`SubscriptionThreeDsMode`](../../doc/models/subscription-three-ds-mode.md) | Optional | 3-D Secure authentication mode applied to the subscription's payments. `if_available` enforces 3DS only if credentials are available for the recurring token and it has not already completed 3DS. `provided` indicates externally supplied MPI authentication data was used. | SubscriptionThreeDsMode getMode() | setMode(SubscriptionThreeDsMode mode) |
| `RedirectEndpoint` | `String` | Optional | URL the customer is redirected to for 3-D Secure authentication. | String getRedirectEndpoint() | setRedirectEndpoint(String redirectEndpoint) |
| `RedirectId` | `UUID` | Optional | Identifier of the 3-D Secure redirect. | UUID getRedirectId() | setRedirectId(UUID redirectId) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.SubscriptionThreeDs;

SubscriptionThreeDs subscriptionThreeDs = new SubscriptionThreeDs.Builder()
    .build();
```

