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
 * BaseKonbiniDataConvenienceStore to be used.
 */
public enum BaseKonbiniDataConvenienceStore {
    SEVEN_ELEVEN,

    FAMILY_MART,

    LAWSON,

    MINI_STOP,

    SEICO_MART,

    PAY_EASY,

    DAILY_YAMAZAKI,

    YAMAZAKI_DAILY_STORE;

    private static TreeMap<String, BaseKonbiniDataConvenienceStore> valueMap = new TreeMap<>();
    private String value;

    static {
        SEVEN_ELEVEN.value = "seven_eleven";
        FAMILY_MART.value = "family_mart";
        LAWSON.value = "lawson";
        MINI_STOP.value = "mini_stop";
        SEICO_MART.value = "seico_mart";
        PAY_EASY.value = "pay_easy";
        DAILY_YAMAZAKI.value = "daily_yamazaki";
        YAMAZAKI_DAILY_STORE.value = "yamazaki_daily_store";

        valueMap.put("seven_eleven", SEVEN_ELEVEN);
        valueMap.put("family_mart", FAMILY_MART);
        valueMap.put("lawson", LAWSON);
        valueMap.put("mini_stop", MINI_STOP);
        valueMap.put("seico_mart", SEICO_MART);
        valueMap.put("pay_easy", PAY_EASY);
        valueMap.put("daily_yamazaki", DAILY_YAMAZAKI);
        valueMap.put("yamazaki_daily_store", YAMAZAKI_DAILY_STORE);
    }

    /**
     * Returns the enum member associated with the given string value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given string value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static BaseKonbiniDataConvenienceStore constructFromString(String toConvert) throws IOException {
        BaseKonbiniDataConvenienceStore enumValue = fromString(toConvert);
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
    public static BaseKonbiniDataConvenienceStore fromString(String toConvert) {
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
     * Convert list of BaseKonbiniDataConvenienceStore values to list of string values.
     * @param toConvert The list of BaseKonbiniDataConvenienceStore values to convert.
     * @return List of representative string values.
     */
    public static List<String> toValue(List<BaseKonbiniDataConvenienceStore> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<String> convertedValues = new ArrayList<>();
        for (BaseKonbiniDataConvenienceStore enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 