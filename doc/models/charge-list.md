
# Charge List

Paginated list of charges.

*This model accepts additional fields of type Object.*

## Structure

`ChargeList`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Items` | [`List<Charge>`](../../doc/models/charge.md) | Optional | List of resources. | List<Charge> getItems() | setItems(List<Charge> items) |
| `HasMore` | `Boolean` | Optional | Whether more results are available. | Boolean getHasMore() | setHasMore(Boolean hasMore) |
| `TotalHits` | `Integer` | Optional | Total number of matching resources. | Integer getTotalHits() | setTotalHits(Integer totalHits) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.Charge;
import com.univapay.api.models.ChargeList;
import com.univapay.api.models.ChargeMode;
import com.univapay.api.models.ChargeStatus;
import com.univapay.api.models.ChargeTransactionTokenType;
import com.univapay.api.models.GenericMetadata;
import com.univapay.api.models.PaymentError;
import com.univapay.api.models.containers.GenericMetadataValue;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

ChargeList chargeList = new ChargeList.Builder()
    .items(Arrays.asList(
        new Charge.Builder()
            .id(UUID.fromString("11ef32c4-9ea8-169c-a6c8-bfc29867a226"))
            .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
            .transactionTokenId(UUID.fromString("11ef32c4-9e89-0cac-bd63-17b9a26af61b"))
            .transactionTokenType(ChargeTransactionTokenType.ONE_TIME)
            .subscriptionId(UUID.fromString("00002470-0000-0000-0000-000000000000"))
            .requestedAmount(1000)
            .requestedCurrency("JPY")
            .requestedAmountFormatted(1000D)
            .chargedAmount(1000)
            .chargedCurrency("JPY")
            .chargedAmountFormatted(1000D)
            .onlyDirectCurrency(false)
            .status(ChargeStatus.SUCCESSFUL)
            .error(new PaymentError.Builder()
                .code(24)
                .message("message4")
                .detail("detail0")
            .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                .build())
            .metadata(new GenericMetadata.Builder()
                .orderId("ORD-2001")
                .univapayName("univapay-name8")
                .univapayPhoneNumber("univapay-phone-number2")
            .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
                    "String4"
                ))
                .build())
            .mode(ChargeMode.TEST)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-06-25T07:29:12.854865Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build(),
        new Charge.Builder()
            .id(UUID.fromString("11ef32c3-3cfe-3bc0-abed-0bb96f792078"))
            .storeId(UUID.fromString("11edf541-c42d-653c-8c3d-dfe0a55f95c0"))
            .transactionTokenId(UUID.fromString("11ef32c3-3cdd-df92-9dce-c346b9fdf088"))
            .transactionTokenType(ChargeTransactionTokenType.RECURRING)
            .subscriptionId(UUID.fromString("00002470-0000-0000-0000-000000000000"))
            .requestedAmount(1250)
            .requestedCurrency("USD")
            .requestedAmountFormatted(12.5D)
            .chargedAmount(1250)
            .chargedCurrency("USD")
            .chargedAmountFormatted(12.5D)
            .onlyDirectCurrency(false)
            .status(ChargeStatus.SUCCESSFUL)
            .error(new PaymentError.Builder()
                .code(24)
                .message("message4")
                .detail("detail0")
            .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
                .build())
            .metadata(new GenericMetadata.Builder()
                .orderId("ORD-2002")
                .univapayName("univapay-name8")
                .univapayPhoneNumber("univapay-phone-number2")
            .additionalProperty("exampleAdditionalProperty", GenericMetadataValue.fromString(
                    "String4"
                ))
                .build())
            .mode(ChargeMode.TEST)
            .createdOn(DateTimeHelper.fromRfc8601DateTime("2024-06-25T07:19:19.507637Z"))
        .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
            .build()
    ))
    .hasMore(false)
    .totalHits(2)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

