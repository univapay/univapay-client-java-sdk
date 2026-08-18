/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import io.apimatic.core.types.AdditionalProperties;
import io.apimatic.core.utilities.ConversionHelper;
import java.util.Map;

/**
 * This is a model class for ChargeCreateRequestThreeDs type.
 */
public class ChargeCreateRequestThreeDs {
    private String redirectEndpoint;
    private ChargeCreateRequestThreeDsMode mode;
    private String authenticationValue;
    private String eci;
    private String dsTransactionId;
    private String serverTransactionId;
    private String messageVersion;
    private String transactionStatus;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public ChargeCreateRequestThreeDs() {
    }

    /**
     * Initialization constructor.
     * @param  redirectEndpoint  String value for redirectEndpoint.
     * @param  mode  ChargeCreateRequestThreeDsMode value for mode.
     * @param  authenticationValue  String value for authenticationValue.
     * @param  eci  String value for eci.
     * @param  dsTransactionId  String value for dsTransactionId.
     * @param  serverTransactionId  String value for serverTransactionId.
     * @param  messageVersion  String value for messageVersion.
     * @param  transactionStatus  String value for transactionStatus.
     */
    public ChargeCreateRequestThreeDs(
            String redirectEndpoint,
            ChargeCreateRequestThreeDsMode mode,
            String authenticationValue,
            String eci,
            String dsTransactionId,
            String serverTransactionId,
            String messageVersion,
            String transactionStatus) {
        this.redirectEndpoint = redirectEndpoint;
        this.mode = mode;
        this.authenticationValue = authenticationValue;
        this.eci = eci;
        this.dsTransactionId = dsTransactionId;
        this.serverTransactionId = serverTransactionId;
        this.messageVersion = messageVersion;
        this.transactionStatus = transactionStatus;
    }

    /**
     * Getter for RedirectEndpoint.
     * URL to redirect the customer to after 3DS authentication.
     * @return Returns the String
     */
    @JsonGetter("redirect_endpoint")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getRedirectEndpoint() {
        return redirectEndpoint;
    }

    /**
     * Setter for RedirectEndpoint.
     * URL to redirect the customer to after 3DS authentication.
     * @param redirectEndpoint Value for String
     */
    @JsonSetter("redirect_endpoint")
    public void setRedirectEndpoint(String redirectEndpoint) {
        this.redirectEndpoint = redirectEndpoint;
    }

    /**
     * Getter for Mode.
     * 3D-Secure authentication type. App Token Secret is required to use 'skip'. `if_available`
     * enforces 3DS only if credentials are available for the recurring token and it has not already
     * completed 3DS. `provided` is set automatically by the server when external MPI authentication
     * data (`authentication_value`, `eci`, etc.) is submitted on the request and cannot be set
     * manually. When omitted, the store's default 3DS policy applies — do not assume 'normal'.
     * @return Returns the ChargeCreateRequestThreeDsMode
     */
    @JsonGetter("mode")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public ChargeCreateRequestThreeDsMode getMode() {
        return mode;
    }

    /**
     * Setter for Mode.
     * 3D-Secure authentication type. App Token Secret is required to use 'skip'. `if_available`
     * enforces 3DS only if credentials are available for the recurring token and it has not already
     * completed 3DS. `provided` is set automatically by the server when external MPI authentication
     * data (`authentication_value`, `eci`, etc.) is submitted on the request and cannot be set
     * manually. When omitted, the store's default 3DS policy applies — do not assume 'normal'.
     * @param mode Value for ChargeCreateRequestThreeDsMode
     */
    @JsonSetter("mode")
    public void setMode(ChargeCreateRequestThreeDsMode mode) {
        this.mode = mode;
    }

    /**
     * Getter for AuthenticationValue.
     * External MPI: the cardholder authentication value (CAVV/AAV) returned by the 3-D Secure
     * directory server. Submit together with `eci`, `ds_transaction_id`, `server_transaction_id`,
     * `message_version`, and `transaction_status` to provide externally completed 3DS
     * authentication data — either all six fields must be present, or none of them.
     * @return Returns the String
     */
    @JsonGetter("authentication_value")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getAuthenticationValue() {
        return authenticationValue;
    }

    /**
     * Setter for AuthenticationValue.
     * External MPI: the cardholder authentication value (CAVV/AAV) returned by the 3-D Secure
     * directory server. Submit together with `eci`, `ds_transaction_id`, `server_transaction_id`,
     * `message_version`, and `transaction_status` to provide externally completed 3DS
     * authentication data — either all six fields must be present, or none of them.
     * @param authenticationValue Value for String
     */
    @JsonSetter("authentication_value")
    public void setAuthenticationValue(String authenticationValue) {
        this.authenticationValue = authenticationValue;
    }

    /**
     * Getter for Eci.
     * External MPI: the two-digit Electronic Commerce Indicator returned by the directory server.
     * Submit together with the other external MPI fields.
     * @return Returns the String
     */
    @JsonGetter("eci")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getEci() {
        return eci;
    }

    /**
     * Setter for Eci.
     * External MPI: the two-digit Electronic Commerce Indicator returned by the directory server.
     * Submit together with the other external MPI fields.
     * @param eci Value for String
     */
    @JsonSetter("eci")
    public void setEci(String eci) {
        this.eci = eci;
    }

    /**
     * Getter for DsTransactionId.
     * External MPI: the directory server transaction ID. Submit together with the other external
     * MPI fields.
     * @return Returns the String
     */
    @JsonGetter("ds_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDsTransactionId() {
        return dsTransactionId;
    }

    /**
     * Setter for DsTransactionId.
     * External MPI: the directory server transaction ID. Submit together with the other external
     * MPI fields.
     * @param dsTransactionId Value for String
     */
    @JsonSetter("ds_transaction_id")
    public void setDsTransactionId(String dsTransactionId) {
        this.dsTransactionId = dsTransactionId;
    }

    /**
     * Getter for ServerTransactionId.
     * External MPI: the 3DS server transaction ID. Submit together with the other external MPI
     * fields.
     * @return Returns the String
     */
    @JsonGetter("server_transaction_id")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getServerTransactionId() {
        return serverTransactionId;
    }

    /**
     * Setter for ServerTransactionId.
     * External MPI: the 3DS server transaction ID. Submit together with the other external MPI
     * fields.
     * @param serverTransactionId Value for String
     */
    @JsonSetter("server_transaction_id")
    public void setServerTransactionId(String serverTransactionId) {
        this.serverTransactionId = serverTransactionId;
    }

    /**
     * Getter for MessageVersion.
     * External MPI: the 3-D Secure protocol message version (e.g., '2.1.0', '2.2.0'). Submit
     * together with the other external MPI fields.
     * @return Returns the String
     */
    @JsonGetter("message_version")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessageVersion() {
        return messageVersion;
    }

    /**
     * Setter for MessageVersion.
     * External MPI: the 3-D Secure protocol message version (e.g., '2.1.0', '2.2.0'). Submit
     * together with the other external MPI fields.
     * @param messageVersion Value for String
     */
    @JsonSetter("message_version")
    public void setMessageVersion(String messageVersion) {
        this.messageVersion = messageVersion;
    }

    /**
     * Getter for TransactionStatus.
     * External MPI: the 3-D Secure directory server transaction status. Only a successful
     * authentication status is accepted. Submit together with the other external MPI fields.
     * @return Returns the String
     */
    @JsonGetter("transaction_status")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Setter for TransactionStatus.
     * External MPI: the 3-D Secure directory server transaction status. Only a successful
     * authentication status is accepted. Submit together with the other external MPI fields.
     * @param transactionStatus Value for String
     */
    @JsonSetter("transaction_status")
    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    /**
     * Hidden method for the serialization of additional properties.
     * @return The map of additionally set properties.
     */
    @JsonAnyGetter
    private Map<String, Object> getAdditionalProperties() {
        return additionalProperties.getAdditionalProperties();
    }

    /**
     * Hidden method for the de-serialization of additional properties.
     * @param name The name of the additional property.
     * @param value The Object value of the additional property.
     */
    @JsonAnySetter
    private void setAdditionalProperties(String name, Object value) {
        additionalProperties.setAdditionalProperty(name,
                ConversionHelper.convertToSimpleType(value,
                        x -> x),
                true);
    }

    /**
     * Getter for the value of additional properties based on provided property name.
     * @param name The name of the additional property.
     * @return Either the Object property value or null if not exist.
     */
    
    public Object getAdditionalProperty(String name) {
        return additionalProperties.getAdditionalProperty(name);
    }

    /**
     * Converts this ChargeCreateRequestThreeDs into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "ChargeCreateRequestThreeDs [" + "redirectEndpoint=" + redirectEndpoint + ", mode="
                + mode + ", authenticationValue=" + authenticationValue + ", eci=" + eci
                + ", dsTransactionId=" + dsTransactionId + ", serverTransactionId="
                + serverTransactionId + ", messageVersion=" + messageVersion
                + ", transactionStatus=" + transactionStatus + ", additionalProperties="
                + additionalProperties + "]";
    }

    /**
     * Builds a new {@link ChargeCreateRequestThreeDs.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link ChargeCreateRequestThreeDs.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .redirectEndpoint(getRedirectEndpoint())
                .mode(getMode())
                .authenticationValue(getAuthenticationValue())
                .eci(getEci())
                .dsTransactionId(getDsTransactionId())
                .serverTransactionId(getServerTransactionId())
                .messageVersion(getMessageVersion())
                .transactionStatus(getTransactionStatus());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link ChargeCreateRequestThreeDs}.
     */
    public static class Builder {
        private String redirectEndpoint;
        private ChargeCreateRequestThreeDsMode mode;
        private String authenticationValue;
        private String eci;
        private String dsTransactionId;
        private String serverTransactionId;
        private String messageVersion;
        private String transactionStatus;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for redirectEndpoint.
         * @param  redirectEndpoint  String value for redirectEndpoint.
         * @return Builder
         */
        public Builder redirectEndpoint(String redirectEndpoint) {
            this.redirectEndpoint = redirectEndpoint;
            return this;
        }

        /**
         * Setter for mode.
         * @param  mode  ChargeCreateRequestThreeDsMode value for mode.
         * @return Builder
         */
        public Builder mode(ChargeCreateRequestThreeDsMode mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Setter for authenticationValue.
         * @param  authenticationValue  String value for authenticationValue.
         * @return Builder
         */
        public Builder authenticationValue(String authenticationValue) {
            this.authenticationValue = authenticationValue;
            return this;
        }

        /**
         * Setter for eci.
         * @param  eci  String value for eci.
         * @return Builder
         */
        public Builder eci(String eci) {
            this.eci = eci;
            return this;
        }

        /**
         * Setter for dsTransactionId.
         * @param  dsTransactionId  String value for dsTransactionId.
         * @return Builder
         */
        public Builder dsTransactionId(String dsTransactionId) {
            this.dsTransactionId = dsTransactionId;
            return this;
        }

        /**
         * Setter for serverTransactionId.
         * @param  serverTransactionId  String value for serverTransactionId.
         * @return Builder
         */
        public Builder serverTransactionId(String serverTransactionId) {
            this.serverTransactionId = serverTransactionId;
            return this;
        }

        /**
         * Setter for messageVersion.
         * @param  messageVersion  String value for messageVersion.
         * @return Builder
         */
        public Builder messageVersion(String messageVersion) {
            this.messageVersion = messageVersion;
            return this;
        }

        /**
         * Setter for transactionStatus.
         * @param  transactionStatus  String value for transactionStatus.
         * @return Builder
         */
        public Builder transactionStatus(String transactionStatus) {
            this.transactionStatus = transactionStatus;
            return this;
        }

        /**
         * Setter for additional property that are not in model fields.
         * @param name The name of the additional property.
         * @param value The Object value of the additional property.
         * @return Builder.
         */
        public Builder additionalProperty(String name, Object value) {
            this.additionalProperties.setAdditionalProperty(name, value);
            return this;
        }

        /**
         * Builds a new {@link ChargeCreateRequestThreeDs} object using the set fields.
         * @return {@link ChargeCreateRequestThreeDs}
         */
        public ChargeCreateRequestThreeDs build() {
            ChargeCreateRequestThreeDs model =
                    new ChargeCreateRequestThreeDs(redirectEndpoint, mode, authenticationValue, eci,
                            dsTransactionId, serverTransactionId, messageVersion,
                            transactionStatus);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
