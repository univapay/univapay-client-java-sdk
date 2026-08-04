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
 * InstallmentPlanType to be used.
 */
public enum InstallmentPlanType {
    REVOLVING,

    FIXED_CYCLES;

    private static TreeMap<String, InstallmentPlanType> valueMap = new TreeMap<>();
    private String value;

    static {
        REVOLVING.value = "revolving";
        FIXED_CYCLES.value = "fixed_cycles";

        valueMap.put("revolving", REVOLVING);
        valueMap.put("fixed_cycles", FIXED_CYCLES);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static InstallmentPlanType constructFromString(String toConvert) throws IOException {
        InstallmentPlanType enumValue = fromString(toConvert);
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
    public static InstallmentPlanType fromString(String toConvert) {
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
     * Convert list of InstallmentPlanType values to list of string values.
     * @param toConvert The list of InstallmentPlanType values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<InstallmentPlanType> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (InstallmentPlanType enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 