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
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.univapay.api.ApiHelper;
import com.univapay.api.models.BankTransferTransactionToken;
import com.univapay.api.models.CardTransactionToken;
import com.univapay.api.models.KonbiniTransactionToken;
import com.univapay.api.models.OnlineTransactionToken;
import com.univapay.api.models.PaidyTransactionToken;
import com.univapay.api.models.QrMerchantTransactionToken;
import com.univapay.api.models.QrScanTransactionToken;
import io.apimatic.core.annotations.TypeCombinator.TypeCombinatorCase;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * This is a container class for one-of types.
 */
@JsonDeserialize(using = TransactionToken.TransactionTokenDeserializer.class)
public abstract class TransactionToken {
    
    /**
     * This is CardTransactionToken case.
     * @param cardTransactionToken CardTransactionToken value for cardTransactionToken.
     * @return The CardTransactionTokenCase object.
     */
    public static TransactionToken fromCardTransactionToken(
            CardTransactionToken cardTransactionToken) {
        return cardTransactionToken == null ? null : new CardTransactionTokenCase(cardTransactionToken);
    }

    /**
     * This is KonbiniTransactionToken case.
     * @param konbiniTransactionToken KonbiniTransactionToken value for konbiniTransactionToken.
     * @return The KonbiniTransactionTokenCase object.
     */
    public static TransactionToken fromKonbiniTransactionToken(
            KonbiniTransactionToken konbiniTransactionToken) {
        return konbiniTransactionToken == null ? null : new KonbiniTransactionTokenCase(konbiniTransactionToken);
    }

    /**
     * This is OnlineTransactionToken case.
     * @param onlineTransactionToken OnlineTransactionToken value for onlineTransactionToken.
     * @return The OnlineTransactionTokenCase object.
     */
    public static TransactionToken fromOnlineTransactionToken(
            OnlineTransactionToken onlineTransactionToken) {
        return onlineTransactionToken == null ? null : new OnlineTransactionTokenCase(onlineTransactionToken);
    }

    /**
     * This is BankTransferTransactionToken case.
     * @param bankTransferTransactionToken BankTransferTransactionToken value for bankTransferTransactionToken.
     * @return The BankTransferTransactionTokenCase object.
     */
    public static TransactionToken fromBankTransferTransactionToken(
            BankTransferTransactionToken bankTransferTransactionToken) {
        return bankTransferTransactionToken == null ? null : new BankTransferTransactionTokenCase(bankTransferTransactionToken);
    }

    /**
     * This is PaidyTransactionToken case.
     * @param paidyTransactionToken PaidyTransactionToken value for paidyTransactionToken.
     * @return The PaidyTransactionTokenCase object.
     */
    public static TransactionToken fromPaidyTransactionToken(
            PaidyTransactionToken paidyTransactionToken) {
        return paidyTransactionToken == null ? null : new PaidyTransactionTokenCase(paidyTransactionToken);
    }

    /**
     * This is QrScanTransactionToken case.
     * @param qrScanTransactionToken QrScanTransactionToken value for qrScanTransactionToken.
     * @return The QrScanTransactionTokenCase object.
     */
    public static TransactionToken fromQrScanTransactionToken(
            QrScanTransactionToken qrScanTransactionToken) {
        return qrScanTransactionToken == null ? null : new QrScanTransactionTokenCase(qrScanTransactionToken);
    }

    /**
     * This is QrMerchantTransactionToken case.
     * @param qrMerchantTransactionToken QrMerchantTransactionToken value for qrMerchantTransactionToken.
     * @return The QrMerchantTransactionTokenCase object.
     */
    public static TransactionToken fromQrMerchantTransactionToken(
            QrMerchantTransactionToken qrMerchantTransactionToken) {
        return qrMerchantTransactionToken == null ? null : new QrMerchantTransactionTokenCase(qrMerchantTransactionToken);
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
        R cardTransactionToken(CardTransactionToken cardTransactionToken);

        R konbiniTransactionToken(KonbiniTransactionToken konbiniTransactionToken);

        R onlineTransactionToken(OnlineTransactionToken onlineTransactionToken);

        R bankTransferTransactionToken(BankTransferTransactionToken bankTransferTransactionToken);

        R paidyTransactionToken(PaidyTransactionToken paidyTransactionToken);

        R qrScanTransactionToken(QrScanTransactionToken qrScanTransactionToken);

        R qrMerchantTransactionToken(QrMerchantTransactionToken qrMerchantTransactionToken);
    }

    /**
     * This is a implementation class for CardTransactionTokenCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "CardTransactionToken")
    private static class CardTransactionTokenCase extends TransactionToken {

        @JsonValue
        private CardTransactionToken cardTransactionToken;

        CardTransactionTokenCase(CardTransactionToken cardTransactionToken) {
            this.cardTransactionToken = cardTransactionToken;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.cardTransactionToken(this.cardTransactionToken);
        }

        @JsonCreator
        private CardTransactionTokenCase(JsonNode jsonNode) throws IOException {
            this.cardTransactionToken = ApiHelper.deserialize(jsonNode,
                CardTransactionToken.class);
        }

        @Override
        public String toString() {
            return cardTransactionToken.toString();
        }
    }

    /**
     * This is a implementation class for KonbiniTransactionTokenCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "KonbiniTransactionToken")
    private static class KonbiniTransactionTokenCase extends TransactionToken {

        @JsonValue
        private KonbiniTransactionToken konbiniTransactionToken;

        KonbiniTransactionTokenCase(KonbiniTransactionToken konbiniTransactionToken) {
            this.konbiniTransactionToken = konbiniTransactionToken;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.konbiniTransactionToken(this.konbiniTransactionToken);
        }

        @JsonCreator
        private KonbiniTransactionTokenCase(JsonNode jsonNode) throws IOException {
            this.konbiniTransactionToken = ApiHelper.deserialize(jsonNode,
                KonbiniTransactionToken.class);
        }

        @Override
        public String toString() {
            return konbiniTransactionToken.toString();
        }
    }

    /**
     * This is a implementation class for OnlineTransactionTokenCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "OnlineTransactionToken")
    private static class OnlineTransactionTokenCase extends TransactionToken {

        @JsonValue
        private OnlineTransactionToken onlineTransactionToken;

        OnlineTransactionTokenCase(OnlineTransactionToken onlineTransactionToken) {
            this.onlineTransactionToken = onlineTransactionToken;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.onlineTransactionToken(this.onlineTransactionToken);
        }

        @JsonCreator
        private OnlineTransactionTokenCase(JsonNode jsonNode) throws IOException {
            this.onlineTransactionToken = ApiHelper.deserialize(jsonNode,
                OnlineTransactionToken.class);
        }

        @Override
        public String toString() {
            return onlineTransactionToken.toString();
        }
    }

    /**
     * This is a implementation class for BankTransferTransactionTokenCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "BankTransferTransactionToken")
    private static class BankTransferTransactionTokenCase extends TransactionToken {

        @JsonValue
        private BankTransferTransactionToken bankTransferTransactionToken;

        BankTransferTransactionTokenCase(BankTransferTransactionToken bankTransferTransactionToken) {
            this.bankTransferTransactionToken = bankTransferTransactionToken;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.bankTransferTransactionToken(this.bankTransferTransactionToken);
        }

        @JsonCreator
        private BankTransferTransactionTokenCase(JsonNode jsonNode) throws IOException {
            this.bankTransferTransactionToken = ApiHelper.deserialize(jsonNode,
                BankTransferTransactionToken.class);
        }

        @Override
        public String toString() {
            return bankTransferTransactionToken.toString();
        }
    }

    /**
     * This is a implementation class for PaidyTransactionTokenCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "PaidyTransactionToken")
    private static class PaidyTransactionTokenCase extends TransactionToken {

        @JsonValue
        private PaidyTransactionToken paidyTransactionToken;

        PaidyTransactionTokenCase(PaidyTransactionToken paidyTransactionToken) {
            this.paidyTransactionToken = paidyTransactionToken;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.paidyTransactionToken(this.paidyTransactionToken);
        }

        @JsonCreator
        private PaidyTransactionTokenCase(JsonNode jsonNode) throws IOException {
            this.paidyTransactionToken = ApiHelper.deserialize(jsonNode,
                PaidyTransactionToken.class);
        }

        @Override
        public String toString() {
            return paidyTransactionToken.toString();
        }
    }

    /**
     * This is a implementation class for QrScanTransactionTokenCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "QrScanTransactionToken")
    private static class QrScanTransactionTokenCase extends TransactionToken {

        @JsonValue
        private QrScanTransactionToken qrScanTransactionToken;

        QrScanTransactionTokenCase(QrScanTransactionToken qrScanTransactionToken) {
            this.qrScanTransactionToken = qrScanTransactionToken;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.qrScanTransactionToken(this.qrScanTransactionToken);
        }

        @JsonCreator
        private QrScanTransactionTokenCase(JsonNode jsonNode) throws IOException {
            this.qrScanTransactionToken = ApiHelper.deserialize(jsonNode,
                QrScanTransactionToken.class);
        }

        @Override
        public String toString() {
            return qrScanTransactionToken.toString();
        }
    }

    /**
     * This is a implementation class for QrMerchantTransactionTokenCase.
     */
    @JsonDeserialize(using = JsonDeserializer.None.class)
    @TypeCombinatorCase(type = "QrMerchantTransactionToken")
    private static class QrMerchantTransactionTokenCase extends TransactionToken {

        @JsonValue
        private QrMerchantTransactionToken qrMerchantTransactionToken;

        QrMerchantTransactionTokenCase(QrMerchantTransactionToken qrMerchantTransactionToken) {
            this.qrMerchantTransactionToken = qrMerchantTransactionToken;
        }

        @Override
        public <R> R match(Cases<R> cases) {
            return cases.qrMerchantTransactionToken(this.qrMerchantTransactionToken);
        }

        @JsonCreator
        private QrMerchantTransactionTokenCase(JsonNode jsonNode) throws IOException {
            this.qrMerchantTransactionToken = ApiHelper.deserialize(jsonNode,
                QrMerchantTransactionToken.class);
        }

        @Override
        public String toString() {
            return qrMerchantTransactionToken.toString();
        }
    }

    /**
     * This is a custom deserializer class for TransactionToken.
     */
    protected static class TransactionTokenDeserializer
            extends JsonDeserializer<TransactionToken> {

        private String discriminator = "payment_type";
        private List<Map<String, Class<? extends TransactionToken>>> registry =
                Arrays.asList(Collections.singletonMap("card", CardTransactionTokenCase.class),
                        Collections.singletonMap("konbini", KonbiniTransactionTokenCase.class),
                        Collections.singletonMap("online", OnlineTransactionTokenCase.class),
                        Collections.singletonMap("bank_transfer", BankTransferTransactionTokenCase.class),
                        Collections.singletonMap("paidy", PaidyTransactionTokenCase.class),
                        Collections.singletonMap("qr_scan", QrScanTransactionTokenCase.class),
                        Collections.singletonMap("qr_merchant", QrMerchantTransactionTokenCase.class));

        @Override
        public TransactionToken deserialize(JsonParser jp, DeserializationContext ctxt)
                throws IOException, JsonProcessingException {
            return ApiHelper.deserialize(jp, ctxt, discriminator, registry, null, true);
        }
    }

}
