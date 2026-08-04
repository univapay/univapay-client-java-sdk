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
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for TokenResponseCardDataCvvAuthorize type.
 */
public class TokenResponseCardDataCvvAuthorize {
    private Boolean enabled;
    private OptionalNullable<String> status;
    private OptionalNullable<UUID> chargeId;
    private OptionalNullable<UUID> credentialsId;
    private OptionalNullable<String> currency;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseCardDataCvvAuthorize() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  status  String value for status.
     * @param  chargeId  UUID value for chargeId.
     * @param  credentialsId  UUID value for credentialsId.
     * @param  currency  String value for currency.
     */
    public TokenResponseCardDataCvvAuthorize(
            Boolean enabled,
            String status,
            UUID chargeId,
            UUID credentialsId,
            String currency) {
        this.enabled = enabled;
        this.status = OptionalNullable.of(status);
        this.chargeId = OptionalNullable.of(chargeId);
        this.credentialsId = OptionalNullable.of(credentialsId);
        this.currency = OptionalNullable.of(currency);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  status  String value for status.
     * @param  chargeId  UUID value for chargeId.
     * @param  credentialsId  UUID value for credentialsId.
     * @param  currency  String value for currency.
     */

    protected TokenResponseCardDataCvvAuthorize(Boolean enabled, OptionalNullable<String> status,
            OptionalNullable<UUID> chargeId, OptionalNullable<UUID> credentialsId,
            OptionalNullable<String> currency) {
        this.enabled = enabled;
        this.status = status;
        this.chargeId = chargeId;
        this.credentialsId = credentialsId;
        this.currency = currency;
    }

    /**
     * Getter for Enabled.
     * Enabled value.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Enabled value.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Internal Getter for Status.
     * Current status of the resource.
     * @return Returns the Internal String
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetStatus() {
        return this.status;
    }

    /**
     * Getter for Status.
     * Current status of the resource.
     * @return Returns the String
     */
    public String getStatus() {
        return OptionalNullable.getFrom(status);
    }

    /**
     * Setter for Status.
     * Current status of the resource.
     * @param status Value for String
     */
    @JsonSetter("status")
    public void setStatus(String status) {
        this.status = OptionalNullable.of(status);
    }

    /**
     * UnSetter for Status.
     * Current status of the resource.
     */
    public void unsetStatus() {
        status = null;
    }

    /**
     * Internal Getter for ChargeId.
     * Charge identifier.
     * @return Returns the Internal UUID
     */
    @JsonGetter("charge_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetChargeId() {
        return this.chargeId;
    }

    /**
     * Getter for ChargeId.
     * Charge identifier.
     * @return Returns the UUID
     */
    public UUID getChargeId() {
        return OptionalNullable.getFrom(chargeId);
    }

    /**
     * Setter for ChargeId.
     * Charge identifier.
     * @param chargeId Value for UUID
     */
    @JsonSetter("charge_id")
    public void setChargeId(UUID chargeId) {
        this.chargeId = OptionalNullable.of(chargeId);
    }

    /**
     * UnSetter for ChargeId.
     * Charge identifier.
     */
    public void unsetChargeId() {
        chargeId = null;
    }

    /**
     * Internal Getter for CredentialsId.
     * Credentials identifier.
     * @return Returns the Internal UUID
     */
    @JsonGetter("credentials_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetCredentialsId() {
        return this.credentialsId;
    }

    /**
     * Getter for CredentialsId.
     * Credentials identifier.
     * @return Returns the UUID
     */
    public UUID getCredentialsId() {
        return OptionalNullable.getFrom(credentialsId);
    }

    /**
     * Setter for CredentialsId.
     * Credentials identifier.
     * @param credentialsId Value for UUID
     */
    @JsonSetter("credentials_id")
    public void setCredentialsId(UUID credentialsId) {
        this.credentialsId = OptionalNullable.of(credentialsId);
    }

    /**
     * UnSetter for CredentialsId.
     * Credentials identifier.
     */
    public void unsetCredentialsId() {
        credentialsId = null;
    }

    /**
     * Internal Getter for Currency.
     * ISO-4217 currency code.
     * @return Returns the Internal String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetCurrency() {
        return this.currency;
    }

    /**
     * Getter for Currency.
     * ISO-4217 currency code.
     * @return Returns the String
     */
    public String getCurrency() {
        return OptionalNullable.getFrom(currency);
    }

    /**
     * Setter for Currency.
     * ISO-4217 currency code.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = OptionalNullable.of(currency);
    }

    /**
     * UnSetter for Currency.
     * ISO-4217 currency code.
     */
    public void unsetCurrency() {
        currency = null;
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
     * Converts this TokenResponseCardDataCvvAuthorize into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseCardDataCvvAuthorize [" + "enabled=" + enabled + ", status=" + status
                + ", chargeId=" + chargeId + ", credentialsId=" + credentialsId + ", currency="
                + currency + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseCardDataCvvAuthorize.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseCardDataCvvAuthorize.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled());
        builder.status = internalGetStatus();
        builder.chargeId = internalGetChargeId();
        builder.credentialsId = internalGetCredentialsId();
        builder.currency = internalGetCurrency();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseCardDataCvvAuthorize}.
     */
    public static class Builder {
        private Boolean enabled;
        private OptionalNullable<String> status;
        private OptionalNullable<UUID> chargeId;
        private OptionalNullable<UUID> credentialsId;
        private OptionalNullable<String> currency;
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
         * Setter for status.
         * @param  status  String value for status.
         * @return Builder
         */
        public Builder status(String status) {
            this.status = OptionalNullable.of(status);
            return this;
        }

        /**
         * UnSetter for status.
         * @return Builder
         */
        public Builder unsetStatus() {
            status = null;
            return this;
        }

        /**
         * Setter for chargeId.
         * @param  chargeId  UUID value for chargeId.
         * @return Builder
         */
        public Builder chargeId(UUID chargeId) {
            this.chargeId = OptionalNullable.of(chargeId);
            return this;
        }

        /**
         * UnSetter for chargeId.
         * @return Builder
         */
        public Builder unsetChargeId() {
            chargeId = null;
            return this;
        }

        /**
         * Setter for credentialsId.
         * @param  credentialsId  UUID value for credentialsId.
         * @return Builder
         */
        public Builder credentialsId(UUID credentialsId) {
            this.credentialsId = OptionalNullable.of(credentialsId);
            return this;
        }

        /**
         * UnSetter for credentialsId.
         * @return Builder
         */
        public Builder unsetCredentialsId() {
            credentialsId = null;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = OptionalNullable.of(currency);
            return this;
        }

        /**
         * UnSetter for currency.
         * @return Builder
         */
        public Builder unsetCurrency() {
            currency = null;
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
         * Builds a new {@link TokenResponseCardDataCvvAuthorize} object using the set fields.
         * @return {@link TokenResponseCardDataCvvAuthorize}
         */
        public TokenResponseCardDataCvvAuthorize build() {
            TokenResponseCardDataCvvAuthorize model =
                    new TokenResponseCardDataCvvAuthorize(enabled, status, chargeId, credentialsId,
                            currency);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
