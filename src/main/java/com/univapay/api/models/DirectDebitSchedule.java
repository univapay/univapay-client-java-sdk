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
import java.time.LocalDate;
import java.util.Map;

/**
 * This is a model class for DirectDebitSchedule type.
 */
public class DirectDebitSchedule {
    private LocalDate merchantBankAccountTransferDate;
    private LocalDate merchantBankAccountRegistrationDeadline;
    private LocalDate merchantBankTransferUploadDeadline;
    private LocalDate platformResultRegistrationDate;
    private LocalDate platformScheduledPayout;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public DirectDebitSchedule() {
    }

    /**
     * Initialization constructor.
     * @param  merchantBankAccountTransferDate  LocalDate value for merchantBankAccountTransferDate.
     * @param  merchantBankAccountRegistrationDeadline  LocalDate value for
     *         merchantBankAccountRegistrationDeadline.
     * @param  merchantBankTransferUploadDeadline  LocalDate value for
     *         merchantBankTransferUploadDeadline.
     * @param  platformResultRegistrationDate  LocalDate value for platformResultRegistrationDate.
     * @param  platformScheduledPayout  LocalDate value for platformScheduledPayout.
     */
    public DirectDebitSchedule(
            LocalDate merchantBankAccountTransferDate,
            LocalDate merchantBankAccountRegistrationDeadline,
            LocalDate merchantBankTransferUploadDeadline,
            LocalDate platformResultRegistrationDate,
            LocalDate platformScheduledPayout) {
        this.merchantBankAccountTransferDate = merchantBankAccountTransferDate;
        this.merchantBankAccountRegistrationDeadline = merchantBankAccountRegistrationDeadline;
        this.merchantBankTransferUploadDeadline = merchantBankTransferUploadDeadline;
        this.platformResultRegistrationDate = platformResultRegistrationDate;
        this.platformScheduledPayout = platformScheduledPayout;
    }

    /**
     * Getter for MerchantBankAccountTransferDate.
     * The date funds are pulled from consumer accounts (指定振替日).
     * @return Returns the LocalDate
     */
    @JsonGetter("merchant_bank_account_transfer_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getMerchantBankAccountTransferDate() {
        return merchantBankAccountTransferDate;
    }

    /**
     * Setter for MerchantBankAccountTransferDate.
     * The date funds are pulled from consumer accounts (指定振替日).
     * @param merchantBankAccountTransferDate Value for LocalDate
     */
    @JsonSetter("merchant_bank_account_transfer_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setMerchantBankAccountTransferDate(LocalDate merchantBankAccountTransferDate) {
        this.merchantBankAccountTransferDate = merchantBankAccountTransferDate;
    }

    /**
     * Getter for MerchantBankAccountRegistrationDeadline.
     * The date by which the bank must receive the signed direct debit mandate (振替依頼書到着期限).
     * @return Returns the LocalDate
     */
    @JsonGetter("merchant_bank_account_registration_deadline")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getMerchantBankAccountRegistrationDeadline() {
        return merchantBankAccountRegistrationDeadline;
    }

    /**
     * Setter for MerchantBankAccountRegistrationDeadline.
     * The date by which the bank must receive the signed direct debit mandate (振替依頼書到着期限).
     * @param merchantBankAccountRegistrationDeadline Value for LocalDate
     */
    @JsonSetter("merchant_bank_account_registration_deadline")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setMerchantBankAccountRegistrationDeadline(LocalDate merchantBankAccountRegistrationDeadline) {
        this.merchantBankAccountRegistrationDeadline = merchantBankAccountRegistrationDeadline;
    }

    /**
     * Getter for MerchantBankTransferUploadDeadline.
     * The last date transfers can be registered or edited for this cycle (振替データアップロード期限). After
     * this, transfers lock.
     * @return Returns the LocalDate
     */
    @JsonGetter("merchant_bank_transfer_upload_deadline")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getMerchantBankTransferUploadDeadline() {
        return merchantBankTransferUploadDeadline;
    }

    /**
     * Setter for MerchantBankTransferUploadDeadline.
     * The last date transfers can be registered or edited for this cycle (振替データアップロード期限). After
     * this, transfers lock.
     * @param merchantBankTransferUploadDeadline Value for LocalDate
     */
    @JsonSetter("merchant_bank_transfer_upload_deadline")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setMerchantBankTransferUploadDeadline(LocalDate merchantBankTransferUploadDeadline) {
        this.merchantBankTransferUploadDeadline = merchantBankTransferUploadDeadline;
    }

    /**
     * Getter for PlatformResultRegistrationDate.
     * The date transfer results are reflected on the platform (振替結果反映日).
     * @return Returns the LocalDate
     */
    @JsonGetter("platform_result_registration_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getPlatformResultRegistrationDate() {
        return platformResultRegistrationDate;
    }

    /**
     * Setter for PlatformResultRegistrationDate.
     * The date transfer results are reflected on the platform (振替結果反映日).
     * @param platformResultRegistrationDate Value for LocalDate
     */
    @JsonSetter("platform_result_registration_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setPlatformResultRegistrationDate(LocalDate platformResultRegistrationDate) {
        this.platformResultRegistrationDate = platformResultRegistrationDate;
    }

    /**
     * Getter for PlatformScheduledPayout.
     * The date collected funds are paid out to the merchant (支払日).
     * @return Returns the LocalDate
     */
    @JsonGetter("platform_scheduled_payout")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getPlatformScheduledPayout() {
        return platformScheduledPayout;
    }

    /**
     * Setter for PlatformScheduledPayout.
     * The date collected funds are paid out to the merchant (支払日).
     * @param platformScheduledPayout Value for LocalDate
     */
    @JsonSetter("platform_scheduled_payout")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setPlatformScheduledPayout(LocalDate platformScheduledPayout) {
        this.platformScheduledPayout = platformScheduledPayout;
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
     * Converts this DirectDebitSchedule into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "DirectDebitSchedule [" + "merchantBankAccountTransferDate="
                + merchantBankAccountTransferDate + ", merchantBankAccountRegistrationDeadline="
                + merchantBankAccountRegistrationDeadline + ", merchantBankTransferUploadDeadline="
                + merchantBankTransferUploadDeadline + ", platformResultRegistrationDate="
                + platformResultRegistrationDate + ", platformScheduledPayout="
                + platformScheduledPayout + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link DirectDebitSchedule.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link DirectDebitSchedule.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .merchantBankAccountTransferDate(getMerchantBankAccountTransferDate())
                .merchantBankAccountRegistrationDeadline(getMerchantBankAccountRegistrationDeadline())
                .merchantBankTransferUploadDeadline(getMerchantBankTransferUploadDeadline())
                .platformResultRegistrationDate(getPlatformResultRegistrationDate())
                .platformScheduledPayout(getPlatformScheduledPayout());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link DirectDebitSchedule}.
     */
    public static class Builder {
        private LocalDate merchantBankAccountTransferDate;
        private LocalDate merchantBankAccountRegistrationDeadline;
        private LocalDate merchantBankTransferUploadDeadline;
        private LocalDate platformResultRegistrationDate;
        private LocalDate platformScheduledPayout;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for merchantBankAccountTransferDate.
         * @param  merchantBankAccountTransferDate  LocalDate value for
         *         merchantBankAccountTransferDate.
         * @return Builder
         */
        public Builder merchantBankAccountTransferDate(
                LocalDate merchantBankAccountTransferDate) {
            this.merchantBankAccountTransferDate = merchantBankAccountTransferDate;
            return this;
        }

        /**
         * Setter for merchantBankAccountRegistrationDeadline.
         * @param  merchantBankAccountRegistrationDeadline  LocalDate value for
         *         merchantBankAccountRegistrationDeadline.
         * @return Builder
         */
        public Builder merchantBankAccountRegistrationDeadline(
                LocalDate merchantBankAccountRegistrationDeadline) {
            this.merchantBankAccountRegistrationDeadline = merchantBankAccountRegistrationDeadline;
            return this;
        }

        /**
         * Setter for merchantBankTransferUploadDeadline.
         * @param  merchantBankTransferUploadDeadline  LocalDate value for
         *         merchantBankTransferUploadDeadline.
         * @return Builder
         */
        public Builder merchantBankTransferUploadDeadline(
                LocalDate merchantBankTransferUploadDeadline) {
            this.merchantBankTransferUploadDeadline = merchantBankTransferUploadDeadline;
            return this;
        }

        /**
         * Setter for platformResultRegistrationDate.
         * @param  platformResultRegistrationDate  LocalDate value for
         *         platformResultRegistrationDate.
         * @return Builder
         */
        public Builder platformResultRegistrationDate(LocalDate platformResultRegistrationDate) {
            this.platformResultRegistrationDate = platformResultRegistrationDate;
            return this;
        }

        /**
         * Setter for platformScheduledPayout.
         * @param  platformScheduledPayout  LocalDate value for platformScheduledPayout.
         * @return Builder
         */
        public Builder platformScheduledPayout(LocalDate platformScheduledPayout) {
            this.platformScheduledPayout = platformScheduledPayout;
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
         * Builds a new {@link DirectDebitSchedule} object using the set fields.
         * @return {@link DirectDebitSchedule}
         */
        public DirectDebitSchedule build() {
            DirectDebitSchedule model =
                    new DirectDebitSchedule(merchantBankAccountTransferDate,
                            merchantBankAccountRegistrationDeadline,
                            merchantBankTransferUploadDeadline, platformResultRegistrationDate,
                            platformScheduledPayout);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
