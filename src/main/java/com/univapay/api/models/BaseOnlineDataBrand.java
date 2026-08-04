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
 * BaseOnlineDataBrand to be used.
 */
public enum BaseOnlineDataBrand {
    ALIPAY_ONLINE,

    ALIPAY_PLUS_ONLINE,

    PAY_PAY_ONLINE,

    WE_CHAT_ONLINE,

    D_BARAI_ONLINE;

    private static TreeMap<String, BaseOnlineDataBrand> valueMap = new TreeMap<>();
    private String value;

    static {
        ALIPAY_ONLINE.value = "alipay_online";
        ALIPAY_PLUS_ONLINE.value = "alipay_plus_online";
        PAY_PAY_ONLINE.value = "pay_pay_online";
        WE_CHAT_ONLINE.value = "we_chat_online";
        D_BARAI_ONLINE.value = "d_barai_online";

        valueMap.put("alipay_online", ALIPAY_ONLINE);
        valueMap.put("alipay_plus_online", ALIPAY_PLUS_ONLINE);
        valueMap.put("pay_pay_online", PAY_PAY_ONLINE);
        valueMap.put("we_chat_online", WE_CHAT_ONLINE);
        valueMap.put("d_barai_online", D_BARAI_ONLINE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BaseOnlineDataBrand constructFromString(String toConvert) throws IOException {
        BaseOnlineDataBrand enumValue = fromString(toConvert);
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
    public static BaseOnlineDataBrand fromString(String toConvert) {
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
     * Convert list of BaseOnlineDataBrand values to list of string values.
     * @param toConvert The list of BaseOnlineDataBrand values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BaseOnlineDataBrand> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BaseOnlineDataBrand enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 