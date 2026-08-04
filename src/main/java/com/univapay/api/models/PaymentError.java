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
 * This is a model class for PaymentError type.
 */
public class PaymentError {
    private Integer code;
    private String message;
    private String detail;
    private AdditionalProperties<Object> additionalProperties = 
            new AdditionalProperties<Object>(this.getClass());

    /**
     * Default constructor.
     */
    public PaymentError() {
    }

    /**
     * Initialization constructor.
     * @param  code  Integer value for code.
     * @param  message  String value for message.
     * @param  detail  String value for detail.
     */
    public PaymentError(
            Integer code,
            String message,
            String detail) {
        this.code = code;
        this.message = message;
        this.detail = detail;
    }

    /**
     * Getter for Code.
     * Payment Error Codes. | Code | Description | | :--- | :--- | | 301 | Card number error. | |
     * 302 | Invalid expiration month. | | 303 | Invalid expiration year. | | 304 | Card expired. |
     * | 305 | Security code (CVV) error. | | 306 | Card declined (authorization screening error). |
     * | 307 | Invalid card. | | 308 | This card has not been approved by the card company. | | 309
     * | General error occurred. Detailed information can be confirmed in the dashboard. | | 310 |
     * Invalid consumer data (invalid request data). | | 311 | Too many charges on the same card in
     * a short period. Please wait and try again. | | 312 | This charge cannot be canceled. | | 313
     * | Authorization expired (during charge capture). | | 314 | This card has been reported stolen
     * or invalidated by the issuer. | | 315 | Please contact the card issuer. | | 316 |
     * Cardholder's last name is required. | | 317 | Partial capture is not supported. | | 318 |
     * Partial refund is not supported. | | 319 | Suspected fraud (security restriction). | | 320 |
     * An error occurred in the bank's system. | | 321 | Dynamic descriptor is not supported. | |
     * 322 | Barcode/QR code is invalid. | | 323 | Barcode/QR code has expired. | | 324 | This
     * barcode/QR code has already been processed. | | 325 | This barcode/QR code is currently being
     * processed. | | 326 | Rejected due to a high-risk profile. | | 327 | Payment deadline
     * (5-minute timeout) has expired. | | 328 | Recovery failed. Manual intervention is required. |
     * | 329 | Refund failed. | | 330 | Insufficient funds. | | 331 | Metadata field value is
     * invalid or missing. | | 332 | Cross-border transaction not permitted: missing ID. | | 333 |
     * Cross-border transaction not permitted: missing phone number. | | 334 | Cross-border
     * transaction not permitted: unauthorized payment method. | | 335 | Cross-border transaction
     * not permitted: missing name. | | 336 | Exceeded the payment limit for this payment method. |
     * | 337 | Exceeded the payment limit for this merchant. | | 338 | Payment information not
     * found. | | 339 | Duplicate payment information. | | 340 | This consumer's retail QR account
     * was rejected by the gateway. | | 341 | This merchant lacks the necessary information for this
     * gateway. | | 342 | Cross-border transaction not permitted: unauthorized currency. | | 343 |
     * Payment could not be processed due to a server error at the gateway. | | 344 | The selected
     * payment method is temporarily unavailable from the gateway. | | 345 | The payment has already
     * been canceled. | | 346 | Payment processing timed out due to system delay and was canceled. |
     * | 351 | Invalid transaction. | | 355 | The card does not support the specified payment
     * division (e.g., installments). | | 356 | The card is not registered for 3D Secure. | | 358 |
     * 3D Secure authentication failed (consumer reason, e.g., wrong password). | | 359 | 3D Secure
     * authentication failed (card company reason). | | 500 | A pre-processing error occurred during
     * the request execution. | | 501 | An internal error occurred. Please contact support. | | 502
     * | The request timed out waiting for a response. | | 601 | A system-released error occurred in
     * this service. Check details. | | 602 | The payment processor rejected the submitted request.
     * Check details. | | 603 | The submitted customer identity verification was rejected by
     * customs. | | 604 | The required customer ID information was not submitted by the merchant. |
     * @return Returns the Integer
     */
    @JsonGetter("code")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public Integer getCode() {
        return code;
    }

    /**
     * Setter for Code.
     * Payment Error Codes. | Code | Description | | :--- | :--- | | 301 | Card number error. | |
     * 302 | Invalid expiration month. | | 303 | Invalid expiration year. | | 304 | Card expired. |
     * | 305 | Security code (CVV) error. | | 306 | Card declined (authorization screening error). |
     * | 307 | Invalid card. | | 308 | This card has not been approved by the card company. | | 309
     * | General error occurred. Detailed information can be confirmed in the dashboard. | | 310 |
     * Invalid consumer data (invalid request data). | | 311 | Too many charges on the same card in
     * a short period. Please wait and try again. | | 312 | This charge cannot be canceled. | | 313
     * | Authorization expired (during charge capture). | | 314 | This card has been reported stolen
     * or invalidated by the issuer. | | 315 | Please contact the card issuer. | | 316 |
     * Cardholder's last name is required. | | 317 | Partial capture is not supported. | | 318 |
     * Partial refund is not supported. | | 319 | Suspected fraud (security restriction). | | 320 |
     * An error occurred in the bank's system. | | 321 | Dynamic descriptor is not supported. | |
     * 322 | Barcode/QR code is invalid. | | 323 | Barcode/QR code has expired. | | 324 | This
     * barcode/QR code has already been processed. | | 325 | This barcode/QR code is currently being
     * processed. | | 326 | Rejected due to a high-risk profile. | | 327 | Payment deadline
     * (5-minute timeout) has expired. | | 328 | Recovery failed. Manual intervention is required. |
     * | 329 | Refund failed. | | 330 | Insufficient funds. | | 331 | Metadata field value is
     * invalid or missing. | | 332 | Cross-border transaction not permitted: missing ID. | | 333 |
     * Cross-border transaction not permitted: missing phone number. | | 334 | Cross-border
     * transaction not permitted: unauthorized payment method. | | 335 | Cross-border transaction
     * not permitted: missing name. | | 336 | Exceeded the payment limit for this payment method. |
     * | 337 | Exceeded the payment limit for this merchant. | | 338 | Payment information not
     * found. | | 339 | Duplicate payment information. | | 340 | This consumer's retail QR account
     * was rejected by the gateway. | | 341 | This merchant lacks the necessary information for this
     * gateway. | | 342 | Cross-border transaction not permitted: unauthorized currency. | | 343 |
     * Payment could not be processed due to a server error at the gateway. | | 344 | The selected
     * payment method is temporarily unavailable from the gateway. | | 345 | The payment has already
     * been canceled. | | 346 | Payment processing timed out due to system delay and was canceled. |
     * | 351 | Invalid transaction. | | 355 | The card does not support the specified payment
     * division (e.g., installments). | | 356 | The card is not registered for 3D Secure. | | 358 |
     * 3D Secure authentication failed (consumer reason, e.g., wrong password). | | 359 | 3D Secure
     * authentication failed (card company reason). | | 500 | A pre-processing error occurred during
     * the request execution. | | 501 | An internal error occurred. Please contact support. | | 502
     * | The request timed out waiting for a response. | | 601 | A system-released error occurred in
     * this service. Check details. | | 602 | The payment processor rejected the submitted request.
     * Check details. | | 603 | The submitted customer identity verification was rejected by
     * customs. | | 604 | The required customer ID information was not submitted by the merchant. |
     * @param code Value for Integer
     */
    @JsonSetter("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Getter for Message.
     * A brief message detailing why the payment failed.
     * @return Returns the String
     */
    @JsonGetter("message")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getMessage() {
        return message;
    }

    /**
     * Setter for Message.
     * A brief message detailing why the payment failed.
     * @param message Value for String
     */
    @JsonSetter("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Getter for Detail.
     * Further specific details regarding the payment failure, if available.
     * @return Returns the String
     */
    @JsonGetter("detail")
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String getDetail() {
        return detail;
    }

    /**
     * Setter for Detail.
     * Further specific details regarding the payment failure, if available.
     * @param detail Value for String
     */
    @JsonSetter("detail")
    public void setDetail(String detail) {
        this.detail = detail;
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
     * Converts this PaymentError into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "PaymentError [" + "code=" + code + ", message=" + message + ", detail=" + detail
                + ", additionalProperties=" + additionalProperties + "]";
    }

    /**
     * Builds a new {@link PaymentError.Builder} object.
     * Creates the instance with the state of the current model.
     * @return a new {@link PaymentError.Builder} object
     */
    public Builder toBuilder() {
        Builder builder = new Builder()
                .code(getCode())
                .message(getMessage())
                .detail(getDetail());
        builder.additionalProperties = additionalProperties;
        return builder;
    }

    /**
     * Class to build instances of {@link PaymentError}.
     */
    public static class Builder {
        private Integer code;
        private String message;
        private String detail;
        private AdditionalProperties<Object> additionalProperties =
                new AdditionalProperties<Object>();



        /**
         * Setter for code.
         * @param  code  Integer value for code.
         * @return Builder
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Setter for message.
         * @param  message  String value for message.
         * @return Builder
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * Setter for detail.
         * @param  detail  String value for detail.
         * @return Builder
         */
        public Builder detail(String detail) {
            this.detail = detail;
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
         * Builds a new {@link PaymentError} object using the set fields.
         * @return {@link PaymentError}
         */
        public PaymentError build() {
            PaymentError model =
                    new PaymentError(code, message, detail);
            model.additionalProperties = additionalProperties;
            return model;
        }
    }
}
