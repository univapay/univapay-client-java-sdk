/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.List;
import java.util.Map;

/**
 * This is a model class for MerchantWebhookCardConfiguration type.
 */
public class MerchantWebhookCardConfiguration {
    private OptionalNullable<Boolean> enabled;
    private OptionalNullable<Boolean> debitEnabled;
    private OptionalNullable<Boolean> prepaidEnabled;
    private OptionalNullable<Boolean> debitAuthorizationEnabled;
    private OptionalNullable<Boolean> prepaidAuthorizationEnabled;
    private OptionalNullable<List<String>> forbiddenCardBrands;
    private OptionalNullable<List<String>> allowedCountriesByIp;
    private OptionalNullable<Boolean> foreignCardsAllowed;
    private OptionalNullable<Boolean> failOnNewEmail;
    private OptionalNullable<Integer> cardLimit;
    private OptionalNullable<Boolean> allowEmptyCvv;
    private OptionalNullable<Boolean> onlyDirectCurrency;
    private OptionalNullable<Boolean> threeDsRequired;
    private OptionalNullable<Boolean> threeDsAddressRequired;
    private OptionalNullable<Boolean> threeDsSkipEnabled;
    private OptionalNullable<Boolean> allowDirectTokenCreation;
    private OptionalNullable<Boolean> threeDsPhoneNumberRequired;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookCardConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  debitEnabled  Boolean value for debitEnabled.
     * @param  prepaidEnabled  Boolean value for prepaidEnabled.
     * @param  debitAuthorizationEnabled  Boolean value for debitAuthorizationEnabled.
     * @param  prepaidAuthorizationEnabled  Boolean value for prepaidAuthorizationEnabled.
     * @param  forbiddenCardBrands  List of String value for forbiddenCardBrands.
     * @param  allowedCountriesByIp  List of String value for allowedCountriesByIp.
     * @param  foreignCardsAllowed  Boolean value for foreignCardsAllowed.
     * @param  failOnNewEmail  Boolean value for failOnNewEmail.
     * @param  cardLimit  Integer value for cardLimit.
     * @param  allowEmptyCvv  Boolean value for allowEmptyCvv.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  threeDsRequired  Boolean value for threeDsRequired.
     * @param  threeDsAddressRequired  Boolean value for threeDsAddressRequired.
     * @param  threeDsSkipEnabled  Boolean value for threeDsSkipEnabled.
     * @param  allowDirectTokenCreation  Boolean value for allowDirectTokenCreation.
     * @param  threeDsPhoneNumberRequired  Boolean value for threeDsPhoneNumberRequired.
     */
    public MerchantWebhookCardConfiguration(
            Boolean enabled,
            Boolean debitEnabled,
            Boolean prepaidEnabled,
            Boolean debitAuthorizationEnabled,
            Boolean prepaidAuthorizationEnabled,
            List<String> forbiddenCardBrands,
            List<String> allowedCountriesByIp,
            Boolean foreignCardsAllowed,
            Boolean failOnNewEmail,
            Integer cardLimit,
            Boolean allowEmptyCvv,
            Boolean onlyDirectCurrency,
            Boolean threeDsRequired,
            Boolean threeDsAddressRequired,
            Boolean threeDsSkipEnabled,
            Boolean allowDirectTokenCreation,
            Boolean threeDsPhoneNumberRequired) {
        this.enabled = OptionalNullable.of(enabled);
        this.debitEnabled = OptionalNullable.of(debitEnabled);
        this.prepaidEnabled = OptionalNullable.of(prepaidEnabled);
        this.debitAuthorizationEnabled = OptionalNullable.of(debitAuthorizationEnabled);
        this.prepaidAuthorizationEnabled = OptionalNullable.of(prepaidAuthorizationEnabled);
        this.forbiddenCardBrands = OptionalNullable.of(forbiddenCardBrands);
        this.allowedCountriesByIp = OptionalNullable.of(allowedCountriesByIp);
        this.foreignCardsAllowed = OptionalNullable.of(foreignCardsAllowed);
        this.failOnNewEmail = OptionalNullable.of(failOnNewEmail);
        this.cardLimit = OptionalNullable.of(cardLimit);
        this.allowEmptyCvv = OptionalNullable.of(allowEmptyCvv);
        this.onlyDirectCurrency = OptionalNullable.of(onlyDirectCurrency);
        this.threeDsRequired = OptionalNullable.of(threeDsRequired);
        this.threeDsAddressRequired = OptionalNullable.of(threeDsAddressRequired);
        this.threeDsSkipEnabled = OptionalNullable.of(threeDsSkipEnabled);
        this.allowDirectTokenCreation = OptionalNullable.of(allowDirectTokenCreation);
        this.threeDsPhoneNumberRequired = OptionalNullable.of(threeDsPhoneNumberRequired);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  debitEnabled  Boolean value for debitEnabled.
     * @param  prepaidEnabled  Boolean value for prepaidEnabled.
     * @param  debitAuthorizationEnabled  Boolean value for debitAuthorizationEnabled.
     * @param  prepaidAuthorizationEnabled  Boolean value for prepaidAuthorizationEnabled.
     * @param  forbiddenCardBrands  List of String value for forbiddenCardBrands.
     * @param  allowedCountriesByIp  List of String value for allowedCountriesByIp.
     * @param  foreignCardsAllowed  Boolean value for foreignCardsAllowed.
     * @param  failOnNewEmail  Boolean value for failOnNewEmail.
     * @param  cardLimit  Integer value for cardLimit.
     * @param  allowEmptyCvv  Boolean value for allowEmptyCvv.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  threeDsRequired  Boolean value for threeDsRequired.
     * @param  threeDsAddressRequired  Boolean value for threeDsAddressRequired.
     * @param  threeDsSkipEnabled  Boolean value for threeDsSkipEnabled.
     * @param  allowDirectTokenCreation  Boolean value for allowDirectTokenCreation.
     * @param  threeDsPhoneNumberRequired  Boolean value for threeDsPhoneNumberRequired.
     */

    protected MerchantWebhookCardConfiguration(OptionalNullable<Boolean> enabled,
            OptionalNullable<Boolean> debitEnabled, OptionalNullable<Boolean> prepaidEnabled,
            OptionalNullable<Boolean> debitAuthorizationEnabled,
            OptionalNullable<Boolean> prepaidAuthorizationEnabled,
            OptionalNullable<List<String>> forbiddenCardBrands,
            OptionalNullable<List<String>> allowedCountriesByIp,
            OptionalNullable<Boolean> foreignCardsAllowed, OptionalNullable<Boolean> failOnNewEmail,
            OptionalNullable<Integer> cardLimit, OptionalNullable<Boolean> allowEmptyCvv,
            OptionalNullable<Boolean> onlyDirectCurrency, OptionalNullable<Boolean> threeDsRequired,
            OptionalNullable<Boolean> threeDsAddressRequired,
            OptionalNullable<Boolean> threeDsSkipEnabled,
            OptionalNullable<Boolean> allowDirectTokenCreation,
            OptionalNullable<Boolean> threeDsPhoneNumberRequired) {
        this.enabled = enabled;
        this.debitEnabled = debitEnabled;
        this.prepaidEnabled = prepaidEnabled;
        this.debitAuthorizationEnabled = debitAuthorizationEnabled;
        this.prepaidAuthorizationEnabled = prepaidAuthorizationEnabled;
        this.forbiddenCardBrands = forbiddenCardBrands;
        this.allowedCountriesByIp = allowedCountriesByIp;
        this.foreignCardsAllowed = foreignCardsAllowed;
        this.failOnNewEmail = failOnNewEmail;
        this.cardLimit = cardLimit;
        this.allowEmptyCvv = allowEmptyCvv;
        this.onlyDirectCurrency = onlyDirectCurrency;
        this.threeDsRequired = threeDsRequired;
        this.threeDsAddressRequired = threeDsAddressRequired;
        this.threeDsSkipEnabled = threeDsSkipEnabled;
        this.allowDirectTokenCreation = allowDirectTokenCreation;
        this.threeDsPhoneNumberRequired = threeDsPhoneNumberRequired;
    }

    /**
     * Internal Getter for Enabled.
     * Enables card payments.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetEnabled() {
        return this.enabled;
    }

    /**
     * Getter for Enabled.
     * Enables card payments.
     * @return Returns the Boolean
     */
    public Boolean getEnabled() {
        return OptionalNullable.getFrom(enabled);
    }

    /**
     * Setter for Enabled.
     * Enables card payments.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = OptionalNullable.of(enabled);
    }

    /**
     * UnSetter for Enabled.
     * Enables card payments.
     */
    public void unsetEnabled() {
        enabled = null;
    }

    /**
     * Internal Getter for DebitEnabled.
     * Allows debit cards for payment flows.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("debit_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDebitEnabled() {
        return this.debitEnabled;
    }

    /**
     * Getter for DebitEnabled.
     * Allows debit cards for payment flows.
     * @return Returns the Boolean
     */
    public Boolean getDebitEnabled() {
        return OptionalNullable.getFrom(debitEnabled);
    }

    /**
     * Setter for DebitEnabled.
     * Allows debit cards for payment flows.
     * @param debitEnabled Value for Boolean
     */
    @JsonSetter("debit_enabled")
    public void setDebitEnabled(Boolean debitEnabled) {
        this.debitEnabled = OptionalNullable.of(debitEnabled);
    }

    /**
     * UnSetter for DebitEnabled.
     * Allows debit cards for payment flows.
     */
    public void unsetDebitEnabled() {
        debitEnabled = null;
    }

    /**
     * Internal Getter for PrepaidEnabled.
     * Allows prepaid cards for payment flows.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("prepaid_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetPrepaidEnabled() {
        return this.prepaidEnabled;
    }

    /**
     * Getter for PrepaidEnabled.
     * Allows prepaid cards for payment flows.
     * @return Returns the Boolean
     */
    public Boolean getPrepaidEnabled() {
        return OptionalNullable.getFrom(prepaidEnabled);
    }

    /**
     * Setter for PrepaidEnabled.
     * Allows prepaid cards for payment flows.
     * @param prepaidEnabled Value for Boolean
     */
    @JsonSetter("prepaid_enabled")
    public void setPrepaidEnabled(Boolean prepaidEnabled) {
        this.prepaidEnabled = OptionalNullable.of(prepaidEnabled);
    }

    /**
     * UnSetter for PrepaidEnabled.
     * Allows prepaid cards for payment flows.
     */
    public void unsetPrepaidEnabled() {
        prepaidEnabled = null;
    }

    /**
     * Internal Getter for DebitAuthorizationEnabled.
     * Allows authorization-only flows for debit cards.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("debit_authorization_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetDebitAuthorizationEnabled() {
        return this.debitAuthorizationEnabled;
    }

    /**
     * Getter for DebitAuthorizationEnabled.
     * Allows authorization-only flows for debit cards.
     * @return Returns the Boolean
     */
    public Boolean getDebitAuthorizationEnabled() {
        return OptionalNullable.getFrom(debitAuthorizationEnabled);
    }

    /**
     * Setter for DebitAuthorizationEnabled.
     * Allows authorization-only flows for debit cards.
     * @param debitAuthorizationEnabled Value for Boolean
     */
    @JsonSetter("debit_authorization_enabled")
    public void setDebitAuthorizationEnabled(Boolean debitAuthorizationEnabled) {
        this.debitAuthorizationEnabled = OptionalNullable.of(debitAuthorizationEnabled);
    }

    /**
     * UnSetter for DebitAuthorizationEnabled.
     * Allows authorization-only flows for debit cards.
     */
    public void unsetDebitAuthorizationEnabled() {
        debitAuthorizationEnabled = null;
    }

    /**
     * Internal Getter for PrepaidAuthorizationEnabled.
     * Allows authorization-only flows for prepaid cards.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("prepaid_authorization_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetPrepaidAuthorizationEnabled() {
        return this.prepaidAuthorizationEnabled;
    }

    /**
     * Getter for PrepaidAuthorizationEnabled.
     * Allows authorization-only flows for prepaid cards.
     * @return Returns the Boolean
     */
    public Boolean getPrepaidAuthorizationEnabled() {
        return OptionalNullable.getFrom(prepaidAuthorizationEnabled);
    }

    /**
     * Setter for PrepaidAuthorizationEnabled.
     * Allows authorization-only flows for prepaid cards.
     * @param prepaidAuthorizationEnabled Value for Boolean
     */
    @JsonSetter("prepaid_authorization_enabled")
    public void setPrepaidAuthorizationEnabled(Boolean prepaidAuthorizationEnabled) {
        this.prepaidAuthorizationEnabled = OptionalNullable.of(prepaidAuthorizationEnabled);
    }

    /**
     * UnSetter for PrepaidAuthorizationEnabled.
     * Allows authorization-only flows for prepaid cards.
     */
    public void unsetPrepaidAuthorizationEnabled() {
        prepaidAuthorizationEnabled = null;
    }

    /**
     * Internal Getter for ForbiddenCardBrands.
     * Card brands rejected by merchant policy.
     * @return Returns the Internal List of String
     */
    @JsonGetter("forbidden_card_brands")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetForbiddenCardBrands() {
        return this.forbiddenCardBrands;
    }

    /**
     * Getter for ForbiddenCardBrands.
     * Card brands rejected by merchant policy.
     * @return Returns the List of String
     */
    public List<String> getForbiddenCardBrands() {
        return OptionalNullable.getFrom(forbiddenCardBrands);
    }

    /**
     * Setter for ForbiddenCardBrands.
     * Card brands rejected by merchant policy.
     * @param forbiddenCardBrands Value for List of String
     */
    @JsonSetter("forbidden_card_brands")
    public void setForbiddenCardBrands(List<String> forbiddenCardBrands) {
        this.forbiddenCardBrands = OptionalNullable.of(forbiddenCardBrands);
    }

    /**
     * UnSetter for ForbiddenCardBrands.
     * Card brands rejected by merchant policy.
     */
    public void unsetForbiddenCardBrands() {
        forbiddenCardBrands = null;
    }

    /**
     * Internal Getter for AllowedCountriesByIp.
     * Source IP country codes allowed for card payments.
     * @return Returns the Internal List of String
     */
    @JsonGetter("allowed_countries_by_ip")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<List<String>> internalGetAllowedCountriesByIp() {
        return this.allowedCountriesByIp;
    }

    /**
     * Getter for AllowedCountriesByIp.
     * Source IP country codes allowed for card payments.
     * @return Returns the List of String
     */
    public List<String> getAllowedCountriesByIp() {
        return OptionalNullable.getFrom(allowedCountriesByIp);
    }

    /**
     * Setter for AllowedCountriesByIp.
     * Source IP country codes allowed for card payments.
     * @param allowedCountriesByIp Value for List of String
     */
    @JsonSetter("allowed_countries_by_ip")
    public void setAllowedCountriesByIp(List<String> allowedCountriesByIp) {
        this.allowedCountriesByIp = OptionalNullable.of(allowedCountriesByIp);
    }

    /**
     * UnSetter for AllowedCountriesByIp.
     * Source IP country codes allowed for card payments.
     */
    public void unsetAllowedCountriesByIp() {
        allowedCountriesByIp = null;
    }

    /**
     * Internal Getter for ForeignCardsAllowed.
     * Allows cards issued outside the primary operating country.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("foreign_cards_allowed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetForeignCardsAllowed() {
        return this.foreignCardsAllowed;
    }

    /**
     * Getter for ForeignCardsAllowed.
     * Allows cards issued outside the primary operating country.
     * @return Returns the Boolean
     */
    public Boolean getForeignCardsAllowed() {
        return OptionalNullable.getFrom(foreignCardsAllowed);
    }

    /**
     * Setter for ForeignCardsAllowed.
     * Allows cards issued outside the primary operating country.
     * @param foreignCardsAllowed Value for Boolean
     */
    @JsonSetter("foreign_cards_allowed")
    public void setForeignCardsAllowed(Boolean foreignCardsAllowed) {
        this.foreignCardsAllowed = OptionalNullable.of(foreignCardsAllowed);
    }

    /**
     * UnSetter for ForeignCardsAllowed.
     * Allows cards issued outside the primary operating country.
     */
    public void unsetForeignCardsAllowed() {
        foreignCardsAllowed = null;
    }

    /**
     * Internal Getter for FailOnNewEmail.
     * Rejects card charges from previously unseen customer email addresses.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("fail_on_new_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetFailOnNewEmail() {
        return this.failOnNewEmail;
    }

    /**
     * Getter for FailOnNewEmail.
     * Rejects card charges from previously unseen customer email addresses.
     * @return Returns the Boolean
     */
    public Boolean getFailOnNewEmail() {
        return OptionalNullable.getFrom(failOnNewEmail);
    }

    /**
     * Setter for FailOnNewEmail.
     * Rejects card charges from previously unseen customer email addresses.
     * @param failOnNewEmail Value for Boolean
     */
    @JsonSetter("fail_on_new_email")
    public void setFailOnNewEmail(Boolean failOnNewEmail) {
        this.failOnNewEmail = OptionalNullable.of(failOnNewEmail);
    }

    /**
     * UnSetter for FailOnNewEmail.
     * Rejects card charges from previously unseen customer email addresses.
     */
    public void unsetFailOnNewEmail() {
        failOnNewEmail = null;
    }

    /**
     * Internal Getter for CardLimit.
     * Maximum number of cards allowed per customer context.
     * @return Returns the Internal Integer
     */
    @JsonGetter("card_limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetCardLimit() {
        return this.cardLimit;
    }

    /**
     * Getter for CardLimit.
     * Maximum number of cards allowed per customer context.
     * @return Returns the Integer
     */
    public Integer getCardLimit() {
        return OptionalNullable.getFrom(cardLimit);
    }

    /**
     * Setter for CardLimit.
     * Maximum number of cards allowed per customer context.
     * @param cardLimit Value for Integer
     */
    @JsonSetter("card_limit")
    public void setCardLimit(Integer cardLimit) {
        this.cardLimit = OptionalNullable.of(cardLimit);
    }

    /**
     * UnSetter for CardLimit.
     * Maximum number of cards allowed per customer context.
     */
    public void unsetCardLimit() {
        cardLimit = null;
    }

    /**
     * Internal Getter for AllowEmptyCvv.
     * Allows card flows without providing a CVV.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("allow_empty_cvv")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetAllowEmptyCvv() {
        return this.allowEmptyCvv;
    }

    /**
     * Getter for AllowEmptyCvv.
     * Allows card flows without providing a CVV.
     * @return Returns the Boolean
     */
    public Boolean getAllowEmptyCvv() {
        return OptionalNullable.getFrom(allowEmptyCvv);
    }

    /**
     * Setter for AllowEmptyCvv.
     * Allows card flows without providing a CVV.
     * @param allowEmptyCvv Value for Boolean
     */
    @JsonSetter("allow_empty_cvv")
    public void setAllowEmptyCvv(Boolean allowEmptyCvv) {
        this.allowEmptyCvv = OptionalNullable.of(allowEmptyCvv);
    }

    /**
     * UnSetter for AllowEmptyCvv.
     * Allows card flows without providing a CVV.
     */
    public void unsetAllowEmptyCvv() {
        allowEmptyCvv = null;
    }

    /**
     * Internal Getter for OnlyDirectCurrency.
     * Limits card processing to direct-settlement currencies only.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("only_direct_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetOnlyDirectCurrency() {
        return this.onlyDirectCurrency;
    }

    /**
     * Getter for OnlyDirectCurrency.
     * Limits card processing to direct-settlement currencies only.
     * @return Returns the Boolean
     */
    public Boolean getOnlyDirectCurrency() {
        return OptionalNullable.getFrom(onlyDirectCurrency);
    }

    /**
     * Setter for OnlyDirectCurrency.
     * Limits card processing to direct-settlement currencies only.
     * @param onlyDirectCurrency Value for Boolean
     */
    @JsonSetter("only_direct_currency")
    public void setOnlyDirectCurrency(Boolean onlyDirectCurrency) {
        this.onlyDirectCurrency = OptionalNullable.of(onlyDirectCurrency);
    }

    /**
     * UnSetter for OnlyDirectCurrency.
     * Limits card processing to direct-settlement currencies only.
     */
    public void unsetOnlyDirectCurrency() {
        onlyDirectCurrency = null;
    }

    /**
     * Internal Getter for ThreeDsRequired.
     * Requires 3-D Secure for eligible card flows.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("three_ds_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetThreeDsRequired() {
        return this.threeDsRequired;
    }

    /**
     * Getter for ThreeDsRequired.
     * Requires 3-D Secure for eligible card flows.
     * @return Returns the Boolean
     */
    public Boolean getThreeDsRequired() {
        return OptionalNullable.getFrom(threeDsRequired);
    }

    /**
     * Setter for ThreeDsRequired.
     * Requires 3-D Secure for eligible card flows.
     * @param threeDsRequired Value for Boolean
     */
    @JsonSetter("three_ds_required")
    public void setThreeDsRequired(Boolean threeDsRequired) {
        this.threeDsRequired = OptionalNullable.of(threeDsRequired);
    }

    /**
     * UnSetter for ThreeDsRequired.
     * Requires 3-D Secure for eligible card flows.
     */
    public void unsetThreeDsRequired() {
        threeDsRequired = null;
    }

    /**
     * Internal Getter for ThreeDsAddressRequired.
     * Requires billing address data when running 3-D Secure.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("three_ds_address_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetThreeDsAddressRequired() {
        return this.threeDsAddressRequired;
    }

    /**
     * Getter for ThreeDsAddressRequired.
     * Requires billing address data when running 3-D Secure.
     * @return Returns the Boolean
     */
    public Boolean getThreeDsAddressRequired() {
        return OptionalNullable.getFrom(threeDsAddressRequired);
    }

    /**
     * Setter for ThreeDsAddressRequired.
     * Requires billing address data when running 3-D Secure.
     * @param threeDsAddressRequired Value for Boolean
     */
    @JsonSetter("three_ds_address_required")
    public void setThreeDsAddressRequired(Boolean threeDsAddressRequired) {
        this.threeDsAddressRequired = OptionalNullable.of(threeDsAddressRequired);
    }

    /**
     * UnSetter for ThreeDsAddressRequired.
     * Requires billing address data when running 3-D Secure.
     */
    public void unsetThreeDsAddressRequired() {
        threeDsAddressRequired = null;
    }

    /**
     * Internal Getter for ThreeDsSkipEnabled.
     * Allows privileged callers to request 3-D Secure skip mode.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("three_ds_skip_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetThreeDsSkipEnabled() {
        return this.threeDsSkipEnabled;
    }

    /**
     * Getter for ThreeDsSkipEnabled.
     * Allows privileged callers to request 3-D Secure skip mode.
     * @return Returns the Boolean
     */
    public Boolean getThreeDsSkipEnabled() {
        return OptionalNullable.getFrom(threeDsSkipEnabled);
    }

    /**
     * Setter for ThreeDsSkipEnabled.
     * Allows privileged callers to request 3-D Secure skip mode.
     * @param threeDsSkipEnabled Value for Boolean
     */
    @JsonSetter("three_ds_skip_enabled")
    public void setThreeDsSkipEnabled(Boolean threeDsSkipEnabled) {
        this.threeDsSkipEnabled = OptionalNullable.of(threeDsSkipEnabled);
    }

    /**
     * UnSetter for ThreeDsSkipEnabled.
     * Allows privileged callers to request 3-D Secure skip mode.
     */
    public void unsetThreeDsSkipEnabled() {
        threeDsSkipEnabled = null;
    }

    /**
     * Internal Getter for AllowDirectTokenCreation.
     * Allows direct card token creation without hosted capture flows.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("allow_direct_token_creation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetAllowDirectTokenCreation() {
        return this.allowDirectTokenCreation;
    }

    /**
     * Getter for AllowDirectTokenCreation.
     * Allows direct card token creation without hosted capture flows.
     * @return Returns the Boolean
     */
    public Boolean getAllowDirectTokenCreation() {
        return OptionalNullable.getFrom(allowDirectTokenCreation);
    }

    /**
     * Setter for AllowDirectTokenCreation.
     * Allows direct card token creation without hosted capture flows.
     * @param allowDirectTokenCreation Value for Boolean
     */
    @JsonSetter("allow_direct_token_creation")
    public void setAllowDirectTokenCreation(Boolean allowDirectTokenCreation) {
        this.allowDirectTokenCreation = OptionalNullable.of(allowDirectTokenCreation);
    }

    /**
     * UnSetter for AllowDirectTokenCreation.
     * Allows direct card token creation without hosted capture flows.
     */
    public void unsetAllowDirectTokenCreation() {
        allowDirectTokenCreation = null;
    }

    /**
     * Internal Getter for ThreeDsPhoneNumberRequired.
     * Requires a phone number when running 3-D Secure.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("three_ds_phone_number_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetThreeDsPhoneNumberRequired() {
        return this.threeDsPhoneNumberRequired;
    }

    /**
     * Getter for ThreeDsPhoneNumberRequired.
     * Requires a phone number when running 3-D Secure.
     * @return Returns the Boolean
     */
    public Boolean getThreeDsPhoneNumberRequired() {
        return OptionalNullable.getFrom(threeDsPhoneNumberRequired);
    }

    /**
     * Setter for ThreeDsPhoneNumberRequired.
     * Requires a phone number when running 3-D Secure.
     * @param threeDsPhoneNumberRequired Value for Boolean
     */
    @JsonSetter("three_ds_phone_number_required")
    public void setThreeDsPhoneNumberRequired(Boolean threeDsPhoneNumberRequired) {
        this.threeDsPhoneNumberRequired = OptionalNullable.of(threeDsPhoneNumberRequired);
    }

    /**
     * UnSetter for ThreeDsPhoneNumberRequired.
     * Requires a phone number when running 3-D Secure.
     */
    public void unsetThreeDsPhoneNumberRequired() {
        threeDsPhoneNumberRequired = null;
    }

    /**
     * Hidden method for the serialization of additional properties.
     * @return The map of additionally set properties.
     */
    @JsonAnyGetter
    private Map<String, Object> getAdditionalProperties() {
        return additionalProperties.getAdditionalProperties();
    }

    /**
     * Hidden method for the de-serialization of additional properties.
     * @param name The name of the additional property.
     * @param value The Object value of the additional property.
     */
    @JsonAnySetter
    private void setAdditionalProperties(String name, Object value) {
        additionalProperties.setAdditionalProperty(name,
                ConversionHelper.convertToSimpleType(value,
                        x -> x),
                true);
    }

    /**
     * Getter for the value of additional properties based on provided property name.
     * @param name The name of the additional property.
     * @return Either the Object property value or null if not exist.
     */
    
    public Object getAdditionalProperty(String name) {
        return additionalProperties.getAdditionalProperty(name);
    }

    /**
     * Converts this MerchantWebhookCardConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookCardConfiguration [" + "enabled=" + enabled + ", debitEnabled="
                + debitEnabled + ", prepaidEnabled=" + prepaidEnabled
                + ", debitAuthorizationEnabled=" + debitAuthorizationEnabled
                + ", prepaidAuthorizationEnabled=" + prepaidAuthorizationEnabled
                + ", forbiddenCardBrands=" + forbiddenCardBrands + ", allowedCountriesByIp="
                + allowedCountriesByIp + ", foreignCardsAllowed=" + foreignCardsAllowed
                + ", failOnNewEmail=" + failOnNewEmail + ", cardLimit=" + cardLimit
                + ", allowEmptyCvv=" + allowEmptyCvv + ", onlyDirectCurrency=" + onlyDirectCurrency
                + ", threeDsRequired=" + threeDsRequired + ", threeDsAddressRequired="
                + threeDsAddressRequired + ", threeDsSkipEnabled=" + threeDsSkipEnabled
                + ", allowDirectTokenCreation=" + allowDirectTokenCreation
                + ", threeDsPhoneNumberRequired=" + threeDsPhoneNumberRequired
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookCardConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookCardConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.enabled = internalGetEnabled();
        builder.debitEnabled = internalGetDebitEnabled();
        builder.prepaidEnabled = internalGetPrepaidEnabled();
        builder.debitAuthorizationEnabled = internalGetDebitAuthorizationEnabled();
        builder.prepaidAuthorizationEnabled = internalGetPrepaidAuthorizationEnabled();
        builder.forbiddenCardBrands = internalGetForbiddenCardBrands();
        builder.allowedCountriesByIp = internalGetAllowedCountriesByIp();
        builder.foreignCardsAllowed = internalGetForeignCardsAllowed();
        builder.failOnNewEmail = internalGetFailOnNewEmail();
        builder.cardLimit = internalGetCardLimit();
        builder.allowEmptyCvv = internalGetAllowEmptyCvv();
        builder.onlyDirectCurrency = internalGetOnlyDirectCurrency();
        builder.threeDsRequired = internalGetThreeDsRequired();
        builder.threeDsAddressRequired = internalGetThreeDsAddressRequired();
        builder.threeDsSkipEnabled = internalGetThreeDsSkipEnabled();
        builder.allowDirectTokenCreation = internalGetAllowDirectTokenCreation();
        builder.threeDsPhoneNumberRequired = internalGetThreeDsPhoneNumberRequired();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookCardConfiguration}.
     */
    public static class Builder {
        private OptionalNullable<Boolean> enabled;
        private OptionalNullable<Boolean> debitEnabled;
        private OptionalNullable<Boolean> prepaidEnabled;
        private OptionalNullable<Boolean> debitAuthorizationEnabled;
        private OptionalNullable<Boolean> prepaidAuthorizationEnabled;
        private OptionalNullable<List<String>> forbiddenCardBrands;
        private OptionalNullable<List<String>> allowedCountriesByIp;
        private OptionalNullable<Boolean> foreignCardsAllowed;
        private OptionalNullable<Boolean> failOnNewEmail;
        private OptionalNullable<Integer> cardLimit;
        private OptionalNullable<Boolean> allowEmptyCvv;
        private OptionalNullable<Boolean> onlyDirectCurrency;
        private OptionalNullable<Boolean> threeDsRequired;
        private OptionalNullable<Boolean> threeDsAddressRequired;
        private OptionalNullable<Boolean> threeDsSkipEnabled;
        private OptionalNullable<Boolean> allowDirectTokenCreation;
        private OptionalNullable<Boolean> threeDsPhoneNumberRequired;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = OptionalNullable.of(enabled);
            return this;
        }

        /**
         * UnSetter for enabled.
         * @return Builder
         */
        public Builder unsetEnabled() {
            enabled = null;
            return this;
        }

        /**
         * Setter for debitEnabled.
         * @param  debitEnabled  Boolean value for debitEnabled.
         * @return Builder
         */
        public Builder debitEnabled(Boolean debitEnabled) {
            this.debitEnabled = OptionalNullable.of(debitEnabled);
            return this;
        }

        /**
         * UnSetter for debitEnabled.
         * @return Builder
         */
        public Builder unsetDebitEnabled() {
            debitEnabled = null;
            return this;
        }

        /**
         * Setter for prepaidEnabled.
         * @param  prepaidEnabled  Boolean value for prepaidEnabled.
         * @return Builder
         */
        public Builder prepaidEnabled(Boolean prepaidEnabled) {
            this.prepaidEnabled = OptionalNullable.of(prepaidEnabled);
            return this;
        }

        /**
         * UnSetter for prepaidEnabled.
         * @return Builder
         */
        public Builder unsetPrepaidEnabled() {
            prepaidEnabled = null;
            return this;
        }

        /**
         * Setter for debitAuthorizationEnabled.
         * @param  debitAuthorizationEnabled  Boolean value for debitAuthorizationEnabled.
         * @return Builder
         */
        public Builder debitAuthorizationEnabled(Boolean debitAuthorizationEnabled) {
            this.debitAuthorizationEnabled = OptionalNullable.of(debitAuthorizationEnabled);
            return this;
        }

        /**
         * UnSetter for debitAuthorizationEnabled.
         * @return Builder
         */
        public Builder unsetDebitAuthorizationEnabled() {
            debitAuthorizationEnabled = null;
            return this;
        }

        /**
         * Setter for prepaidAuthorizationEnabled.
         * @param  prepaidAuthorizationEnabled  Boolean value for prepaidAuthorizationEnabled.
         * @return Builder
         */
        public Builder prepaidAuthorizationEnabled(Boolean prepaidAuthorizationEnabled) {
            this.prepaidAuthorizationEnabled = OptionalNullable.of(prepaidAuthorizationEnabled);
            return this;
        }

        /**
         * UnSetter for prepaidAuthorizationEnabled.
         * @return Builder
         */
        public Builder unsetPrepaidAuthorizationEnabled() {
            prepaidAuthorizationEnabled = null;
            return this;
        }

        /**
         * Setter for forbiddenCardBrands.
         * @param  forbiddenCardBrands  List of String value for forbiddenCardBrands.
         * @return Builder
         */
        public Builder forbiddenCardBrands(List<String> forbiddenCardBrands) {
            this.forbiddenCardBrands = OptionalNullable.of(forbiddenCardBrands);
            return this;
        }

        /**
         * UnSetter for forbiddenCardBrands.
         * @return Builder
         */
        public Builder unsetForbiddenCardBrands() {
            forbiddenCardBrands = null;
            return this;
        }

        /**
         * Setter for allowedCountriesByIp.
         * @param  allowedCountriesByIp  List of String value for allowedCountriesByIp.
         * @return Builder
         */
        public Builder allowedCountriesByIp(List<String> allowedCountriesByIp) {
            this.allowedCountriesByIp = OptionalNullable.of(allowedCountriesByIp);
            return this;
        }

        /**
         * UnSetter for allowedCountriesByIp.
         * @return Builder
         */
        public Builder unsetAllowedCountriesByIp() {
            allowedCountriesByIp = null;
            return this;
        }

        /**
         * Setter for foreignCardsAllowed.
         * @param  foreignCardsAllowed  Boolean value for foreignCardsAllowed.
         * @return Builder
         */
        public Builder foreignCardsAllowed(Boolean foreignCardsAllowed) {
            this.foreignCardsAllowed = OptionalNullable.of(foreignCardsAllowed);
            return this;
        }

        /**
         * UnSetter for foreignCardsAllowed.
         * @return Builder
         */
        public Builder unsetForeignCardsAllowed() {
            foreignCardsAllowed = null;
            return this;
        }

        /**
         * Setter for failOnNewEmail.
         * @param  failOnNewEmail  Boolean value for failOnNewEmail.
         * @return Builder
         */
        public Builder failOnNewEmail(Boolean failOnNewEmail) {
            this.failOnNewEmail = OptionalNullable.of(failOnNewEmail);
            return this;
        }

        /**
         * UnSetter for failOnNewEmail.
         * @return Builder
         */
        public Builder unsetFailOnNewEmail() {
            failOnNewEmail = null;
            return this;
        }

        /**
         * Setter for cardLimit.
         * @param  cardLimit  Integer value for cardLimit.
         * @return Builder
         */
        public Builder cardLimit(Integer cardLimit) {
            this.cardLimit = OptionalNullable.of(cardLimit);
            return this;
        }

        /**
         * UnSetter for cardLimit.
         * @return Builder
         */
        public Builder unsetCardLimit() {
            cardLimit = null;
            return this;
        }

        /**
         * Setter for allowEmptyCvv.
         * @param  allowEmptyCvv  Boolean value for allowEmptyCvv.
         * @return Builder
         */
        public Builder allowEmptyCvv(Boolean allowEmptyCvv) {
            this.allowEmptyCvv = OptionalNullable.of(allowEmptyCvv);
            return this;
        }

        /**
         * UnSetter for allowEmptyCvv.
         * @return Builder
         */
        public Builder unsetAllowEmptyCvv() {
            allowEmptyCvv = null;
            return this;
        }

        /**
         * Setter for onlyDirectCurrency.
         * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
         * @return Builder
         */
        public Builder onlyDirectCurrency(Boolean onlyDirectCurrency) {
            this.onlyDirectCurrency = OptionalNullable.of(onlyDirectCurrency);
            return this;
        }

        /**
         * UnSetter for onlyDirectCurrency.
         * @return Builder
         */
        public Builder unsetOnlyDirectCurrency() {
            onlyDirectCurrency = null;
            return this;
        }

        /**
         * Setter for threeDsRequired.
         * @param  threeDsRequired  Boolean value for threeDsRequired.
         * @return Builder
         */
        public Builder threeDsRequired(Boolean threeDsRequired) {
            this.threeDsRequired = OptionalNullable.of(threeDsRequired);
            return this;
        }

        /**
         * UnSetter for threeDsRequired.
         * @return Builder
         */
        public Builder unsetThreeDsRequired() {
            threeDsRequired = null;
            return this;
        }

        /**
         * Setter for threeDsAddressRequired.
         * @param  threeDsAddressRequired  Boolean value for threeDsAddressRequired.
         * @return Builder
         */
        public Builder threeDsAddressRequired(Boolean threeDsAddressRequired) {
            this.threeDsAddressRequired = OptionalNullable.of(threeDsAddressRequired);
            return this;
        }

        /**
         * UnSetter for threeDsAddressRequired.
         * @return Builder
         */
        public Builder unsetThreeDsAddressRequired() {
            threeDsAddressRequired = null;
            return this;
        }

        /**
         * Setter for threeDsSkipEnabled.
         * @param  threeDsSkipEnabled  Boolean value for threeDsSkipEnabled.
         * @return Builder
         */
        public Builder threeDsSkipEnabled(Boolean threeDsSkipEnabled) {
            this.threeDsSkipEnabled = OptionalNullable.of(threeDsSkipEnabled);
            return this;
        }

        /**
         * UnSetter for threeDsSkipEnabled.
         * @return Builder
         */
        public Builder unsetThreeDsSkipEnabled() {
            threeDsSkipEnabled = null;
            return this;
        }

        /**
         * Setter for allowDirectTokenCreation.
         * @param  allowDirectTokenCreation  Boolean value for allowDirectTokenCreation.
         * @return Builder
         */
        public Builder allowDirectTokenCreation(Boolean allowDirectTokenCreation) {
            this.allowDirectTokenCreation = OptionalNullable.of(allowDirectTokenCreation);
            return this;
        }

        /**
         * UnSetter for allowDirectTokenCreation.
         * @return Builder
         */
        public Builder unsetAllowDirectTokenCreation() {
            allowDirectTokenCreation = null;
            return this;
        }

        /**
         * Setter for threeDsPhoneNumberRequired.
         * @param  threeDsPhoneNumberRequired  Boolean value for threeDsPhoneNumberRequired.
         * @return Builder
         */
        public Builder threeDsPhoneNumberRequired(Boolean threeDsPhoneNumberRequired) {
            this.threeDsPhoneNumberRequired = OptionalNullable.of(threeDsPhoneNumberRequired);
            return this;
        }

        /**
         * UnSetter for threeDsPhoneNumberRequired.
         * @return Builder
         */
        public Builder unsetThreeDsPhoneNumberRequired() {
            threeDsPhoneNumberRequired = null;
            return this;
        }

        /**
         * Setter for additional property that are not in model fields.
         * @param name The name of the additional property.
         * @param value The Object value of the additional property.
         * @return Builder.
         */
        public Builder additionalProperty(String name, Object value) {
            this.additionalProperties.setAdditionalProperty(name, value);
            return this;
        }

        /**
         * Builds a new {@link MerchantWebhookCardConfiguration} object using the set fields.
         * @return {@link MerchantWebhookCardConfiguration}
         */
        public MerchantWebhookCardConfiguration build() {
            MerchantWebhookCardConfiguration model =
                    new MerchantWebhookCardConfiguration(enabled, debitEnabled, prepaidEnabled,
                            debitAuthorizationEnabled, prepaidAuthorizationEnabled,
                            forbiddenCardBrands, allowedCountriesByIp, foreignCardsAllowed,
                            failOnNewEmail, cardLimit, allowEmptyCvv, onlyDirectCurrency,
                            threeDsRequired, threeDsAddressRequired, threeDsSkipEnabled,
                            allowDirectTokenCreation, threeDsPhoneNumberRequired);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
