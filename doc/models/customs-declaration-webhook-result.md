
# Customs Declaration Webhook Result

Result payload returned by the customs declaration formatter.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationWebhookResult`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `ApprovingAuthority` | `String` | Optional | Customs authority that approved the declaration. | String getApprovingAuthority() | setApprovingAuthority(String approvingAuthority) |
| `TradeId` | `String` | Optional | Gateway trade identifier. | String getTradeId() | setTradeId(String tradeId) |
| `TransactionId` | `String` | Optional | Gateway transaction identifier for customs. | String getTransactionId() | setTransactionId(String transactionId) |
| `ChargeTransactionId` | `String` | Optional | Gateway charge transaction identifier linked to the declaration. | String getChargeTransactionId() | setChargeTransactionId(String chargeTransactionId) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.CustomsDeclarationWebhookResult;

CustomsDeclarationWebhookResult customsDeclarationWebhookResult = new CustomsDeclarationWebhookResult.Builder()
    .approvingAuthority("TOKYO")
    .tradeId("wx_trade_12345")
    .transactionId("wx_txn_12345")
    .chargeTransactionId("wx_charge_12345")
    .build();
```

