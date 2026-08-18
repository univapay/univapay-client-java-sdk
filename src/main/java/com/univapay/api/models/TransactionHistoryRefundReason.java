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
 * TransactionHistoryRefundReason to be used.
 */
public enum TransactionHistoryRefundReason {
    DUPLICATE,

    FRAUD,

    CUSTOMER_REQUEST,

    SYSTEM_FAILURE,

    CHARGEBACK,

    CHARGEBACK_FEE_EXEMPT,

    CHARGEBACK_REVERSE;

    private static TreeMap<String, TransactionHistoryRefundReason> valueMap = new TreeMap<>();
    private String value;

    static {
        DUPLICATE.value = "duplicate";
        FRAUD.value = "fraud";
        CUSTOMER_REQUEST.value = "customer_request";
        SYSTEM_FAILURE.value = "system_failure";
        CHARGEBACK.value = "chargeback";
        CHARGEBACK_FEE_EXEMPT.value = "chargeback_fee_exempt";
        CHARGEBACK_REVERSE.value = "chargeback_reverse";

        valueMap.put("duplicate", DUPLICATE);
        valueMap.put("fraud", FRAUD);
        valueMap.put("customer_request", CUSTOMER_REQUEST);
        valueMap.put("system_failure", SYSTEM_FAILURE);
        valueMap.put("chargeback", CHARGEBACK);
        valueMap.put("chargeback_fee_exempt", CHARGEBACK_FEE_EXEMPT);
        valueMap.put("chargeback_reverse", CHARGEBACK_REVERSE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionHistoryRefundReason constructFromString(String toConvert) throws IOException {
        TransactionHistoryRefundReason enumValue = fromString(toConvert);
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
    public static TransactionHistoryRefundReason fromString(String toConvert) {
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
     * Convert list of TransactionHistoryRefundReason values to list of string values.
     * @param toConvert The list of TransactionHistoryRefundReason values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionHistoryRefundReason> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionHistoryRefundReason enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 