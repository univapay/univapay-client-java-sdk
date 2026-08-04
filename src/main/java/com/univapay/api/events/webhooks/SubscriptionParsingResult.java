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
import com.univapay.api.models.SubscriptionWebhookEvent;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an event class for SubscriptionParsingResult.
 */
@JsonDeserialize(using = SubscriptionParsingResult.SubscriptionParsingResultDeserializer.class)
public abstract class SubscriptionParsingResult {
    
    /**
     * Fired when a new subscription is created and its first payment has been initiated. The `data`
     * field contains the full Subscription object.
     * @param subscriptionCreated SubscriptionWebhookEvent value for subscriptionCreated.
     * @return The SubscriptionCreatedCase object.
     */
    public static SubscriptionParsingResult fromSubscriptionCreated(
            SubscriptionWebhookEvent subscriptionCreated) {
        return subscriptionCreated == null ? null : new SubscriptionCreatedCase(subscriptionCreated);
    }

    /**
     * Fired when a scheduled subscription payment is successfully processed. The `data` field
     * contains the full Subscription object.
     * @param subscriptionPayment SubscriptionWebhookEvent value for subscriptionPayment.
     * @return The SubscriptionPaymentCase object.
     */
    public static SubscriptionParsingResult fromSubscriptionPayment(
            SubscriptionWebhookEvent subscriptionPayment) {
        return subscriptionPayment == null ? null : new SubscriptionPaymentCase(subscriptionPayment);
    }

    /**
     * Fired when a subscription completes all of its scheduled payments. The `data` field contains
     * the full Subscription object.
     * @param subscriptionCompleted SubscriptionWebhookEvent value for subscriptionCompleted.
     * @return The SubscriptionCompletedCase object.
     */
    public static SubscriptionParsingResult fromSubscriptionCompleted(
            SubscriptionWebhookEvent subscriptionCompleted) {
        return subscriptionCompleted == null ? null : new SubscriptionCompletedCase(subscriptionCompleted);
    }

    /**
     * Fired when a scheduled subscription payment fails. The `data` field contains the full
     * Subscription object.
     * @param subscriptionFailure SubscriptionWebhookEvent value for subscriptionFailure.
     * @return The SubscriptionFailureCase object.
     */
    public static SubscriptionParsingResult fromSubscriptionFailure(
            SubscriptionWebhookEvent subscriptionFailure) {
        return subscriptionFailure == null ? null : new SubscriptionFailureCase(subscriptionFailure);
    }

    /**
     * Fired when a subscription is cancelled before all payments complete. The `data` field
     * contains the full Subscription object.
     * @param subscriptionCanceled SubscriptionWebhookEvent value for subscriptionCanceled.
     * @return The SubscriptionCanceledCase object.
     */
    public static SubscriptionParsingResult fromSubscriptionCanceled(
            SubscriptionWebhookEvent subscriptionCanceled) {
        return subscriptionCanceled == null ? null : new SubscriptionCanceledCase(subscriptionCanceled);
    }

    /**
     * Fired when a subscription is suspended (paused). The `data` field contains the full
     * Subscription object.
     * @param subscriptionSuspended SubscriptionWebhookEvent value for subscriptionSuspended.
     * @return The SubscriptionSuspendedCase object.
     */
    public static SubscriptionParsingResult fromSubscriptionSuspended(
            SubscriptionWebhookEvent subscriptionSuspended) {
        return subscriptionSuspended == null ? null : new SubscriptionSuspendedCase(subscriptionSuspended);
    }

    /**
     * Triggered when no event identified
     * @return The Unknown object.
     */
    public static SubscriptionParsingResult markUnknown() {
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
            public R subscriptionCreated(SubscriptionWebhookEvent subscriptionCreated) {
                return someCases.subscriptionCreated(subscriptionCreated);
            }

            @Override
            public R subscriptionPayment(SubscriptionWebhookEvent subscriptionPayment) {
                return someCases.subscriptionPayment(subscriptionPayment);
            }

            @Override
            public R subscriptionCompleted(SubscriptionWebhookEvent subscriptionCompleted) {
                return someCases.subscriptionCompleted(subscriptionCompleted);
            }

            @Override
            public R subscriptionFailure(SubscriptionWebhookEvent subscriptionFailure) {
                return someCases.subscriptionFailure(subscriptionFailure);
            }

            @Override
            public R subscriptionCanceled(SubscriptionWebhookEvent subscriptionCanceled) {
                return someCases.subscriptionCanceled(subscriptionCanceled);
            }

            @Override
            public R subscriptionSuspended(SubscriptionWebhookEvent subscriptionSuspended) {
                return someCases.subscriptionSuspended(subscriptionSuspended);
            }

            @Override
            public R unknown() {
                return someCases.unknown();
            }
        });
    }

    /**
     * This is interface for SubscriptionParsingResult cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R subscriptionCreated(SubscriptionWebhookEvent subscriptionCreated);

        R subscriptionPayment(SubscriptionWebhookEvent subscriptionPayment);

        R subscriptionCompleted(SubscriptionWebhookEvent subscriptionCompleted);

        R subscriptionFailure(SubscriptionWebhookEvent subscriptionFailure);

        R subscriptionCanceled(SubscriptionWebhookEvent subscriptionCanceled);

        R subscriptionSuspended(SubscriptionWebhookEvent subscriptionSuspended);

        R unknown();
    }

    /**
     * This is interface for some-of cases (any subset).
     * @param <R> The type to return after applying callback.
     */
    public interface SomeCases<R> {
        default R subscriptionCreated(SubscriptionWebhookEvent subscriptionCreated) { return null; }

        default R subscriptionPayment(SubscriptionWebhookEvent subscriptionPayment) { return null; }

        default R subscriptionCompleted(SubscriptionWebhookEvent subscriptionCompleted) { return null; }

        default R subscriptionFailure(SubscriptionWebhookEvent subscriptionFailure) { return null; }

        default R subscriptionCanceled(SubscriptionWebhookEvent subscriptionCanceled) { return null; }

        default R subscriptionSuspended(SubscriptionWebhookEvent subscriptionSuspended) { return null; }

        default R unknown() { return null; }
    }

    /**
     * This is a implementation class for SubscriptionCreatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionWebhookEvent")
    private static class SubscriptionCreatedCase extends SubscriptionParsingResult {

        @JsonValue
        private SubscriptionWebhookEvent subscriptionCreated;

        SubscriptionCreatedCase(SubscriptionWebhookEvent subscriptionCreated) {
            this.subscriptionCreated = subscriptionCreated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionCreated(this.subscriptionCreated);
        }

        @JsonCreator
        private SubscriptionCreatedCase(JsonNode jsonNode) throws IOException {
            this.subscriptionCreated = ApiHelper.deserialize(jsonNode,
                SubscriptionWebhookEvent.class);
        }

        @Override
        public String toString() {
            return subscriptionCreated.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionPaymentCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionWebhookEvent")
    private static class SubscriptionPaymentCase extends SubscriptionParsingResult {

        @JsonValue
        private SubscriptionWebhookEvent subscriptionPayment;

        SubscriptionPaymentCase(SubscriptionWebhookEvent subscriptionPayment) {
            this.subscriptionPayment = subscriptionPayment;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionPayment(this.subscriptionPayment);
        }

        @JsonCreator
        private SubscriptionPaymentCase(JsonNode jsonNode) throws IOException {
            this.subscriptionPayment = ApiHelper.deserialize(jsonNode,
                SubscriptionWebhookEvent.class);
        }

        @Override
        public String toString() {
            return subscriptionPayment.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionCompletedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionWebhookEvent")
    private static class SubscriptionCompletedCase extends SubscriptionParsingResult {

        @JsonValue
        private SubscriptionWebhookEvent subscriptionCompleted;

        SubscriptionCompletedCase(SubscriptionWebhookEvent subscriptionCompleted) {
            this.subscriptionCompleted = subscriptionCompleted;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionCompleted(this.subscriptionCompleted);
        }

        @JsonCreator
        private SubscriptionCompletedCase(JsonNode jsonNode) throws IOException {
            this.subscriptionCompleted = ApiHelper.deserialize(jsonNode,
                SubscriptionWebhookEvent.class);
        }

        @Override
        public String toString() {
            return subscriptionCompleted.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionFailureCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionWebhookEvent")
    private static class SubscriptionFailureCase extends SubscriptionParsingResult {

        @JsonValue
        private SubscriptionWebhookEvent subscriptionFailure;

        SubscriptionFailureCase(SubscriptionWebhookEvent subscriptionFailure) {
            this.subscriptionFailure = subscriptionFailure;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionFailure(this.subscriptionFailure);
        }

        @JsonCreator
        private SubscriptionFailureCase(JsonNode jsonNode) throws IOException {
            this.subscriptionFailure = ApiHelper.deserialize(jsonNode,
                SubscriptionWebhookEvent.class);
        }

        @Override
        public String toString() {
            return subscriptionFailure.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionCanceledCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionWebhookEvent")
    private static class SubscriptionCanceledCase extends SubscriptionParsingResult {

        @JsonValue
        private SubscriptionWebhookEvent subscriptionCanceled;

        SubscriptionCanceledCase(SubscriptionWebhookEvent subscriptionCanceled) {
            this.subscriptionCanceled = subscriptionCanceled;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionCanceled(this.subscriptionCanceled);
        }

        @JsonCreator
        private SubscriptionCanceledCase(JsonNode jsonNode) throws IOException {
            this.subscriptionCanceled = ApiHelper.deserialize(jsonNode,
                SubscriptionWebhookEvent.class);
        }

        @Override
        public String toString() {
            return subscriptionCanceled.toString();
        }
    }

    /**
     * This is a implementation class for SubscriptionSuspendedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "SubscriptionWebhookEvent")
    private static class SubscriptionSuspendedCase extends SubscriptionParsingResult {

        @JsonValue
        private SubscriptionWebhookEvent subscriptionSuspended;

        SubscriptionSuspendedCase(SubscriptionWebhookEvent subscriptionSuspended) {
            this.subscriptionSuspended = subscriptionSuspended;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.subscriptionSuspended(this.subscriptionSuspended);
        }

        @JsonCreator
        private SubscriptionSuspendedCase(JsonNode jsonNode) throws IOException {
            this.subscriptionSuspended = ApiHelper.deserialize(jsonNode,
                SubscriptionWebhookEvent.class);
        }

        @Override
        public String toString() {
            return subscriptionSuspended.toString();
        }
    }

    /**
     * This is a implementation class for UnknownCase.
     */
    private static class Unknown extends SubscriptionParsingResult {

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.unknown();
        }

    }

    /**
     * This is a custom deserializer class for SubscriptionParsingResult.
     */
    protected static class SubscriptionParsingResultDeserializer
            extends JsonDeserializer<SubscriptionParsingResult> {

        private String discriminator = "event";
        private List<Map<String, Class<? extends SubscriptionParsingResult>>> registry =
                Arrays.asList(
                        Collections.singletonMap("subscription_created", SubscriptionCreatedCase.class),
                        Collections.singletonMap("subscription_payment", SubscriptionPaymentCase.class),
                        Collections.singletonMap("subscription_completed", SubscriptionCompletedCase.class),
                        Collections.singletonMap("subscription_failure", SubscriptionFailureCase.class),
                        Collections.singletonMap("subscription_canceled", SubscriptionCanceledCase.class),
                        Collections.singletonMap("subscription_suspended", SubscriptionSuspendedCase.class));

        @Override
        public SubscriptionParsingResult deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
