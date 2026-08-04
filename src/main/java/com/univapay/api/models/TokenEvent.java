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
 * TokenEvent to be used.
 */
public enum TokenEvent {
    TOKEN_CREATED,

    TOKEN_UPDATED,

    TOKEN_THREE_D_S_UPDATED,

    TOKEN_CVV_AUTH_UPDATED,

    TOKEN_CVV_AUTH_CHECK_UPDATED,

    TOKEN_REPLACED,

    RECURRING_TOKEN_DELETED;

    private static TreeMap<String, TokenEvent> valueMap = new TreeMap<>();
    private String value;

    static {
        TOKEN_CREATED.value = "token_created";
        TOKEN_UPDATED.value = "token_updated";
        TOKEN_THREE_D_S_UPDATED.value = "token_three_d_s_updated";
        TOKEN_CVV_AUTH_UPDATED.value = "token_cvv_auth_updated";
        TOKEN_CVV_AUTH_CHECK_UPDATED.value = "token_cvv_auth_check_updated";
        TOKEN_REPLACED.value = "token_replaced";
        RECURRING_TOKEN_DELETED.value = "recurring_token_deleted";

        valueMap.put("token_created", TOKEN_CREATED);
        valueMap.put("token_updated", TOKEN_UPDATED);
        valueMap.put("token_three_d_s_updated", TOKEN_THREE_D_S_UPDATED);
        valueMap.put("token_cvv_auth_updated", TOKEN_CVV_AUTH_UPDATED);
        valueMap.put("token_cvv_auth_check_updated", TOKEN_CVV_AUTH_CHECK_UPDATED);
        valueMap.put("token_replaced", TOKEN_REPLACED);
        valueMap.put("recurring_token_deleted", RECURRING_TOKEN_DELETED);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TokenEvent constructFromString(String toConvert) throws IOException {
        TokenEvent enumValue = fromString(toConvert);
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
    public static TokenEvent fromString(String toConvert) {
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
     * Convert list of TokenEvent values to list of string values.
     * @param toConvert The list of TokenEvent values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TokenEvent> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TokenEvent enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 