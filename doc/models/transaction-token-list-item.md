
# Transaction Token List Item

Transaction token entry returned in list responses.

*This model accepts additional fields of type Object.*

## Structure

`TransactionTokenListItem`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Unique identifier. | UUID getId() | setId(UUID id) |
| `StoreId` | `UUID` | Optional | Store identifier. | UUID getStoreId() | setStoreId(UUID storeId) |
| `MerchantName` | `String` | Optional | Merchant display name. | String getMerchantName() | setMerchantName(String merchantName) |
| `StoreName` | `String` | Optional | Store display name. | String getStoreName() | setStoreName(String storeName) |
| `Email` | `String` | Optional | Customer email address. | String getEmail() | setEmail(String email) |
| `PaymentType` | `String` | Optional | Payment method type. | String getPaymentType() | setPaymentType(String paymentType) |
| `Active` | `Boolean` | Optional | Whether the resource is active. | Boolean getActive() | setActive(Boolean active) |
| `Mode` | `String` | Optional | Processing mode for the resource. | String getMode() | setMode(String mode) |
| `Type` | `String` | Optional | Type of the resource. | String getType() | setType(String type) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `UpdatedOn` | `LocalDateTime` | Optional | Timestamp when the resource was last updated. | LocalDateTime getUpdatedOn() | setUpdatedOn(LocalDateTime updatedOn) |
| `UserData` | [`TransactionTokenListItemUserData`](../../doc/models/transaction-token-list-item-user-data.md) | Optional | Transaction Token List Item User Data schema. | TransactionTokenListItemUserData getUserData() | setUserData(TransactionTokenListItemUserData userData) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.TransactionTokenListItem;
import com.univapay.api.models.TransactionTokenListItemUserData;
import java.io.IOException;
import java.util.UUID;

TransactionTokenListItem transactionTokenListItem = new TransactionTokenListItem.Builder()
    .id(UUID.fromString("2fe23e45-f95d-4c95-9963-739070096443"))
    .storeId(UUID.fromString("79e9504e-96d8-46ed-8d22-2e8b36238605"))
    .merchantName("Test Merchant")
    .storeName("Tokyo Store")
    .email("user@example.com")
    .paymentType("card")
    .active(true)
    .mode("live")
    .type("one_time")
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
    .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
    .userData(new TransactionTokenListItemUserData.Builder()
        .cardholderName("TARO YAMADA")
        .email("user@example.com")
        .brand("visa")
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

