
# Subscription User Data

Customer-facing payment method summary data.

*This model accepts additional fields of type Object.*

## Structure

`SubscriptionUserData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Type` | `String` | Optional | Type of the resource. | String getType() | setType(String type) |
| `CardholderName` | `String` | Optional | Cardholder name value. | String getCardholderName() | setCardholderName(String cardholderName) |
| `Email` | `String` | Optional | Customer email address. | String getEmail() | setEmail(String email) |
| `Brand` | `String` | Optional | Brand or network name. | String getBrand() | setBrand(String brand) |
| `Gateway` | `String` | Optional | Gateway identifier. | String getGateway() | setGateway(String gateway) |
| `ServiceProvider` | `String` | Optional | Service provider identifier. | String getServiceProvider() | setServiceProvider(String serviceProvider) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.SubscriptionUserData;
import java.io.IOException;

SubscriptionUserData subscriptionUserData = new SubscriptionUserData.Builder()
    .type("type8")
    .cardholderName("cardholder_name2")
    .email("email4")
    .brand("brand6")
    .gateway("gateway2")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

