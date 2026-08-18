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
 * This is a model class for CheckoutCardConfiguration type.
 */
public class CheckoutCardConfiguration {
    private Boolean enabled;
    private Boolean debitEnabled;
    private Boolean prepaidEnabled;
    private Boolean debitAuthorizationEnabled;
    private Boolean prepaidAuthorizationEnabled;
    private Boolean onlyDirectCurrency;
    private OptionalNullable<List<String>> forbiddenCardBrands;
    private OptionalNullable<List<String>> allowedCountriesByIp;
    private Boolean foreignCardsAllowed;
    private OptionalNullable<Boolean> failOnNewEmail;
    private OptionalNullable<CardLimit> cardLimit;
    private OptionalNullable<Boolean> allowEmptyCvv;
    private Boolean allowDirectTokenCreation;
    private Boolean threeDsRequired;
    private Boolean threeDsAddressRequired;
    private Boolean threeDsSkipEnabled;
    private Boolean threeDsPhoneNumberRequired;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CheckoutCardConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  debitEnabled  Boolean value for debitEnabled.
     * @param  prepaidEnabled  Boolean value for prepaidEnabled.
     * @param  debitAuthorizationEnabled  Boolean value for debitAuthorizationEnabled.
     * @param  prepaidAuthorizationEnabled  Boolean value for prepaidAuthorizationEnabled.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  forbiddenCardBrands  List of String value for forbiddenCardBrands.
     * @param  allowedCountriesByIp  List of String value for allowedCountriesByIp.
     * @param  foreignCardsAllowed  Boolean value for foreignCardsAllowed.
     * @param  failOnNewEmail  Boolean value for failOnNewEmail.
     * @param  cardLimit  CardLimit value for cardLimit.
     * @param  allowEmptyCvv  Boolean value for allowEmptyCvv.
     * @param  allowDirectTokenCreation  Boolean value for allowDirectTokenCreation.
     * @param  threeDsRequired  Boolean value for threeDsRequired.
     * @param  threeDsAddressRequired  Boolean value for threeDsAddressRequired.
     * @param  threeDsSkipEnabled  Boolean value for threeDsSkipEnabled.
     * @param  threeDsPhoneNumberRequired  Boolean value for threeDsPhoneNumberRequired.
     */
    public CheckoutCardConfiguration(
            Boolean enabled,
            Boolean debitEnabled,
            Boolean prepaidEnabled,
            Boolean debitAuthorizationEnabled,
            Boolean prepaidAuthorizationEnabled,
            Boolean onlyDirectCurrency,
            List<String> forbiddenCardBrands,
            List<String> allowedCountriesByIp,
            Boolean foreignCardsAllowed,
            Boolean failOnNewEmail,
            CardLimit cardLimit,
            Boolean allowEmptyCvv,
            Boolean allowDirectTokenCreation,
            Boolean threeDsRequired,
            Boolean threeDsAddressRequired,
            Boolean threeDsSkipEnabled,
            Boolean threeDsPhoneNumberRequired) {
        this.enabled = enabled;
        this.debitEnabled = debitEnabled;
        this.prepaidEnabled = prepaidEnabled;
        this.debitAuthorizationEnabled = debitAuthorizationEnabled;
        this.prepaidAuthorizationEnabled = prepaidAuthorizationEnabled;
        this.onlyDirectCurrency = onlyDirectCurrency;
        this.forbiddenCardBrands = OptionalNullable.of(forbiddenCardBrands);
        this.allowedCountriesByIp = OptionalNullable.of(allowedCountriesByIp);
        this.foreignCardsAllowed = foreignCardsAllowed;
        this.failOnNewEmail = OptionalNullable.of(failOnNewEmail);
        this.cardLimit = OptionalNullable.of(cardLimit);
        this.allowEmptyCvv = OptionalNullable.of(allowEmptyCvv);
        this.allowDirectTokenCreation = allowDirectTokenCreation;
        this.threeDsRequired = threeDsRequired;
        this.threeDsAddressRequired = threeDsAddressRequired;
        this.threeDsSkipEnabled = threeDsSkipEnabled;
        this.threeDsPhoneNumberRequired = threeDsPhoneNumberRequired;
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  debitEnabled  Boolean value for debitEnabled.
     * @param  prepaidEnabled  Boolean value for prepaidEnabled.
     * @param  debitAuthorizationEnabled  Boolean value for debitAuthorizationEnabled.
     * @param  prepaidAuthorizationEnabled  Boolean value for prepaidAuthorizationEnabled.
     * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
     * @param  forbiddenCardBrands  List of String value for forbiddenCardBrands.
     * @param  allowedCountriesByIp  List of String value for allowedCountriesByIp.
     * @param  foreignCardsAllowed  Boolean value for foreignCardsAllowed.
     * @param  failOnNewEmail  Boolean value for failOnNewEmail.
     * @param  cardLimit  CardLimit value for cardLimit.
     * @param  allowEmptyCvv  Boolean value for allowEmptyCvv.
     * @param  allowDirectTokenCreation  Boolean value for allowDirectTokenCreation.
     * @param  threeDsRequired  Boolean value for threeDsRequired.
     * @param  threeDsAddressRequired  Boolean value for threeDsAddressRequired.
     * @param  threeDsSkipEnabled  Boolean value for threeDsSkipEnabled.
     * @param  threeDsPhoneNumberRequired  Boolean value for threeDsPhoneNumberRequired.
     */

    protected CheckoutCardConfiguration(Boolean enabled, Boolean debitEnabled,
            Boolean prepaidEnabled, Boolean debitAuthorizationEnabled,
            Boolean prepaidAuthorizationEnabled, Boolean onlyDirectCurrency,
            OptionalNullable<List<String>> forbiddenCardBrands,
            OptionalNullable<List<String>> allowedCountriesByIp, Boolean foreignCardsAllowed,
            OptionalNullable<Boolean> failOnNewEmail, OptionalNullable<CardLimit> cardLimit,
            OptionalNullable<Boolean> allowEmptyCvv, Boolean allowDirectTokenCreation,
            Boolean threeDsRequired, Boolean threeDsAddressRequired, Boolean threeDsSkipEnabled,
            Boolean threeDsPhoneNumberRequired) {
        this.enabled = enabled;
        this.debitEnabled = debitEnabled;
        this.prepaidEnabled = prepaidEnabled;
        this.debitAuthorizationEnabled = debitAuthorizationEnabled;
        this.prepaidAuthorizationEnabled = prepaidAuthorizationEnabled;
        this.onlyDirectCurrency = onlyDirectCurrency;
        this.forbiddenCardBrands = forbiddenCardBrands;
        this.allowedCountriesByIp = allowedCountriesByIp;
        this.foreignCardsAllowed = foreignCardsAllowed;
        this.failOnNewEmail = failOnNewEmail;
        this.cardLimit = cardLimit;
        this.allowEmptyCvv = allowEmptyCvv;
        this.allowDirectTokenCreation = allowDirectTokenCreation;
        this.threeDsRequired = threeDsRequired;
        this.threeDsAddressRequired = threeDsAddressRequired;
        this.threeDsSkipEnabled = threeDsSkipEnabled;
        this.threeDsPhoneNumberRequired = threeDsPhoneNumberRequired;
    }

    /**
     * Getter for Enabled.
     * Whether card payments are enabled.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether card payments are enabled.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for DebitEnabled.
     * Whether debit cards are allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("debit_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDebitEnabled() {
        return debitEnabled;
    }

    /**
     * Setter for DebitEnabled.
     * Whether debit cards are allowed.
     * @param debitEnabled Value for Boolean
     */
    @JsonSetter("debit_enabled")
    public void setDebitEnabled(Boolean debitEnabled) {
        this.debitEnabled = debitEnabled;
    }

    /**
     * Getter for PrepaidEnabled.
     * Whether prepaid cards are allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("prepaid_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrepaidEnabled() {
        return prepaidEnabled;
    }

    /**
     * Setter for PrepaidEnabled.
     * Whether prepaid cards are allowed.
     * @param prepaidEnabled Value for Boolean
     */
    @JsonSetter("prepaid_enabled")
    public void setPrepaidEnabled(Boolean prepaidEnabled) {
        this.prepaidEnabled = prepaidEnabled;
    }

    /**
     * Getter for DebitAuthorizationEnabled.
     * Whether authorization-only flows are allowed for debit cards.
     * @return Returns the Boolean
     */
    @JsonGetter("debit_authorization_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getDebitAuthorizationEnabled() {
        return debitAuthorizationEnabled;
    }

    /**
     * Setter for DebitAuthorizationEnabled.
     * Whether authorization-only flows are allowed for debit cards.
     * @param debitAuthorizationEnabled Value for Boolean
     */
    @JsonSetter("debit_authorization_enabled")
    public void setDebitAuthorizationEnabled(Boolean debitAuthorizationEnabled) {
        this.debitAuthorizationEnabled = debitAuthorizationEnabled;
    }

    /**
     * Getter for PrepaidAuthorizationEnabled.
     * Whether authorization-only flows are allowed for prepaid cards.
     * @return Returns the Boolean
     */
    @JsonGetter("prepaid_authorization_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getPrepaidAuthorizationEnabled() {
        return prepaidAuthorizationEnabled;
    }

    /**
     * Setter for PrepaidAuthorizationEnabled.
     * Whether authorization-only flows are allowed for prepaid cards.
     * @param prepaidAuthorizationEnabled Value for Boolean
     */
    @JsonSetter("prepaid_authorization_enabled")
    public void setPrepaidAuthorizationEnabled(Boolean prepaidAuthorizationEnabled) {
        this.prepaidAuthorizationEnabled = prepaidAuthorizationEnabled;
    }

    /**
     * Getter for OnlyDirectCurrency.
     * Whether card processing is restricted to direct-settlement currencies.
     * @return Returns the Boolean
     */
    @JsonGetter("only_direct_currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getOnlyDirectCurrency() {
        return onlyDirectCurrency;
    }

    /**
     * Setter for OnlyDirectCurrency.
     * Whether card processing is restricted to direct-settlement currencies.
     * @param onlyDirectCurrency Value for Boolean
     */
    @JsonSetter("only_direct_currency")
    public void setOnlyDirectCurrency(Boolean onlyDirectCurrency) {
        this.onlyDirectCurrency = onlyDirectCurrency;
    }

    /**
     * Internal Getter for ForbiddenCardBrands.
     * Card brands rejected by merchant policy. Common values include `visa`, `mastercard`,
     * `american_express`, `maestro`, `discover`, `jcb`, `diners_club`, `private_label`, and
     * `unionpay`; gateway-specific brands the platform cannot map appear as `unmapped_&lt;raw value&gt;`.
     * `null` when no brand is forbidden.
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
     * Card brands rejected by merchant policy. Common values include `visa`, `mastercard`,
     * `american_express`, `maestro`, `discover`, `jcb`, `diners_club`, `private_label`, and
     * `unionpay`; gateway-specific brands the platform cannot map appear as `unmapped_&lt;raw value&gt;`.
     * `null` when no brand is forbidden.
     * @return Returns the List of String
     */
    public List<String> getForbiddenCardBrands() {
        return OptionalNullable.getFrom(forbiddenCardBrands);
    }

    /**
     * Setter for ForbiddenCardBrands.
     * Card brands rejected by merchant policy. Common values include `visa`, `mastercard`,
     * `american_express`, `maestro`, `discover`, `jcb`, `diners_club`, `private_label`, and
     * `unionpay`; gateway-specific brands the platform cannot map appear as `unmapped_&lt;raw value&gt;`.
     * `null` when no brand is forbidden.
     * @param forbiddenCardBrands Value for List of String
     */
    @JsonSetter("forbidden_card_brands")
    public void setForbiddenCardBrands(List<String> forbiddenCardBrands) {
        this.forbiddenCardBrands = OptionalNullable.of(forbiddenCardBrands);
    }

    /**
     * UnSetter for ForbiddenCardBrands.
     * Card brands rejected by merchant policy. Common values include `visa`, `mastercard`,
     * `american_express`, `maestro`, `discover`, `jcb`, `diners_club`, `private_label`, and
     * `unionpay`; gateway-specific brands the platform cannot map appear as `unmapped_&lt;raw value&gt;`.
     * `null` when no brand is forbidden.
     */
    public void unsetForbiddenCardBrands() {
        forbiddenCardBrands = null;
    }

    /**
     * Internal Getter for AllowedCountriesByIp.
     * ISO 3166-1 alpha-2 country codes allowed to originate card payments by IP geolocation. `null`
     * when unrestricted.
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
     * ISO 3166-1 alpha-2 country codes allowed to originate card payments by IP geolocation. `null`
     * when unrestricted.
     * @return Returns the List of String
     */
    public List<String> getAllowedCountriesByIp() {
        return OptionalNullable.getFrom(allowedCountriesByIp);
    }

    /**
     * Setter for AllowedCountriesByIp.
     * ISO 3166-1 alpha-2 country codes allowed to originate card payments by IP geolocation. `null`
     * when unrestricted.
     * @param allowedCountriesByIp Value for List of String
     */
    @JsonSetter("allowed_countries_by_ip")
    public void setAllowedCountriesByIp(List<String> allowedCountriesByIp) {
        this.allowedCountriesByIp = OptionalNullable.of(allowedCountriesByIp);
    }

    /**
     * UnSetter for AllowedCountriesByIp.
     * ISO 3166-1 alpha-2 country codes allowed to originate card payments by IP geolocation. `null`
     * when unrestricted.
     */
    public void unsetAllowedCountriesByIp() {
        allowedCountriesByIp = null;
    }

    /**
     * Getter for ForeignCardsAllowed.
     * Whether cards issued outside the primary operating country are allowed.
     * @return Returns the Boolean
     */
    @JsonGetter("foreign_cards_allowed")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getForeignCardsAllowed() {
        return foreignCardsAllowed;
    }

    /**
     * Setter for ForeignCardsAllowed.
     * Whether cards issued outside the primary operating country are allowed.
     * @param foreignCardsAllowed Value for Boolean
     */
    @JsonSetter("foreign_cards_allowed")
    public void setForeignCardsAllowed(Boolean foreignCardsAllowed) {
        this.foreignCardsAllowed = foreignCardsAllowed;
    }

    /**
     * Internal Getter for FailOnNewEmail.
     * Whether to reject card charges from previously unseen customer email addresses. `null` when
     * not configured.
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
     * Whether to reject card charges from previously unseen customer email addresses. `null` when
     * not configured.
     * @return Returns the Boolean
     */
    public Boolean getFailOnNewEmail() {
        return OptionalNullable.getFrom(failOnNewEmail);
    }

    /**
     * Setter for FailOnNewEmail.
     * Whether to reject card charges from previously unseen customer email addresses. `null` when
     * not configured.
     * @param failOnNewEmail Value for Boolean
     */
    @JsonSetter("fail_on_new_email")
    public void setFailOnNewEmail(Boolean failOnNewEmail) {
        this.failOnNewEmail = OptionalNullable.of(failOnNewEmail);
    }

    /**
     * UnSetter for FailOnNewEmail.
     * Whether to reject card charges from previously unseen customer email addresses. `null` when
     * not configured.
     */
    public void unsetFailOnNewEmail() {
        failOnNewEmail = null;
    }

    /**
     * Internal Getter for CardLimit.
     * Per-card spending limit. `null` when no limit is configured.
     * @return Returns the Internal CardLimit
     */
    @JsonGetter("card_limit")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<CardLimit> internalGetCardLimit() {
        return this.cardLimit;
    }

    /**
     * Getter for CardLimit.
     * Per-card spending limit. `null` when no limit is configured.
     * @return Returns the CardLimit
     */
    public CardLimit getCardLimit() {
        return OptionalNullable.getFrom(cardLimit);
    }

    /**
     * Setter for CardLimit.
     * Per-card spending limit. `null` when no limit is configured.
     * @param cardLimit Value for CardLimit
     */
    @JsonSetter("card_limit")
    public void setCardLimit(CardLimit cardLimit) {
        this.cardLimit = OptionalNullable.of(cardLimit);
    }

    /**
     * UnSetter for CardLimit.
     * Per-card spending limit. `null` when no limit is configured.
     */
    public void unsetCardLimit() {
        cardLimit = null;
    }

    /**
     * Internal Getter for AllowEmptyCvv.
     * Whether card flows may proceed without a CVV. `null` when not configured.
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
     * Whether card flows may proceed without a CVV. `null` when not configured.
     * @return Returns the Boolean
     */
    public Boolean getAllowEmptyCvv() {
        return OptionalNullable.getFrom(allowEmptyCvv);
    }

    /**
     * Setter for AllowEmptyCvv.
     * Whether card flows may proceed without a CVV. `null` when not configured.
     * @param allowEmptyCvv Value for Boolean
     */
    @JsonSetter("allow_empty_cvv")
    public void setAllowEmptyCvv(Boolean allowEmptyCvv) {
        this.allowEmptyCvv = OptionalNullable.of(allowEmptyCvv);
    }

    /**
     * UnSetter for AllowEmptyCvv.
     * Whether card flows may proceed without a CVV. `null` when not configured.
     */
    public void unsetAllowEmptyCvv() {
        allowEmptyCvv = null;
    }

    /**
     * Getter for AllowDirectTokenCreation.
     * Whether direct card token creation is allowed without a hosted capture flow.
     * @return Returns the Boolean
     */
    @JsonGetter("allow_direct_token_creation")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getAllowDirectTokenCreation() {
        return allowDirectTokenCreation;
    }

    /**
     * Setter for AllowDirectTokenCreation.
     * Whether direct card token creation is allowed without a hosted capture flow.
     * @param allowDirectTokenCreation Value for Boolean
     */
    @JsonSetter("allow_direct_token_creation")
    public void setAllowDirectTokenCreation(Boolean allowDirectTokenCreation) {
        this.allowDirectTokenCreation = allowDirectTokenCreation;
    }

    /**
     * Getter for ThreeDsRequired.
     * Whether 3-D Secure is required for eligible card flows.
     * @return Returns the Boolean
     */
    @JsonGetter("three_ds_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getThreeDsRequired() {
        return threeDsRequired;
    }

    /**
     * Setter for ThreeDsRequired.
     * Whether 3-D Secure is required for eligible card flows.
     * @param threeDsRequired Value for Boolean
     */
    @JsonSetter("three_ds_required")
    public void setThreeDsRequired(Boolean threeDsRequired) {
        this.threeDsRequired = threeDsRequired;
    }

    /**
     * Getter for ThreeDsAddressRequired.
     * Whether billing address data is required when running 3-D Secure.
     * @return Returns the Boolean
     */
    @JsonGetter("three_ds_address_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getThreeDsAddressRequired() {
        return threeDsAddressRequired;
    }

    /**
     * Setter for ThreeDsAddressRequired.
     * Whether billing address data is required when running 3-D Secure.
     * @param threeDsAddressRequired Value for Boolean
     */
    @JsonSetter("three_ds_address_required")
    public void setThreeDsAddressRequired(Boolean threeDsAddressRequired) {
        this.threeDsAddressRequired = threeDsAddressRequired;
    }

    /**
     * Getter for ThreeDsSkipEnabled.
     * Whether privileged callers may request a 3-D Secure skip.
     * @return Returns the Boolean
     */
    @JsonGetter("three_ds_skip_enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getThreeDsSkipEnabled() {
        return threeDsSkipEnabled;
    }

    /**
     * Setter for ThreeDsSkipEnabled.
     * Whether privileged callers may request a 3-D Secure skip.
     * @param threeDsSkipEnabled Value for Boolean
     */
    @JsonSetter("three_ds_skip_enabled")
    public void setThreeDsSkipEnabled(Boolean threeDsSkipEnabled) {
        this.threeDsSkipEnabled = threeDsSkipEnabled;
    }

    /**
     * Getter for ThreeDsPhoneNumberRequired.
     * Whether a phone number is required when running 3-D Secure.
     * @return Returns the Boolean
     */
    @JsonGetter("three_ds_phone_number_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getThreeDsPhoneNumberRequired() {
        return threeDsPhoneNumberRequired;
    }

    /**
     * Setter for ThreeDsPhoneNumberRequired.
     * Whether a phone number is required when running 3-D Secure.
     * @param threeDsPhoneNumberRequired Value for Boolean
     */
    @JsonSetter("three_ds_phone_number_required")
    public void setThreeDsPhoneNumberRequired(Boolean threeDsPhoneNumberRequired) {
        this.threeDsPhoneNumberRequired = threeDsPhoneNumberRequired;
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
     * Converts this CheckoutCardConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CheckoutCardConfiguration [" + "enabled=" + enabled + ", debitEnabled="
                + debitEnabled + ", prepaidEnabled=" + prepaidEnabled
                + ", debitAuthorizationEnabled=" + debitAuthorizationEnabled
                + ", prepaidAuthorizationEnabled=" + prepaidAuthorizationEnabled
                + ", onlyDirectCurrency=" + onlyDirectCurrency + ", forbiddenCardBrands="
                + forbiddenCardBrands + ", allowedCountriesByIp=" + allowedCountriesByIp
                + ", foreignCardsAllowed=" + foreignCardsAllowed + ", failOnNewEmail="
                + failOnNewEmail + ", cardLimit=" + cardLimit + ", allowEmptyCvv=" + allowEmptyCvv
                + ", allowDirectTokenCreation=" + allowDirectTokenCreation + ", threeDsRequired="
                + threeDsRequired + ", threeDsAddressRequired=" + threeDsAddressRequired
                + ", threeDsSkipEnabled=" + threeDsSkipEnabled + ", threeDsPhoneNumberRequired="
                + threeDsPhoneNumberRequired + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link CheckoutCardConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CheckoutCardConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled())
                .debitEnabled(getDebitEnabled())
                .prepaidEnabled(getPrepaidEnabled())
                .debitAuthorizationEnabled(getDebitAuthorizationEnabled())
                .prepaidAuthorizationEnabled(getPrepaidAuthorizationEnabled())
                .onlyDirectCurrency(getOnlyDirectCurrency())
                .foreignCardsAllowed(getForeignCardsAllowed())
                .allowDirectTokenCreation(getAllowDirectTokenCreation())
                .threeDsRequired(getThreeDsRequired())
                .threeDsAddressRequired(getThreeDsAddressRequired())
                .threeDsSkipEnabled(getThreeDsSkipEnabled())
                .threeDsPhoneNumberRequired(getThreeDsPhoneNumberRequired());
        builder.forbiddenCardBrands = internalGetForbiddenCardBrands();
        builder.allowedCountriesByIp = internalGetAllowedCountriesByIp();
        builder.failOnNewEmail = internalGetFailOnNewEmail();
        builder.cardLimit = internalGetCardLimit();
        builder.allowEmptyCvv = internalGetAllowEmptyCvv();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CheckoutCardConfiguration}.
     */
    public static class Builder {
        private Boolean enabled;
        private Boolean debitEnabled;
        private Boolean prepaidEnabled;
        private Boolean debitAuthorizationEnabled;
        private Boolean prepaidAuthorizationEnabled;
        private Boolean onlyDirectCurrency;
        private OptionalNullable<List<String>> forbiddenCardBrands;
        private OptionalNullable<List<String>> allowedCountriesByIp;
        private Boolean foreignCardsAllowed;
        private OptionalNullable<Boolean> failOnNewEmail;
        private OptionalNullable<CardLimit> cardLimit;
        private OptionalNullable<Boolean> allowEmptyCvv;
        private Boolean allowDirectTokenCreation;
        private Boolean threeDsRequired;
        private Boolean threeDsAddressRequired;
        private Boolean threeDsSkipEnabled;
        private Boolean threeDsPhoneNumberRequired;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for enabled.
         * @param  enabled  Boolean value for enabled.
         * @return Builder
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * Setter for debitEnabled.
         * @param  debitEnabled  Boolean value for debitEnabled.
         * @return Builder
         */
        public Builder debitEnabled(Boolean debitEnabled) {
            this.debitEnabled = debitEnabled;
            return this;
        }

        /**
         * Setter for prepaidEnabled.
         * @param  prepaidEnabled  Boolean value for prepaidEnabled.
         * @return Builder
         */
        public Builder prepaidEnabled(Boolean prepaidEnabled) {
            this.prepaidEnabled = prepaidEnabled;
            return this;
        }

        /**
         * Setter for debitAuthorizationEnabled.
         * @param  debitAuthorizationEnabled  Boolean value for debitAuthorizationEnabled.
         * @return Builder
         */
        public Builder debitAuthorizationEnabled(Boolean debitAuthorizationEnabled) {
            this.debitAuthorizationEnabled = debitAuthorizationEnabled;
            return this;
        }

        /**
         * Setter for prepaidAuthorizationEnabled.
         * @param  prepaidAuthorizationEnabled  Boolean value for prepaidAuthorizationEnabled.
         * @return Builder
         */
        public Builder prepaidAuthorizationEnabled(Boolean prepaidAuthorizationEnabled) {
            this.prepaidAuthorizationEnabled = prepaidAuthorizationEnabled;
            return this;
        }

        /**
         * Setter for onlyDirectCurrency.
         * @param  onlyDirectCurrency  Boolean value for onlyDirectCurrency.
         * @return Builder
         */
        public Builder onlyDirectCurrency(Boolean onlyDirectCurrency) {
            this.onlyDirectCurrency = onlyDirectCurrency;
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
            this.foreignCardsAllowed = foreignCardsAllowed;
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
         * @param  cardLimit  CardLimit value for cardLimit.
         * @return Builder
         */
        public Builder cardLimit(CardLimit cardLimit) {
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
         * Setter for allowDirectTokenCreation.
         * @param  allowDirectTokenCreation  Boolean value for allowDirectTokenCreation.
         * @return Builder
         */
        public Builder allowDirectTokenCreation(Boolean allowDirectTokenCreation) {
            this.allowDirectTokenCreation = allowDirectTokenCreation;
            return this;
        }

        /**
         * Setter for threeDsRequired.
         * @param  threeDsRequired  Boolean value for threeDsRequired.
         * @return Builder
         */
        public Builder threeDsRequired(Boolean threeDsRequired) {
            this.threeDsRequired = threeDsRequired;
            return this;
        }

        /**
         * Setter for threeDsAddressRequired.
         * @param  threeDsAddressRequired  Boolean value for threeDsAddressRequired.
         * @return Builder
         */
        public Builder threeDsAddressRequired(Boolean threeDsAddressRequired) {
            this.threeDsAddressRequired = threeDsAddressRequired;
            return this;
        }

        /**
         * Setter for threeDsSkipEnabled.
         * @param  threeDsSkipEnabled  Boolean value for threeDsSkipEnabled.
         * @return Builder
         */
        public Builder threeDsSkipEnabled(Boolean threeDsSkipEnabled) {
            this.threeDsSkipEnabled = threeDsSkipEnabled;
            return this;
        }

        /**
         * Setter for threeDsPhoneNumberRequired.
         * @param  threeDsPhoneNumberRequired  Boolean value for threeDsPhoneNumberRequired.
         * @return Builder
         */
        public Builder threeDsPhoneNumberRequired(Boolean threeDsPhoneNumberRequired) {
            this.threeDsPhoneNumberRequired = threeDsPhoneNumberRequired;
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
         * Builds a new {@link CheckoutCardConfiguration} object using the set fields.
         * @return {@link CheckoutCardConfiguration}
         */
        public CheckoutCardConfiguration build() {
            CheckoutCardConfiguration model =
                    new CheckoutCardConfiguration(enabled, debitEnabled, prepaidEnabled,
                            debitAuthorizationEnabled, prepaidAuthorizationEnabled,
                            onlyDirectCurrency, forbiddenCardBrands, allowedCountriesByIp,
                            foreignCardsAllowed, failOnNewEmail, cardLimit, allowEmptyCvv,
                            allowDirectTokenCreation, threeDsRequired, threeDsAddressRequired,
                            threeDsSkipEnabled, threeDsPhoneNumberRequired);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
