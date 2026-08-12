
# Merchant Webhook Bank Transfer Configuration

Bank transfer payment settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookBankTransferConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables bank transfer payments. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `MatchAmount` | `Boolean` | Optional | Requires the received deposit amount to exactly match the charge amount. | Boolean getMatchAmount() | setMatchAmount(Boolean matchAmount) |
| `Expiration` | `String` | Optional | ISO-8601 duration before the charge expires. | String getExpiration() | setExpiration(String expiration) |
| `VirtualBankAccountsThreshold` | `Integer` | Optional | Threshold for provisioning additional virtual bank accounts. | Integer getVirtualBankAccountsThreshold() | setVirtualBankAccountsThreshold(Integer virtualBankAccountsThreshold) |
| `VirtualBankAccountsFetchCount` | `Integer` | Optional | Number of virtual bank accounts fetched per replenishment batch. | Integer getVirtualBankAccountsFetchCount() | setVirtualBankAccountsFetchCount(Integer virtualBankAccountsFetchCount) |
| `DefaultExtensionPeriod` | `String` | Optional | Default ISO-8601 extension period applied to eligible charges. | String getDefaultExtensionPeriod() | setDefaultExtensionPeriod(String defaultExtensionPeriod) |
| `MaximumExtensionPeriod` | `String` | Optional | Maximum ISO-8601 extension period allowed for a charge. | String getMaximumExtensionPeriod() | setMaximumExtensionPeriod(String maximumExtensionPeriod) |
| `AutomaticExtensionEnabled` | `Boolean` | Optional | Automatically extends eligible bank transfer charges. | Boolean getAutomaticExtensionEnabled() | setAutomaticExtensionEnabled(Boolean automaticExtensionEnabled) |
| `ChargeRequestNotificationEnabled` | `Boolean` | Optional | Sends notifications when a bank transfer charge is created. | Boolean getChargeRequestNotificationEnabled() | setChargeRequestNotificationEnabled(Boolean chargeRequestNotificationEnabled) |
| `ChargeRequestCanceledNotificationEnabled` | `Boolean` | Optional | Sends notifications when a bank transfer charge is canceled. | Boolean getChargeRequestCanceledNotificationEnabled() | setChargeRequestCanceledNotificationEnabled(Boolean chargeRequestCanceledNotificationEnabled) |
| `ChargeExpiredNotificationEnabled` | `Boolean` | Optional | Sends notifications when a bank transfer charge expires. | Boolean getChargeExpiredNotificationEnabled() | setChargeExpiredNotificationEnabled(Boolean chargeExpiredNotificationEnabled) |
| `DepositReceivedNotificationEnabled` | `Boolean` | Optional | Sends notifications when a deposit is received. | Boolean getDepositReceivedNotificationEnabled() | setDepositReceivedNotificationEnabled(Boolean depositReceivedNotificationEnabled) |
| `DepositInsufficientNotificationEnabled` | `Boolean` | Optional | Sends notifications when a deposit is below the expected amount. | Boolean getDepositInsufficientNotificationEnabled() | setDepositInsufficientNotificationEnabled(Boolean depositInsufficientNotificationEnabled) |
| `DepositExceededNotificationEnabled` | `Boolean` | Optional | Sends notifications when a deposit exceeds the expected amount. | Boolean getDepositExceededNotificationEnabled() | setDepositExceededNotificationEnabled(Boolean depositExceededNotificationEnabled) |
| `ExtensionNotificationEnabled` | `Boolean` | Optional | Sends notifications when a bank transfer charge is extended. | Boolean getExtensionNotificationEnabled() | setExtensionNotificationEnabled(Boolean extensionNotificationEnabled) |
| `RemindNotificationPeriod` | `String` | Optional | ISO-8601 lead time for payment reminder notifications. | String getRemindNotificationPeriod() | setRemindNotificationPeriod(String remindNotificationPeriod) |
| `RemindNotificationEnabled` | `Boolean` | Optional | Sends reminder notifications before bank transfer expiry. | Boolean getRemindNotificationEnabled() | setRemindNotificationEnabled(Boolean remindNotificationEnabled) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookBankTransferConfiguration;

MerchantWebhookBankTransferConfiguration merchantWebhookBankTransferConfiguration = new MerchantWebhookBankTransferConfiguration.Builder()
    .enabled(true)
    .matchAmount(true)
    .expiration("P7D")
    .virtualBankAccountsThreshold(50)
    .virtualBankAccountsFetchCount(25)
    .defaultExtensionPeriod("P3D")
    .maximumExtensionPeriod("P30D")
    .automaticExtensionEnabled(true)
    .chargeRequestNotificationEnabled(true)
    .depositReceivedNotificationEnabled(true)
    .remindNotificationPeriod("P2D")
    .remindNotificationEnabled(true)
    .build();
```

