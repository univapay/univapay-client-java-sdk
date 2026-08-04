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
 * This is a model class for TokenResponseCardDataThreeDs type.
 */
public class TokenResponseCardDataThreeDs {
    private Boolean enabled;
    private TokenResponseCardDataThreeDsStatus status;
    private OptionalNullable<String> redirectEndpoint;
    private OptionalNullable<UUID> redirectId;
    private Boolean exempted;
    private OptionalNullable<PaymentError> error;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public TokenResponseCardDataThreeDs() {
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  status  TokenResponseCardDataThreeDsStatus value for status.
     * @param  redirectEndpoint  String value for redirectEndpoint.
     * @param  redirectId  UUID value for redirectId.
     * @param  exempted  Boolean value for exempted.
     * @param  error  PaymentError value for error.
     */
    public TokenResponseCardDataThreeDs(
            Boolean enabled,
            TokenResponseCardDataThreeDsStatus status,
            String redirectEndpoint,
            UUID redirectId,
            Boolean exempted,
            PaymentError error) {
        this.enabled = enabled;
        this.status = status;
        this.redirectEndpoint = OptionalNullable.of(redirectEndpoint);
        this.redirectId = OptionalNullable.of(redirectId);
        this.exempted = exempted;
        this.error = OptionalNullable.of(error);
    }

    /**
     * Initialization constructor.
     * @param  enabled  Boolean value for enabled.
     * @param  status  TokenResponseCardDataThreeDsStatus value for status.
     * @param  redirectEndpoint  String value for redirectEndpoint.
     * @param  redirectId  UUID value for redirectId.
     * @param  exempted  Boolean value for exempted.
     * @param  error  PaymentError value for error.
     */

    protected TokenResponseCardDataThreeDs(Boolean enabled,
            TokenResponseCardDataThreeDsStatus status, OptionalNullable<String> redirectEndpoint,
            OptionalNullable<UUID> redirectId, Boolean exempted,
            OptionalNullable<PaymentError> error) {
        this.enabled = enabled;
        this.status = status;
        this.redirectEndpoint = redirectEndpoint;
        this.redirectId = redirectId;
        this.exempted = exempted;
        this.error = error;
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
     * Getter for Status.
     * Token Response Card Data Three Ds Status schema.
     * @return Returns the TokenResponseCardDataThreeDsStatus
     */
    @JsonGetter("status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public TokenResponseCardDataThreeDsStatus getStatus() {
        return status;
    }

    /**
     * Setter for Status.
     * Token Response Card Data Three Ds Status schema.
     * @param status Value for TokenResponseCardDataThreeDsStatus
     */
    @JsonSetter("status")
    public void setStatus(TokenResponseCardDataThreeDsStatus status) {
        this.status = status;
    }

    /**
     * Internal Getter for RedirectEndpoint.
     * Redirect endpoint URL.
     * @return Returns the Internal String
     */
    @JsonGetter("redirect_endpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetRedirectEndpoint() {
        return this.redirectEndpoint;
    }

    /**
     * Getter for RedirectEndpoint.
     * Redirect endpoint URL.
     * @return Returns the String
     */
    public String getRedirectEndpoint() {
        return OptionalNullable.getFrom(redirectEndpoint);
    }

    /**
     * Setter for RedirectEndpoint.
     * Redirect endpoint URL.
     * @param redirectEndpoint Value for String
     */
    @JsonSetter("redirect_endpoint")
    public void setRedirectEndpoint(String redirectEndpoint) {
        this.redirectEndpoint = OptionalNullable.of(redirectEndpoint);
    }

    /**
     * UnSetter for RedirectEndpoint.
     * Redirect endpoint URL.
     */
    public void unsetRedirectEndpoint() {
        redirectEndpoint = null;
    }

    /**
     * Internal Getter for RedirectId.
     * Redirect identifier.
     * @return Returns the Internal UUID
     */
    @JsonGetter("redirect_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetRedirectId() {
        return this.redirectId;
    }

    /**
     * Getter for RedirectId.
     * Redirect identifier.
     * @return Returns the UUID
     */
    public UUID getRedirectId() {
        return OptionalNullable.getFrom(redirectId);
    }

    /**
     * Setter for RedirectId.
     * Redirect identifier.
     * @param redirectId Value for UUID
     */
    @JsonSetter("redirect_id")
    public void setRedirectId(UUID redirectId) {
        this.redirectId = OptionalNullable.of(redirectId);
    }

    /**
     * UnSetter for RedirectId.
     * Redirect identifier.
     */
    public void unsetRedirectId() {
        redirectId = null;
    }

    /**
     * Getter for Exempted.
     * Indicates if the 3DS check was exempted. When creating charge 3DS check will not be required.
     * @return Returns the Boolean
     */
    @JsonGetter("exempted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getExempted() {
        return exempted;
    }

    /**
     * Setter for Exempted.
     * Indicates if the 3DS check was exempted. When creating charge 3DS check will not be required.
     * @param exempted Value for Boolean
     */
    @JsonSetter("exempted")
    public void setExempted(Boolean exempted) {
        this.exempted = exempted;
    }

    /**
     * Internal Getter for Error.
     * Payment error details, or null if successful.
     * @return Returns the Internal PaymentError
     */
    @JsonGetter("error")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<PaymentError> internalGetError() {
        return this.error;
    }

    /**
     * Getter for Error.
     * Payment error details, or null if successful.
     * @return Returns the PaymentError
     */
    public PaymentError getError() {
        return OptionalNullable.getFrom(error);
    }

    /**
     * Setter for Error.
     * Payment error details, or null if successful.
     * @param error Value for PaymentError
     */
    @JsonSetter("error")
    public void setError(PaymentError error) {
        this.error = OptionalNullable.of(error);
    }

    /**
     * UnSetter for Error.
     * Payment error details, or null if successful.
     */
    public void unsetError() {
        error = null;
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
     * Converts this TokenResponseCardDataThreeDs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TokenResponseCardDataThreeDs [" + "enabled=" + enabled + ", status=" + status
                + ", redirectEndpoint=" + redirectEndpoint + ", redirectId=" + redirectId
                + ", exempted=" + exempted + ", error=" + error + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TokenResponseCardDataThreeDs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TokenResponseCardDataThreeDs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .enabled(getEnabled())
                .status(getStatus())
                .exempted(getExempted());
        builder.redirectEndpoint = internalGetRedirectEndpoint();
        builder.redirectId = internalGetRedirectId();
        builder.error = internalGetError();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TokenResponseCardDataThreeDs}.
     */
    public static class Builder {
        private Boolean enabled;
        private TokenResponseCardDataThreeDsStatus status;
        private OptionalNullable<String> redirectEndpoint;
        private OptionalNullable<UUID> redirectId;
        private Boolean exempted;
        private OptionalNullable<PaymentError> error;
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
         * @param  status  TokenResponseCardDataThreeDsStatus value for status.
         * @return Builder
         */
        public Builder status(TokenResponseCardDataThreeDsStatus status) {
            this.status = status;
            return this;
        }

        /**
         * Setter for redirectEndpoint.
         * @param  redirectEndpoint  String value for redirectEndpoint.
         * @return Builder
         */
        public Builder redirectEndpoint(String redirectEndpoint) {
            this.redirectEndpoint = OptionalNullable.of(redirectEndpoint);
            return this;
        }

        /**
         * UnSetter for redirectEndpoint.
         * @return Builder
         */
        public Builder unsetRedirectEndpoint() {
            redirectEndpoint = null;
            return this;
        }

        /**
         * Setter for redirectId.
         * @param  redirectId  UUID value for redirectId.
         * @return Builder
         */
        public Builder redirectId(UUID redirectId) {
            this.redirectId = OptionalNullable.of(redirectId);
            return this;
        }

        /**
         * UnSetter for redirectId.
         * @return Builder
         */
        public Builder unsetRedirectId() {
            redirectId = null;
            return this;
        }

        /**
         * Setter for exempted.
         * @param  exempted  Boolean value for exempted.
         * @return Builder
         */
        public Builder exempted(Boolean exempted) {
            this.exempted = exempted;
            return this;
        }

        /**
         * Setter for error.
         * @param  error  PaymentError value for error.
         * @return Builder
         */
        public Builder error(PaymentError error) {
            this.error = OptionalNullable.of(error);
            return this;
        }

        /**
         * UnSetter for error.
         * @return Builder
         */
        public Builder unsetError() {
            error = null;
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
         * Builds a new {@link TokenResponseCardDataThreeDs} object using the set fields.
         * @return {@link TokenResponseCardDataThreeDs}
         */
        public TokenResponseCardDataThreeDs build() {
            TokenResponseCardDataThreeDs model =
                    new TokenResponseCardDataThreeDs(enabled, status, redirectEndpoint, redirectId,
                            exempted, error);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
