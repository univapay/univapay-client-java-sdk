/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.authentication;

import com.univapay.api.BearerAuthCredentials;
import io.apimatic.core.authentication.HeaderAuth;
import java.util.Collections;

/**
 * Utility class for authorization and token management.
 */
public class BearerAuthManager extends HeaderAuth implements BearerAuthCredentials {

    /**
     * Private instance of the auth model containing the auth credentials.
     */
    private BearerAuthModel authModel;

    /**
     * Constructor.
     * @param authModel The instance of auth credentials.
     */
    public BearerAuthManager(BearerAuthModel authModel) {
        super(Collections.singletonMap("Authorization",
                applyBearerPrefix(authModel.getSecretKey(), authModel.getJwtToken())));
        this.authModel = authModel;
    }

    /**
     * applies bearer prefix to the combined secret key and JWT token.
     * @param secretKey The secret key.
     * @param jwtToken The JWT token.
     * @return The combined credentials with 'Bearer' as prefix.
     */
    private static String applyBearerPrefix(String secretKey, String jwtToken) {
        if (secretKey == null || secretKey == "" || jwtToken == null || jwtToken == "") {
            return null;
        }

        return "Bearer " + secretKey + "." + jwtToken;
    }

    /**
     * String value for secretKey.
     * @return secretKey
     */
    public String getSecretKey() {
        return authModel.getSecretKey();
    }

    /**
     * String value for jwtToken.
     * @return jwtToken
     */
    public String getJwtToken() {
        return authModel.getJwtToken();
    }

    /**
     * Checks if provided credentials matched with existing ones.
     * @param secretKey String value for the secret key.
     * @param jwtToken String value for the JWT token.
     * @return true if credentials matched.
     */
    public boolean equals(String secretKey, String jwtToken) {
        return secretKey.equals(getSecretKey()) && jwtToken.equals(getJwtToken());
    }

    /**
     * Converts this BearerAuthManager into string format.
     * @return String representation of this class
     */
    @Override
    public String toString() {
        return "BearerAuthManager [" + "secretKey=" + getSecretKey()
                + ", jwtToken=" + getJwtToken() + "]";
    }
    /**
    * Returns the error message if the auth credentials are not valid.
    * @return the auth specific error message.
    */
    @Override
    public String getErrorMessage() {
        String errorMessage = super.getErrorMessage();
        if (errorMessage == null) {
            return null;
        }

        return "BearerAuth - " + errorMessage;
    }

}