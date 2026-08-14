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
 * DirectDebitDebitDate to be used.
 */
public enum DirectDebitDebitDate {
    FOURTEEN,

    TWENTY_SEVEN;

    private static TreeMap<String, DirectDebitDebitDate> valueMap = new TreeMap<>();
    private String value;

    static {
        FOURTEEN.value = "fourteen";
        TWENTY_SEVEN.value = "twenty_seven";

        valueMap.put("fourteen", FOURTEEN);
        valueMap.put("twenty_seven", TWENTY_SEVEN);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DirectDebitDebitDate constructFromString(String toConvert) throws IOException {
        DirectDebitDebitDate enumValue = fromString(toConvert);
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
    public static DirectDebitDebitDate fromString(String toConvert) {
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
     * Convert list of DirectDebitDebitDate values to list of string values.
     * @param toConvert The list of DirectDebitDebitDate values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DirectDebitDebitDate> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DirectDebitDebitDate enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 