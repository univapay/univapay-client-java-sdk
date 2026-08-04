
# Customs Declaration Webhook Data

Customs declaration payload delivered in `customs_declaration_finished` webhooks. Platform-level deliveries may include `platform_id` and `updated_on`.

*This model accepts additional fields of type Object.*

## Structure

`CustomsDeclarationWebhookData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Customs declaration identifier. | UUID getId() | setId(UUID id) |
| `ChargeId` | `UUID` | Optional | Charge identifier associated with the declaration. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `MerchantId` | `UUID` | Optional | Merchant identifier. | UUID getMerchantId() | setMerchantId(UUID merchantId) |
| `StoreId` | `UUID` | Optional | Store identifier. | UUID getStoreId() | setStoreId(UUID storeId) |
| `PlatformId` | `UUID` | Optional | Platform identifier, included on platform-level deliveries. | UUID getPlatformId() | setPlatformId(UUID platformId) |
| `Mode` | `String` | Optional | Processing mode. | String getMode() | setMode(String mode) |
| `Gateway` | `String` | Optional | Gateway that processed the declaration. | String getGateway() | setGateway(String gateway) |
| `Declaration` | [`CustomsDeclarationWebhookDeclaration`](../../doc/models/customs-declaration-webhook-declaration.md) | Optional | WeChat customs declaration payload returned by the backend formatter. | CustomsDeclarationWebhookDeclaration getDeclaration() | setDeclaration(CustomsDeclarationWebhookDeclaration declaration) |
| `DeclarationResult` | [`CustomsDeclarationWebhookResult`](../../doc/models/customs-declaration-webhook-result.md) | Optional | Result payload returned by the customs declaration formatter. | CustomsDeclarationWebhookResult getDeclarationResult() | setDeclarationResult(CustomsDeclarationWebhookResult declarationResult) |
| `Status` | [`CustomsDeclarationWebhookStatus`](../../doc/models/customs-declaration-webhook-status.md) | Optional | Customs declaration status returned by the backend. | CustomsDeclarationWebhookStatus getStatus() | setStatus(CustomsDeclarationWebhookStatus status) |
| `Error` | [`CustomsDeclarationWebhookError`](../../doc/models/customs-declaration-webhook-error.md) | Optional | Error payload returned when customs declaration processing fails. | CustomsDeclarationWebhookError getError() | setError(CustomsDeclarationWebhookError error) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the declaration was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the declaration was last updated, included on platform-level deliveries. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.CustomsDeclarationWebhookData;
import com.univapay.api.models.CustomsDeclarationWebhookDeclaration;
import com.univapay.api.models.CustomsDeclarationWebhookResult;
import com.univapay.api.models.CustomsDeclarationWebhookStatus;
import java.io.IOException;
import java.util.UUID;

CustomsDeclarationWebhookData customsDeclarationWebhookData = new CustomsDeclarationWebhookData.Builder()
    .id(UUID.fromString("11ef0000-0000-4000-8000-000000000040"))
    .chargeId(UUID.fromString("11ef0000-0000-4000-8000-000000000001"))
    .merchantId(UUID.fromString("11ef0000-0000-4000-8000-000000000020"))
    .storeId(UUID.fromString("11ef0000-0000-4000-8000-000000000022"))
    .platformId(UUID.fromString("00000082-0000-0000-0000-000000000000"))
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
    .error(null)
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

