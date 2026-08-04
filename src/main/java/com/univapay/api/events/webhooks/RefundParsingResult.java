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
import com.univapay.api.models.RefundWebhookCallback;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an event class for RefundParsingResult.
 */
@JsonDeserialize(using = RefundParsingResult.RefundParsingResultDeserializer.class)
public abstract class RefundParsingResult {
    
    /**
     * Fired when a refund reaches a terminal status (`successful`, `failed`, `error`). The `data`
     * field contains the full Refund object.
     * @param refundFinished RefundWebhookCallback value for refundFinished.
     * @return The RefundFinishedCase object.
     */
    public static RefundParsingResult fromRefundFinished(RefundWebhookCallback refundFinished) {
        return refundFinished == null ? null : new RefundFinishedCase(refundFinished);
    }

    /**
     * Triggered when no event identified
     * @return The Unknown object.
     */
    public static RefundParsingResult markUnknown() {
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
            public R refundFinished(RefundWebhookCallback refundFinished) {
                return someCases.refundFinished(refundFinished);
            }

            @Override
            public R unknown() {
                return someCases.unknown();
            }
        });
    }

    /**
     * This is interface for RefundParsingResult cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R refundFinished(RefundWebhookCallback refundFinished);

        R unknown();
    }

    /**
     * This is interface for some-of cases (any subset).
     * @param <R> The type to return after applying callback.
     */
    public interface SomeCases<R> {
        default R refundFinished(RefundWebhookCallback refundFinished) { return null; }

        default R unknown() { return null; }
    }

    /**
     * This is a implementation class for RefundFinishedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "RefundWebhookCallback")
    private static class RefundFinishedCase extends RefundParsingResult {

        @JsonValue
        private RefundWebhookCallback refundFinished;

        RefundFinishedCase(RefundWebhookCallback refundFinished) {
            this.refundFinished = refundFinished;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.refundFinished(this.refundFinished);
        }

        @JsonCreator
        private RefundFinishedCase(JsonNode jsonNode) throws IOException {
            this.refundFinished = ApiHelper.deserialize(jsonNode,
                RefundWebhookCallback.class);
        }

        @Override
        public String toString() {
            return refundFinished.toString();
        }
    }

    /**
     * This is a implementation class for UnknownCase.
     */
    private static class Unknown extends RefundParsingResult {

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.unknown();
        }

    }

    /**
     * This is a custom deserializer class for RefundParsingResult.
     */
    protected static class RefundParsingResultDeserializer
            extends JsonDeserializer<RefundParsingResult> {

        private String discriminator = "event";
        private List<Map<String, Class<? extends RefundParsingResult>>> registry =
                Arrays.asList(
                        Collections.singletonMap("refund_finished", RefundFinishedCase.class));

        @Override
        public RefundParsingResult deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
