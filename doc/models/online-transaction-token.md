
# Online Transaction Token

Stored transaction token resource for an `online` payment type.

*This model accepts additional fields of type Object.*

## Structure

`OnlineTransactionToken`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier. | UUID getId() | setId(UUID id) |
| `StoreId` | `UUID` | Optional | Store identifier. | UUID getStoreId() | setStoreId(UUID storeId) |
| `Email` | `String` | Optional | Customer email address. | String getEmail() | setEmail(String email) |
| `Active` | `Boolean` | Optional | Whether the resource is active. | Boolean getActive() | setActive(Boolean active) |
| `Mode` | [`TransactionTokenMode`](../../doc/models/transaction-token-mode.md) | Optional | Transaction Token Mode schema. | TransactionTokenMode getMode() | setMode(TransactionTokenMode mode) |
| `Type` | [`TransactionTokenType`](../../doc/models/transaction-token-type.md) | Optional | Transaction Token Type schema. | TransactionTokenType getType() | setType(TransactionTokenType type) |
| `UsageLimit` | `String` | Optional | Usage limit applied to the token. | String getUsageLimit() | setUsageLimit(String usageLimit) |
| `Confirmed` | `Boolean` | Optional | Whether the token has been confirmed. | Boolean getConfirmed() | setConfirmed(Boolean confirmed) |
| `Metadata` | [`Map<String, TransactionTokenMetadataAdditionalProperties>`](../../doc/models/containers/transaction-token-metadata-additional-properties.md) | Optional | Transaction Token Metadata Additional Properties schema. | Map<String, TransactionTokenMetadataAdditionalProperties> getMetadata() | setMetadata(Map<String, TransactionTokenMetadataAdditionalProperties> metadata) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `LastUsedOn` | `LocalDateTime` | Optional | Timestamp when the token was last used. | LocalDateTime getLastUsedOn() | setLastUsedOn(LocalDateTime lastUsedOn) |
| `PaymentType` | `String` | Required, Constant | Payment method type. Always `online` for this variant.<br><br>**Value**: `"online"` | String getPaymentType() | setPaymentType(String paymentType) |
| `Data` | [`TokenResponseOnlineData`](../../doc/models/token-response-online-data.md) | Required | Token Response Online Data schema. | TokenResponseOnlineData getData() | setData(TokenResponseOnlineData data) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.BaseOnlineDataBrand;
import com.univapay.api.models.BaseOnlineDataCallMethod;
import com.univapay.api.models.BaseOnlineDataOsType;
import com.univapay.api.models.BaseOnlineDataUserIdentifierSource;
import com.univapay.api.models.OnlineTransactionToken;
import com.univapay.api.models.TokenResponseOnlineData;
import com.univapay.api.models.TransactionTokenMode;
import com.univapay.api.models.TransactionTokenType;
import com.univapay.api.models.containers.TransactionTokenMetadataAdditionalProperties;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.UUID;

OnlineTransactionToken onlineTransactionToken = new OnlineTransactionToken.Builder(
    "online",
    new TokenResponseOnlineData.Builder()
        .brand(BaseOnlineDataBrand.WE_CHAT_ONLINE)
        .callMethod(BaseOnlineDataCallMethod.WEB)
        .osType(BaseOnlineDataOsType.ANDROID)
        .userIdentifier("wechat_open_id_12345")
        .userIdentifierSource(BaseOnlineDataUserIdentifierSource.PROVIDED)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build()
)
.id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
.storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
.email("test@univapay.com")
.active(true)
.mode(TransactionTokenMode.LIVE)
.type(TransactionTokenType.ONE_TIME)
.usageLimit("example")
.confirmed(true)
.metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
        put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
            "cust_12345"
        ));
    }})
.createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
.updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
.lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
.build();
```

