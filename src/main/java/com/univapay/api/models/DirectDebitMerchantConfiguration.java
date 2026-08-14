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
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for DirectDebitMerchantConfiguration type.
 */
public class DirectDebitMerchantConfiguration {
    private String legacyId;
    private Boolean enabled;
    private DirectDebitDebitDate debitDate;
    private String consignorCode;
    private String classifier;
    private String signature;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitMerchantConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  legacyId  String value for legacyId.
     * @param  enabled  Boolean value for enabled.
     * @param  debitDate  DirectDebitDebitDate value for debitDate.
     * @param  consignorCode  String value for consignorCode.
     * @param  classifier  String value for classifier.
     * @param  signature  String value for signature.
     */
    public DirectDebitMerchantConfiguration(
            String legacyId,
            Boolean enabled,
            DirectDebitDebitDate debitDate,
            String consignorCode,
            String classifier,
            String signature) {
        this.legacyId = legacyId;
        this.enabled = enabled;
        this.debitDate = debitDate;
        this.consignorCode = consignorCode;
        this.classifier = classifier;
        this.signature = signature;
    }

    /**
     * Getter for LegacyId.
     * Identifier of the merchant in the legacy direct debit system.
     * @return Returns the String
     */
    @JsonGetter("legacy_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getLegacyId() {
        return legacyId;
    }

    /**
     * Setter for LegacyId.
     * Identifier of the merchant in the legacy direct debit system.
     * @param legacyId Value for String
     */
    @JsonSetter("legacy_id")
    public void setLegacyId(String legacyId) {
        this.legacyId = legacyId;
    }

    /**
     * Getter for Enabled.
     * Whether direct debit is enabled for this merchant.
     * @return Returns the Boolean
     */
    @JsonGetter("enabled")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * Setter for Enabled.
     * Whether direct debit is enabled for this merchant.
     * @param enabled Value for Boolean
     */
    @JsonSetter("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Getter for DebitDate.
     * Monthly debit cycle — funds are pulled on either the 14th or the 27th.
     * @return Returns the DirectDebitDebitDate
     */
    @JsonGetter("debit_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public DirectDebitDebitDate getDebitDate() {
        return debitDate;
    }

    /**
     * Setter for DebitDate.
     * Monthly debit cycle — funds are pulled on either the 14th or the 27th.
     * @param debitDate Value for DirectDebitDebitDate
     */
    @JsonSetter("debit_date")
    public void setDebitDate(DirectDebitDebitDate debitDate) {
        this.debitDate = debitDate;
    }

    /**
     * Getter for ConsignorCode.
     * Consignor code (委託者コード) assigned by the collecting bank.
     * @return Returns the String
     */
    @JsonGetter("consignor_code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getConsignorCode() {
        return consignorCode;
    }

    /**
     * Setter for ConsignorCode.
     * Consignor code (委託者コード) assigned by the collecting bank.
     * @param consignorCode Value for String
     */
    @JsonSetter("consignor_code")
    public void setConsignorCode(String consignorCode) {
        this.consignorCode = consignorCode;
    }

    /**
     * Getter for Classifier.
     * Transfer classification code (区分) agreed with the collecting bank.
     * @return Returns the String
     */
    @JsonGetter("classifier")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getClassifier() {
        return classifier;
    }

    /**
     * Setter for Classifier.
     * Transfer classification code (区分) agreed with the collecting bank.
     * @param classifier Value for String
     */
    @JsonSetter("classifier")
    public void setClassifier(String classifier) {
        this.classifier = classifier;
    }

    /**
     * Getter for Signature.
     * Name printed on the consumer's bank statement (印字名), in half-width katakana.
     * @return Returns the String
     */
    @JsonGetter("signature")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getSignature() {
        return signature;
    }

    /**
     * Setter for Signature.
     * Name printed on the consumer's bank statement (印字名), in half-width katakana.
     * @param signature Value for String
     */
    @JsonSetter("signature")
    public void setSignature(String signature) {
        this.signature = signature;
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
     * Converts this DirectDebitMerchantConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitMerchantConfiguration [" + "legacyId=" + legacyId + ", enabled="
                + enabled + ", debitDate=" + debitDate + ", consignorCode=" + consignorCode
                + ", classifier=" + classifier + ", signature=" + signature
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link DirectDebitMerchantConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitMerchantConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .legacyId(getLegacyId())
                .enabled(getEnabled())
                .debitDate(getDebitDate())
                .consignorCode(getConsignorCode())
                .classifier(getClassifier())
                .signature(getSignature());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitMerchantConfiguration}.
     */
    public static class Builder {
        private String legacyId;
        private Boolean enabled;
        private DirectDebitDebitDate debitDate;
        private String consignorCode;
        private String classifier;
        private String signature;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for legacyId.
         * @param  legacyId  String value for legacyId.
         * @return Builder
         */
        public Builder legacyId(String legacyId) {
            this.legacyId = legacyId;
            return this;
        }

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
         * Setter for debitDate.
         * @param  debitDate  DirectDebitDebitDate value for debitDate.
         * @return Builder
         */
        public Builder debitDate(DirectDebitDebitDate debitDate) {
            this.debitDate = debitDate;
            return this;
        }

        /**
         * Setter for consignorCode.
         * @param  consignorCode  String value for consignorCode.
         * @return Builder
         */
        public Builder consignorCode(String consignorCode) {
            this.consignorCode = consignorCode;
            return this;
        }

        /**
         * Setter for classifier.
         * @param  classifier  String value for classifier.
         * @return Builder
         */
        public Builder classifier(String classifier) {
            this.classifier = classifier;
            return this;
        }

        /**
         * Setter for signature.
         * @param  signature  String value for signature.
         * @return Builder
         */
        public Builder signature(String signature) {
            this.signature = signature;
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
         * Builds a new {@link DirectDebitMerchantConfiguration} object using the set fields.
         * @return {@link DirectDebitMerchantConfiguration}
         */
        public DirectDebitMerchantConfiguration build() {
            DirectDebitMerchantConfiguration model =
                    new DirectDebitMerchantConfiguration(legacyId, enabled, debitDate,
                            consignorCode, classifier, signature);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
