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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.univapay.api.DateTimeHelper;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.types.OptionalNullable;
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for TokenResponseCardDataCvvAuthorizeCheck type.
 */
public class TokenResponseCardDataCvvAuthorizeCheck {
    private OptionalNullable<String> status;
    private OptionalNullable<UUID> chargeId;
    private OptionalNullable<LocalDateTime> date;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseCardDataCvvAuthorizeCheck() {
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  chargeId  UUID value for chargeId.
     * @param  date  LocalDateTime value for date.
     */
    public TokenResponseCardDataCvvAuthorizeCheck(
            String status,
            UUID chargeId,
            LocalDateTime date) {
        this.status = OptionalNullable.of(status);
        this.chargeId = OptionalNullable.of(chargeId);
        this.date = OptionalNullable.of(date);
    }

    /**
     * Initialization constructor.
     * @param  status  String value for status.
     * @param  chargeId  UUID value for chargeId.
     * @param  date  LocalDateTime value for date.
     */

    protected TokenResponseCardDataCvvAuthorizeCheck(OptionalNullable<String> status,
            OptionalNullable<UUID> chargeId, OptionalNullable<LocalDateTime> date) {
        this.status = status;
        this.chargeId = chargeId;
        this.date = date;
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
     * Internal Getter for Date.
     * Date value.
     * @return Returns the Internal LocalDateTime
     */
    @JsonGetter("date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Rfc8601DateTimeSerializer.class)
    protected OptionalNullable<LocalDateTime> internalGetDate() {
        return this.date;
    }

    /**
     * Getter for Date.
     * Date value.
     * @return Returns the LocalDateTime
     */
    public LocalDateTime getDate() {
        return OptionalNullable.getFrom(date);
    }

    /**
     * Setter for Date.
     * Date value.
     * @param date Value for LocalDateTime
     */
    @JsonSetter("date")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setDate(LocalDateTime date) {
        this.date = OptionalNullable.of(date);
    }

    /**
     * UnSetter for Date.
     * Date value.
     */
    public void unsetDate() {
        date = null;
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
     * Converts this TokenResponseCardDataCvvAuthorizeCheck into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseCardDataCvvAuthorizeCheck [" + "status=" + status + ", chargeId="
                + chargeId + ", date=" + date + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link TokenResponseCardDataCvvAuthorizeCheck.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseCardDataCvvAuthorizeCheck.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.status = internalGetStatus();
        builder.chargeId = internalGetChargeId();
        builder.date = internalGetDate();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseCardDataCvvAuthorizeCheck}.
     */
    public static class Builder {
        private OptionalNullable<String> status;
        private OptionalNullable<UUID> chargeId;
        private OptionalNullable<LocalDateTime> date;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for date.
         * @param  date  LocalDateTime value for date.
         * @return Builder
         */
        public Builder date(LocalDateTime date) {
            this.date = OptionalNullable.of(date);
            return this;
        }

        /**
         * UnSetter for date.
         * @return Builder
         */
        public Builder unsetDate() {
            date = null;
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
         * Builds a new {@link TokenResponseCardDataCvvAuthorizeCheck} object using the set fields.
         * @return {@link TokenResponseCardDataCvvAuthorizeCheck}
         */
        public TokenResponseCardDataCvvAuthorizeCheck build() {
            TokenResponseCardDataCvvAuthorizeCheck model =
                    new TokenResponseCardDataCvvAuthorizeCheck(status, chargeId, date);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
