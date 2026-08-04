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
import com.univapay.api.models.TokenResponseBankTransferData;
import com.univapay.api.models.TokenResponseCardData;
import com.univapay.api.models.TokenResponseKonbiniData;
import com.univapay.api.models.TokenResponseOnlineData;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a container class for any-of types.
 */
@JsonDeserialize(using = TransactionTokenData.TransactionTokenDataDeserializer.class)
public abstract class TransactionTokenData {
    
    /**
     * This is TokenResponseCardData case.
     * @param tokenResponseCardData TokenResponseCardData value for tokenResponseCardData.
     * @return The TokenResponseCardDataCase object.
     */
    public static TransactionTokenData fromTokenResponseCardData(
            TokenResponseCardData tokenResponseCardData) {
        return tokenResponseCardData == null ? null : new TokenResponseCardDataCase(tokenResponseCardData);
    }

    /**
     * This is TokenResponseKonbiniData case.
     * @param tokenResponseKonbiniData TokenResponseKonbiniData value for tokenResponseKonbiniData.
     * @return The TokenResponseKonbiniDataCase object.
     */
    public static TransactionTokenData fromTokenResponseKonbiniData(
            TokenResponseKonbiniData tokenResponseKonbiniData) {
        return tokenResponseKonbiniData == null ? null : new TokenResponseKonbiniDataCase(tokenResponseKonbiniData);
    }

    /**
     * This is TokenResponseOnlineData case.
     * @param tokenResponseOnlineData TokenResponseOnlineData value for tokenResponseOnlineData.
     * @return The TokenResponseOnlineDataCase object.
     */
    public static TransactionTokenData fromTokenResponseOnlineData(
            TokenResponseOnlineData tokenResponseOnlineData) {
        return tokenResponseOnlineData == null ? null : new TokenResponseOnlineDataCase(tokenResponseOnlineData);
    }

    /**
     * This is TokenResponseBankTransferData case.
     * @param tokenResponseBankTransferData TokenResponseBankTransferData value for tokenResponseBankTransferData.
     * @return The TokenResponseBankTransferDataCase object.
     */
    public static TransactionTokenData fromTokenResponseBankTransferData(
            TokenResponseBankTransferData tokenResponseBankTransferData) {
        return tokenResponseBankTransferData == null ? null : new TokenResponseBankTransferDataCase(tokenResponseBankTransferData);
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
        R tokenResponseCardData(TokenResponseCardData tokenResponseCardData);

        R tokenResponseKonbiniData(TokenResponseKonbiniData tokenResponseKonbiniData);

        R tokenResponseOnlineData(TokenResponseOnlineData tokenResponseOnlineData);

        R tokenResponseBankTransferData(TokenResponseBankTransferData tokenResponseBankTransferData);
    }

    /**
     * This is a implementation class for TokenResponseCardDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenResponseCardData")
    private static class TokenResponseCardDataCase extends TransactionTokenData {

        @JsonValue
        private TokenResponseCardData tokenResponseCardData;

        TokenResponseCardDataCase(TokenResponseCardData tokenResponseCardData) {
            this.tokenResponseCardData = tokenResponseCardData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenResponseCardData(this.tokenResponseCardData);
        }

        @JsonCreator
        private TokenResponseCardDataCase(JsonNode jsonNode) throws IOException {
            this.tokenResponseCardData = ApiHelper.deserialize(jsonNode,
                TokenResponseCardData.class);
        }

        @Override
        public String toString() {
            return tokenResponseCardData.toString();
        }
    }

    /**
     * This is a implementation class for TokenResponseKonbiniDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenResponseKonbiniData")
    private static class TokenResponseKonbiniDataCase extends TransactionTokenData {

        @JsonValue
        private TokenResponseKonbiniData tokenResponseKonbiniData;

        TokenResponseKonbiniDataCase(TokenResponseKonbiniData tokenResponseKonbiniData) {
            this.tokenResponseKonbiniData = tokenResponseKonbiniData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenResponseKonbiniData(this.tokenResponseKonbiniData);
        }

        @JsonCreator
        private TokenResponseKonbiniDataCase(JsonNode jsonNode) throws IOException {
            this.tokenResponseKonbiniData = ApiHelper.deserialize(jsonNode,
                TokenResponseKonbiniData.class);
        }

        @Override
        public String toString() {
            return tokenResponseKonbiniData.toString();
        }
    }

    /**
     * This is a implementation class for TokenResponseOnlineDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenResponseOnlineData")
    private static class TokenResponseOnlineDataCase extends TransactionTokenData {

        @JsonValue
        private TokenResponseOnlineData tokenResponseOnlineData;

        TokenResponseOnlineDataCase(TokenResponseOnlineData tokenResponseOnlineData) {
            this.tokenResponseOnlineData = tokenResponseOnlineData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenResponseOnlineData(this.tokenResponseOnlineData);
        }

        @JsonCreator
        private TokenResponseOnlineDataCase(JsonNode jsonNode) throws IOException {
            this.tokenResponseOnlineData = ApiHelper.deserialize(jsonNode,
                TokenResponseOnlineData.class);
        }

        @Override
        public String toString() {
            return tokenResponseOnlineData.toString();
        }
    }

    /**
     * This is a implementation class for TokenResponseBankTransferDataCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenResponseBankTransferData")
    private static class TokenResponseBankTransferDataCase extends TransactionTokenData {

        @JsonValue
        private TokenResponseBankTransferData tokenResponseBankTransferData;

        TokenResponseBankTransferDataCase(TokenResponseBankTransferData tokenResponseBankTransferData) {
            this.tokenResponseBankTransferData = tokenResponseBankTransferData;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenResponseBankTransferData(this.tokenResponseBankTransferData);
        }

        @JsonCreator
        private TokenResponseBankTransferDataCase(JsonNode jsonNode) throws IOException {
            this.tokenResponseBankTransferData = ApiHelper.deserialize(jsonNode,
                TokenResponseBankTransferData.class);
        }

        @Override
        public String toString() {
            return tokenResponseBankTransferData.toString();
        }
    }

    /**
     * This is a custom deserializer class for TransactionTokenData.
     */
    protected static class TransactionTokenDataDeserializer
            extends JsonDeserializer<TransactionTokenData> {

        @Override
        public TransactionTokenData deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            ObjectCodec oc = jp.getCodec();
            JsonNode node = oc.readTree(jp);
            return ApiHelper.deserialize(node, Arrays.asList(TokenResponseCardDataCase.class,
                    TokenResponseKonbiniDataCase.class, TokenResponseOnlineDataCase.class,
                    TokenResponseBankTransferDataCase.class), false);
        }
    }

}
