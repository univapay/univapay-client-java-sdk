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
import io.apimatic.core.utilities.ConversionHelper;
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for ChargeCreateRequest type.
 */
public class ChargeCreateRequest {
    private UUID transactionTokenId;
    private int amount;
    private String currency;
    private Boolean capture;
    private LocalDateTime captureAt;
    private String merchantTransactionId;
    private GenericMetadata metadata;
    private ChargeCreateRequestClientMetadata clientMetadata;
    private ChargeCreateRequestRedirect redirect;
    private ChargeCreateRequestThreeDs threeDs;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ChargeCreateRequest() {
        currency = "JPY";
        capture = true;
    }

    /**
     * Initialization constructor.
     * @param  transactionTokenId  UUID value for transactionTokenId.
     * @param  amount  int value for amount.
     * @param  currency  String value for currency.
     * @param  capture  Boolean value for capture.
     * @param  captureAt  LocalDateTime value for captureAt.
     * @param  merchantTransactionId  String value for merchantTransactionId.
     * @param  metadata  GenericMetadata value for metadata.
     * @param  clientMetadata  ChargeCreateRequestClientMetadata value for clientMetadata.
     * @param  redirect  ChargeCreateRequestRedirect value for redirect.
     * @param  threeDs  ChargeCreateRequestThreeDs value for threeDs.
     */
    public ChargeCreateRequest(
            UUID transactionTokenId,
            int amount,
            String currency,
            Boolean capture,
            LocalDateTime captureAt,
            String merchantTransactionId,
            GenericMetadata metadata,
            ChargeCreateRequestClientMetadata clientMetadata,
            ChargeCreateRequestRedirect redirect,
            ChargeCreateRequestThreeDs threeDs) {
        this.transactionTokenId = transactionTokenId;
        this.amount = amount;
        this.currency = currency;
        this.capture = capture;
        this.captureAt = captureAt;
        this.merchantTransactionId = merchantTransactionId;
        this.metadata = metadata;
        this.clientMetadata = clientMetadata;
        this.redirect = redirect;
        this.threeDs = threeDs;
    }

    /**
     * Getter for TransactionTokenId.
     * Transaction token identifier.
     * @return Returns the UUID
     */
    @JsonGetter("transaction_token_id")
    public UUID getTransactionTokenId() {
        return transactionTokenId;
    }

    /**
     * Setter for TransactionTokenId.
     * Transaction token identifier.
     * @param transactionTokenId Value for UUID
     */
    @JsonSetter("transaction_token_id")
    public void setTransactionTokenId(UUID transactionTokenId) {
        this.transactionTokenId = transactionTokenId;
    }

    /**
     * Getter for Amount.
     * The charge amount.
     * @return Returns the int
     */
    @JsonGetter("amount")
    public int getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * The charge amount.
     * @param amount Value for int
     */
    @JsonSetter("amount")
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO-4217 currency code.
     * @return Returns the String
     */
    @JsonGetter("currency")
    public String getCurrency() {
        return currency;
    }

    /**
     * Setter for Currency.
     * ISO-4217 currency code.
     * @param currency Value for String
     */
    @JsonSetter("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Getter for Capture.
     * If false, creates an Authorization only (Hold).
     * @return Returns the Boolean
     */
    @JsonGetter("capture")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getCapture() {
        return capture;
    }

    /**
     * Setter for Capture.
     * If false, creates an Authorization only (Hold).
     * @param capture Value for Boolean
     */
    @JsonSetter("capture")
    public void setCapture(Boolean capture) {
        this.capture = capture;
    }

    /**
     * Getter for CaptureAt.
     * Auto-capture date for cards, or payment deadline for Konbini/Bank. Note: Time specification
     * is ignored for 7-Eleven, Seicomart, and PayEasy.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("capture_at")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCaptureAt() {
        return captureAt;
    }

    /**
     * Setter for CaptureAt.
     * Auto-capture date for cards, or payment deadline for Konbini/Bank. Note: Time specification
     * is ignored for 7-Eleven, Seicomart, and PayEasy.
     * @param captureAt Value for LocalDateTime
     */
    @JsonSetter("capture_at")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCaptureAt(LocalDateTime captureAt) {
        this.captureAt = captureAt;
    }

    /**
     * Getter for MerchantTransactionId.
     * Unique transaction ID for the merchant. Required/used by specific brands like we_chat,
     * we_chat_mpm, and we_chat_online.
     * @return Returns the String
     */
    @JsonGetter("merchant_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMerchantTransactionId() {
        return merchantTransactionId;
    }

    /**
     * Setter for MerchantTransactionId.
     * Unique transaction ID for the merchant. Required/used by specific brands like we_chat,
     * we_chat_mpm, and we_chat_online.
     * @param merchantTransactionId Value for String
     */
    @JsonSetter("merchant_transaction_id")
    public void setMerchantTransactionId(String merchantTransactionId) {
        this.merchantTransactionId = merchantTransactionId;
    }

    /**
     * Getter for Metadata.
     * A free-form dictionary for custom metadata.
     * @return Returns the GenericMetadata
     */
    @JsonGetter("metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public GenericMetadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for Metadata.
     * A free-form dictionary for custom metadata.
     * @param metadata Value for GenericMetadata
     */
    @JsonSetter("metadata")
    public void setMetadata(GenericMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for ClientMetadata.
     * Charge Create Request Client Metadata schema.
     * @return Returns the ChargeCreateRequestClientMetadata
     */
    @JsonGetter("client_metadata")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeCreateRequestClientMetadata getClientMetadata() {
        return clientMetadata;
    }

    /**
     * Setter for ClientMetadata.
     * Charge Create Request Client Metadata schema.
     * @param clientMetadata Value for ChargeCreateRequestClientMetadata
     */
    @JsonSetter("client_metadata")
    public void setClientMetadata(ChargeCreateRequestClientMetadata clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    /**
     * Getter for Redirect.
     * Charge Create Request Redirect schema.
     * @return Returns the ChargeCreateRequestRedirect
     */
    @JsonGetter("redirect")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeCreateRequestRedirect getRedirect() {
        return redirect;
    }

    /**
     * Setter for Redirect.
     * Charge Create Request Redirect schema.
     * @param redirect Value for ChargeCreateRequestRedirect
     */
    @JsonSetter("redirect")
    public void setRedirect(ChargeCreateRequestRedirect redirect) {
        this.redirect = redirect;
    }

    /**
     * Getter for ThreeDs.
     * Charge Create Request Three Ds schema. Either supply `mode` (and optionally
     * `redirect_endpoint`) to have Univapay run 3DS, or supply all six external-MPI fields
     * (`authentication_value` through `transaction_status`) when 3DS authentication was already
     * completed outside of Univapay — in that case `mode` is set to `provided` automatically and
     * must not be sent.
     * @return Returns the ChargeCreateRequestThreeDs
     */
    @JsonGetter("three_ds")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeCreateRequestThreeDs getThreeDs() {
        return threeDs;
    }

    /**
     * Setter for ThreeDs.
     * Charge Create Request Three Ds schema. Either supply `mode` (and optionally
     * `redirect_endpoint`) to have Univapay run 3DS, or supply all six external-MPI fields
     * (`authentication_value` through `transaction_status`) when 3DS authentication was already
     * completed outside of Univapay — in that case `mode` is set to `provided` automatically and
     * must not be sent.
     * @param threeDs Value for ChargeCreateRequestThreeDs
     */
    @JsonSetter("three_ds")
    public void setThreeDs(ChargeCreateRequestThreeDs threeDs) {
        this.threeDs = threeDs;
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
     * Converts this ChargeCreateRequest into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargeCreateRequest [" + "transactionTokenId=" + transactionTokenId + ", amount="
                + amount + ", currency=" + currency + ", capture=" + capture + ", captureAt="
                + captureAt + ", merchantTransactionId=" + merchantTransactionId + ", metadata="
                + metadata + ", clientMetadata=" + clientMetadata + ", redirect=" + redirect
                + ", threeDs=" + threeDs + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ChargeCreateRequest.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargeCreateRequest.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder(transactionTokenId, amount, currency)
                .capture(getCapture())
                .captureAt(getCaptureAt())
                .merchantTransactionId(getMerchantTransactionId())
                .metadata(getMetadata())
                .clientMetadata(getClientMetadata())
                .redirect(getRedirect())
                .threeDs(getThreeDs());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ChargeCreateRequest}.
     */
    public static class Builder {
        private UUID transactionTokenId;
        private int amount;
        private String currency = "JPY";
        private Boolean capture = true;
        private LocalDateTime captureAt;
        private String merchantTransactionId;
        private GenericMetadata metadata;
        private ChargeCreateRequestClientMetadata clientMetadata;
        private ChargeCreateRequestRedirect redirect;
        private ChargeCreateRequestThreeDs threeDs;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();

        /**
         * Initialization constructor.
         */
        public Builder() {
        }

        /**
         * Initialization constructor.
         * @param  transactionTokenId  UUID value for transactionTokenId.
         * @param  amount  int value for amount.
         * @param  currency  String value for currency.
         */
        public Builder(UUID transactionTokenId, int amount, String currency) {
            this.transactionTokenId = transactionTokenId;
            this.amount = amount;
            this.currency = currency;
        }

        /**
         * Setter for transactionTokenId.
         * @param  transactionTokenId  UUID value for transactionTokenId.
         * @return Builder
         */
        public Builder transactionTokenId(UUID transactionTokenId) {
            this.transactionTokenId = transactionTokenId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  int value for amount.
         * @return Builder
         */
        public Builder amount(int amount) {
            this.amount = amount;
            return this;
        }

        /**
         * Setter for currency.
         * @param  currency  String value for currency.
         * @return Builder
         */
        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        /**
         * Setter for capture.
         * @param  capture  Boolean value for capture.
         * @return Builder
         */
        public Builder capture(Boolean capture) {
            this.capture = capture;
            return this;
        }

        /**
         * Setter for captureAt.
         * @param  captureAt  LocalDateTime value for captureAt.
         * @return Builder
         */
        public Builder captureAt(LocalDateTime captureAt) {
            this.captureAt = captureAt;
            return this;
        }

        /**
         * Setter for merchantTransactionId.
         * @param  merchantTransactionId  String value for merchantTransactionId.
         * @return Builder
         */
        public Builder merchantTransactionId(String merchantTransactionId) {
            this.merchantTransactionId = merchantTransactionId;
            return this;
        }

        /**
         * Setter for metadata.
         * @param  metadata  GenericMetadata value for metadata.
         * @return Builder
         */
        public Builder metadata(GenericMetadata metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * Setter for clientMetadata.
         * @param  clientMetadata  ChargeCreateRequestClientMetadata value for clientMetadata.
         * @return Builder
         */
        public Builder clientMetadata(ChargeCreateRequestClientMetadata clientMetadata) {
            this.clientMetadata = clientMetadata;
            return this;
        }

        /**
         * Setter for redirect.
         * @param  redirect  ChargeCreateRequestRedirect value for redirect.
         * @return Builder
         */
        public Builder redirect(ChargeCreateRequestRedirect redirect) {
            this.redirect = redirect;
            return this;
        }

        /**
         * Setter for threeDs.
         * @param  threeDs  ChargeCreateRequestThreeDs value for threeDs.
         * @return Builder
         */
        public Builder threeDs(ChargeCreateRequestThreeDs threeDs) {
            this.threeDs = threeDs;
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
         * Builds a new {@link ChargeCreateRequest} object using the set fields.
         * @return {@link ChargeCreateRequest}
         */
        public ChargeCreateRequest build() {
            ChargeCreateRequest model =
                    new ChargeCreateRequest(transactionTokenId, amount, currency, capture,
                            captureAt, merchantTransactionId, metadata, clientMetadata, redirect,
                            threeDs);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
