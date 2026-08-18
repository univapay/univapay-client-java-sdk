
# Checkout Subscription Configuration

Univapay-hosted subscription feature toggle.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutSubscriptionConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether Univapay-hosted subscriptions are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutSubscriptionConfiguration;
import java.io.IOException;

CheckoutSubscriptionConfiguration checkoutSubscriptionConfiguration = new CheckoutSubscriptionConfiguration.Builder()
    .enabled(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

