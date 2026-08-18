
# Transaction History List

Paginated list of transaction history rows. Unlike other list responses in this API, `total_hits` is only present on the first page (no `cursor` supplied) or the last page, and `next_cursor` is only present while `has_more` is `true`.

*This model accepts additional fields of type Object.*

## Structure

`TransactionHistoryList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<TransactionHistoryItem>`](../../doc/models/transaction-history-item.md) | Optional | List of resources. | List<TransactionHistoryItem> getItems() | setItems(List<TransactionHistoryItem> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `TotalHits` | `Integer` | Optional | Total number of matching resources. Present on the first page (no `cursor` supplied) or the last page; absent on intermediate pages while `has_more` is `true`. | Integer getTotalHits() | setTotalHits(Integer totalHits) |
| `NextCursor` | `UUID` | Optional | Cursor to pass as `cursor` to fetch the next page. Present only while `has_more` is `true`. | UUID getNextCursor() | setNextCursor(UUID nextCursor) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.TransactionHistoryChargeType;
import com.univapay.api.models.TransactionHistoryItem;
import com.univapay.api.models.TransactionHistoryList;
import com.univapay.api.models.TransactionHistoryMode;
import com.univapay.api.models.TransactionHistoryPaymentType;
import com.univapay.api.models.TransactionHistoryRefund;
import com.univapay.api.models.TransactionHistoryRefundReason;
import com.univapay.api.models.TransactionHistoryRefundStatus;
import com.univapay.api.models.TransactionHistoryServiceProvider;
import com.univapay.api.models.TransactionHistoryStatus;
import com.univapay.api.models.TransactionHistoryType;
import com.univapay.api.models.TransactionHistoryUserData;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

TransactionHistoryList transactionHistoryList = new TransactionHistoryList.Builder()
    .items(Arrays.asList(
        new TransactionHistoryItem.Builder()
            .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
            .resourceId(UUID.fromString("11ef0000-0000-4000-8000-000000000070"))
            .chargeId(null)
            .amount(1000)
            .currency("JPY")
            .amountFormatted(1000D)
            .type(TransactionHistoryType.CHARGE)
            .status(TransactionHistoryStatus.SUCCESSFUL)
            .metadata(new GenericMetadata.Builder()
                .orderId("order_id0")
                .univapayName("univapay-name8")
                .univapayPhoneNumber("univapay-phone-number2")
            .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
                    "String4"
                ))
                .build())
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-05-01T12:34:56.789Z"))
            .mode(TransactionHistoryMode.TEST)
            .merchantName("Test merchant")
            .storeName("Test store")
            .paymentType(TransactionHistoryPaymentType.CARD)
            .userData(new TransactionHistoryUserData.Builder()
                .type(TransactionHistoryType.CHARGE)
                .cardholderName("Some Guy")
                .cardholderEmailAddress("test4@univapay.com")
                .cardholderPhoneNumber("cardholder_phone_number4")
                .customerName("customer_name8")
                .brand("visa")
                .gateway("test")
                .serviceProvider(TransactionHistoryServiceProvider.CREDIT)
                .refunds(Arrays.asList(
                    new TransactionHistoryRefund.Builder()
                        .refundId(UUID.fromString("11ef0000-0000-4000-8000-000000000010"))
                        .amount(500)
                        .currency("JPY")
                        .amountFormatted(500D)
                        .status(TransactionHistoryRefundStatus.SUCCESSFUL)
                    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                        .build()
                ))
            .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                .build())
            .bankTransferPaymentStatus(null)
            .bankTransferLatestDepositDate(null)
            .mcpTokenId(null)
            .chargeType(TransactionHistoryChargeType.NORMAL)
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new TransactionHistoryItem.Builder()
            .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
            .resourceId(UUID.fromString("11ef0000-0000-4000-8000-000000000010"))
            .chargeId(UUID.fromString("11ef0000-0000-4000-8000-000000000070"))
            .amount(500)
            .currency("JPY")
            .amountFormatted(500D)
            .type(TransactionHistoryType.REFUND)
            .status(TransactionHistoryStatus.SUCCESSFUL)
            .metadata(new GenericMetadata.Builder()
                .orderId("order_id0")
                .univapayName("univapay-name8")
                .univapayPhoneNumber("univapay-phone-number2")
            .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
                    "String4"
                ))
                .build())
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-05-01T13:00:00.000000Z"))
            .mode(TransactionHistoryMode.TEST)
            .merchantName("Test merchant")
            .storeName("Test store")
            .paymentType(TransactionHistoryPaymentType.CARD)
            .userData(new TransactionHistoryUserData.Builder()
                .type(TransactionHistoryType.REFUND)
                .cardholderName("cardholder_name8")
                .cardholderEmailAddress("cardholder_email_address0")
                .cardholderPhoneNumber("cardholder_phone_number4")
                .customerName("customer_name8")
                .reason(TransactionHistoryRefundReason.CUSTOMER_REQUEST)
            .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                .build())
            .bankTransferPaymentStatus(null)
            .bankTransferLatestDepositDate(null)
            .mcpTokenId(null)
            .chargeType(null)
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
    .totalHits(2)
    .nextCursor(UUID.fromString("11ef0000-0000-4000-8000-000000000071"))
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

