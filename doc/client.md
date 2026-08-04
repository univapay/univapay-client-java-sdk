
# Client Class Documentation

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| baseUrl | `String` | Base URL for the API<br>*Default*: `"https://api.univapay.com"` |
| environment | [`Environment`](../README.md#environments) | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](../doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| loggingConfig | [`Consumer<ApiLoggingConfiguration.Builder>`](../doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| bearerAuthCredentials | [`BearerAuthCredentials`](auth/oauth-2-bearer-token.md) | The Credentials Setter for OAuth 2 Bearer token |

The API client can be initialized as follows:

```java
import com.univapay.api.Environment;
import com.univapay.api.UnivapayClientSdkClient;
import com.univapay.api.authentication.BearerAuthModel;
import com.univapay.api.exceptions.ApiException;
import com.univapay.api.http.response.ApiResponse;
import org.slf4j.event.Level;

public class Program {
    public static void main(String[] args) {
        UnivapayClientSdkClient client = new UnivapayClientSdkClient.Builder()
            .loggingConfig(builder -> builder
                    .level(Level.DEBUG)
                    .requestConfig(logConfigBuilder -> logConfigBuilder.body(true))
                    .responseConfig(logConfigBuilder -> logConfigBuilder.headers(true)))
            .httpClientConfig(configBuilder -> configBuilder
                    .timeout(0))
            .bearerAuthCredentials(new BearerAuthModel.Builder(
                    "AccessToken"
                )
                .build())
            .environment(Environment.PRODUCTION)
            .baseUrl("https://api.univapay.com")
            .build();

    }
}
```

## Univapay Public APIClient Class

The gateway for the SDK. This class acts as a factory for the Apis and also holds the configuration of the SDK.

### Apis

| Name | Description | Return Type |
|  --- | --- | --- |
| `getChargesApi()` | Provides access to Charges controller. | `ChargesApi` |
| `getTransactionTokensApi()` | Provides access to TransactionTokens controller. | `TransactionTokensApi` |
| `getRefundsApi()` | Provides access to Refunds controller. | `RefundsApi` |
| `getSubscriptionsApi()` | Provides access to Subscriptions controller. | `SubscriptionsApi` |
| `getCancelsApi()` | Provides access to Cancels controller. | `CancelsApi` |
| `getMerchantsApi()` | Provides access to Merchants controller. | `MerchantsApi` |
| `getStoresApi()` | Provides access to Stores controller. | `StoresApi` |
| `getWebhooksApi()` | Provides access to Webhooks controller. | `WebhooksApi` |

### Methods

| Name | Description | Return Type |
|  --- | --- | --- |
| `shutdown()` | Shutdown the underlying HttpClient instance. | `void` |
| `getEnvironment()` | Current API environment. | `Environment` |
| `getBaseUrl()` | Base URL for the API | `String` |
| `getHttpClient()` | The HTTP Client instance to use for making HTTP requests. | `HttpClient` |
| `getHttpClientConfig()` | Http Client Configuration instance. | [`ReadonlyHttpClientConfiguration`](../doc/http-client-configuration.md) |
| `getLoggingConfig()` | Logging Configuration instance. | [`ReadonlyLoggingConfiguration`](../doc/api-logging-configuration.md) |
| `getBearerAuthCredentials()` | The credentials to use with BearerAuth. | [`BearerAuthCredentials`](auth/oauth-2-bearer-token.md) |
| `getBaseUri(Server server)` | Get base URI by current environment | `String` |
| `getBaseUri()` | Get base URI by current environment | `String` |

