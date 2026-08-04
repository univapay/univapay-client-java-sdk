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
 * RefundReasonRequest to be used.
 */
public enum RefundReasonRequest {
    DUPLICATE,

    FRAUD,

    CUSTOMER_REQUEST;

    private static TreeMap<String, RefundReasonRequest> valueMap = new TreeMap<>();
    private String value;

    static {
        DUPLICATE.value = "duplicate";
        FRAUD.value = "fraud";
        CUSTOMER_REQUEST.value = "customer_request";

        valueMap.put("duplicate", DUPLICATE);
        valueMap.put("fraud", FRAUD);
        valueMap.put("customer_request", CUSTOMER_REQUEST);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static RefundReasonRequest constructFromString(String toConvert) throws IOException {
        RefundReasonRequest enumValue = fromString(toConvert);
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
    public static RefundReasonRequest fromString(String toConvert) {
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
     * Convert list of RefundReasonRequest values to list of string values.
     * @param toConvert The list of RefundReasonRequest values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<RefundReasonRequest> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (RefundReasonRequest enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 