/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * SubscriptionSimulationPeriod to be used.
 */
public enum SubscriptionSimulationPeriod {
    DAILY,

    WEEKLY,

    BIWEEKLY,

    MONTHLY,

    BIMONTHLY,

    QUARTERLY,

    SEMIANNUALLY,

    ANNUALLY;

    private static TreeMap<String, SubscriptionSimulationPeriod> valueMap = new TreeMap<>();
    private String value;

    static {
        DAILY.value = "daily";
        WEEKLY.value = "weekly";
        BIWEEKLY.value = "biweekly";
        MONTHLY.value = "monthly";
        BIMONTHLY.value = "bimonthly";
        QUARTERLY.value = "quarterly";
        SEMIANNUALLY.value = "semiannually";
        ANNUALLY.value = "annually";

        valueMap.put("daily", DAILY);
        valueMap.put("weekly", WEEKLY);
        valueMap.put("biweekly", BIWEEKLY);
        valueMap.put("monthly", MONTHLY);
        valueMap.put("bimonthly", BIMONTHLY);
        valueMap.put("quarterly", QUARTERLY);
        valueMap.put("semiannually", SEMIANNUALLY);
        valueMap.put("annually", ANNUALLY);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionSimulationPeriod constructFromString(String toConvert) throws IOException {
        SubscriptionSimulationPeriod enumValue = fromString(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     */
    public static SubscriptionSimulationPeriod fromString(String toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the string value associated with the enum member.
     * @return The string value against enum member.
     */
    @JsonValue
    public String value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of SubscriptionSimulationPeriod values to list of string values.
     * @param toConvert The list of SubscriptionSimulationPeriod values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionSimulationPeriod> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionSimulationPeriod enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 