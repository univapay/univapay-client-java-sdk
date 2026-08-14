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
 * DirectDebitBankTransferError to be used.
 */
public enum DirectDebitBankTransferError {
    INSUFFICIENT_FUNDS,

    NO_DEPOSIT_TRANSACTION,

    TRANSFER_STOPPED_BY_DEPOSITOR,

    NO_ACCOUNT_TRANSFER_REQUEST,

    TRANSFER_STOPPED_BY_TRUSTEE,

    OTHER_ERROR,

    UNKNOWN_ERROR;

    private static TreeMap<String, DirectDebitBankTransferError> valueMap = new TreeMap<>();
    private String value;

    static {
        INSUFFICIENT_FUNDS.value = "insufficient_funds";
        NO_DEPOSIT_TRANSACTION.value = "no_deposit_transaction";
        TRANSFER_STOPPED_BY_DEPOSITOR.value = "transfer_stopped_by_depositor";
        NO_ACCOUNT_TRANSFER_REQUEST.value = "no_account_transfer_request";
        TRANSFER_STOPPED_BY_TRUSTEE.value = "transfer_stopped_by_trustee";
        OTHER_ERROR.value = "other_error";
        UNKNOWN_ERROR.value = "unknown_error";

        valueMap.put("insufficient_funds", INSUFFICIENT_FUNDS);
        valueMap.put("no_deposit_transaction", NO_DEPOSIT_TRANSACTION);
        valueMap.put("transfer_stopped_by_depositor", TRANSFER_STOPPED_BY_DEPOSITOR);
        valueMap.put("no_account_transfer_request", NO_ACCOUNT_TRANSFER_REQUEST);
        valueMap.put("transfer_stopped_by_trustee", TRANSFER_STOPPED_BY_TRUSTEE);
        valueMap.put("other_error", OTHER_ERROR);
        valueMap.put("unknown_error", UNKNOWN_ERROR);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static DirectDebitBankTransferError constructFromString(String toConvert) throws IOException {
        DirectDebitBankTransferError enumValue = fromString(toConvert);
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
    public static DirectDebitBankTransferError fromString(String toConvert) {
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
     * Convert list of DirectDebitBankTransferError values to list of string values.
     * @param toConvert The list of DirectDebitBankTransferError values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<DirectDebitBankTransferError> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (DirectDebitBankTransferError enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 