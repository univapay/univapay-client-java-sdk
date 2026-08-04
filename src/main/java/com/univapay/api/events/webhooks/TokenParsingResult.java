/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.events.webhooks;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.univapay.api.ApiHelper;
import com.univapay.api.models.TokenWebhookEvent;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an event class for TokenParsingResult.
 */
@JsonDeserialize(using = TokenParsingResult.TokenParsingResultDeserializer.class)
public abstract class TokenParsingResult {
    
    /**
     * Fired when a new transaction token is created. The `data` field contains the full
     * TransactionToken object.
     * @param tokenCreated TokenWebhookEvent value for tokenCreated.
     * @return The TokenCreatedCase object.
     */
    public static TokenParsingResult fromTokenCreated(TokenWebhookEvent tokenCreated) {
        return tokenCreated == null ? null : new TokenCreatedCase(tokenCreated);
    }

    /**
     * Fired when a transaction token is updated (e.g., metadata change). The `data` field contains
     * the full TransactionToken object.
     * @param tokenUpdated TokenWebhookEvent value for tokenUpdated.
     * @return The TokenUpdatedCase object.
     */
    public static TokenParsingResult fromTokenUpdated(TokenWebhookEvent tokenUpdated) {
        return tokenUpdated == null ? null : new TokenUpdatedCase(tokenUpdated);
    }

    /**
     * Fired when the 3-D Secure data associated with a token is updated. The `data` field contains
     * the full TransactionToken object.
     * @param tokenThreeDsUpdated TokenWebhookEvent value for tokenThreeDsUpdated.
     * @return The TokenThreeDsUpdatedCase object.
     */
    public static TokenParsingResult fromTokenThreeDsUpdated(
            TokenWebhookEvent tokenThreeDsUpdated) {
        return tokenThreeDsUpdated == null ? null : new TokenThreeDsUpdatedCase(tokenThreeDsUpdated);
    }

    /**
     * Fired when the CVV authorization result for a token is updated. The `data` field contains the
     * full TransactionToken object.
     * @param tokenCvvAuthUpdated TokenWebhookEvent value for tokenCvvAuthUpdated.
     * @return The TokenCvvAuthUpdatedCase object.
     */
    public static TokenParsingResult fromTokenCvvAuthUpdated(
            TokenWebhookEvent tokenCvvAuthUpdated) {
        return tokenCvvAuthUpdated == null ? null : new TokenCvvAuthUpdatedCase(tokenCvvAuthUpdated);
    }

    /**
     * Fired when the CVV auth check status for a token changes. The `data` field contains the full
     * TransactionToken object.
     * @param tokenCvvAuthCheckUpdated TokenWebhookEvent value for tokenCvvAuthCheckUpdated.
     * @return The TokenCvvAuthCheckUpdatedCase object.
     */
    public static TokenParsingResult fromTokenCvvAuthCheckUpdated(
            TokenWebhookEvent tokenCvvAuthCheckUpdated) {
        return tokenCvvAuthCheckUpdated == null ? null : new TokenCvvAuthCheckUpdatedCase(tokenCvvAuthCheckUpdated);
    }

    /**
     * Fired when a transaction token is replaced by a new token (e.g., after card update). The
     * `data` field contains the replacement TransactionToken object.
     * @param tokenReplaced TokenWebhookEvent value for tokenReplaced.
     * @return The TokenReplacedCase object.
     */
    public static TokenParsingResult fromTokenReplaced(TokenWebhookEvent tokenReplaced) {
        return tokenReplaced == null ? null : new TokenReplacedCase(tokenReplaced);
    }

    /**
     * Fired when a recurring transaction token is deleted. The `data` field contains the deleted
     * TransactionToken object.
     * @param recurringTokenDeleted TokenWebhookEvent value for recurringTokenDeleted.
     * @return The RecurringTokenDeletedCase object.
     */
    public static TokenParsingResult fromRecurringTokenDeleted(
            TokenWebhookEvent recurringTokenDeleted) {
        return recurringTokenDeleted == null ? null : new RecurringTokenDeletedCase(recurringTokenDeleted);
    }

    /**
     * Triggered when no event identified
     * @return The Unknown object.
     */
    public static TokenParsingResult markUnknown() {
        return new Unknown();
    }

    /**
     * Method to match from the provided one-of cases.
     * @param <R> The type to return after applying callback.
     * @param cases The one-of type cases callback.
     * @return The one-of matched case.
     */
    public abstract <R> R match(Cases<R> cases);

    /**
     * Method to match from the provided some-of cases (any one).
     * @param <R> The type to return after applying callback.
     * @param someCases The some-of type cases callback.
     * @return The matched case, or null if not handled.
     */
    public <R> R matchSome(SomeCases<R> someCases) {
        return match(new Cases<R>() {

            @Override
            public R tokenCreated(TokenWebhookEvent tokenCreated) {
                return someCases.tokenCreated(tokenCreated);
            }

            @Override
            public R tokenUpdated(TokenWebhookEvent tokenUpdated) {
                return someCases.tokenUpdated(tokenUpdated);
            }

            @Override
            public R tokenThreeDsUpdated(TokenWebhookEvent tokenThreeDsUpdated) {
                return someCases.tokenThreeDsUpdated(tokenThreeDsUpdated);
            }

            @Override
            public R tokenCvvAuthUpdated(TokenWebhookEvent tokenCvvAuthUpdated) {
                return someCases.tokenCvvAuthUpdated(tokenCvvAuthUpdated);
            }

            @Override
            public R tokenCvvAuthCheckUpdated(TokenWebhookEvent tokenCvvAuthCheckUpdated) {
                return someCases.tokenCvvAuthCheckUpdated(tokenCvvAuthCheckUpdated);
            }

            @Override
            public R tokenReplaced(TokenWebhookEvent tokenReplaced) {
                return someCases.tokenReplaced(tokenReplaced);
            }

            @Override
            public R recurringTokenDeleted(TokenWebhookEvent recurringTokenDeleted) {
                return someCases.recurringTokenDeleted(recurringTokenDeleted);
            }

            @Override
            public R unknown() {
                return someCases.unknown();
            }
        });
    }

    /**
     * This is interface for TokenParsingResult cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R tokenCreated(TokenWebhookEvent tokenCreated);

        R tokenUpdated(TokenWebhookEvent tokenUpdated);

        R tokenThreeDsUpdated(TokenWebhookEvent tokenThreeDsUpdated);

        R tokenCvvAuthUpdated(TokenWebhookEvent tokenCvvAuthUpdated);

        R tokenCvvAuthCheckUpdated(TokenWebhookEvent tokenCvvAuthCheckUpdated);

        R tokenReplaced(TokenWebhookEvent tokenReplaced);

        R recurringTokenDeleted(TokenWebhookEvent recurringTokenDeleted);

        R unknown();
    }

    /**
     * This is interface for some-of cases (any subset).
     * @param <R> The type to return after applying callback.
     */
    public interface SomeCases<R> {
        default R tokenCreated(TokenWebhookEvent tokenCreated) { return null; }

        default R tokenUpdated(TokenWebhookEvent tokenUpdated) { return null; }

        default R tokenThreeDsUpdated(TokenWebhookEvent tokenThreeDsUpdated) { return null; }

        default R tokenCvvAuthUpdated(TokenWebhookEvent tokenCvvAuthUpdated) { return null; }

        default R tokenCvvAuthCheckUpdated(TokenWebhookEvent tokenCvvAuthCheckUpdated) { return null; }

        default R tokenReplaced(TokenWebhookEvent tokenReplaced) { return null; }

        default R recurringTokenDeleted(TokenWebhookEvent recurringTokenDeleted) { return null; }

        default R unknown() { return null; }
    }

    /**
     * This is a implementation class for TokenCreatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenWebhookEvent")
    private static class TokenCreatedCase extends TokenParsingResult {

        @JsonValue
        private TokenWebhookEvent tokenCreated;

        TokenCreatedCase(TokenWebhookEvent tokenCreated) {
            this.tokenCreated = tokenCreated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCreated(this.tokenCreated);
        }

        @JsonCreator
        private TokenCreatedCase(JsonNode jsonNode) throws IOException {
            this.tokenCreated = ApiHelper.deserialize(jsonNode,
                TokenWebhookEvent.class);
        }

        @Override
        public String toString() {
            return tokenCreated.toString();
        }
    }

    /**
     * This is a implementation class for TokenUpdatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenWebhookEvent")
    private static class TokenUpdatedCase extends TokenParsingResult {

        @JsonValue
        private TokenWebhookEvent tokenUpdated;

        TokenUpdatedCase(TokenWebhookEvent tokenUpdated) {
            this.tokenUpdated = tokenUpdated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenUpdated(this.tokenUpdated);
        }

        @JsonCreator
        private TokenUpdatedCase(JsonNode jsonNode) throws IOException {
            this.tokenUpdated = ApiHelper.deserialize(jsonNode,
                TokenWebhookEvent.class);
        }

        @Override
        public String toString() {
            return tokenUpdated.toString();
        }
    }

    /**
     * This is a implementation class for TokenThreeDsUpdatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenWebhookEvent")
    private static class TokenThreeDsUpdatedCase extends TokenParsingResult {

        @JsonValue
        private TokenWebhookEvent tokenThreeDsUpdated;

        TokenThreeDsUpdatedCase(TokenWebhookEvent tokenThreeDsUpdated) {
            this.tokenThreeDsUpdated = tokenThreeDsUpdated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenThreeDsUpdated(this.tokenThreeDsUpdated);
        }

        @JsonCreator
        private TokenThreeDsUpdatedCase(JsonNode jsonNode) throws IOException {
            this.tokenThreeDsUpdated = ApiHelper.deserialize(jsonNode,
                TokenWebhookEvent.class);
        }

        @Override
        public String toString() {
            return tokenThreeDsUpdated.toString();
        }
    }

    /**
     * This is a implementation class for TokenCvvAuthUpdatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenWebhookEvent")
    private static class TokenCvvAuthUpdatedCase extends TokenParsingResult {

        @JsonValue
        private TokenWebhookEvent tokenCvvAuthUpdated;

        TokenCvvAuthUpdatedCase(TokenWebhookEvent tokenCvvAuthUpdated) {
            this.tokenCvvAuthUpdated = tokenCvvAuthUpdated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCvvAuthUpdated(this.tokenCvvAuthUpdated);
        }

        @JsonCreator
        private TokenCvvAuthUpdatedCase(JsonNode jsonNode) throws IOException {
            this.tokenCvvAuthUpdated = ApiHelper.deserialize(jsonNode,
                TokenWebhookEvent.class);
        }

        @Override
        public String toString() {
            return tokenCvvAuthUpdated.toString();
        }
    }

    /**
     * This is a implementation class for TokenCvvAuthCheckUpdatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenWebhookEvent")
    private static class TokenCvvAuthCheckUpdatedCase extends TokenParsingResult {

        @JsonValue
        private TokenWebhookEvent tokenCvvAuthCheckUpdated;

        TokenCvvAuthCheckUpdatedCase(TokenWebhookEvent tokenCvvAuthCheckUpdated) {
            this.tokenCvvAuthCheckUpdated = tokenCvvAuthCheckUpdated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenCvvAuthCheckUpdated(this.tokenCvvAuthCheckUpdated);
        }

        @JsonCreator
        private TokenCvvAuthCheckUpdatedCase(JsonNode jsonNode) throws IOException {
            this.tokenCvvAuthCheckUpdated = ApiHelper.deserialize(jsonNode,
                TokenWebhookEvent.class);
        }

        @Override
        public String toString() {
            return tokenCvvAuthCheckUpdated.toString();
        }
    }

    /**
     * This is a implementation class for TokenReplacedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenWebhookEvent")
    private static class TokenReplacedCase extends TokenParsingResult {

        @JsonValue
        private TokenWebhookEvent tokenReplaced;

        TokenReplacedCase(TokenWebhookEvent tokenReplaced) {
            this.tokenReplaced = tokenReplaced;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.tokenReplaced(this.tokenReplaced);
        }

        @JsonCreator
        private TokenReplacedCase(JsonNode jsonNode) throws IOException {
            this.tokenReplaced = ApiHelper.deserialize(jsonNode,
                TokenWebhookEvent.class);
        }

        @Override
        public String toString() {
            return tokenReplaced.toString();
        }
    }

    /**
     * This is a implementation class for RecurringTokenDeletedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "TokenWebhookEvent")
    private static class RecurringTokenDeletedCase extends TokenParsingResult {

        @JsonValue
        private TokenWebhookEvent recurringTokenDeleted;

        RecurringTokenDeletedCase(TokenWebhookEvent recurringTokenDeleted) {
            this.recurringTokenDeleted = recurringTokenDeleted;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.recurringTokenDeleted(this.recurringTokenDeleted);
        }

        @JsonCreator
        private RecurringTokenDeletedCase(JsonNode jsonNode) throws IOException {
            this.recurringTokenDeleted = ApiHelper.deserialize(jsonNode,
                TokenWebhookEvent.class);
        }

        @Override
        public String toString() {
            return recurringTokenDeleted.toString();
        }
    }

    /**
     * This is a implementation class for UnknownCase.
     */
    private static class Unknown extends TokenParsingResult {

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.unknown();
        }

    }

    /**
     * This is a custom deserializer class for TokenParsingResult.
     */
    protected static class TokenParsingResultDeserializer
            extends JsonDeserializer<TokenParsingResult> {

        private String discriminator = "event";
        private List<Map<String, Class<? extends TokenParsingResult>>> registry =
                Arrays.asList(Collections.singletonMap("token_created", TokenCreatedCase.class),
                        Collections.singletonMap("token_updated", TokenUpdatedCase.class),
                        Collections.singletonMap("token_three_d_s_updated", TokenThreeDsUpdatedCase.class),
                        Collections.singletonMap("token_cvv_auth_updated", TokenCvvAuthUpdatedCase.class),
                        Collections.singletonMap("token_cvv_auth_check_updated", TokenCvvAuthCheckUpdatedCase.class),
                        Collections.singletonMap("token_replaced", TokenReplacedCase.class),
                        Collections.singletonMap("recurring_token_deleted", RecurringTokenDeletedCase.class));

        @Override
        public TokenParsingResult deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
