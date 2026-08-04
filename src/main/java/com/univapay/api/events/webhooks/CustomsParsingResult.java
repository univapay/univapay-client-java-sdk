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
import com.univapay.api.models.CustomsDeclarationWebhookCallback;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an event class for CustomsParsingResult.
 */
@JsonDeserialize(using = CustomsParsingResult.CustomsParsingResultDeserializer.class)
public abstract class CustomsParsingResult {
    
    /**
     * Fired when a customs declaration associated with a charge reaches a terminal state. The
     * `data` field contains the CustomsDeclaration resource returned by the backend formatter.
     * @param customsDeclarationFinished CustomsDeclarationWebhookCallback value for customsDeclarationFinished.
     * @return The CustomsDeclarationFinishedCase object.
     */
    public static CustomsParsingResult fromCustomsDeclarationFinished(
            CustomsDeclarationWebhookCallback customsDeclarationFinished) {
        return customsDeclarationFinished == null ? null : new CustomsDeclarationFinishedCase(customsDeclarationFinished);
    }

    /**
     * Triggered when no event identified
     * @return The Unknown object.
     */
    public static CustomsParsingResult markUnknown() {
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
            public R customsDeclarationFinished(CustomsDeclarationWebhookCallback customsDeclarationFinished) {
                return someCases.customsDeclarationFinished(customsDeclarationFinished);
            }

            @Override
            public R unknown() {
                return someCases.unknown();
            }
        });
    }

    /**
     * This is interface for CustomsParsingResult cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R customsDeclarationFinished(CustomsDeclarationWebhookCallback customsDeclarationFinished);

        R unknown();
    }

    /**
     * This is interface for some-of cases (any subset).
     * @param <R> The type to return after applying callback.
     */
    public interface SomeCases<R> {
        default R customsDeclarationFinished(CustomsDeclarationWebhookCallback customsDeclarationFinished) { return null; }

        default R unknown() { return null; }
    }

    /**
     * This is a implementation class for CustomsDeclarationFinishedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CustomsDeclarationWebhookCallback")
    private static class CustomsDeclarationFinishedCase extends CustomsParsingResult {

        @JsonValue
        private CustomsDeclarationWebhookCallback customsDeclarationFinished;

        CustomsDeclarationFinishedCase(CustomsDeclarationWebhookCallback customsDeclarationFinished) {
            this.customsDeclarationFinished = customsDeclarationFinished;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.customsDeclarationFinished(this.customsDeclarationFinished);
        }

        @JsonCreator
        private CustomsDeclarationFinishedCase(JsonNode jsonNode) throws IOException {
            this.customsDeclarationFinished = ApiHelper.deserialize(jsonNode,
                CustomsDeclarationWebhookCallback.class);
        }

        @Override
        public String toString() {
            return customsDeclarationFinished.toString();
        }
    }

    /**
     * This is a implementation class for UnknownCase.
     */
    private static class Unknown extends CustomsParsingResult {

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.unknown();
        }

    }

    /**
     * This is a custom deserializer class for CustomsParsingResult.
     */
    protected static class CustomsParsingResultDeserializer
            extends JsonDeserializer<CustomsParsingResult> {

        private String discriminator = "event";
        private List<Map<String, Class<? extends CustomsParsingResult>>> registry =
                Arrays.asList(
                        Collections.singletonMap("customs_declaration_finished", CustomsDeclarationFinishedCase.class));

        @Override
        public CustomsParsingResult deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
