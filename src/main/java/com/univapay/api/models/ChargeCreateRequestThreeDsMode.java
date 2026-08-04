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
 * ChargeCreateRequestThreeDsMode to be used.
 */
public enum ChargeCreateRequestThreeDsMode {
    NORMAL,

    REQUIRE,

    FORCE,

    SKIP;

    private static TreeMap<String, ChargeCreateRequestThreeDsMode> valueMap = new TreeMap<>();
    private String value;

    static {
        NORMAL.value = "normal";
        REQUIRE.value = "require";
        FORCE.value = "force";
        SKIP.value = "skip";

        valueMap.put("normal", NORMAL);
        valueMap.put("require", REQUIRE);
        valueMap.put("force", FORCE);
        valueMap.put("skip", SKIP);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static ChargeCreateRequestThreeDsMode constructFromString(String toConvert) throws IOException {
        ChargeCreateRequestThreeDsMode enumValue = fromString(toConvert);
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
    public static ChargeCreateRequestThreeDsMode fromString(String toConvert) {
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
     * Convert list of ChargeCreateRequestThreeDsMode values to list of string values.
     * @param toConvert The list of ChargeCreateRequestThreeDsMode values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<ChargeCreateRequestThreeDsMode> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (ChargeCreateRequestThreeDsMode enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 