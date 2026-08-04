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
 * ChargeEvent to be used.
 */
public enum ChargeEvent {
    CHARGE_UPDATED,

    CHARGE_FINISHED;

    private static TreeMap<String, ChargeEvent> valueMap = new TreeMap<>();
    private String value;

    static {
        CHARGE_UPDATED.value = "charge_updated";
        CHARGE_FINISHED.value = "charge_finished";

        valueMap.put("charge_updated", CHARGE_UPDATED);
        valueMap.put("charge_finished", CHARGE_FINISHED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ChargeEvent constructFromString(String toConvert) throws IOException {
        ChargeEvent enumValue = fromString(toConvert);
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
    public static ChargeEvent fromString(String toConvert) {
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
     * Convert list of ChargeEvent values to list of string values.
     * @param toConvert The list of ChargeEvent values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ChargeEvent> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ChargeEvent enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 