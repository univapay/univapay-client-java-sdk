
# Bank Transfer Status Data

Data payload for `bank_transfer_status_updated` webhook events. Contains the bank transfer extension fields inlined alongside amount and metadata.

*This model accepts additional fields of type Object.*

## Structure

`BankTransferStatusData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Id` | `UUID` | Optional | Bank transfer charge extension ID. | UUID getId() | setId(UUID id) |
| `ChargeId` | `UUID` | Optional | ID of the associated charge. | UUID getChargeId() | setChargeId(UUID chargeId) |
| `PaymentStatus` | [`BankTransferPaymentStatus`](../../doc/models/bank-transfer-payment-status.md) | Optional | Payment status of a bank transfer charge. | BankTransferPaymentStatus getPaymentStatus() | setPaymentStatus(BankTransferPaymentStatus paymentStatus) |
| `LatestDepositDate` | `LocalDateTime` | Optional | Date of the most recent deposit. | LocalDateTime getLatestDepositDate() | setLatestDepositDate(LocalDateTime latestDepositDate) |
| `CreatedOn` | `LocalDateTime` | Optional | When the bank transfer extension record was created. | LocalDateTime getCreatedOn() | setCreatedOn(LocalDateTime createdOn) |
| `LatestDepositAmount` | `Integer` | Optional | Amount of the most recent deposit in minor currency units. | Integer getLatestDepositAmount() | setLatestDepositAmount(Integer latestDepositAmount) |
| `Balance` | `Integer` | Optional | Current outstanding balance in minor currency units. | Integer getBalance() | setBalance(Integer balance) |
| `Currency` | `String` | Optional | ISO 4217 currency code. | String getCurrency() | setCurrency(String currency) |
| `Amount` | `Integer` | Optional | Total charge amount in minor currency units. | Integer getAmount() | setAmount(Integer amount) |
| `AmountDifference` | `Integer` | Optional | Difference between paid and expected amount (positive = over, negative = under). | Integer getAmountDifference() | setAmountDifference(Integer amountDifference) |
| `TokenMetadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getTokenMetadata() | setTokenMetadata(GenericMetadata tokenMetadata) |
| `ChargeMetadata` | [`GenericMetadata`](../../doc/models/generic-metadata.md) | Optional | A free-form dictionary for custom metadata. | GenericMetadata getChargeMetadata() | setChargeMetadata(GenericMetadata chargeMetadata) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.BankTransferPaymentStatus;
import com.univapay.api.models.BankTransferStatusData;
import com.univapay.api.models.GenericMetadata;
import java.util.UUID;

BankTransferStatusData bankTransferStatusData = new BankTransferStatusData.Builder()
    .id(UUID.fromString("11ef0000-0000-4000-8000-000000000002"))
    .chargeId(UUID.fromString("11ef0000-0000-4000-8000-000000000001"))
    .paymentStatus(BankTransferPaymentStatus.EXACT)
    .latestDepositDate(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
    .latestDepositAmount(1000)
    .balance(0)
    .currency("JPY")
    .amount(1000)
    .amountDifference(0)
    .tokenMetadata(new GenericMetadata.Builder()
        .orderId("12345")
        .build())
    .chargeMetadata(new GenericMetadata.Builder()
        .orderId("order_12345")
        .build())
    .build();
```

