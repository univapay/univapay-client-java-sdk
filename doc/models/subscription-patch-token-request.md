
# Subscription Patch Token Request

Request body for updating the payment method (transaction token) of a subscription. The new token must belong to the same store, be active, and match the subscription's mode.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionPatchTokenRequest`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `TransactionTokenId` | `UUID` | Required | The ID of the new transaction token to use for future subscription payments. Must be a recurring or subscription-type token for the same store. | UUID getTransactionTokenId() | setTransactionTokenId(UUID transactionTokenId) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.SubscriptionPatchTokenRequest;
import java.io.IOException;
import java.util.UUID;

SubscriptionPatchTokenRequest subscriptionPatchTokenRequest = new SubscriptionPatchTokenRequest.Builder(
    UUID.fromString("11ef3362-3700-c54a-9baa-6f7e6527c9d9")
)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

