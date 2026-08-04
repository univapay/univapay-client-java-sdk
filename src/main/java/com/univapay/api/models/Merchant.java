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
 * This is a model class for Merchant type.
 */
public class Merchant {
    private UUID id;
    private OptionalNullable<UUID> verificationDataId;
    private String name;
    private String email;
    private OptionalNullable<String> notificationEmail;
    private OptionalNullable<String> financeNotificationEmail;
    private Boolean verified;
    private MerchantWebhookConfiguration configuration;
    private LocalDateTime createdOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public Merchant() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  verificationDataId  UUID value for verificationDataId.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  notificationEmail  String value for notificationEmail.
     * @param  financeNotificationEmail  String value for financeNotificationEmail.
     * @param  verified  Boolean value for verified.
     * @param  configuration  MerchantWebhookConfiguration value for configuration.
     * @param  createdOn  LocalDateTime value for createdOn.
     */
    public Merchant(
            UUID id,
            UUID verificationDataId,
            String name,
            String email,
            String notificationEmail,
            String financeNotificationEmail,
            Boolean verified,
            MerchantWebhookConfiguration configuration,
            LocalDateTime createdOn) {
        this.id = id;
        this.verificationDataId = OptionalNullable.of(verificationDataId);
        this.name = name;
        this.email = email;
        this.notificationEmail = OptionalNullable.of(notificationEmail);
        this.financeNotificationEmail = OptionalNullable.of(financeNotificationEmail);
        this.verified = verified;
        this.configuration = configuration;
        this.createdOn = createdOn;
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  verificationDataId  UUID value for verificationDataId.
     * @param  name  String value for name.
     * @param  email  String value for email.
     * @param  notificationEmail  String value for notificationEmail.
     * @param  financeNotificationEmail  String value for financeNotificationEmail.
     * @param  verified  Boolean value for verified.
     * @param  configuration  MerchantWebhookConfiguration value for configuration.
     * @param  createdOn  LocalDateTime value for createdOn.
     */

    protected Merchant(UUID id, OptionalNullable<UUID> verificationDataId, String name,
            String email, OptionalNullable<String> notificationEmail,
            OptionalNullable<String> financeNotificationEmail, Boolean verified,
            MerchantWebhookConfiguration configuration, LocalDateTime createdOn) {
        this.id = id;
        this.verificationDataId = verificationDataId;
        this.name = name;
        this.email = email;
        this.notificationEmail = notificationEmail;
        this.financeNotificationEmail = financeNotificationEmail;
        this.verified = verified;
        this.configuration = configuration;
        this.createdOn = createdOn;
    }

    /**
     * Getter for Id.
     * Merchant identifier.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Merchant identifier.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Internal Getter for VerificationDataId.
     * Verification data identifier associated with the merchant.
     * @return Returns the Internal UUID
     */
    @JsonGetter("verification_data_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<UUID> internalGetVerificationDataId() {
        return this.verificationDataId;
    }

    /**
     * Getter for VerificationDataId.
     * Verification data identifier associated with the merchant.
     * @return Returns the UUID
     */
    public UUID getVerificationDataId() {
        return OptionalNullable.getFrom(verificationDataId);
    }

    /**
     * Setter for VerificationDataId.
     * Verification data identifier associated with the merchant.
     * @param verificationDataId Value for UUID
     */
    @JsonSetter("verification_data_id")
    public void setVerificationDataId(UUID verificationDataId) {
        this.verificationDataId = OptionalNullable.of(verificationDataId);
    }

    /**
     * UnSetter for VerificationDataId.
     * Verification data identifier associated with the merchant.
     */
    public void unsetVerificationDataId() {
        verificationDataId = null;
    }

    /**
     * Getter for Name.
     * Merchant display name.
     * @return Returns the String
     */
    @JsonGetter("name")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getName() {
        return name;
    }

    /**
     * Setter for Name.
     * Merchant display name.
     * @param name Value for String
     */
    @JsonSetter("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter for Email.
     * Primary merchant email address.
     * @return Returns the String
     */
    @JsonGetter("email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEmail() {
        return email;
    }

    /**
     * Setter for Email.
     * Primary merchant email address.
     * @param email Value for String
     */
    @JsonSetter("email")
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Internal Getter for NotificationEmail.
     * Merchant notification email address.
     * @return Returns the Internal String
     */
    @JsonGetter("notification_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetNotificationEmail() {
        return this.notificationEmail;
    }

    /**
     * Getter for NotificationEmail.
     * Merchant notification email address.
     * @return Returns the String
     */
    public String getNotificationEmail() {
        return OptionalNullable.getFrom(notificationEmail);
    }

    /**
     * Setter for NotificationEmail.
     * Merchant notification email address.
     * @param notificationEmail Value for String
     */
    @JsonSetter("notification_email")
    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = OptionalNullable.of(notificationEmail);
    }

    /**
     * UnSetter for NotificationEmail.
     * Merchant notification email address.
     */
    public void unsetNotificationEmail() {
        notificationEmail = null;
    }

    /**
     * Internal Getter for FinanceNotificationEmail.
     * Merchant finance notification email address.
     * @return Returns the Internal String
     */
    @JsonGetter("finance_notification_email")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetFinanceNotificationEmail() {
        return this.financeNotificationEmail;
    }

    /**
     * Getter for FinanceNotificationEmail.
     * Merchant finance notification email address.
     * @return Returns the String
     */
    public String getFinanceNotificationEmail() {
        return OptionalNullable.getFrom(financeNotificationEmail);
    }

    /**
     * Setter for FinanceNotificationEmail.
     * Merchant finance notification email address.
     * @param financeNotificationEmail Value for String
     */
    @JsonSetter("finance_notification_email")
    public void setFinanceNotificationEmail(String financeNotificationEmail) {
        this.financeNotificationEmail = OptionalNullable.of(financeNotificationEmail);
    }

    /**
     * UnSetter for FinanceNotificationEmail.
     * Merchant finance notification email address.
     */
    public void unsetFinanceNotificationEmail() {
        financeNotificationEmail = null;
    }

    /**
     * Getter for Verified.
     * Whether the merchant has completed verification.
     * @return Returns the Boolean
     */
    @JsonGetter("verified")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getVerified() {
        return verified;
    }

    /**
     * Setter for Verified.
     * Whether the merchant has completed verification.
     * @param verified Value for Boolean
     */
    @JsonSetter("verified")
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * Getter for Configuration.
     * Merchant configuration snapshot serialized by gyron-payments-api.
     * @return Returns the MerchantWebhookConfiguration
     */
    @JsonGetter("configuration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public MerchantWebhookConfiguration getConfiguration() {
        return configuration;
    }

    /**
     * Setter for Configuration.
     * Merchant configuration snapshot serialized by gyron-payments-api.
     * @param configuration Value for MerchantWebhookConfiguration
     */
    @JsonSetter("configuration")
    public void setConfiguration(MerchantWebhookConfiguration configuration) {
        this.configuration = configuration;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the merchant was created.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("created_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    /**
     * Setter for CreatedOn.
     * Timestamp when the merchant was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
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
     * Converts this Merchant into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "Merchant [" + "id=" + id + ", verificationDataId=" + verificationDataId + ", name="
                + name + ", email=" + email + ", notificationEmail=" + notificationEmail
                + ", financeNotificationEmail=" + financeNotificationEmail + ", verified="
                + verified + ", configuration=" + configuration + ", createdOn=" + createdOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link Merchant.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link Merchant.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .name(getName())
                .email(getEmail())
                .verified(getVerified())
                .configuration(getConfiguration())
                .createdOn(getCreatedOn());
        builder.verificationDataId = internalGetVerificationDataId();
        builder.notificationEmail = internalGetNotificationEmail();
        builder.financeNotificationEmail = internalGetFinanceNotificationEmail();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link Merchant}.
     */
    public static class Builder {
        private UUID id;
        private OptionalNullable<UUID> verificationDataId;
        private String name;
        private String email;
        private OptionalNullable<String> notificationEmail;
        private OptionalNullable<String> financeNotificationEmail;
        private Boolean verified;
        private MerchantWebhookConfiguration configuration;
        private LocalDateTime createdOn;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for id.
         * @param  id  UUID value for id.
         * @return Builder
         */
        public Builder id(UUID id) {
            this.id = id;
            return this;
        }

        /**
         * Setter for verificationDataId.
         * @param  verificationDataId  UUID value for verificationDataId.
         * @return Builder
         */
        public Builder verificationDataId(UUID verificationDataId) {
            this.verificationDataId = OptionalNullable.of(verificationDataId);
            return this;
        }

        /**
         * UnSetter for verificationDataId.
         * @return Builder
         */
        public Builder unsetVerificationDataId() {
            verificationDataId = null;
            return this;
        }

        /**
         * Setter for name.
         * @param  name  String value for name.
         * @return Builder
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Setter for email.
         * @param  email  String value for email.
         * @return Builder
         */
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        /**
         * Setter for notificationEmail.
         * @param  notificationEmail  String value for notificationEmail.
         * @return Builder
         */
        public Builder notificationEmail(String notificationEmail) {
            this.notificationEmail = OptionalNullable.of(notificationEmail);
            return this;
        }

        /**
         * UnSetter for notificationEmail.
         * @return Builder
         */
        public Builder unsetNotificationEmail() {
            notificationEmail = null;
            return this;
        }

        /**
         * Setter for financeNotificationEmail.
         * @param  financeNotificationEmail  String value for financeNotificationEmail.
         * @return Builder
         */
        public Builder financeNotificationEmail(String financeNotificationEmail) {
            this.financeNotificationEmail = OptionalNullable.of(financeNotificationEmail);
            return this;
        }

        /**
         * UnSetter for financeNotificationEmail.
         * @return Builder
         */
        public Builder unsetFinanceNotificationEmail() {
            financeNotificationEmail = null;
            return this;
        }

        /**
         * Setter for verified.
         * @param  verified  Boolean value for verified.
         * @return Builder
         */
        public Builder verified(Boolean verified) {
            this.verified = verified;
            return this;
        }

        /**
         * Setter for configuration.
         * @param  configuration  MerchantWebhookConfiguration value for configuration.
         * @return Builder
         */
        public Builder configuration(MerchantWebhookConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * Setter for createdOn.
         * @param  createdOn  LocalDateTime value for createdOn.
         * @return Builder
         */
        public Builder createdOn(LocalDateTime createdOn) {
            this.createdOn = createdOn;
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
         * Builds a new {@link Merchant} object using the set fields.
         * @return {@link Merchant}
         */
        public Merchant build() {
            Merchant model =
                    new Merchant(id, verificationDataId, name, email, notificationEmail,
                            financeNotificationEmail, verified, configuration, createdOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
