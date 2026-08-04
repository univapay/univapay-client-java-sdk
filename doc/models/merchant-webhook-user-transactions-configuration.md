
# Merchant Webhook User Transactions Configuration

Merchant transaction notification settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookUserTransactionsConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables merchant transaction notifications. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `NotifyCustomer` | `Boolean` | Optional | Sends transaction notifications to the customer. | Boolean getNotifyCustomer() | setNotifyCustomer(Boolean notifyCustomer) |
| `NotifyOnTest` | `Boolean` | Optional | Sends notifications for test-mode events. | Boolean getNotifyOnTest() | setNotifyOnTest(Boolean notifyOnTest) |
| `NotifyOnRecurringTokenCreation` | `Boolean` | Optional | Sends notifications when a recurring token is created. | Boolean getNotifyOnRecurringTokenCreation() | setNotifyOnRecurringTokenCreation(Boolean notifyOnRecurringTokenCreation) |
| `NotifyOnRecurringTokenCvvFailed` | `Boolean` | Optional | Sends notifications when recurring-token CVV confirmation fails. | Boolean getNotifyOnRecurringTokenCvvFailed() | setNotifyOnRecurringTokenCvvFailed(Boolean notifyOnRecurringTokenCvvFailed) |
| `NotifyOnWebhookFailure` | `Boolean` | Optional | Sends notifications after repeated webhook delivery failures. | Boolean getNotifyOnWebhookFailure() | setNotifyOnWebhookFailure(Boolean notifyOnWebhookFailure) |
| `NotifyOnWebhookDisabled` | `Boolean` | Optional | Sends notifications when webhook delivery is disabled. | Boolean getNotifyOnWebhookDisabled() | setNotifyOnWebhookDisabled(Boolean notifyOnWebhookDisabled) |
| `NotifyUserOnFailedTransactions` | `Boolean` | Optional | Sends merchant notifications for failed transactions. | Boolean getNotifyUserOnFailedTransactions() | setNotifyUserOnFailedTransactions(Boolean notifyUserOnFailedTransactions) |
| `NotifyCustomerOnFailedTransactions` | `Boolean` | Optional | Sends customer notifications for failed transactions. | Boolean getNotifyCustomerOnFailedTransactions() | setNotifyCustomerOnFailedTransactions(Boolean notifyCustomerOnFailedTransactions) |
| `NotifyUserOnConvenienceInstructions` | `Boolean` | Optional | Sends merchant notifications with convenience-store payment instructions. | Boolean getNotifyUserOnConvenienceInstructions() | setNotifyUserOnConvenienceInstructions(Boolean notifyUserOnConvenienceInstructions) |
| `NotifyOnSubscriptions` | `Boolean` | Optional | Sends notifications for subscription lifecycle events. | Boolean getNotifyOnSubscriptions() | setNotifyOnSubscriptions(Boolean notifyOnSubscriptions) |
| `NotifyOnAuthorizations` | `Boolean` | Optional | Sends notifications for authorization-only charges. | Boolean getNotifyOnAuthorizations() | setNotifyOnAuthorizations(Boolean notifyOnAuthorizations) |
| `NotifyOnCvvAuthorizations` | `Boolean` | Optional | Sends notifications for CVV authorization events. | Boolean getNotifyOnCvvAuthorizations() | setNotifyOnCvvAuthorizations(Boolean notifyOnCvvAuthorizations) |
| `NotifyOnCancels` | `Boolean` | Optional | Sends notifications when charges are canceled. | Boolean getNotifyOnCancels() | setNotifyOnCancels(Boolean notifyOnCancels) |
| `CustomerReferLinkEnabled` | `Boolean` | Optional | Includes customer self-service links in supported notifications. | Boolean getCustomerReferLinkEnabled() | setCustomerReferLinkEnabled(Boolean customerReferLinkEnabled) |
| `NotifyOnConvenienceExpiry` | `Boolean` | Optional | Sends notifications when convenience payments expire. | Boolean getNotifyOnConvenienceExpiry() | setNotifyOnConvenienceExpiry(Boolean notifyOnConvenienceExpiry) |
| `NotifyOnRecurringTokenCreationWithThreeDs` | `Boolean` | Optional | Sends notifications when recurring tokens are created through 3-D Secure. | Boolean getNotifyOnRecurringTokenCreationWithThreeDs() | setNotifyOnRecurringTokenCreationWithThreeDs(Boolean notifyOnRecurringTokenCreationWithThreeDs) |
| `NotifyOnChargebacks` | `Boolean` | Optional | Sends notifications for chargeback events. | Boolean getNotifyOnChargebacks() | setNotifyOnChargebacks(Boolean notifyOnChargebacks) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.MerchantWebhookUserTransactionsConfiguration;
import java.io.IOException;

MerchantWebhookUserTransactionsConfiguration merchantWebhookUserTransactionsConfiguration = new MerchantWebhookUserTransactionsConfiguration.Builder()
    .enabled(true)
    .notifyCustomer(true)
    .notifyOnTest(false)
    .notifyOnRecurringTokenCreation(false)
    .notifyOnRecurringTokenCvvFailed(false)
    .notifyOnWebhookFailure(true)
    .notifyOnWebhookDisabled(true)
    .notifyOnSubscriptions(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

