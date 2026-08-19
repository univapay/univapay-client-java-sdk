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
 * This is a model class for SubscriptionThreeDs type.
 */
public class SubscriptionThreeDs {
    private OptionalNullable<SubscriptionThreeDsMode> mode;
    private OptionalNullable<String> redirectEndpoint;
    private OptionalNullable<UUID> redirectId;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionThreeDs() {
    }

    /**
     * Initialization constructor.
     * @param  mode  SubscriptionThreeDsMode value for mode.
     * @param  redirectEndpoint  String value for redirectEndpoint.
     * @param  redirectId  UUID value for redirectId.
     */
    public SubscriptionThreeDs(
            SubscriptionThreeDsMode mode,
            String redirectEndpoint,
            UUID redirectId) {
        this.mode = OptionalNullable.of(mode);
        this.redirectEndpoint = OptionalNullable.of(redirectEndpoint);
        this.redirectId = OptionalNullable.of(redirectId);
    }

    /**
     * Initialization constructor.
     * @param  mode  SubscriptionThreeDsMode value for mode.
     * @param  redirectEndpoint  String value for redirectEndpoint.
     * @param  redirectId  UUID value for redirectId.
     */

    protected SubscriptionThreeDs(OptionalNullable<SubscriptionThreeDsMode> mode,
            OptionalNullable<String> redirectEndpoint, OptionalNullable<UUID> redirectId) {
        this.mode = mode;
        this.redirectEndpoint = redirectEndpoint;
        this.redirectId = redirectId;
    }

    /**
     * Internal Getter for Mode.
     * 3-D Secure authentication mode applied to the subscription's payments. `if_available`
     * enforces 3DS only if credentials are available for the recurring token and it has not already
     * completed 3DS. `provided` indicates externally supplied MPI authentication data was used.
     * @return Returns the Internal SubscriptionThreeDsMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<SubscriptionThreeDsMode> internalGetMode() {
        return this.mode;
    }

    /**
     * Getter for Mode.
     * 3-D Secure authentication mode applied to the subscription's payments. `if_available`
     * enforces 3DS only if credentials are available for the recurring token and it has not already
     * completed 3DS. `provided` indicates externally supplied MPI authentication data was used.
     * @return Returns the SubscriptionThreeDsMode
     */
    public SubscriptionThreeDsMode getMode() {
        return OptionalNullable.getFrom(mode);
    }

    /**
     * Setter for Mode.
     * 3-D Secure authentication mode applied to the subscription's payments. `if_available`
     * enforces 3DS only if credentials are available for the recurring token and it has not already
     * completed 3DS. `provided` indicates externally supplied MPI authentication data was used.
     * @param mode Value for SubscriptionThreeDsMode
     */
    @JsonSetter("mode")
    public void setMode(SubscriptionThreeDsMode mode) {
        this.mode = OptionalNullable.of(mode);
    }

    /**
     * UnSetter for Mode.
     * 3-D Secure authentication mode applied to the subscription's payments. `if_available`
     * enforces 3DS only if credentials are available for the recurring token and it has not already
     * completed 3DS. `provided` indicates externally supplied MPI authentication data was used.
     */
    public void unsetMode() {
        mode = null;
    }

    /**
     * Internal Getter for RedirectEndpoint.
     * URL the customer is redirected to for 3-D Secure authentication.
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
     * URL the customer is redirected to for 3-D Secure authentication.
     * @return Returns the String
     */
    public String getRedirectEndpoint() {
        return OptionalNullable.getFrom(redirectEndpoint);
    }

    /**
     * Setter for RedirectEndpoint.
     * URL the customer is redirected to for 3-D Secure authentication.
     * @param redirectEndpoint Value for String
     */
    @JsonSetter("redirect_endpoint")
    public void setRedirectEndpoint(String redirectEndpoint) {
        this.redirectEndpoint = OptionalNullable.of(redirectEndpoint);
    }

    /**
     * UnSetter for RedirectEndpoint.
     * URL the customer is redirected to for 3-D Secure authentication.
     */
    public void unsetRedirectEndpoint() {
        redirectEndpoint = null;
    }

    /**
     * Internal Getter for RedirectId.
     * Identifier of the 3-D Secure redirect.
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
     * Identifier of the 3-D Secure redirect.
     * @return Returns the UUID
     */
    public UUID getRedirectId() {
        return OptionalNullable.getFrom(redirectId);
    }

    /**
     * Setter for RedirectId.
     * Identifier of the 3-D Secure redirect.
     * @param redirectId Value for UUID
     */
    @JsonSetter("redirect_id")
    public void setRedirectId(UUID redirectId) {
        this.redirectId = OptionalNullable.of(redirectId);
    }

    /**
     * UnSetter for RedirectId.
     * Identifier of the 3-D Secure redirect.
     */
    public void unsetRedirectId() {
        redirectId = null;
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
     * Converts this SubscriptionThreeDs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionThreeDs [" + "mode=" + mode + ", redirectEndpoint=" + redirectEndpoint
                + ", redirectId=" + redirectId + ", additionalProperties=" + additionalProperties
                + "]";
    }

    /**
     * Builds a new {@link SubscriptionThreeDs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionThreeDs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder();
        builder.mode = internalGetMode();
        builder.redirectEndpoint = internalGetRedirectEndpoint();
        builder.redirectId = internalGetRedirectId();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionThreeDs}.
     */
    public static class Builder {
        private OptionalNullable<SubscriptionThreeDsMode> mode;
        private OptionalNullable<String> redirectEndpoint;
        private OptionalNullable<UUID> redirectId;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for mode.
         * @param  mode  SubscriptionThreeDsMode value for mode.
         * @return Builder
         */
        public Builder mode(SubscriptionThreeDsMode mode) {
            this.mode = OptionalNullable.of(mode);
            return this;
        }

        /**
         * UnSetter for mode.
         * @return Builder
         */
        public Builder unsetMode() {
            mode = null;
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
         * Builds a new {@link SubscriptionThreeDs} object using the set fields.
         * @return {@link SubscriptionThreeDs}
         */
        public SubscriptionThreeDs build() {
            SubscriptionThreeDs model =
                    new SubscriptionThreeDs(mode, redirectEndpoint, redirectId);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
