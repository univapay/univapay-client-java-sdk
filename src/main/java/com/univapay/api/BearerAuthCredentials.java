/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api;

/**
 * Interface to access authentication credentials.
 */
public interface BearerAuthCredentials {

    /**
     * String value for secretKey.
     * @return secretKey
     */
    String getSecretKey();

    /**
     * String value for jwtToken.
     * @return jwtToken
     */
    String getJwtToken();

    /**
     * Checks if provided credentials matched with existing ones.
     * @param secretKey String value for the secret key.
     * @param jwtToken String value for the JWT token.
     * @return true if credentials matched.
     */
    boolean equals(String secretKey, String jwtToken);
}