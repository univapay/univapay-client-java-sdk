
# Checkout Bank Transfer Configuration

Bank transfer (振込) payment settings applied to checkout.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutBankTransferConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether bank transfer payments are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `MatchAmount` | [`CheckoutBankTransferMatchAmount`](../../doc/models/checkout-bank-transfer-match-amount.md) | Optional | Deposit-matching policy applied to bank transfer payments. | CheckoutBankTransferMatchAmount getMatchAmount() | setMatchAmount(CheckoutBankTransferMatchAmount matchAmount) |
| `Expiration` | `String` | Optional | ISO-8601 duration before a bank transfer payment expires. | String getExpiration() | setExpiration(String expiration) |
| `ExpirationTimeShift` | [`ExpirationTimeShift`](../../doc/models/expiration-time-shift.md) | Optional | Time-of-day override applied when calculating expirations, shared by convenience-store and bank-transfer configuration. | ExpirationTimeShift getExpirationTimeShift() | setExpirationTimeShift(ExpirationTimeShift expirationTimeShift) |
| `VirtualBankAccountsThreshold` | `Integer` | Optional | Number of unused virtual bank accounts that triggers provisioning of additional accounts.<br><br>**Constraints**: `>= 0` | Integer getVirtualBankAccountsThreshold() | setVirtualBankAccountsThreshold(Integer virtualBankAccountsThreshold) |
| `VirtualBankAccountsFetchCount` | `Integer` | Optional | Number of virtual bank accounts provisioned per replenishment.<br><br>**Constraints**: `>= 1` | Integer getVirtualBankAccountsFetchCount() | setVirtualBankAccountsFetchCount(Integer virtualBankAccountsFetchCount) |
| `DefaultExtensionPeriod` | `String` | Optional | ISO-8601 duration by which a payment deadline is extended by default. | String getDefaultExtensionPeriod() | setDefaultExtensionPeriod(String defaultExtensionPeriod) |
| `MaximumExtensionPeriod` | `String` | Optional | ISO-8601 duration for the maximum allowed extension. | String getMaximumExtensionPeriod() | setMaximumExtensionPeriod(String maximumExtensionPeriod) |
| `AutomaticExtensionEnabled` | `Boolean` | Optional | Whether payment deadlines are extended automatically. | Boolean getAutomaticExtensionEnabled() | setAutomaticExtensionEnabled(Boolean automaticExtensionEnabled) |
| `ChargeRequestNotificationEnabled` | `Boolean` | Optional | Whether a notification is sent when a bank transfer charge is requested. | Boolean getChargeRequestNotificationEnabled() | setChargeRequestNotificationEnabled(Boolean chargeRequestNotificationEnabled) |
| `ChargeRequestCanceledNotificationEnabled` | `Boolean` | Optional | Whether a notification is sent when a requested bank transfer charge is canceled. | Boolean getChargeRequestCanceledNotificationEnabled() | setChargeRequestCanceledNotificationEnabled(Boolean chargeRequestCanceledNotificationEnabled) |
| `ChargeExpiredNotificationEnabled` | `Boolean` | Optional | Whether a notification is sent when a bank transfer charge expires. | Boolean getChargeExpiredNotificationEnabled() | setChargeExpiredNotificationEnabled(Boolean chargeExpiredNotificationEnabled) |
| `DepositReceivedNotificationEnabled` | `Boolean` | Optional | Whether a notification is sent when a deposit is received. | Boolean getDepositReceivedNotificationEnabled() | setDepositReceivedNotificationEnabled(Boolean depositReceivedNotificationEnabled) |
| `DepositInsufficientNotificationEnabled` | `Boolean` | Optional | Whether a notification is sent when a deposit is insufficient. | Boolean getDepositInsufficientNotificationEnabled() | setDepositInsufficientNotificationEnabled(Boolean depositInsufficientNotificationEnabled) |
| `DepositExceededNotificationEnabled` | `Boolean` | Optional | Whether a notification is sent when a deposit exceeds the requested amount. | Boolean getDepositExceededNotificationEnabled() | setDepositExceededNotificationEnabled(Boolean depositExceededNotificationEnabled) |
| `ExtensionNotificationEnabled` | `Boolean` | Optional | Whether a notification is sent when a payment deadline is extended. | Boolean getExtensionNotificationEnabled() | setExtensionNotificationEnabled(Boolean extensionNotificationEnabled) |
| `RemindNotificationPeriod` | `String` | Optional | ISO-8601 duration before expiration at which a reminder notification is sent. | String getRemindNotificationPeriod() | setRemindNotificationPeriod(String remindNotificationPeriod) |
| `RemindNotificationEnabled` | `Boolean` | Optional | Whether reminder notifications are sent before a payment deadline. | Boolean getRemindNotificationEnabled() | setRemindNotificationEnabled(Boolean remindNotificationEnabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutBankTransferConfiguration;
import com.univapay.api.models.CheckoutBankTransferMatchAmount;
import com.univapay.api.models.ExpirationTimeShift;
import java.io.IOException;

CheckoutBankTransferConfiguration checkoutBankTransferConfiguration = new CheckoutBankTransferConfiguration.Builder()
    .enabled(true)
    .matchAmount(CheckoutBankTransferMatchAmount.DISABLED)
    .expiration("PT72H")
    .expirationTimeShift(new ExpirationTimeShift.Builder()
        .value("value4")
        .enabled(false)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .virtualBankAccountsThreshold(5)
    .virtualBankAccountsFetchCount(10)
    .defaultExtensionPeriod("PT168H")
    .maximumExtensionPeriod("PT168H")
    .automaticExtensionEnabled(false)
    .chargeRequestNotificationEnabled(false)
    .chargeRequestCanceledNotificationEnabled(false)
    .chargeExpiredNotificationEnabled(false)
    .depositReceivedNotificationEnabled(false)
    .depositInsufficientNotificationEnabled(false)
    .depositExceededNotificationEnabled(false)
    .extensionNotificationEnabled(false)
    .remindNotificationPeriod("PT168H")
    .remindNotificationEnabled(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

