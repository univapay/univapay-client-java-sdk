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
 * SubscriptionThreeDsMode to be used.
 */
public enum SubscriptionThreeDsMode {
    NORMAL,

    REQUIRE,

    FORCE,

    SKIP,

    IF_AVAILABLE,

    PROVIDED;

    private static TreeMap<String, SubscriptionThreeDsMode> valueMap = new TreeMap<>();
    private String value;

    static {
        NORMAL.value = "normal";
        REQUIRE.value = "require";
        FORCE.value = "force";
        SKIP.value = "skip";
        IF_AVAILABLE.value = "if_available";
        PROVIDED.value = "provided";

        valueMap.put("normal", NORMAL);
        valueMap.put("require", REQUIRE);
        valueMap.put("force", FORCE);
        valueMap.put("skip", SKIP);
        valueMap.put("if_available", IF_AVAILABLE);
        valueMap.put("provided", PROVIDED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static SubscriptionThreeDsMode constructFromString(String toConvert) throws IOException {
        SubscriptionThreeDsMode enumValue = fromString(toConvert);
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
    public static SubscriptionThreeDsMode fromString(String toConvert) {
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
     * Convert list of SubscriptionThreeDsMode values to list of string values.
     * @param toConvert The list of SubscriptionThreeDsMode values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<SubscriptionThreeDsMode> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (SubscriptionThreeDsMode enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 