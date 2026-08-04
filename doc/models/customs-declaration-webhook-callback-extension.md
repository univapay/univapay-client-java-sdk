
# Customs Declaration Webhook Callback Extension

Customs-declaration-specific webhook payload extension.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationWebhookCallbackExtension`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Data` | [`CustomsDeclarationWebhookData`](../../doc/models/customs-declaration-webhook-data.md) | Optional | Customs declaration payload delivered in `customs_declaration_finished` webhooks. Platform-level deliveries may include `platform_id` and `updated_on`. | CustomsDeclarationWebhookData getData() | setData(CustomsDeclarationWebhookData data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.CustomsDeclarationWebhookCallbackExtension;
import com.univapay.api.models.CustomsDeclarationWebhookData;
import com.univapay.api.models.CustomsDeclarationWebhookDeclaration;
import com.univapay.api.models.CustomsDeclarationWebhookResult;
import com.univapay.api.models.CustomsDeclarationWebhookStatus;
import java.io.IOException;
import java.util.UUID;

CustomsDeclarationWebhookCallbackExtension customsDeclarationWebhookCallbackExtension = new CustomsDeclarationWebhookCallbackExtension.Builder()
    .data(new CustomsDeclarationWebhookData.Builder()
        .id(UUID.fromString("11ef0000-0000-4000-8000-000000000040"))
        .chargeId(UUID.fromString("11ef0000-0000-4000-8000-000000000001"))
        .merchantId(UUID.fromString("11ef0000-0000-4000-8000-000000000020"))
        .storeId(UUID.fromString("11ef0000-0000-4000-8000-000000000022"))
        .platformId(UUID.fromString("00000550-0000-0000-0000-000000000000"))
        .mode("test")
        .gateway("wechat_online")
        .declaration(new CustomsDeclarationWebhookDeclaration.Builder()
            .customs("TOKYO")
            .merchantCustomsNo("1234567890")
            .certificateId("AB1234567")
            .certificateName("TARO YAMADA")
            .build())
        .declarationResult(new CustomsDeclarationWebhookResult.Builder()
            .approvingAuthority("TOKYO")
            .tradeId("wx_trade_12345")
            .transactionId("wx_txn_12345")
            .chargeTransactionId("wx_charge_12345")
            .build())
        .status(CustomsDeclarationWebhookStatus.SUCCESSFUL)
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

