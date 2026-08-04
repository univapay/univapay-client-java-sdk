/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models.containers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.univapay.api.ApiHelper;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorStringCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = TransactionTokenCreateMetadataProps.TransactionTokenCreateMetadataPropsDeserializer.class)
public abstract class TransactionTokenCreateMetadataProps {
    
    /**
     * This is String case.
     * @param string String value for string.
     * @return The StringCase object.
     */
    public static TransactionTokenCreateMetadataProps fromString(String string) {
        return string == null ? null : new StringCase(string);
    }

    /**
     * This is Boolean case.
     * @param mBoolean boolean value for mBoolean.
     * @return The BooleanCase object.
     */
    public static TransactionTokenCreateMetadataProps fromBoolean(boolean mBoolean) {
        return new BooleanCase(mBoolean);
    }

    /**
     * This is Precision case.
     * @param precision double value for precision.
     * @return The PrecisionCase object.
     */
    public static TransactionTokenCreateMetadataProps fromPrecision(double precision) {
        return new PrecisionCase(precision);
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for one-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R string(String string);

        R mBoolean(boolean mBoolean);

        R precision(double precision);
    }

    /**
     * This is a implementation class for StringCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorStringCase
    @TypeCombinatorCase(type = "String")
    private static class StringCase extends TransactionTokenCreateMetadataProps {

        @JsonValue
        private String string;

        StringCase(String string) {
            this.string = string;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.string(this.string);
        }

        @JsonCreator
        private StringCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isTextual()) {
                this.string = ApiHelper.deserialize(jsonNode, String.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return string.toString();
        }
    }

    /**
     * This is a implementation class for BooleanCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "boolean")
    private static class BooleanCase extends TransactionTokenCreateMetadataProps {

        @JsonValue
        private boolean mBoolean;

        BooleanCase(boolean mBoolean) {
            this.mBoolean = mBoolean;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.mBoolean(this.mBoolean);
        }

        @JsonCreator
        private BooleanCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isBoolean()) {
                this.mBoolean = ApiHelper.deserialize(jsonNode, Boolean.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(mBoolean);
        }
    }

    /**
     * This is a implementation class for PrecisionCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "double")
    private static class PrecisionCase extends TransactionTokenCreateMetadataProps {

        @JsonValue
        private double precision;

        PrecisionCase(double precision) {
            this.precision = precision;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.precision(this.precision);
        }

        @JsonCreator
        private PrecisionCase(JsonNode jsonNode) throws IOException {
            if (jsonNode.isDouble()) {
                this.precision = ApiHelper.deserialize(jsonNode, Double.class);
            } else {
                throw new IllegalArgumentException();
            }
        }

        @Override
        public String toString() {
            return String.valueOf(precision);
        }
    }

    /**
     * This is a custom deserializer class for TransactionTokenCreateMetadataProps.
     */
    protected static class TransactionTokenCreateMetadataPropsDeserializer
            extends JsonDeserializer<TransactionTokenCreateMetadataProps> {

        @Override
        public TransactionTokenCreateMetadataProps deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(StringCase.class, BooleanCase.class,
                    PrecisionCase.class), true);
        }
    }

}
