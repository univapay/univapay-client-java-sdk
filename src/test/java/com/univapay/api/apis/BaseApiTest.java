/*
 * UnivapayClientSdk
 *
 * This file was automatically generated for Univapay by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.univapay.api.apis;

import com.univapay.api.Environment;
import com.univapay.api.UnivapayClientSdkClient;
import com.univapay.api.authentication.BearerAuthModel;
import com.univapay.api.testing.HttpCallbackCatcher;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

/**
 * Base class for all test cases.
 */
public class BaseApiTest {
    /**
     * Test configuration.
     */
    public static final int REQUEST_TIMEOUT = 30;

    public static final double ASSERT_PRECISION = 0.01;
    
    /**
     * Global rules for tests.
     */
    @Rule
    public Timeout globalTimeout = Timeout.seconds(REQUEST_TIMEOUT);
    
    /**
     * Test fixtures,
     * Used to serve as HttpCallback and to capture request & response.
     */

    protected static HttpCallbackCatcher httpResponse;
    
    /**
     * Setup test.
     */
    @BeforeClass
    public static void setUp() throws Exception {
        httpResponse = new HttpCallbackCatcher(); 
    }

    /**
     * Tear down test.
     */
    @AfterClass
    public static void tearDown() throws Exception {
        httpResponse = null;
    }

    /**
     * Create test configuration from Environment variables.
     */
    protected static UnivapayClientSdkClient createConfigurationFromEnvironment() {
        UnivapayClientSdkClient.Builder builder = new UnivapayClientSdkClient.Builder();

        final String environment = System.getenv("UNIVAPAY_CLIENT_SDK_ENVIRONMENT");
        final String baseUrl = System.getenv("UNIVAPAY_CLIENT_SDK_BASE_URL");
        final String directDebitBaseUrl =
                System.getenv("UNIVAPAY_CLIENT_SDK_DIRECT_DEBIT_BASE_URL");
        final String timeout = System.getenv("UNIVAPAY_CLIENT_SDK_TIMEOUT");
        final String secretKey = System.getenv("UNIVAPAY_CLIENT_SDK_SECRET_KEY");
        final String jwtToken = System.getenv("UNIVAPAY_CLIENT_SDK_JWT_TOKEN");

        if (secretKey != null && jwtToken != null) {
            builder.bearerAuthCredentials(new BearerAuthModel
                    .Builder(secretKey, jwtToken)
                    .build());
        }
        if (environment != null) {
            builder.environment(Environment.fromString(environment));
        }
        if (baseUrl != null) {
            builder.baseUrl(baseUrl);
        }
        if (directDebitBaseUrl != null) {
            builder.directDebitBaseUrl(directDebitBaseUrl);
        }
        if (timeout != null) {
            builder.httpClientConfig(configBuilder -> configBuilder.timeout(
                    Long.parseLong(timeout)));
        }
        return builder.build();
    }

    /**
     * Create test configuration.
     */
    protected static UnivapayClientSdkClient createConfiguration() {
        // Set Configuration parameters for test execution
        UnivapayClientSdkClient config = createConfigurationFromEnvironment();
        config = config.newBuilder()
                .httpCallback(httpResponse)
                .build();
        return config;
    }
}
