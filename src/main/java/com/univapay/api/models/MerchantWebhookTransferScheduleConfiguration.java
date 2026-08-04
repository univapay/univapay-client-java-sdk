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

/**
 * This is a model class for MerchantWebhookTransferScheduleConfiguration type.
 */
public class MerchantWebhookTransferScheduleConfiguration {
    private String waitPeriod;
    private String period;
    private OptionalNullable<Boolean> fullPeriodRequired;
    private OptionalNullable<String> dayOfWeek;
    private OptionalNullable<Integer> weekOfMonth;
    private OptionalNullable<Integer> dayOfMonth;
    private OptionalNullable<String> weeklyClosingDay;
    private OptionalNullable<String> weeklyPayoutDay;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public MerchantWebhookTransferScheduleConfiguration() {
    }

    /**
     * Initialization constructor.
     * @param  waitPeriod  String value for waitPeriod.
     * @param  period  String value for period.
     * @param  fullPeriodRequired  Boolean value for fullPeriodRequired.
     * @param  dayOfWeek  String value for dayOfWeek.
     * @param  weekOfMonth  Integer value for weekOfMonth.
     * @param  dayOfMonth  Integer value for dayOfMonth.
     * @param  weeklyClosingDay  String value for weeklyClosingDay.
     * @param  weeklyPayoutDay  String value for weeklyPayoutDay.
     */
    public MerchantWebhookTransferScheduleConfiguration(
            String waitPeriod,
            String period,
            Boolean fullPeriodRequired,
            String dayOfWeek,
            Integer weekOfMonth,
            Integer dayOfMonth,
            String weeklyClosingDay,
            String weeklyPayoutDay) {
        this.waitPeriod = waitPeriod;
        this.period = period;
        this.fullPeriodRequired = OptionalNullable.of(fullPeriodRequired);
        this.dayOfWeek = OptionalNullable.of(dayOfWeek);
        this.weekOfMonth = OptionalNullable.of(weekOfMonth);
        this.dayOfMonth = OptionalNullable.of(dayOfMonth);
        this.weeklyClosingDay = OptionalNullable.of(weeklyClosingDay);
        this.weeklyPayoutDay = OptionalNullable.of(weeklyPayoutDay);
    }

    /**
     * Initialization constructor.
     * @param  waitPeriod  String value for waitPeriod.
     * @param  period  String value for period.
     * @param  fullPeriodRequired  Boolean value for fullPeriodRequired.
     * @param  dayOfWeek  String value for dayOfWeek.
     * @param  weekOfMonth  Integer value for weekOfMonth.
     * @param  dayOfMonth  Integer value for dayOfMonth.
     * @param  weeklyClosingDay  String value for weeklyClosingDay.
     * @param  weeklyPayoutDay  String value for weeklyPayoutDay.
     */

    protected MerchantWebhookTransferScheduleConfiguration(String waitPeriod, String period,
            OptionalNullable<Boolean> fullPeriodRequired, OptionalNullable<String> dayOfWeek,
            OptionalNullable<Integer> weekOfMonth, OptionalNullable<Integer> dayOfMonth,
            OptionalNullable<String> weeklyClosingDay, OptionalNullable<String> weeklyPayoutDay) {
        this.waitPeriod = waitPeriod;
        this.period = period;
        this.fullPeriodRequired = fullPeriodRequired;
        this.dayOfWeek = dayOfWeek;
        this.weekOfMonth = weekOfMonth;
        this.dayOfMonth = dayOfMonth;
        this.weeklyClosingDay = weeklyClosingDay;
        this.weeklyPayoutDay = weeklyPayoutDay;
    }

    /**
     * Getter for WaitPeriod.
     * ISO-8601 period before charges become payable.
     * @return Returns the String
     */
    @JsonGetter("wait_period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getWaitPeriod() {
        return waitPeriod;
    }

    /**
     * Setter for WaitPeriod.
     * ISO-8601 period before charges become payable.
     * @param waitPeriod Value for String
     */
    @JsonSetter("wait_period")
    public void setWaitPeriod(String waitPeriod) {
        this.waitPeriod = waitPeriod;
    }

    /**
     * Getter for Period.
     * Transfer period selected for payouts.
     * @return Returns the String
     */
    @JsonGetter("period")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getPeriod() {
        return period;
    }

    /**
     * Setter for Period.
     * Transfer period selected for payouts.
     * @param period Value for String
     */
    @JsonSetter("period")
    public void setPeriod(String period) {
        this.period = period;
    }

    /**
     * Internal Getter for FullPeriodRequired.
     * Whether the first transfer period must be fully completed.
     * @return Returns the Internal Boolean
     */
    @JsonGetter("full_period_required")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Boolean> internalGetFullPeriodRequired() {
        return this.fullPeriodRequired;
    }

    /**
     * Getter for FullPeriodRequired.
     * Whether the first transfer period must be fully completed.
     * @return Returns the Boolean
     */
    public Boolean getFullPeriodRequired() {
        return OptionalNullable.getFrom(fullPeriodRequired);
    }

    /**
     * Setter for FullPeriodRequired.
     * Whether the first transfer period must be fully completed.
     * @param fullPeriodRequired Value for Boolean
     */
    @JsonSetter("full_period_required")
    public void setFullPeriodRequired(Boolean fullPeriodRequired) {
        this.fullPeriodRequired = OptionalNullable.of(fullPeriodRequired);
    }

    /**
     * UnSetter for FullPeriodRequired.
     * Whether the first transfer period must be fully completed.
     */
    public void unsetFullPeriodRequired() {
        fullPeriodRequired = null;
    }

    /**
     * Internal Getter for DayOfWeek.
     * Payout day of week when using weekly schedules.
     * @return Returns the Internal String
     */
    @JsonGetter("day_of_week")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetDayOfWeek() {
        return this.dayOfWeek;
    }

    /**
     * Getter for DayOfWeek.
     * Payout day of week when using weekly schedules.
     * @return Returns the String
     */
    public String getDayOfWeek() {
        return OptionalNullable.getFrom(dayOfWeek);
    }

    /**
     * Setter for DayOfWeek.
     * Payout day of week when using weekly schedules.
     * @param dayOfWeek Value for String
     */
    @JsonSetter("day_of_week")
    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = OptionalNullable.of(dayOfWeek);
    }

    /**
     * UnSetter for DayOfWeek.
     * Payout day of week when using weekly schedules.
     */
    public void unsetDayOfWeek() {
        dayOfWeek = null;
    }

    /**
     * Internal Getter for WeekOfMonth.
     * Week of month used by monthly schedules.
     * @return Returns the Internal Integer
     */
    @JsonGetter("week_of_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetWeekOfMonth() {
        return this.weekOfMonth;
    }

    /**
     * Getter for WeekOfMonth.
     * Week of month used by monthly schedules.
     * @return Returns the Integer
     */
    public Integer getWeekOfMonth() {
        return OptionalNullable.getFrom(weekOfMonth);
    }

    /**
     * Setter for WeekOfMonth.
     * Week of month used by monthly schedules.
     * @param weekOfMonth Value for Integer
     */
    @JsonSetter("week_of_month")
    public void setWeekOfMonth(Integer weekOfMonth) {
        this.weekOfMonth = OptionalNullable.of(weekOfMonth);
    }

    /**
     * UnSetter for WeekOfMonth.
     * Week of month used by monthly schedules.
     */
    public void unsetWeekOfMonth() {
        weekOfMonth = null;
    }

    /**
     * Internal Getter for DayOfMonth.
     * Day of month used by monthly schedules.
     * @return Returns the Internal Integer
     */
    @JsonGetter("day_of_month")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<Integer> internalGetDayOfMonth() {
        return this.dayOfMonth;
    }

    /**
     * Getter for DayOfMonth.
     * Day of month used by monthly schedules.
     * @return Returns the Integer
     */
    public Integer getDayOfMonth() {
        return OptionalNullable.getFrom(dayOfMonth);
    }

    /**
     * Setter for DayOfMonth.
     * Day of month used by monthly schedules.
     * @param dayOfMonth Value for Integer
     */
    @JsonSetter("day_of_month")
    public void setDayOfMonth(Integer dayOfMonth) {
        this.dayOfMonth = OptionalNullable.of(dayOfMonth);
    }

    /**
     * UnSetter for DayOfMonth.
     * Day of month used by monthly schedules.
     */
    public void unsetDayOfMonth() {
        dayOfMonth = null;
    }

    /**
     * Internal Getter for WeeklyClosingDay.
     * Weekly closing day for balance aggregation.
     * @return Returns the Internal String
     */
    @JsonGetter("weekly_closing_day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetWeeklyClosingDay() {
        return this.weeklyClosingDay;
    }

    /**
     * Getter for WeeklyClosingDay.
     * Weekly closing day for balance aggregation.
     * @return Returns the String
     */
    public String getWeeklyClosingDay() {
        return OptionalNullable.getFrom(weeklyClosingDay);
    }

    /**
     * Setter for WeeklyClosingDay.
     * Weekly closing day for balance aggregation.
     * @param weeklyClosingDay Value for String
     */
    @JsonSetter("weekly_closing_day")
    public void setWeeklyClosingDay(String weeklyClosingDay) {
        this.weeklyClosingDay = OptionalNullable.of(weeklyClosingDay);
    }

    /**
     * UnSetter for WeeklyClosingDay.
     * Weekly closing day for balance aggregation.
     */
    public void unsetWeeklyClosingDay() {
        weeklyClosingDay = null;
    }

    /**
     * Internal Getter for WeeklyPayoutDay.
     * Weekly payout day.
     * @return Returns the Internal String
     */
    @JsonGetter("weekly_payout_day")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = OptionalNullable.Serializer.class)
    protected OptionalNullable<String> internalGetWeeklyPayoutDay() {
        return this.weeklyPayoutDay;
    }

    /**
     * Getter for WeeklyPayoutDay.
     * Weekly payout day.
     * @return Returns the String
     */
    public String getWeeklyPayoutDay() {
        return OptionalNullable.getFrom(weeklyPayoutDay);
    }

    /**
     * Setter for WeeklyPayoutDay.
     * Weekly payout day.
     * @param weeklyPayoutDay Value for String
     */
    @JsonSetter("weekly_payout_day")
    public void setWeeklyPayoutDay(String weeklyPayoutDay) {
        this.weeklyPayoutDay = OptionalNullable.of(weeklyPayoutDay);
    }

    /**
     * UnSetter for WeeklyPayoutDay.
     * Weekly payout day.
     */
    public void unsetWeeklyPayoutDay() {
        weeklyPayoutDay = null;
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
     * Converts this MerchantWebhookTransferScheduleConfiguration into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "MerchantWebhookTransferScheduleConfiguration [" + "waitPeriod=" + waitPeriod
                + ", period=" + period + ", fullPeriodRequired=" + fullPeriodRequired
                + ", dayOfWeek=" + dayOfWeek + ", weekOfMonth=" + weekOfMonth + ", dayOfMonth="
                + dayOfMonth + ", weeklyClosingDay=" + weeklyClosingDay + ", weeklyPayoutDay="
                + weeklyPayoutDay + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link MerchantWebhookTransferScheduleConfiguration.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link MerchantWebhookTransferScheduleConfiguration.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .waitPeriod(getWaitPeriod())
                .period(getPeriod());
        builder.fullPeriodRequired = internalGetFullPeriodRequired();
        builder.dayOfWeek = internalGetDayOfWeek();
        builder.weekOfMonth = internalGetWeekOfMonth();
        builder.dayOfMonth = internalGetDayOfMonth();
        builder.weeklyClosingDay = internalGetWeeklyClosingDay();
        builder.weeklyPayoutDay = internalGetWeeklyPayoutDay();
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link MerchantWebhookTransferScheduleConfiguration}.
     */
    public static class Builder {
        private String waitPeriod;
        private String period;
        private OptionalNullable<Boolean> fullPeriodRequired;
        private OptionalNullable<String> dayOfWeek;
        private OptionalNullable<Integer> weekOfMonth;
        private OptionalNullable<Integer> dayOfMonth;
        private OptionalNullable<String> weeklyClosingDay;
        private OptionalNullable<String> weeklyPayoutDay;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for waitPeriod.
         * @param  waitPeriod  String value for waitPeriod.
         * @return Builder
         */
        public Builder waitPeriod(String waitPeriod) {
            this.waitPeriod = waitPeriod;
            return this;
        }

        /**
         * Setter for period.
         * @param  period  String value for period.
         * @return Builder
         */
        public Builder period(String period) {
            this.period = period;
            return this;
        }

        /**
         * Setter for fullPeriodRequired.
         * @param  fullPeriodRequired  Boolean value for fullPeriodRequired.
         * @return Builder
         */
        public Builder fullPeriodRequired(Boolean fullPeriodRequired) {
            this.fullPeriodRequired = OptionalNullable.of(fullPeriodRequired);
            return this;
        }

        /**
         * UnSetter for fullPeriodRequired.
         * @return Builder
         */
        public Builder unsetFullPeriodRequired() {
            fullPeriodRequired = null;
            return this;
        }

        /**
         * Setter for dayOfWeek.
         * @param  dayOfWeek  String value for dayOfWeek.
         * @return Builder
         */
        public Builder dayOfWeek(String dayOfWeek) {
            this.dayOfWeek = OptionalNullable.of(dayOfWeek);
            return this;
        }

        /**
         * UnSetter for dayOfWeek.
         * @return Builder
         */
        public Builder unsetDayOfWeek() {
            dayOfWeek = null;
            return this;
        }

        /**
         * Setter for weekOfMonth.
         * @param  weekOfMonth  Integer value for weekOfMonth.
         * @return Builder
         */
        public Builder weekOfMonth(Integer weekOfMonth) {
            this.weekOfMonth = OptionalNullable.of(weekOfMonth);
            return this;
        }

        /**
         * UnSetter for weekOfMonth.
         * @return Builder
         */
        public Builder unsetWeekOfMonth() {
            weekOfMonth = null;
            return this;
        }

        /**
         * Setter for dayOfMonth.
         * @param  dayOfMonth  Integer value for dayOfMonth.
         * @return Builder
         */
        public Builder dayOfMonth(Integer dayOfMonth) {
            this.dayOfMonth = OptionalNullable.of(dayOfMonth);
            return this;
        }

        /**
         * UnSetter for dayOfMonth.
         * @return Builder
         */
        public Builder unsetDayOfMonth() {
            dayOfMonth = null;
            return this;
        }

        /**
         * Setter for weeklyClosingDay.
         * @param  weeklyClosingDay  String value for weeklyClosingDay.
         * @return Builder
         */
        public Builder weeklyClosingDay(String weeklyClosingDay) {
            this.weeklyClosingDay = OptionalNullable.of(weeklyClosingDay);
            return this;
        }

        /**
         * UnSetter for weeklyClosingDay.
         * @return Builder
         */
        public Builder unsetWeeklyClosingDay() {
            weeklyClosingDay = null;
            return this;
        }

        /**
         * Setter for weeklyPayoutDay.
         * @param  weeklyPayoutDay  String value for weeklyPayoutDay.
         * @return Builder
         */
        public Builder weeklyPayoutDay(String weeklyPayoutDay) {
            this.weeklyPayoutDay = OptionalNullable.of(weeklyPayoutDay);
            return this;
        }

        /**
         * UnSetter for weeklyPayoutDay.
         * @return Builder
         */
        public Builder unsetWeeklyPayoutDay() {
            weeklyPayoutDay = null;
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
         * Builds a new {@link MerchantWebhookTransferScheduleConfiguration} object using the set
         * fields.
         * @return {@link MerchantWebhookTransferScheduleConfiguration}
         */
        public MerchantWebhookTransferScheduleConfiguration build() {
            MerchantWebhookTransferScheduleConfiguration model =
                    new MerchantWebhookTransferScheduleConfiguration(waitPeriod, period,
                            fullPeriodRequired, dayOfWeek, weekOfMonth, dayOfMonth,
                            weeklyClosingDay, weeklyPayoutDay);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
