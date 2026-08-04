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
import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

/**
 * This is a model class for SubscriptionPayment type.
 */
public class SubscriptionPayment {
    private UUID id;
    private LocalDate dueDate;
    private String zoneId;
    private Integer amount;
    private String currency;
    private Double amountFormatted;
    private Boolean isPaid;
    private Boolean isLastPayment;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public SubscriptionPayment() {
    }

    /**
     * Initialization constructor.
     * @param  id  UUID value for id.
     * @param  dueDate  LocalDate value for dueDate.
     * @param  zoneId  String value for zoneId.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  isPaid  Boolean value for isPaid.
     * @param  isLastPayment  Boolean value for isLastPayment.
     * @param  createdOn  LocalDateTime value for createdOn.
     * @param  updatedOn  LocalDateTime value for updatedOn.
     */
    public SubscriptionPayment(
            UUID id,
            LocalDate dueDate,
            String zoneId,
            Integer amount,
            String currency,
            Double amountFormatted,
            Boolean isPaid,
            Boolean isLastPayment,
            LocalDateTime createdOn,
            LocalDateTime updatedOn) {
        this.id = id;
        this.dueDate = dueDate;
        this.zoneId = zoneId;
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.isPaid = isPaid;
        this.isLastPayment = isLastPayment;
        this.createdOn = createdOn;
        this.updatedOn = updatedOn;
    }

    /**
     * Getter for Id.
     * Unique identifier.
     * @return Returns the UUID
     */
    @JsonGetter("id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public UUID getId() {
        return id;
    }

    /**
     * Setter for Id.
     * Unique identifier.
     * @param id Value for UUID
     */
    @JsonSetter("id")
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * Getter for DueDate.
     * Scheduled due date.
     * @return Returns the LocalDate
     */
    @JsonGetter("due_date")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.SimpleDateSerializer.class)
    public LocalDate getDueDate() {
        return dueDate;
    }

    /**
     * Setter for DueDate.
     * Scheduled due date.
     * @param dueDate Value for LocalDate
     */
    @JsonSetter("due_date")
    @JsonDeserialize(using = DateTimeHelper.SimpleDateDeserializer.class)
    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * Getter for ZoneId.
     * IANA Timezone ID.
     * @return Returns the String
     */
    @JsonGetter("zone_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getZoneId() {
        return zoneId;
    }

    /**
     * Setter for ZoneId.
     * IANA Timezone ID.
     * @param zoneId Value for String
     */
    @JsonSetter("zone_id")
    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * Getter for Amount.
     * Amount in the smallest currency unit.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Amount in the smallest currency unit.
     * @param amount Value for Integer
     */
    @JsonSetter("amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    /**
     * Getter for Currency.
     * ISO-4217 currency code.
     * @return Returns the String
     */
    @JsonGetter("currency")
    @JsonInclude(JsonInclude.Include.NON_NULL)
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
     * Getter for AmountFormatted.
     * Amount formatted for display.
     * @return Returns the Double
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * Amount formatted for display.
     * @param amountFormatted Value for Double
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(Double amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    /**
     * Getter for IsPaid.
     * Indicates whether this specific payment cycle has been successfully charged.
     * @return Returns the Boolean
     */
    @JsonGetter("is_paid")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsPaid() {
        return isPaid;
    }

    /**
     * Setter for IsPaid.
     * Indicates whether this specific payment cycle has been successfully charged.
     * @param isPaid Value for Boolean
     */
    @JsonSetter("is_paid")
    public void setIsPaid(Boolean isPaid) {
        this.isPaid = isPaid;
    }

    /**
     * Getter for IsLastPayment.
     * Indicates if this is the final payment in a limited-cycle subscription.
     * @return Returns the Boolean
     */
    @JsonGetter("is_last_payment")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Boolean getIsLastPayment() {
        return isLastPayment;
    }

    /**
     * Setter for IsLastPayment.
     * Indicates if this is the final payment in a limited-cycle subscription.
     * @param isLastPayment Value for Boolean
     */
    @JsonSetter("is_last_payment")
    public void setIsLastPayment(Boolean isLastPayment) {
        this.isLastPayment = isLastPayment;
    }

    /**
     * Getter for CreatedOn.
     * Timestamp when the resource was created.
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
     * Timestamp when the resource was created.
     * @param createdOn Value for LocalDateTime
     */
    @JsonSetter("created_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    /**
     * Getter for UpdatedOn.
     * Timestamp when the resource was last updated.
     * @return Returns the LocalDateTime
     */
    @JsonGetter("updated_on")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = DateTimeHelper.Rfc8601DateTimeSerializer.class)
    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    /**
     * Setter for UpdatedOn.
     * Timestamp when the resource was last updated.
     * @param updatedOn Value for LocalDateTime
     */
    @JsonSetter("updated_on")
    @JsonDeserialize(using = DateTimeHelper.Rfc8601DateTimeDeserializer.class)
    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
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
     * Converts this SubscriptionPayment into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "SubscriptionPayment [" + "id=" + id + ", dueDate=" + dueDate + ", zoneId=" + zoneId
                + ", amount=" + amount + ", currency=" + currency + ", amountFormatted="
                + amountFormatted + ", isPaid=" + isPaid + ", isLastPayment=" + isLastPayment
                + ", createdOn=" + createdOn + ", updatedOn=" + updatedOn
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link SubscriptionPayment.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link SubscriptionPayment.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .id(getId())
                .dueDate(getDueDate())
                .zoneId(getZoneId())
                .amount(getAmount())
                .currency(getCurrency())
                .amountFormatted(getAmountFormatted())
                .isPaid(getIsPaid())
                .isLastPayment(getIsLastPayment())
                .createdOn(getCreatedOn())
                .updatedOn(getUpdatedOn());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link SubscriptionPayment}.
     */
    public static class Builder {
        private UUID id;
        private LocalDate dueDate;
        private String zoneId;
        private Integer amount;
        private String currency;
        private Double amountFormatted;
        private Boolean isPaid;
        private Boolean isLastPayment;
        private LocalDateTime createdOn;
        private LocalDateTime updatedOn;
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
         * Setter for dueDate.
         * @param  dueDate  LocalDate value for dueDate.
         * @return Builder
         */
        public Builder dueDate(LocalDate dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        /**
         * Setter for zoneId.
         * @param  zoneId  String value for zoneId.
         * @return Builder
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        /**
         * Setter for amount.
         * @param  amount  Integer value for amount.
         * @return Builder
         */
        public Builder amount(Integer amount) {
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
         * Setter for amountFormatted.
         * @param  amountFormatted  Double value for amountFormatted.
         * @return Builder
         */
        public Builder amountFormatted(Double amountFormatted) {
            this.amountFormatted = amountFormatted;
            return this;
        }

        /**
         * Setter for isPaid.
         * @param  isPaid  Boolean value for isPaid.
         * @return Builder
         */
        public Builder isPaid(Boolean isPaid) {
            this.isPaid = isPaid;
            return this;
        }

        /**
         * Setter for isLastPayment.
         * @param  isLastPayment  Boolean value for isLastPayment.
         * @return Builder
         */
        public Builder isLastPayment(Boolean isLastPayment) {
            this.isLastPayment = isLastPayment;
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
         * Setter for updatedOn.
         * @param  updatedOn  LocalDateTime value for updatedOn.
         * @return Builder
         */
        public Builder updatedOn(LocalDateTime updatedOn) {
            this.updatedOn = updatedOn;
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
         * Builds a new {@link SubscriptionPayment} object using the set fields.
         * @return {@link SubscriptionPayment}
         */
        public SubscriptionPayment build() {
            SubscriptionPayment model =
                    new SubscriptionPayment(id, dueDate, zoneId, amount, currency, amountFormatted,
                            isPaid, isLastPayment, createdOn, updatedOn);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
