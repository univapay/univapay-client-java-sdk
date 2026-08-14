/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api;

import com.univapay.api.authentication.BearerAuthModel;
import com.univapay.api.http.client.ReadonlyHttpClientConfiguration;
import com.univapay.api.logging.configuration.ReadonlyLoggingConfiguration;

/**
 * Configuration Interface for the library.
 */
public interface Configuration {

    /**
     * Current API environment.
     * @return a copy of environment
     */
    Environment getEnvironment();

    /**
     * Base URL for the API
     * @return a copy of baseUrl
     */
    String getBaseUrl();

    /**
     * Base URL for the Direct Debit API
     * @return a copy of directDebitBaseUrl
     */
    String getDirectDebitBaseUrl();

    /**
     * Http Client Configuration instance.
     * @return a copy of httpClientConfig
     */
    ReadonlyHttpClientConfiguration getHttpClientConfig();

    /**
     * Logging Configuration instance.
     * @return a copy of loggingConfig
     */
    ReadonlyLoggingConfiguration getLoggingConfig();

    /**
     * The timeout to use for making HTTP requests. The timeout to use for making HTTP requests.
     * @return a copy of timeout
     */
    long timeout();

    /**
     * The secret key to use, together with the JWT token, for API requests.
     * @return secretKey
     */
    String getSecretKey();

    /**
     * The JWT token to use, together with the secret key, for API requests.
     * @return jwtToken
     */
    String getJwtToken();

    /**
     * The credentials to use with BearerAuth.
     * @return bearerAuthCredentials
     */
    BearerAuthCredentials getBearerAuthCredentials();

    /**
     * The auth credential model for BearerAuth.
     * @return the instance of BearerAuthModel
     */
    BearerAuthModel getBearerAuthModel();

    /**
     * Get base URI by current environment.
     * @param server Server for which to get the base URI
     * @return Processed base URI
     */
    String getBaseUri(Server server);

    /**
     * Get base URI by current environment.
     * @return Processed base URI
     */
    String getBaseUri();
}
