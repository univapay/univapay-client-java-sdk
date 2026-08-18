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
 * TransactionHistoryServiceProvider to be used.
 */
public enum TransactionHistoryServiceProvider {
    CREDIT,

    CONVENIENCE,

    BANK_TRANSFER,

    PAIDY,

    PAY_PAY,

    ALIPAY,

    WE_CHAT,

    DOCOMO,

    MERCARI,

    AU,

    RAKUTEN,

    BARTONG,

    JKOPAY,

    GINKO_PAY,

    AEON_PAY,

    EROMNET,

    TEST;

    private static TreeMap<String, TransactionHistoryServiceProvider> valueMap = new TreeMap<>();
    private String value;

    static {
        CREDIT.value = "credit";
        CONVENIENCE.value = "convenience";
        BANK_TRANSFER.value = "bank_transfer";
        PAIDY.value = "paidy";
        PAY_PAY.value = "pay_pay";
        ALIPAY.value = "alipay";
        WE_CHAT.value = "we_chat";
        DOCOMO.value = "docomo";
        MERCARI.value = "mercari";
        AU.value = "au";
        RAKUTEN.value = "rakuten";
        BARTONG.value = "bartong";
        JKOPAY.value = "jkopay";
        GINKO_PAY.value = "ginko_pay";
        AEON_PAY.value = "aeon_pay";
        EROMNET.value = "eromnet";
        TEST.value = "test";

        valueMap.put("credit", CREDIT);
        valueMap.put("convenience", CONVENIENCE);
        valueMap.put("bank_transfer", BANK_TRANSFER);
        valueMap.put("paidy", PAIDY);
        valueMap.put("pay_pay", PAY_PAY);
        valueMap.put("alipay", ALIPAY);
        valueMap.put("we_chat", WE_CHAT);
        valueMap.put("docomo", DOCOMO);
        valueMap.put("mercari", MERCARI);
        valueMap.put("au", AU);
        valueMap.put("rakuten", RAKUTEN);
        valueMap.put("bartong", BARTONG);
        valueMap.put("jkopay", JKOPAY);
        valueMap.put("ginko_pay", GINKO_PAY);
        valueMap.put("aeon_pay", AEON_PAY);
        valueMap.put("eromnet", EROMNET);
        valueMap.put("test", TEST);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static TransactionHistoryServiceProvider constructFromString(String toConvert) throws IOException {
        TransactionHistoryServiceProvider enumValue = fromString(toConvert);
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
    public static TransactionHistoryServiceProvider fromString(String toConvert) {
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
     * Convert list of TransactionHistoryServiceProvider values to list of string values.
     * @param toConvert The list of TransactionHistoryServiceProvider values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<TransactionHistoryServiceProvider> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (TransactionHistoryServiceProvider enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 