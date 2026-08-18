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
import com.univapay.api.models.TokenCreateBankTransferData;
import com.univapay.api.models.TokenCreateCardData;
import com.univapay.api.models.TokenCreateKonbiniData;
import com.univapay.api.models.TokenCreateOnlineData;
import com.univapay.api.models.TokenCreatePaidyData;
import com.univapay.api.models.TokenCreateQrMerchantData;
import com.univapay.api.models.TokenCreateQrScanData;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = TransactionTokenCreateRequestData.TransactionTokenCreateRequestDataDeserializer.class)
public abstract class TransactionTokenCreateRequestData {
    
    /**
     * This is TokenCreateCardData case.
     * @param tokenCreateCardData TokenCreateCardData value for tokenCreateCardData.
     * @return The TokenCreateCardDataCase object.
     */
    public static TransactionTokenCreateRequestData fromTokenCreateCardData(
            TokenCreateCardData tokenCreateCardData) {
        return tokenCreateCardData == null ? null : new TokenCreateCardDataCase(tokenCreateCardData);
    }

    /**
     * This is TokenCreateKonbiniData case.
     * @param tokenCreateKonbiniData TokenCreateKonbiniData value for tokenCreateKonbiniData.
     * @return The TokenCreateKonbiniDataCase object.
     */
    public static TransactionTokenCreateRequestData fromTokenCreateKonbiniData(
            TokenCreateKonbiniData tokenCreateKonbiniData) {
        return tokenCreateKonbiniData == null ? null : new TokenCreateKonbiniDataCase(tokenCreateKonbiniData);
    }

    /**
     * This is TokenCreateOnlineData case.
     * @param tokenCreateOnlineData TokenCreateOnlineData value for tokenCreateOnlineData.
     * @return The TokenCreateOnlineDataCase object.
     */
    public static TransactionTokenCreateRequestData fromTokenCreateOnlineData(
            TokenCreateOnlineData tokenCreateOnlineData) {
        return tokenCreateOnlineData == null ? null : new TokenCreateOnlineDataCase(tokenCreateOnlineData);
    }

    /**
     * This is TokenCreateBankTransferData case.
     * @param tokenCreateBankTransferData TokenCreateBankTransferData value for tokenCreateBankTransferData.
     * @return The TokenCreateBankTransferDataCase object.
     */
    public static TransactionTokenCreateRequestData fromTokenCreateBankTransferData(
            TokenCreateBankTransferData tokenCreateBankTransferData) {
        return tokenCreateBankTransferData == null ? null : new TokenCreateBankTransferDataCase(tokenCreateBankTransferData);
    }

    /**
     * This is TokenCreatePaidyData case.
     * @param tokenCreatePaidyData TokenCreatePaidyData value for tokenCreatePaidyData.
     * @return The TokenCreatePaidyDataCase object.
     */
    public static TransactionTokenCreateRequestData fromTokenCreatePaidyData(
            TokenCreatePaidyData tokenCreatePaidyData) {
        return tokenCreatePaidyData == null ? null : new TokenCreatePaidyDataCase(tokenCreatePaidyData);
    }

    /**
     * This is TokenCreateQrScanData case.
     * @param tokenCreateQrScanData TokenCreateQrScanData value for tokenCreateQrScanData.
     * @return The TokenCreateQrScanDataCase object.
     */
    public static TransactionTokenCreateRequestData fromTokenCreateQrScanData(
            TokenCreateQrScanData tokenCreateQrScanData) {
        return tokenCreateQrScanData == null ? null : new TokenCreateQrScanDataCase(tokenCreateQrScanData);
    }

    /**
     * This is TokenCreateQrMerchantData case.
     * @param tokenCreateQrMerchantData TokenCreateQrMerchantData value for tokenCreateQrMerchantData.
     * @return The TokenCreateQrMerchantDataCase object.
     */
    public static TransactionTokenCreateRequestData fromTokenCreateQrMerchantData(
            TokenCreateQrMerchantData tokenCreateQrMerchantData) {
        return tokenCreateQrMerchantData == null ? null : new TokenCreateQrMerchantDataCase(tokenCreateQrMerchantData);
    }

    /**
     * Method to match from the provided any-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The any-of type cases callback.
     * @return The any-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * This is interface for any-of cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R tokenCreateCardData(TokenCreateCardData tokenCreateCardData);

        R tokenCreateKonbiniData(TokenCreateKonbiniData tokenCreateKonbiniData);

        R tokenCreateOnlineData(TokenCreateOnlineData tokenCreateOnlineData);

        R tokenCreateBankTransferData(TokenCreateBankTransferData tokenCreateBankTransferData);

        R tokenCreatePaidyData(TokenCreatePaidyData tokenCreatePaidyData);

        R tokenCreateQrScanData(TokenCreateQrScanData tokenCreateQrScanData);

        R tokenCreateQrMerchantData(TokenCreateQrMerchantData tokenCreateQrMerchantData);
    }

    /**
     * This is a implementation class for TokenCreateCardDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenCreateCardData")
    private static class TokenCreateCardDataCase extends TransactionTokenCreateRequestData {

        @JsonValue
        private TokenCreateCardData tokenCreateCardData;

        TokenCreateCardDataCase(TokenCreateCardData tokenCreateCardData) {
            this.tokenCreateCardData = tokenCreateCardData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreateCardData(this.tokenCreateCardData);
        }

        @JsonCreator
        private TokenCreateCardDataCase(JsonNode jsonNode) throws IOException {
            this.tokenCreateCardData = ApiHelper.deserialize(jsonNode,
                TokenCreateCardData.class);
        }

        @Override
        public String toString() {
            return tokenCreateCardData.toString();
        }
    }

    /**
     * This is a implementation class for TokenCreateKonbiniDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenCreateKonbiniData")
    private static class TokenCreateKonbiniDataCase extends TransactionTokenCreateRequestData {

        @JsonValue
        private TokenCreateKonbiniData tokenCreateKonbiniData;

        TokenCreateKonbiniDataCase(TokenCreateKonbiniData tokenCreateKonbiniData) {
            this.tokenCreateKonbiniData = tokenCreateKonbiniData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreateKonbiniData(this.tokenCreateKonbiniData);
        }

        @JsonCreator
        private TokenCreateKonbiniDataCase(JsonNode jsonNode) throws IOException {
            this.tokenCreateKonbiniData = ApiHelper.deserialize(jsonNode,
                TokenCreateKonbiniData.class);
        }

        @Override
        public String toString() {
            return tokenCreateKonbiniData.toString();
        }
    }

    /**
     * This is a implementation class for TokenCreateOnlineDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenCreateOnlineData")
    private static class TokenCreateOnlineDataCase extends TransactionTokenCreateRequestData {

        @JsonValue
        private TokenCreateOnlineData tokenCreateOnlineData;

        TokenCreateOnlineDataCase(TokenCreateOnlineData tokenCreateOnlineData) {
            this.tokenCreateOnlineData = tokenCreateOnlineData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreateOnlineData(this.tokenCreateOnlineData);
        }

        @JsonCreator
        private TokenCreateOnlineDataCase(JsonNode jsonNode) throws IOException {
            this.tokenCreateOnlineData = ApiHelper.deserialize(jsonNode,
                TokenCreateOnlineData.class);
        }

        @Override
        public String toString() {
            return tokenCreateOnlineData.toString();
        }
    }

    /**
     * This is a implementation class for TokenCreateBankTransferDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenCreateBankTransferData")
    private static class TokenCreateBankTransferDataCase extends TransactionTokenCreateRequestData {

        @JsonValue
        private TokenCreateBankTransferData tokenCreateBankTransferData;

        TokenCreateBankTransferDataCase(TokenCreateBankTransferData tokenCreateBankTransferData) {
            this.tokenCreateBankTransferData = tokenCreateBankTransferData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreateBankTransferData(this.tokenCreateBankTransferData);
        }

        @JsonCreator
        private TokenCreateBankTransferDataCase(JsonNode jsonNode) throws IOException {
            this.tokenCreateBankTransferData = ApiHelper.deserialize(jsonNode,
                TokenCreateBankTransferData.class);
        }

        @Override
        public String toString() {
            return tokenCreateBankTransferData.toString();
        }
    }

    /**
     * This is a implementation class for TokenCreatePaidyDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenCreatePaidyData")
    private static class TokenCreatePaidyDataCase extends TransactionTokenCreateRequestData {

        @JsonValue
        private TokenCreatePaidyData tokenCreatePaidyData;

        TokenCreatePaidyDataCase(TokenCreatePaidyData tokenCreatePaidyData) {
            this.tokenCreatePaidyData = tokenCreatePaidyData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreatePaidyData(this.tokenCreatePaidyData);
        }

        @JsonCreator
        private TokenCreatePaidyDataCase(JsonNode jsonNode) throws IOException {
            this.tokenCreatePaidyData = ApiHelper.deserialize(jsonNode,
                TokenCreatePaidyData.class);
        }

        @Override
        public String toString() {
            return tokenCreatePaidyData.toString();
        }
    }

    /**
     * This is a implementation class for TokenCreateQrScanDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenCreateQrScanData")
    private static class TokenCreateQrScanDataCase extends TransactionTokenCreateRequestData {

        @JsonValue
        private TokenCreateQrScanData tokenCreateQrScanData;

        TokenCreateQrScanDataCase(TokenCreateQrScanData tokenCreateQrScanData) {
            this.tokenCreateQrScanData = tokenCreateQrScanData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreateQrScanData(this.tokenCreateQrScanData);
        }

        @JsonCreator
        private TokenCreateQrScanDataCase(JsonNode jsonNode) throws IOException {
            this.tokenCreateQrScanData = ApiHelper.deserialize(jsonNode,
                TokenCreateQrScanData.class);
        }

        @Override
        public String toString() {
            return tokenCreateQrScanData.toString();
        }
    }

    /**
     * This is a implementation class for TokenCreateQrMerchantDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenCreateQrMerchantData")
    private static class TokenCreateQrMerchantDataCase extends TransactionTokenCreateRequestData {

        @JsonValue
        private TokenCreateQrMerchantData tokenCreateQrMerchantData;

        TokenCreateQrMerchantDataCase(TokenCreateQrMerchantData tokenCreateQrMerchantData) {
            this.tokenCreateQrMerchantData = tokenCreateQrMerchantData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreateQrMerchantData(this.tokenCreateQrMerchantData);
        }

        @JsonCreator
        private TokenCreateQrMerchantDataCase(JsonNode jsonNode) throws IOException {
            this.tokenCreateQrMerchantData = ApiHelper.deserialize(jsonNode,
                TokenCreateQrMerchantData.class);
        }

        @Override
        public String toString() {
            return tokenCreateQrMerchantData.toString();
        }
    }

    /**
     * This is a custom deserializer class for TransactionTokenCreateRequestData.
     */
    protected static class TransactionTokenCreateRequestDataDeserializer
            extends JsonDeserializer<TransactionTokenCreateRequestData> {

        @Override
        public TransactionTokenCreateRequestData deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(TokenCreateCardDataCase.class,
                    TokenCreateKonbiniDataCase.class, TokenCreateOnlineDataCase.class,
                    TokenCreateBankTransferDataCase.class, TokenCreatePaidyDataCase.class,
                    TokenCreateQrScanDataCase.class, TokenCreateQrMerchantDataCase.class), false);
        }
    }

}
