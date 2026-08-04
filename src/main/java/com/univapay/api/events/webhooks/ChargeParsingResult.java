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
import com.univapay.api.models.ChargeWebhookEvent;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an event class for ChargeParsingResult.
 */
@JsonDeserialize(using = ChargeParsingResult.ChargeParsingResultDeserializer.class)
public abstract class ChargeParsingResult {
    
    /**
     * Fired whenever a charge transitions to a new status (e.g., `pending` → `awaiting`). The
     * `data` field contains the full Charge object at the time of the event.
     * @param chargeUpdated ChargeWebhookEvent value for chargeUpdated.
     * @return The ChargeUpdatedCase object.
     */
    public static ChargeParsingResult fromChargeUpdated(ChargeWebhookEvent chargeUpdated) {
        return chargeUpdated == null ? null : new ChargeUpdatedCase(chargeUpdated);
    }

    /**
     * Fired when a charge reaches a terminal status (`successful`, `failed`, `error`). The `data`
     * field contains the full Charge object.
     * @param chargeFinished ChargeWebhookEvent value for chargeFinished.
     * @return The ChargeFinishedCase object.
     */
    public static ChargeParsingResult fromChargeFinished(ChargeWebhookEvent chargeFinished) {
        return chargeFinished == null ? null : new ChargeFinishedCase(chargeFinished);
    }

    /**
     * Triggered when no event identified
     * @return The Unknown object.
     */
    public static ChargeParsingResult markUnknown() {
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
            public R chargeUpdated(ChargeWebhookEvent chargeUpdated) {
                return someCases.chargeUpdated(chargeUpdated);
            }

            @Override
            public R chargeFinished(ChargeWebhookEvent chargeFinished) {
                return someCases.chargeFinished(chargeFinished);
            }

            @Override
            public R unknown() {
                return someCases.unknown();
            }
        });
    }

    /**
     * This is interface for ChargeParsingResult cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R chargeUpdated(ChargeWebhookEvent chargeUpdated);

        R chargeFinished(ChargeWebhookEvent chargeFinished);

        R unknown();
    }

    /**
     * This is interface for some-of cases (any subset).
     * @param <R> The type to return after applying callback.
     */
    public interface SomeCases<R> {
        default R chargeUpdated(ChargeWebhookEvent chargeUpdated) { return null; }

        default R chargeFinished(ChargeWebhookEvent chargeFinished) { return null; }

        default R unknown() { return null; }
    }

    /**
     * This is a implementation class for ChargeUpdatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ChargeWebhookEvent")
    private static class ChargeUpdatedCase extends ChargeParsingResult {

        @JsonValue
        private ChargeWebhookEvent chargeUpdated;

        ChargeUpdatedCase(ChargeWebhookEvent chargeUpdated) {
            this.chargeUpdated = chargeUpdated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.chargeUpdated(this.chargeUpdated);
        }

        @JsonCreator
        private ChargeUpdatedCase(JsonNode jsonNode) throws IOException {
            this.chargeUpdated = ApiHelper.deserialize(jsonNode,
                ChargeWebhookEvent.class);
        }

        @Override
        public String toString() {
            return chargeUpdated.toString();
        }
    }

    /**
     * This is a implementation class for ChargeFinishedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "ChargeWebhookEvent")
    private static class ChargeFinishedCase extends ChargeParsingResult {

        @JsonValue
        private ChargeWebhookEvent chargeFinished;

        ChargeFinishedCase(ChargeWebhookEvent chargeFinished) {
            this.chargeFinished = chargeFinished;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.chargeFinished(this.chargeFinished);
        }

        @JsonCreator
        private ChargeFinishedCase(JsonNode jsonNode) throws IOException {
            this.chargeFinished = ApiHelper.deserialize(jsonNode,
                ChargeWebhookEvent.class);
        }

        @Override
        public String toString() {
            return chargeFinished.toString();
        }
    }

    /**
     * This is a implementation class for UnknownCase.
     */
    private static class Unknown extends ChargeParsingResult {

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.unknown();
        }

    }

    /**
     * This is a custom deserializer class for ChargeParsingResult.
     */
    protected static class ChargeParsingResultDeserializer
            extends JsonDeserializer<ChargeParsingResult> {

        private String discriminator = "event";
        private List<Map<String, Class<? extends ChargeParsingResult>>> registry =
                Arrays.asList(Collections.singletonMap("charge_updated", ChargeUpdatedCase.class),
                        Collections.singletonMap("charge_finished", ChargeFinishedCase.class));

        @Override
        public ChargeParsingResult deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
