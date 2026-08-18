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
 * This is a model class for CardLimit type.
 */
public class CardLimit {
    private Integer amount;
    private String currency;
    private Double amountFormatted;
    private String duration;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public CardLimit() {
    }

    /**
     * Initialization constructor.
     * @param  amount  Integer value for amount.
     * @param  currency  String value for currency.
     * @param  amountFormatted  Double value for amountFormatted.
     * @param  duration  String value for duration.
     */
    public CardLimit(
            Integer amount,
            String currency,
            Double amountFormatted,
            String duration) {
        this.amount = amount;
        this.currency = currency;
        this.amountFormatted = amountFormatted;
        this.duration = duration;
    }

    /**
     * Getter for Amount.
     * Maximum amount a single card may charge within `duration`.
     * @return Returns the Integer
     */
    @JsonGetter("amount")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getAmount() {
        return amount;
    }

    /**
     * Setter for Amount.
     * Maximum amount a single card may charge within `duration`.
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
     * Limit amount formatted for display.
     * @return Returns the Double
     */
    @JsonGetter("amount_formatted")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Double getAmountFormatted() {
        return amountFormatted;
    }

    /**
     * Setter for AmountFormatted.
     * Limit amount formatted for display.
     * @param amountFormatted Value for Double
     */
    @JsonSetter("amount_formatted")
    public void setAmountFormatted(Double amountFormatted) {
        this.amountFormatted = amountFormatted;
    }

    /**
     * Getter for Duration.
     * ISO-8601 period over which the limit is evaluated (e.g. P1M).
     * @return Returns the String
     */
    @JsonGetter("duration")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDuration() {
        return duration;
    }

    /**
     * Setter for Duration.
     * ISO-8601 period over which the limit is evaluated (e.g. P1M).
     * @param duration Value for String
     */
    @JsonSetter("duration")
    public void setDuration(String duration) {
        this.duration = duration;
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
     * Converts this CardLimit into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "CardLimit [" + "amount=" + amount + ", currency=" + currency + ", amountFormatted="
                + amountFormatted + ", duration=" + duration + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link CardLimit.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link CardLimit.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .amount(getAmount())
                .currency(getCurrency())
                .amountFormatted(getAmountFormatted())
                .duration(getDuration());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link CardLimit}.
     */
    public static class Builder {
        private Integer amount;
        private String currency;
        private Double amountFormatted;
        private String duration;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



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
         * Setter for duration.
         * @param  duration  String value for duration.
         * @return Builder
         */
        public Builder duration(String duration) {
            this.duration = duration;
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
         * Builds a new {@link CardLimit} object using the set fields.
         * @return {@link CardLimit}
         */
        public CardLimit build() {
            CardLimit model =
                    new CardLimit(amount, currency, amountFormatted, duration);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
