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
 * PlanSettingsType to be used.
 */
public enum PlanSettingsType {
    FIXED_CYCLES,

    FIXED_CYCLE_AMOUNT;

    private static TreeMap<String, PlanSettingsType> valueMap = new TreeMap<>();
    private String value;

    static {
        FIXED_CYCLES.value = "fixed_cycles";
        FIXED_CYCLE_AMOUNT.value = "fixed_cycle_amount";

        valueMap.put("fixed_cycles", FIXED_CYCLES);
        valueMap.put("fixed_cycle_amount", FIXED_CYCLE_AMOUNT);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static PlanSettingsType constructFromString(String toConvert) throws IOException {
        PlanSettingsType enumValue = fromString(toConvert);
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
    public static PlanSettingsType fromString(String toConvert) {
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
     * Convert list of PlanSettingsType values to list of string values.
     * @param toConvert The list of PlanSettingsType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<PlanSettingsType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (PlanSettingsType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 