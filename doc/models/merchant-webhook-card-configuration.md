
# Merchant Webhook Card Configuration

Card payment settings.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookCardConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables card payments. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `DebitEnabled` | `Boolean` | Optional | Allows debit cards for payment flows. | Boolean getDebitEnabled() | setDebitEnabled(Boolean debitEnabled) |
| `PrepaidEnabled` | `Boolean` | Optional | Allows prepaid cards for payment flows. | Boolean getPrepaidEnabled() | setPrepaidEnabled(Boolean prepaidEnabled) |
| `DebitAuthorizationEnabled` | `Boolean` | Optional | Allows authorization-only flows for debit cards. | Boolean getDebitAuthorizationEnabled() | setDebitAuthorizationEnabled(Boolean debitAuthorizationEnabled) |
| `PrepaidAuthorizationEnabled` | `Boolean` | Optional | Allows authorization-only flows for prepaid cards. | Boolean getPrepaidAuthorizationEnabled() | setPrepaidAuthorizationEnabled(Boolean prepaidAuthorizationEnabled) |
| `ForbiddenCardBrands` | `List<String>` | Optional | Card brands rejected by merchant policy. | List<String> getForbiddenCardBrands() | setForbiddenCardBrands(List<String> forbiddenCardBrands) |
| `AllowedCountriesByIp` | `List<String>` | Optional | Source IP country codes allowed for card payments. | List<String> getAllowedCountriesByIp() | setAllowedCountriesByIp(List<String> allowedCountriesByIp) |
| `ForeignCardsAllowed` | `Boolean` | Optional | Allows cards issued outside the primary operating country. | Boolean getForeignCardsAllowed() | setForeignCardsAllowed(Boolean foreignCardsAllowed) |
| `FailOnNewEmail` | `Boolean` | Optional | Rejects card charges from previously unseen customer email addresses. | Boolean getFailOnNewEmail() | setFailOnNewEmail(Boolean failOnNewEmail) |
| `CardLimit` | `Integer` | Optional | Maximum number of cards allowed per customer context. | Integer getCardLimit() | setCardLimit(Integer cardLimit) |
| `AllowEmptyCvv` | `Boolean` | Optional | Allows card flows without providing a CVV. | Boolean getAllowEmptyCvv() | setAllowEmptyCvv(Boolean allowEmptyCvv) |
| `OnlyDirectCurrency` | `Boolean` | Optional | Limits card processing to direct-settlement currencies only. | Boolean getOnlyDirectCurrency() | setOnlyDirectCurrency(Boolean onlyDirectCurrency) |
| `ThreeDsRequired` | `Boolean` | Optional | Requires 3-D Secure for eligible card flows. | Boolean getThreeDsRequired() | setThreeDsRequired(Boolean threeDsRequired) |
| `ThreeDsAddressRequired` | `Boolean` | Optional | Requires billing address data when running 3-D Secure. | Boolean getThreeDsAddressRequired() | setThreeDsAddressRequired(Boolean threeDsAddressRequired) |
| `ThreeDsSkipEnabled` | `Boolean` | Optional | Allows privileged callers to request 3-D Secure skip mode. | Boolean getThreeDsSkipEnabled() | setThreeDsSkipEnabled(Boolean threeDsSkipEnabled) |
| `AllowDirectTokenCreation` | `Boolean` | Optional | Allows direct card token creation without hosted capture flows. | Boolean getAllowDirectTokenCreation() | setAllowDirectTokenCreation(Boolean allowDirectTokenCreation) |
| `ThreeDsPhoneNumberRequired` | `Boolean` | Optional | Requires a phone number when running 3-D Secure. | Boolean getThreeDsPhoneNumberRequired() | setThreeDsPhoneNumberRequired(Boolean threeDsPhoneNumberRequired) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookCardConfiguration;

MerchantWebhookCardConfiguration merchantWebhookCardConfiguration = new MerchantWebhookCardConfiguration.Builder()
    .enabled(true)
    .debitEnabled(true)
    .prepaidEnabled(false)
    .foreignCardsAllowed(false)
    .threeDsRequired(true)
    .allowDirectTokenCreation(false)
    .build();
```

