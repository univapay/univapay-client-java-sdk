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
import com.univapay.api.ApiHelper;
import com.univapay.api.models.containers.TransactionTokenCreateMetadataProps;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for TransactionTokenCreateRequestMetadata type.
 */
public class TransactionTokenCreateRequestMetadata {
    private String univapayReferenceId;
    private UUID univapayCustomerId;
    private String univapayName;
    private String univapayPhoneNumber;
    private AdditionalProperties<TransactionTokenCreateMetadataProps> additionalProperties = 
            new AdditionalProperties<TransactionTokenCreateMetadataProps>(this.getClass());

    /**
     * Default constructor.
     */
    public TransactionTokenCreateRequestMetadata() {
    }

    /**
     * Initialization constructor.
     * @param  univapayReferenceId  String value for univapayReferenceId.
     * @param  univapayCustomerId  UUID value for univapayCustomerId.
     * @param  univapayName  String value for univapayName.
     * @param  univapayPhoneNumber  String value for univapayPhoneNumber.
     */
    public TransactionTokenCreateRequestMetadata(
            String univapayReferenceId,
            UUID univapayCustomerId,
            String univapayName,
            String univapayPhoneNumber) {
        this.univapayReferenceId = univapayReferenceId;
        this.univapayCustomerId = univapayCustomerId;
        this.univapayName = univapayName;
        this.univapayPhoneNumber = univapayPhoneNumber;
    }

    /**
     * Getter for UnivapayReferenceId.
     * Any arbitrary value (Free format).
     * @return Returns the String
     */
    @JsonGetter("univapay-reference-id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnivapayReferenceId() {
        return univapayReferenceId;
    }

    /**
     * Setter for UnivapayReferenceId.
     * Any arbitrary value (Free format).
     * @param univapayReferenceId Value for String
     */
    @JsonSetter("univapay-reference-id")
    public void setUnivapayReferenceId(String univapayReferenceId) {
        this.univapayReferenceId = univapayReferenceId;
    }

    /**
     * Getter for UnivapayCustomerId.
     * Customer ID.
     * @return Returns the UUID
     */
    @JsonGetter("univapay-customer-id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getUnivapayCustomerId() {
        return univapayCustomerId;
    }

    /**
     * Setter for UnivapayCustomerId.
     * Customer ID.
     * @param univapayCustomerId Value for UUID
     */
    @JsonSetter("univapay-customer-id")
    public void setUnivapayCustomerId(UUID univapayCustomerId) {
        this.univapayCustomerId = univapayCustomerId;
    }

    /**
     * Getter for UnivapayName.
     * Consumer name passed to payment processors that require it (e.g., konbini, bank transfer).
     * @return Returns the String
     */
    @JsonGetter("univapay-name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnivapayName() {
        return univapayName;
    }

    /**
     * Setter for UnivapayName.
     * Consumer name passed to payment processors that require it (e.g., konbini, bank transfer).
     * @param univapayName Value for String
     */
    @JsonSetter("univapay-name")
    public void setUnivapayName(String univapayName) {
        this.univapayName = univapayName;
    }

    /**
     * Getter for UnivapayPhoneNumber.
     * Consumer phone number passed to payment processors that require it.
     * @return Returns the String
     */
    @JsonGetter("univapay-phone-number")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getUnivapayPhoneNumber() {
        return univapayPhoneNumber;
    }

    /**
     * Setter for UnivapayPhoneNumber.
     * Consumer phone number passed to payment processors that require it.
     * @param univapayPhoneNumber Value for String
     */
    @JsonSetter("univapay-phone-number")
    public void setUnivapayPhoneNumber(String univapayPhoneNumber) {
        this.univapayPhoneNumber = univapayPhoneNumber;
    }

    /**
     * Hidden method for the serialization of additional properties.
     * @return The map of additionally set properties.
     */
    @JsonAnyGetter
    private Map<String, TransactionTokenCreateMetadataProps> getAdditionalProperties() {
        return additionalProperties.getAdditionalProperties();
    }

    /**
     * Hidden method for the de-serialization of additional properties.
     * @param name The name of the additional property.
     * @param value The TransactionTokenCreateMetadataProps value of the additional property.
     */
    @JsonAnySetter
    private void setAdditionalProperties(String name, Object value) {
        additionalProperties.setAdditionalProperty(name,
                ConversionHelper.convertToSimpleType(value,
                        x -> ApiHelper.tryDeserialize(ApiHelper.trySerialize(x),
                                TransactionTokenCreateMetadataProps.class)),
                true);
    }

    /**
     * Getter for the value of additional properties based on provided property name.
     * @param name The name of the additional property.
     * @return Either the TransactionTokenCreateMetadataProps property value or null if not exist.
     */
    
    public TransactionTokenCreateMetadataProps getAdditionalProperty(String name) {
        return additionalProperties.getAdditionalProperty(name);
    }

    /**
     * Converts this TransactionTokenCreateRequestMetadata into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "TransactionTokenCreateRequestMetadata [" + "univapayReferenceId="
                + univapayReferenceId + ", univapayCustomerId=" + univapayCustomerId
                + ", univapayName=" + univapayName + ", univapayPhoneNumber=" + univapayPhoneNumber
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link TransactionTokenCreateRequestMetadata.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link TransactionTokenCreateRequestMetadata.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .univapayReferenceId(getUnivapayReferenceId())
                .univapayCustomerId(getUnivapayCustomerId())
                .univapayName(getUnivapayName())
                .univapayPhoneNumber(getUnivapayPhoneNumber());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link TransactionTokenCreateRequestMetadata}.
     */
    public static class Builder {
        private String univapayReferenceId;
        private UUID univapayCustomerId;
        private String univapayName;
        private String univapayPhoneNumber;
        private AdditionalProperties<TransactionTokenCreateMetadataProps> additionalProperties =
                new AdditionalProperties<TransactionTokenCreateMetadataProps>();



        /**
         * Setter for univapayReferenceId.
         * @param  univapayReferenceId  String value for univapayReferenceId.
         * @return Builder
         */
        public Builder univapayReferenceId(String univapayReferenceId) {
            this.univapayReferenceId = univapayReferenceId;
            return this;
        }

        /**
         * Setter for univapayCustomerId.
         * @param  univapayCustomerId  UUID value for univapayCustomerId.
         * @return Builder
         */
        public Builder univapayCustomerId(UUID univapayCustomerId) {
            this.univapayCustomerId = univapayCustomerId;
            return this;
        }

        /**
         * Setter for univapayName.
         * @param  univapayName  String value for univapayName.
         * @return Builder
         */
        public Builder univapayName(String univapayName) {
            this.univapayName = univapayName;
            return this;
        }

        /**
         * Setter for univapayPhoneNumber.
         * @param  univapayPhoneNumber  String value for univapayPhoneNumber.
         * @return Builder
         */
        public Builder univapayPhoneNumber(String univapayPhoneNumber) {
            this.univapayPhoneNumber = univapayPhoneNumber;
            return this;
        }

        /**
         * Setter for additional property that are not in model fields.
         * @param name The name of the additional property.
         * @param value The TransactionTokenCreateMetadataProps value of the additional property.
         * @return Builder.
         */
        public Builder additionalProperty(String name,
                TransactionTokenCreateMetadataProps value) {
            this.additionalProperties.setAdditionalProperty(name, value);
            return this;
        }

        /**
         * Builds a new {@link TransactionTokenCreateRequestMetadata} object using the set fields.
         * @return {@link TransactionTokenCreateRequestMetadata}
         */
        public TransactionTokenCreateRequestMetadata build() {
            TransactionTokenCreateRequestMetadata model =
                    new TransactionTokenCreateRequestMetadata(univapayReferenceId,
                            univapayCustomerId, univapayName, univapayPhoneNumber);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
