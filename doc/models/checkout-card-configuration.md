
# Checkout Card Configuration

Card payment settings applied to checkout.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutCardConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Whether card payments are enabled. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `DebitEnabled` | `Boolean` | Optional | Whether debit cards are allowed. | Boolean getDebitEnabled() | setDebitEnabled(Boolean debitEnabled) |
| `PrepaidEnabled` | `Boolean` | Optional | Whether prepaid cards are allowed. | Boolean getPrepaidEnabled() | setPrepaidEnabled(Boolean prepaidEnabled) |
| `DebitAuthorizationEnabled` | `Boolean` | Optional | Whether authorization-only flows are allowed for debit cards. | Boolean getDebitAuthorizationEnabled() | setDebitAuthorizationEnabled(Boolean debitAuthorizationEnabled) |
| `PrepaidAuthorizationEnabled` | `Boolean` | Optional | Whether authorization-only flows are allowed for prepaid cards. | Boolean getPrepaidAuthorizationEnabled() | setPrepaidAuthorizationEnabled(Boolean prepaidAuthorizationEnabled) |
| `OnlyDirectCurrency` | `Boolean` | Optional | Whether card processing is restricted to direct-settlement currencies. | Boolean getOnlyDirectCurrency() | setOnlyDirectCurrency(Boolean onlyDirectCurrency) |
| `ForbiddenCardBrands` | `List<String>` | Optional | Card brands rejected by merchant policy. Common values include `visa`, `mastercard`, `american_express`, `maestro`, `discover`, `jcb`, `diners_club`, `private_label`, and `unionpay`; gateway-specific brands the platform cannot map appear as `unmapped_<raw value>`. `null` when no brand is forbidden. | List<String> getForbiddenCardBrands() | setForbiddenCardBrands(List<String> forbiddenCardBrands) |
| `AllowedCountriesByIp` | `List<String>` | Optional | ISO 3166-1 alpha-2 country codes allowed to originate card payments by IP geolocation. `null` when unrestricted. | List<String> getAllowedCountriesByIp() | setAllowedCountriesByIp(List<String> allowedCountriesByIp) |
| `ForeignCardsAllowed` | `Boolean` | Optional | Whether cards issued outside the primary operating country are allowed. | Boolean getForeignCardsAllowed() | setForeignCardsAllowed(Boolean foreignCardsAllowed) |
| `FailOnNewEmail` | `Boolean` | Optional | Whether to reject card charges from previously unseen customer email addresses. `null` when not configured. | Boolean getFailOnNewEmail() | setFailOnNewEmail(Boolean failOnNewEmail) |
| `CardLimit` | [`CardLimit`](../../doc/models/card-limit.md) | Optional | Per-card spending limit. `null` when no limit is configured. | CardLimit getCardLimit() | setCardLimit(CardLimit cardLimit) |
| `AllowEmptyCvv` | `Boolean` | Optional | Whether card flows may proceed without a CVV. `null` when not configured. | Boolean getAllowEmptyCvv() | setAllowEmptyCvv(Boolean allowEmptyCvv) |
| `AllowDirectTokenCreation` | `Boolean` | Optional | Whether direct card token creation is allowed without a hosted capture flow. | Boolean getAllowDirectTokenCreation() | setAllowDirectTokenCreation(Boolean allowDirectTokenCreation) |
| `ThreeDsRequired` | `Boolean` | Optional | Whether 3-D Secure is required for eligible card flows. | Boolean getThreeDsRequired() | setThreeDsRequired(Boolean threeDsRequired) |
| `ThreeDsAddressRequired` | `Boolean` | Optional | Whether billing address data is required when running 3-D Secure. | Boolean getThreeDsAddressRequired() | setThreeDsAddressRequired(Boolean threeDsAddressRequired) |
| `ThreeDsSkipEnabled` | `Boolean` | Optional | Whether privileged callers may request a 3-D Secure skip. | Boolean getThreeDsSkipEnabled() | setThreeDsSkipEnabled(Boolean threeDsSkipEnabled) |
| `ThreeDsPhoneNumberRequired` | `Boolean` | Optional | Whether a phone number is required when running 3-D Secure. | Boolean getThreeDsPhoneNumberRequired() | setThreeDsPhoneNumberRequired(Boolean threeDsPhoneNumberRequired) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutCardConfiguration;
import java.io.IOException;

CheckoutCardConfiguration checkoutCardConfiguration = new CheckoutCardConfiguration.Builder()
    .enabled(true)
    .debitEnabled(true)
    .prepaidEnabled(true)
    .debitAuthorizationEnabled(false)
    .prepaidAuthorizationEnabled(false)
    .onlyDirectCurrency(false)
    .foreignCardsAllowed(true)
    .allowDirectTokenCreation(true)
    .threeDsRequired(false)
    .threeDsAddressRequired(false)
    .threeDsSkipEnabled(false)
    .threeDsPhoneNumberRequired(true)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

