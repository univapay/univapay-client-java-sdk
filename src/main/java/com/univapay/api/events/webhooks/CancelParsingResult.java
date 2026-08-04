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
import com.univapay.api.models.CancelWebhookCallback;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an event class for CancelParsingResult.
 */
@JsonDeserialize(using = CancelParsingResult.CancelParsingResultDeserializer.class)
public abstract class CancelParsingResult {
    
    /**
     * Fired when a cancellation request reaches a terminal status (`successful`, `failed`,
     * `error`). The `data` field contains the full Cancel object.
     * @param cancelFinished CancelWebhookCallback value for cancelFinished.
     * @return The CancelFinishedCase object.
     */
    public static CancelParsingResult fromCancelFinished(CancelWebhookCallback cancelFinished) {
        return cancelFinished == null ? null : new CancelFinishedCase(cancelFinished);
    }

    /**
     * Triggered when no event identified
     * @return The Unknown object.
     */
    public static CancelParsingResult markUnknown() {
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
            public R cancelFinished(CancelWebhookCallback cancelFinished) {
                return someCases.cancelFinished(cancelFinished);
            }

            @Override
            public R unknown() {
                return someCases.unknown();
            }
        });
    }

    /**
     * This is interface for CancelParsingResult cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R cancelFinished(CancelWebhookCallback cancelFinished);

        R unknown();
    }

    /**
     * This is interface for some-of cases (any subset).
     * @param <R> The type to return after applying callback.
     */
    public interface SomeCases<R> {
        default R cancelFinished(CancelWebhookCallback cancelFinished) { return null; }

        default R unknown() { return null; }
    }

    /**
     * This is a implementation class for CancelFinishedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CancelWebhookCallback")
    private static class CancelFinishedCase extends CancelParsingResult {

        @JsonValue
        private CancelWebhookCallback cancelFinished;

        CancelFinishedCase(CancelWebhookCallback cancelFinished) {
            this.cancelFinished = cancelFinished;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.cancelFinished(this.cancelFinished);
        }

        @JsonCreator
        private CancelFinishedCase(JsonNode jsonNode) throws IOException {
            this.cancelFinished = ApiHelper.deserialize(jsonNode,
                CancelWebhookCallback.class);
        }

        @Override
        public String toString() {
            return cancelFinished.toString();
        }
    }

    /**
     * This is a implementation class for UnknownCase.
     */
    private static class Unknown extends CancelParsingResult {

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.unknown();
        }

    }

    /**
     * This is a custom deserializer class for CancelParsingResult.
     */
    protected static class CancelParsingResultDeserializer
            extends JsonDeserializer<CancelParsingResult> {

        private String discriminator = "event";
        private List<Map<String, Class<? extends CancelParsingResult>>> registry =
                Arrays.asList(
                        Collections.singletonMap("cancel_finished", CancelFinishedCase.class));

        @Override
        public CancelParsingResult deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
