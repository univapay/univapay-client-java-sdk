
# Merchant Webhook Money Amount

Monetary amount object serialized by backend config models.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookMoneyAmount`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Amount` | `Integer` | Optional | Amount in minor currency units. | Integer getAmount() | setAmount(Integer amount) |
| `Currency` | `String` | Optional | ISO 4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookMoneyAmount;

MerchantWebhookMoneyAmount merchantWebhookMoneyAmount = new MerchantWebhookMoneyAmount.Builder()
    .amount(1000)
    .currency("JPY")
    .build();
```

