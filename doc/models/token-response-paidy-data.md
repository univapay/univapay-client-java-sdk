
# Token Response Paidy Data

Token Response Paidy Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponsePaidyData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `PaidyToken` | `String` | Required | One-time token issued by the Paidy SDK/widget on the client side. | String getPaidyToken() | setPaidyToken(String paidyToken) |
| `PhoneNumber` | `String` | Optional | Consumer phone number in Japanese format. | String getPhoneNumber() | setPhoneNumber(String phoneNumber) |
| `ShippingAddress` | [`TokenResponsePaidyDataShippingAddress`](../../doc/models/token-response-paidy-data-shipping-address.md) | Optional | Shipping address returned for a Paidy token. | TokenResponsePaidyDataShippingAddress getShippingAddress() | setShippingAddress(TokenResponsePaidyDataShippingAddress shippingAddress) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponsePaidyData;
import com.univapay.api.models.TokenResponsePaidyDataShippingAddress;

TokenResponsePaidyData tokenResponsePaidyData = new TokenResponsePaidyData.Builder(
    "paidy-token-abc123"
)
.phoneNumber("08012341234")
.shippingAddress(new TokenResponsePaidyDataShippingAddress.Builder()
        .zip("105-0011")
        .line1("1-1-1")
        .city("Minato")
        .state("Tokyo")
        .build())
.build();
```

