
# Getting Started with Univapay Public API

## Introduction

OpenAPI specification for the Univapay Online Payment API.

### Authentication (JWT)

This API uses JWT (JSON Web Tokens) for authentication via the HTTP `Authorization` header. To authenticate, you must generate an **Application Token** in the Univapay dashboard.  This generates two components: 1. **Token (`{jwt}`)** 2. **Secret (`{secret}`)**

#### ⚠️ Security Warning

The **Secret** grants extensive privileges (e.g., creating charges, capturing authorized card charges, refunding).
**NEVER expose the `{secret}` in frontend application code** (e.g., consumer browsers) or public repositories. It is strictly for backend server-to-server communication.
*Univapay is not responsible for accidents caused by leaked secrets.*

#### Bearer Auth Formats

Depending on where you are calling the API from, the Bearer format changes:

* **Frontend / Browser (No Secret)**: `Bearer {jwt}`
  *(Used for Widgets or Inline Forms. You must register your allowed domains in the dashboard when creating the token).*
* **Backend / Server (With Secret)**: `Bearer {secret}.{jwt}`
  *(Required for all backend processing).*

We will assume that all requests are going to originate from a backend server thus, all requests will require the secret

#### Token Types

* **Store Token**: Grants full access to requests for that specific store.
* **Merchant Token**: Can't create transaction tokens but can access data from multiple stores.

## Install the Package

Install the SDK by adding the following dependency in your project's pom.xml file:

```xml
<dependency>
  <groupId>com.univapay</groupId>
  <artifactId>univapay-client-sdk</artifactId>
  <version>1.2.1</version>
</dependency>
```

You can also view the package at:
https://central.sonatype.com/artifact/com.univapay/univapay-client-sdk/1.2.1

## Test the SDK

The generated code and the server can be tested using automatically generated test cases.
JUnit is used as the testing framework and test runner.

In Eclipse, for running the tests do the following:

1. Select the project UnivapayClientSdk from the package explorer.
2. Select `Run -> Run as -> JUnit Test` or use `Alt + Shift + X` followed by `T` to run the Tests.

## Initialize the API Client

**_Note:_** Documentation for the client can be found [here.](doc/client.md)

The following parameters are configurable for the API Client:

| Parameter | Type | Description |
|  --- | --- | --- |
| baseUrl | `String` | Base URL for the API<br>*Default*: `"https://api.univapay.com"` |
| directDebitBaseUrl | `String` | Base URL for the Direct Debit API<br>*Default*: `"https://direct-debit.gopay-services.com"` |
| environment | [`Environment`](README.md#environments) | The API environment. <br> **Default: `Environment.PRODUCTION`** |
| httpClientConfig | [`Consumer<HttpClientConfiguration.Builder>`](doc/http-client-configuration-builder.md) | Set up Http Client Configuration instance. |
| loggingConfig | [`Consumer<ApiLoggingConfiguration.Builder>`](doc/api-logging-configuration-builder.md) | Set up Logging Configuration instance. |
| bearerAuthCredentials | [`BearerAuthCredentials`](doc/auth/oauth-2-bearer-token.md) | The Credentials Setter for OAuth 2 Bearer token |

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
            .directDebitBaseUrl("https://direct-debit.gopay-services.com")
            .build();

    }
}
```

## Environments

The SDK can be configured to use a different environment for making API calls. Available environments are:

### Fields

| Name | Description |
|  --- | --- |
| PRODUCTION | **Default** Production Server |

## Authorization

This API uses the following authentication schemes.

* [`JWT_TOKEN (OAuth 2 Bearer token)`](doc/auth/oauth-2-bearer-token.md)

## List of APIs

* [Transaction Tokens](doc/controllers/transaction-tokens.md)
* [Direct Debit](doc/controllers/direct-debit.md)
* [Transaction History](doc/controllers/transaction-history.md)
* [Charges](doc/controllers/charges.md)
* [Refunds](doc/controllers/refunds.md)
* [Subscriptions](doc/controllers/subscriptions.md)
* [Cancels](doc/controllers/cancels.md)
* [Merchants](doc/controllers/merchants.md)
* [Stores](doc/controllers/stores.md)
* [Webhooks](doc/controllers/webhooks.md)
* [Checkout](doc/controllers/checkout.md)

## Webhooks

* [Charge](doc/events/webhooks/charge-handler.md)
* [Token](doc/events/webhooks/token-handler.md)
* [Refund](doc/events/webhooks/refund-handler.md)
* [Cancel](doc/events/webhooks/cancel-handler.md)
* [Subscription](doc/events/webhooks/subscription-handler.md)
* [Bank-Transfer](doc/events/webhooks/bank-transfer-handler.md)
* [Customs](doc/events/webhooks/customs-handler.md)

## SDK Infrastructure

### Configuration

* [ApiLoggingConfiguration](doc/api-logging-configuration.md)
* [ApiLoggingConfiguration.Builder](doc/api-logging-configuration-builder.md)
* [ApiRequestLoggingConfiguration.Builder](doc/api-request-logging-configuration-builder.md)
* [ApiResponseLoggingConfiguration.Builder](doc/api-response-logging-configuration-builder.md)
* [Configuration Interface](doc/configuration-interface.md)
* [HttpClientConfiguration](doc/http-client-configuration.md)
* [HttpClientConfiguration.Builder](doc/http-client-configuration-builder.md)
* [HttpProxyConfiguration](doc/http-proxy-configuration.md)
* [HttpProxyConfiguration.Builder](doc/http-proxy-configuration-builder.md)

### HTTP

* [Headers](doc/headers.md)
* [HttpCallback Interface](doc/http-callback-interface.md)
* [HttpContext](doc/http-context.md)
* [HttpBodyRequest](doc/http-body-request.md)
* [HttpRequest](doc/http-request.md)
* [HttpResponse](doc/http-response.md)
* [HttpStringResponse](doc/http-string-response.md)

### Utilities

* [ApiException](doc/api-exception.md)
* [ApiResponse](doc/api-response.md)
* [ApiHelper](doc/api-helper.md)
* [FileWrapper](doc/file-wrapper.md)
* [DateTimeHelper](doc/date-time-helper.md)

