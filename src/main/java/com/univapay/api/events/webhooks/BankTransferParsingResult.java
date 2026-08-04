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
import com.univapay.api.models.BankTransferStatusWebhookCallback;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is an event class for BankTransferParsingResult.
 */
@JsonDeserialize(using = BankTransferParsingResult.BankTransferParsingResultDeserializer.class)
public abstract class BankTransferParsingResult {
    
    /**
     * Fired when the payment status of a bank transfer charge changes (e.g., when a deposit is
     * received and matched against the expected amount). The `data` field contains a
     * `BankTransferStatusData` object with the extension record, deposit amounts, and originating
     * charge/token metadata.
     * @param bankTransferStatusUpdated BankTransferStatusWebhookCallback value for bankTransferStatusUpdated.
     * @return The BankTransferStatusUpdatedCase object.
     */
    public static BankTransferParsingResult fromBankTransferStatusUpdated(
            BankTransferStatusWebhookCallback bankTransferStatusUpdated) {
        return bankTransferStatusUpdated == null ? null : new BankTransferStatusUpdatedCase(bankTransferStatusUpdated);
    }

    /**
     * Triggered when no event identified
     * @return The Unknown object.
     */
    public static BankTransferParsingResult markUnknown() {
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
            public R bankTransferStatusUpdated(BankTransferStatusWebhookCallback bankTransferStatusUpdated) {
                return someCases.bankTransferStatusUpdated(bankTransferStatusUpdated);
            }

            @Override
            public R unknown() {
                return someCases.unknown();
            }
        });
    }

    /**
     * This is interface for BankTransferParsingResult cases.
     * @param <R> The type to return after applying callback.
     */
    public interface Cases<R> {
        R bankTransferStatusUpdated(BankTransferStatusWebhookCallback bankTransferStatusUpdated);

        R unknown();
    }

    /**
     * This is interface for some-of cases (any subset).
     * @param <R> The type to return after applying callback.
     */
    public interface SomeCases<R> {
        default R bankTransferStatusUpdated(BankTransferStatusWebhookCallback bankTransferStatusUpdated) { return null; }

        default R unknown() { return null; }
    }

    /**
     * This is a implementation class for BankTransferStatusUpdatedCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "BankTransferStatusWebhookCallback")
    private static class BankTransferStatusUpdatedCase extends BankTransferParsingResult {

        @JsonValue
        private BankTransferStatusWebhookCallback bankTransferStatusUpdated;

        BankTransferStatusUpdatedCase(BankTransferStatusWebhookCallback bankTransferStatusUpdated) {
            this.bankTransferStatusUpdated = bankTransferStatusUpdated;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.bankTransferStatusUpdated(this.bankTransferStatusUpdated);
        }

        @JsonCreator
        private BankTransferStatusUpdatedCase(JsonNode jsonNode) throws IOException {
            this.bankTransferStatusUpdated = ApiHelper.deserialize(jsonNode,
                BankTransferStatusWebhookCallback.class);
        }

        @Override
        public String toString() {
            return bankTransferStatusUpdated.toString();
        }
    }

    /**
     * This is a implementation class for UnknownCase.
     */
    private static class Unknown extends BankTransferParsingResult {

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.unknown();
        }

    }

    /**
     * This is a custom deserializer class for BankTransferParsingResult.
     */
    protected static class BankTransferParsingResultDeserializer
            extends JsonDeserializer<BankTransferParsingResult> {

        private String discriminator = "event";
        private List<Map<String, Class<? extends BankTransferParsingResult>>> registry =
                Arrays.asList(
                        Collections.singletonMap("bank_transfer_status_updated", BankTransferStatusUpdatedCase.class));

        @Override
        public BankTransferParsingResult deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
