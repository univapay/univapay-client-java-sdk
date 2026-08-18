
# Token Create Paidy Data

Token Create Paidy Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenCreatePaidyData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaidyToken` | `String` | Required | One-time token issued by the Paidy SDK/widget on the client side. | String getPaidyToken() | setPaidyToken(String paidyToken) |
| `ShippingAddress` | [`TokenCreatePaidyDataShippingAddress`](../../doc/models/token-create-paidy-data-shipping-address.md) | Required | Shipping address for a Paidy token. `zip` is required; the server additionally requires at least one of `line1`, `line2`, `city`, or `state` to be present (not enforceable at the schema level). | TokenCreatePaidyDataShippingAddress getShippingAddress() | setShippingAddress(TokenCreatePaidyDataShippingAddress shippingAddress) |
| `PhoneNumber` | `String` | Optional | Consumer phone number in Japanese format (e.g., '08012341234'). | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenCreatePaidyData;
import com.univapay.api.models.TokenCreatePaidyDataShippingAddress;

TokenCreatePaidyData tokenCreatePaidyData = new TokenCreatePaidyData.Builder(
    "paidy-token-abc123",
    new TokenCreatePaidyDataShippingAddress.Builder(
        "105-0011"
    )
    .line1("1-1-1")
    .city("Minato")
    .state("Tokyo")
    .build()
)
.phoneNumber("08012341234")
.build();
```

