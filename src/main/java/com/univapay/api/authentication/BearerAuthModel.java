/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.authentication;

/**
 * A data class for OAuth 2 Bearer token credentials.
 */
public class BearerAuthModel {
    private String secretKey;
    private String jwtToken;

    /**
     * A Constructor for BearerAuthModel.
     */
    private BearerAuthModel(String secretKey, String jwtToken) {
        this.secretKey = secretKey;
        this.jwtToken = jwtToken;
    }

    /**
     * Getter for secretKey.
     * @return secretKey The value of SecretKey.
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * Getter for jwtToken.
     * @return jwtToken The value of JwtToken.
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    /**
     * Builds a new {@link BearerAuthModel.Builder} object.
     * Creates the instance with the state of the current auth model.
     * @return a new {@link BearerAuthModel.Builder} object.
     */
    public Builder toBuilder() {
        return new Builder(getSecretKey(), getJwtToken());
    }

    /**
     * A Builder class for OAuth 2 Bearer token credentials.
     */
    public static class Builder {
        private String secretKey;
        private String jwtToken;

        /**
         * The constructor with required auth credentials.
         * @param secretKey The value of SecretKey.
         * @param jwtToken The value of JwtToken.
         */
        public Builder(String secretKey, String jwtToken) {
            if (secretKey == null) {
                throw new NullPointerException("SecretKey cannot be null.");
            }
            if (jwtToken == null) {
                throw new NullPointerException("JwtToken cannot be null.");
            }

            this.secretKey = secretKey;
            this.jwtToken = jwtToken;
        }

        /**
         * Setter for secretKey.
         * @param secretKey The value of SecretKey.
         * @return Builder The current instance of Builder.
         */
        public Builder secretKey(String secretKey) {
            if (secretKey == null) {
                throw new NullPointerException("SecretKey cannot be null.");
            }

            this.secretKey = secretKey;
            return this;
        }

        /**
         * Setter for jwtToken.
         * @param jwtToken The value of JwtToken.
         * @return Builder The current instance of Builder.
         */
        public Builder jwtToken(String jwtToken) {
            if (jwtToken == null) {
                throw new NullPointerException("JwtToken cannot be null.");
            }

            this.jwtToken = jwtToken;
            return this;
        }

        /**
         * Builds the instance of BearerAuthModel using the provided credentials.
         * @return The instance of BearerAuthModel.
         */
        public BearerAuthModel build() {
            return new BearerAuthModel(secretKey, jwtToken);
        }
    }
}