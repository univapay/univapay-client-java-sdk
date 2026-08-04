
# Store

Store resource returned by the backend `FullStore` formatter. It combines core store identity with the resolved configuration snapshot used for runtime policy evaluation.

*This model accepts additional fields of type Object.*

## Structure

`Store`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Store identifier. | UUID getId() | setId(UUID id) |
| `Name` | `String` | Optional | Store display name. | String getName() | setName(String name) |
| `CreatedOn` | `LocalDateTime` | Optional | Timestamp when the store was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `Configuration` | [`MerchantWebhookConfiguration`](../../doc/models/merchant-webhook-configuration.md) | Optional | Store-scoped configuration snapshot serialized by gyron-payments-api. It uses the same flattened serializer as merchant configuration, but omits `transfer_schedule`. | MerchantWebhookConfiguration getConfiguration() | setConfiguration(MerchantWebhookConfiguration configuration) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.MerchantWebhookBankTransferConfiguration;
import com.univapay.api.models.MerchantWebhookCardConfiguration;
import com.univapay.api.models.MerchantWebhookConfiguration;
import com.univapay.api.models.MerchantWebhookMoneyAmount;
import com.univapay.api.models.MerchantWebhookOnlineConfiguration;
import com.univapay.api.models.MerchantWebhookUserTransactionsConfiguration;
import com.univapay.api.models.Store;
import java.io.IOException;
import java.util.Arrays;
import java.util.UUID;

Store store = new Store.Builder()
    .id(UUID.fromString("11ef0000-0000-4000-8000-000000000022"))
    .name("Tokyo Store")
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .configuration(new MerchantWebhookConfiguration.Builder()
        .percentFee(3.6D)
        .flatFees(Arrays.asList(
            null
        ))
        .logoUrl("logo_url4")
        .country("JP")
        .language("ja")
        .minimumChargeAmounts(Arrays.asList(
            new MerchantWebhookMoneyAmount.Builder()
                .amount(100)
                .currency("JPY")
                .build()
        ))
        .maximumChargeAmounts(Arrays.asList(
            new MerchantWebhookMoneyAmount.Builder()
                .amount(100000)
                .currency("JPY")
                .build()
        ))
        .userTransactionsConfiguration(new MerchantWebhookUserTransactionsConfiguration.Builder()
            .enabled(true)
            .notifyCustomer(true)
            .notifyOnWebhookFailure(true)
            .build())
        .cardConfiguration(new MerchantWebhookCardConfiguration.Builder()
            .enabled(true)
            .debitEnabled(true)
            .prepaidEnabled(false)
            .threeDsRequired(true)
            .build())
        .onlineConfiguration(new MerchantWebhookOnlineConfiguration.Builder()
            .enabled(true)
            .build())
        .bankTransferConfiguration(new MerchantWebhookBankTransferConfiguration.Builder()
            .enabled(true)
            .matchAmount(true)
            .expiration("P7D")
            .build())
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

