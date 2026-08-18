# Transaction History

```java
TransactionHistoryApi transactionHistoryApi = client.getTransactionHistoryApi();
```

## Class Name

`TransactionHistoryApi`

## Methods

* [List Transaction History](../../doc/controllers/transaction-history.md#list-transaction-history)
* [List Store Transaction History](../../doc/controllers/transaction-history.md#list-store-transaction-history)


# List Transaction History

Returns a paginated, searchable history of charges and refunds across all of the merchant's stores, combining both resource types into a single unified row shape.

```java
CompletableFuture<ApiResponse<TransactionHistoryList>> listTransactionHistoryAsync(
    final TransactionHistoryMode mode,
    final String shortId,
    final String from,
    final String to,
    final TransactionHistoryStatus status,
    final TransactionHistoryType type,
    final String search,
    final String email,
    final UUID id,
    final String metadata,
    final String cardExp,
    final String cardLastFour,
    final String cardholder,
    final List<String> cardBrand,
    final List<String> brand,
    final List<String> brands,
    final String currency,
    final TransactionHistoryServiceProvider serviceProvider,
    final List<TransactionHistoryServiceProvider> serviceProviders,
    final String gatewayTransactionId,
    final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
    final String bankTransferLatestDepositDateFrom,
    final String bankTransferLatestDepositDateTo,
    final Integer limit,
    final UUID cursor,
    final CursorDirectionQuery cursorDirection)
```

## Authentication

This endpoint requires [JWT_TOKEN](../../doc/auth/oauth-2-bearer-token.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `mode` | [`TransactionHistoryMode`](../../doc/models/transaction-history-mode.md) | Query, Optional | Filter by environment mode. |
| `shortId` | `String` | Query, Optional | Filter by the last 6 characters of a resource's UUID. Must be exactly 6 characters. |
| `from` | `String` | Query, Optional | Show rows created on or after this date. Accepts epoch-millis or an ISO-8601 date-time. Must not be later than `to`. |
| `to` | `String` | Query, Optional | Show rows created on or before this date. Accepts epoch-millis or an ISO-8601 date-time. Must not be earlier than `from`. |
| `status` | [`TransactionHistoryStatus`](../../doc/models/transaction-history-status.md) | Query, Optional | Filter by status. Accepts any charge or refund status value. |
| `type` | [`TransactionHistoryType`](../../doc/models/transaction-history-type.md) | Query, Optional | Filter by row type. |
| `search` | `String` | Query, Optional | Free-text search across cardholder/customer name and email. Wrap a value in quotes (`"first last"`) for an exact-phrase match; an unquoted value matches partially. |
| `email` | `String` | Query, Optional | Filter by email address. |
| `id` | `UUID` | Query, Optional | Filter by exact charge or refund ID. |
| `metadata` | `String` | Query, Optional | Filter by metadata. |
| `cardExp` | `String` | Query, Optional | Filter by card expiration, in `yyyy-MM` format. |
| `cardLastFour` | `String` | Query, Optional | Filter by the last 4 digits of the card. Must be exactly 4 characters. |
| `cardholder` | `String` | Query, Optional | Filter by cardholder name. Partial match by default; wrap in quotes for an exact-phrase match. |
| `cardBrand` | `List<String>` | Query, Optional | Deprecated legacy alias of `brand`; use `brand` instead. Repeatable via the `[]` suffix (e.g. `card_brand[]=visa&card_brand[]=jcb`). Raw brand identifiers vary by payment type — see the `user_data.brand` field on this endpoint's response. |
| `brand` | `List<String>` | Query, Optional | Filter by brand. Repeatable via the `[]` suffix (e.g. `brand[]=visa&brand[]=jcb`). Raw brand identifiers vary by payment type — see the `user_data.brand` field on this endpoint's response. |
| `brands` | `List<String>` | Query, Optional | Deprecated legacy alias of `brand`; use `brand` instead. Repeatable via the `[]` suffix (e.g. `brands[]=visa&brands[]=jcb`). Raw brand identifiers vary by payment type — see the `user_data.brand` field on this endpoint's response. |
| `currency` | `String` | Query, Optional | Filter by currency (ISO-4217). |
| `serviceProvider` | [`TransactionHistoryServiceProvider`](../../doc/models/transaction-history-service-provider.md) | Query, Optional | Filter by service provider. |
| `serviceProviders` | [`List<TransactionHistoryServiceProvider>`](../../doc/models/transaction-history-service-provider.md) | Query, Optional | Filter by service provider. Repeatable via the `[]` suffix (e.g. `service_providers[]=credit&service_providers[]=paidy`). Must not be empty; duplicate values are deduplicated. |
| `gatewayTransactionId` | `String` | Query, Optional | Filter by the gateway's own transaction ID (free text). |
| `bankTransferPaymentStatuses` | [`List<BankTransferPaymentStatus>`](../../doc/models/bank-transfer-payment-status.md) | Query, Optional | Filter bank transfer rows by payment status. Repeatable via the `[]` suffix (e.g. `bank_transfer_payment_statuses[]=unpaid&bank_transfer_payment_statuses[]=exact`). |
| `bankTransferLatestDepositDateFrom` | `String` | Query, Optional | Start of the range (inclusive) for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time. |
| `bankTransferLatestDepositDateTo` | `String` | Query, Optional | End of the range (inclusive) for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time. |
| `limit` | `Integer` | Query, Optional | Maximum number of resources to return in one page.<br><br>**Default**: `10`<br><br>**Constraints**: `<= 100` |
| `cursor` | `UUID` | Query, Optional | Cursor pointing to the resource after which pagination should continue. |
| `cursorDirection` | [`CursorDirectionQuery`](../../doc/models/cursor-direction-query.md) | Query, Optional | Pagination direction relative to the supplied cursor.<br><br>**Default**: `CursorDirectionQuery.DESC` |

## Response Type

**200**: Paginated transaction history.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`TransactionHistoryList`](../../doc/models/transaction-history-list.md).

## Example Usage

```java
TransactionHistoryMode mode = TransactionHistoryMode.TEST;
String shortId = "8bfc29";
String from = "04/01/2026 00:00:00";
String to = "04/30/2026 23:59:59";
TransactionHistoryStatus status = TransactionHistoryStatus.SUCCESSFUL;
TransactionHistoryType type = TransactionHistoryType.CHARGE;
String search = "Taro Yamada";
String email = "user@example.com";
UUID id = UUID.fromString("11ef0000-0000-4000-8000-000000000070");
String metadata = "order_id: 12345";
String cardExp = "2026-04";
String cardLastFour = "4242";
String cardholder = "TARO YAMADA";
List<String> cardBrand = Liquid error: Value cannot be null. (Parameter 'key');

List<String> brand = Liquid error: Value cannot be null. (Parameter 'key');

List<String> brands = Liquid error: Value cannot be null. (Parameter 'key');

String currency = "JPY";
TransactionHistoryServiceProvider serviceProvider = TransactionHistoryServiceProvider.CREDIT;
List<TransactionHistoryServiceProvider> serviceProviders = Liquid error: Value cannot be null. (Parameter 'key');

String gatewayTransactionId = "gw-txn-00123456";
List<BankTransferPaymentStatus> bankTransferPaymentStatuses = Liquid error: Value cannot be null. (Parameter 'key');

String bankTransferLatestDepositDateFrom = "04/01/2026 00:00:00";
String bankTransferLatestDepositDateTo = "04/30/2026 23:59:59";
Integer limit = 10;
UUID cursor = UUID.fromString("3541d4fa-596d-428e-8a36-f274e1b3d505");
CursorDirectionQuery cursorDirection = CursorDirectionQuery.ASC;

transactionHistoryApi.listTransactionHistoryAsync(mode, shortId, from, to, status, type, search, email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand, brand, brands, currency, serviceProvider, serviceProviders, gatewayTransactionId, bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom, bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ApiErrorException) {
        ApiErrorException apiErrorException = (ApiErrorException) cause;
        apiErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "items": [
    {
      "store_id": "11edf541-c42d-653c-8c3d-dfe0a55f95c0",
      "resource_id": "11ef0000-0000-4000-8000-000000000070",
      "charge_id": null,
      "amount": 1000,
      "currency": "JPY",
      "amount_formatted": 1000,
      "type": "charge",
      "status": "successful",
      "metadata": {},
      "created_on": "2024-05-01T12:34:56.789Z",
      "mode": "test",
      "merchant_name": "Test merchant",
      "store_name": "Test store",
      "payment_type": "card",
      "user_data": {
        "type": "charge",
        "cardholder_name": "Some Guy",
        "cardholder_email_address": "test4@univapay.com",
        "brand": "visa",
        "gateway": "test",
        "service_provider": "credit",
        "refunds": [
          {
            "refund_id": "11ef0000-0000-4000-8000-000000000010",
            "amount": 500,
            "currency": "JPY",
            "amount_formatted": 500,
            "status": "successful"
          }
        ]
      },
      "bank_transfer_payment_status": null,
      "bank_transfer_latest_deposit_date": null,
      "mcp_token_id": null,
      "charge_type": "normal"
    },
    {
      "store_id": "11edf541-c42d-653c-8c3d-dfe0a55f95c0",
      "resource_id": "11ef0000-0000-4000-8000-000000000010",
      "charge_id": "11ef0000-0000-4000-8000-000000000070",
      "amount": 500,
      "currency": "JPY",
      "amount_formatted": 500,
      "type": "refund",
      "status": "successful",
      "metadata": {},
      "created_on": "2024-05-01T13:00:00.000000Z",
      "mode": "test",
      "merchant_name": "Test merchant",
      "store_name": "Test store",
      "payment_type": "card",
      "user_data": {
        "type": "refund",
        "reason": "customer_request"
      },
      "bank_transfer_payment_status": null,
      "bank_transfer_latest_deposit_date": null,
      "mcp_token_id": null,
      "charge_type": null
    }
  ],
  "has_more": false,
  "total_hits": 2
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request (400). The request was invalid or could not be processed.  Common codes: VALIDATION_ERROR, INVALID_TOKEN_TYPE, NOT_SUPPORTED_BY_PROCESSOR. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 401 | Unauthorized (401). Authentication failed.  Common codes: AUTH_HEADER_MISSING, INVALID_APP_TOKEN, INVALID_CREDENTIALS. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 403 | Forbidden (403). The request is understood, but access is refused.  This occurs if permissions are insufficient or if a security lock is triggered. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 429 | Too Many Requests (429). Rate limit exceeded. Returns an empty JSON object in this spec. | `ApiException` |


# List Store Transaction History

Returns a paginated, searchable history of charges and refunds for a single store, combining both resource types into a single unified row shape.

```java
CompletableFuture<ApiResponse<TransactionHistoryList>> listStoreTransactionHistoryAsync(
    final UUID storeId,
    final TransactionHistoryMode mode,
    final String shortId,
    final String from,
    final String to,
    final TransactionHistoryStatus status,
    final TransactionHistoryType type,
    final String search,
    final String email,
    final UUID id,
    final String metadata,
    final String cardExp,
    final String cardLastFour,
    final String cardholder,
    final List<String> cardBrand,
    final List<String> brand,
    final List<String> brands,
    final String currency,
    final TransactionHistoryServiceProvider serviceProvider,
    final List<TransactionHistoryServiceProvider> serviceProviders,
    final String gatewayTransactionId,
    final List<BankTransferPaymentStatus> bankTransferPaymentStatuses,
    final String bankTransferLatestDepositDateFrom,
    final String bankTransferLatestDepositDateTo,
    final Integer limit,
    final UUID cursor,
    final CursorDirectionQuery cursorDirection)
```

## Authentication

This endpoint requires [JWT_TOKEN](../../doc/auth/oauth-2-bearer-token.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `storeId` | `UUID` | Template, Required | The unique identifier of the store. |
| `mode` | [`TransactionHistoryMode`](../../doc/models/transaction-history-mode.md) | Query, Optional | Filter by environment mode. |
| `shortId` | `String` | Query, Optional | Filter by the last 6 characters of a resource's UUID. Must be exactly 6 characters. |
| `from` | `String` | Query, Optional | Show rows created on or after this date. Accepts epoch-millis or an ISO-8601 date-time. Must not be later than `to`. |
| `to` | `String` | Query, Optional | Show rows created on or before this date. Accepts epoch-millis or an ISO-8601 date-time. Must not be earlier than `from`. |
| `status` | [`TransactionHistoryStatus`](../../doc/models/transaction-history-status.md) | Query, Optional | Filter by status. Accepts any charge or refund status value. |
| `type` | [`TransactionHistoryType`](../../doc/models/transaction-history-type.md) | Query, Optional | Filter by row type. |
| `search` | `String` | Query, Optional | Free-text search across cardholder/customer name and email. Wrap a value in quotes (`"first last"`) for an exact-phrase match; an unquoted value matches partially. |
| `email` | `String` | Query, Optional | Filter by email address. |
| `id` | `UUID` | Query, Optional | Filter by exact charge or refund ID. |
| `metadata` | `String` | Query, Optional | Filter by metadata. |
| `cardExp` | `String` | Query, Optional | Filter by card expiration, in `yyyy-MM` format. |
| `cardLastFour` | `String` | Query, Optional | Filter by the last 4 digits of the card. Must be exactly 4 characters. |
| `cardholder` | `String` | Query, Optional | Filter by cardholder name. Partial match by default; wrap in quotes for an exact-phrase match. |
| `cardBrand` | `List<String>` | Query, Optional | Deprecated legacy alias of `brand`; use `brand` instead. Repeatable via the `[]` suffix (e.g. `card_brand[]=visa&card_brand[]=jcb`). Raw brand identifiers vary by payment type — see the `user_data.brand` field on this endpoint's response. |
| `brand` | `List<String>` | Query, Optional | Filter by brand. Repeatable via the `[]` suffix (e.g. `brand[]=visa&brand[]=jcb`). Raw brand identifiers vary by payment type — see the `user_data.brand` field on this endpoint's response. |
| `brands` | `List<String>` | Query, Optional | Deprecated legacy alias of `brand`; use `brand` instead. Repeatable via the `[]` suffix (e.g. `brands[]=visa&brands[]=jcb`). Raw brand identifiers vary by payment type — see the `user_data.brand` field on this endpoint's response. |
| `currency` | `String` | Query, Optional | Filter by currency (ISO-4217). |
| `serviceProvider` | [`TransactionHistoryServiceProvider`](../../doc/models/transaction-history-service-provider.md) | Query, Optional | Filter by service provider. |
| `serviceProviders` | [`List<TransactionHistoryServiceProvider>`](../../doc/models/transaction-history-service-provider.md) | Query, Optional | Filter by service provider. Repeatable via the `[]` suffix (e.g. `service_providers[]=credit&service_providers[]=paidy`). Must not be empty; duplicate values are deduplicated. |
| `gatewayTransactionId` | `String` | Query, Optional | Filter by the gateway's own transaction ID (free text). |
| `bankTransferPaymentStatuses` | [`List<BankTransferPaymentStatus>`](../../doc/models/bank-transfer-payment-status.md) | Query, Optional | Filter bank transfer rows by payment status. Repeatable via the `[]` suffix (e.g. `bank_transfer_payment_statuses[]=unpaid&bank_transfer_payment_statuses[]=exact`). |
| `bankTransferLatestDepositDateFrom` | `String` | Query, Optional | Start of the range (inclusive) for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time. |
| `bankTransferLatestDepositDateTo` | `String` | Query, Optional | End of the range (inclusive) for `bank_transfer_latest_deposit_date`. Accepts epoch-millis or an ISO-8601 date-time. |
| `limit` | `Integer` | Query, Optional | Maximum number of resources to return in one page.<br><br>**Default**: `10`<br><br>**Constraints**: `<= 100` |
| `cursor` | `UUID` | Query, Optional | Cursor pointing to the resource after which pagination should continue. |
| `cursorDirection` | [`CursorDirectionQuery`](../../doc/models/cursor-direction-query.md) | Query, Optional | Pagination direction relative to the supplied cursor.<br><br>**Default**: `CursorDirectionQuery.DESC` |

## Response Type

**200**: Paginated transaction history for the store.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`TransactionHistoryList`](../../doc/models/transaction-history-list.md).

## Example Usage

```java
UUID storeId = UUID.fromString("0cab399b-5621-425b-993b-f8507eba1e78");
TransactionHistoryMode mode = TransactionHistoryMode.TEST;
String shortId = "8bfc29";
String from = "04/01/2026 00:00:00";
String to = "04/30/2026 23:59:59";
TransactionHistoryStatus status = TransactionHistoryStatus.SUCCESSFUL;
TransactionHistoryType type = TransactionHistoryType.CHARGE;
String search = "Taro Yamada";
String email = "user@example.com";
UUID id = UUID.fromString("11ef0000-0000-4000-8000-000000000070");
String metadata = "order_id: 12345";
String cardExp = "2026-04";
String cardLastFour = "4242";
String cardholder = "TARO YAMADA";
List<String> cardBrand = Liquid error: Value cannot be null. (Parameter 'key');

List<String> brand = Liquid error: Value cannot be null. (Parameter 'key');

List<String> brands = Liquid error: Value cannot be null. (Parameter 'key');

String currency = "JPY";
TransactionHistoryServiceProvider serviceProvider = TransactionHistoryServiceProvider.CREDIT;
List<TransactionHistoryServiceProvider> serviceProviders = Liquid error: Value cannot be null. (Parameter 'key');

String gatewayTransactionId = "gw-txn-00123456";
List<BankTransferPaymentStatus> bankTransferPaymentStatuses = Liquid error: Value cannot be null. (Parameter 'key');

String bankTransferLatestDepositDateFrom = "04/01/2026 00:00:00";
String bankTransferLatestDepositDateTo = "04/30/2026 23:59:59";
Integer limit = 10;
UUID cursor = UUID.fromString("3541d4fa-596d-428e-8a36-f274e1b3d505");
CursorDirectionQuery cursorDirection = CursorDirectionQuery.ASC;

transactionHistoryApi.listStoreTransactionHistoryAsync(storeId, mode, shortId, from, to, status, type, search, email, id, metadata, cardExp, cardLastFour, cardholder, cardBrand, brand, brands, currency, serviceProvider, serviceProviders, gatewayTransactionId, bankTransferPaymentStatuses, bankTransferLatestDepositDateFrom, bankTransferLatestDepositDateTo, limit, cursor, cursorDirection).thenAccept(result -> {
    // TODO success callback handler
    System.out.println(result);
}).exceptionally(exception -> {
    Throwable cause = exception.getCause();

    if (cause instanceof ApiErrorException) {
        ApiErrorException apiErrorException = (ApiErrorException) cause;
        apiErrorException.printStackTrace();
    } else {
        // fallback for unexpected errors
        exception.printStackTrace();
    }

    return null;
});
```

## Example Response *(as JSON)*

```json
{
  "items": [
    {
      "store_id": "11edf541-c42d-653c-8c3d-dfe0a55f95c0",
      "resource_id": "11ef0000-0000-4000-8000-000000000072",
      "charge_id": null,
      "amount": 2500,
      "currency": "JPY",
      "amount_formatted": 2500,
      "type": "charge",
      "status": "awaiting",
      "metadata": {},
      "created_on": "2024-05-03T10:00:00.000000Z",
      "mode": "live",
      "merchant_name": "Test merchant",
      "store_name": "Test store",
      "payment_type": "bank_transfer",
      "user_data": {
        "type": "charge",
        "cardholder_email_address": "test_bank_transfer@test.com",
        "brand": "aozora_bank",
        "gateway": "aozora_bank",
        "service_provider": "bank_transfer",
        "refunds": []
      },
      "bank_transfer_payment_status": "unpaid",
      "bank_transfer_latest_deposit_date": null,
      "mcp_token_id": null,
      "charge_type": "normal"
    }
  ],
  "has_more": false,
  "total_hits": 1
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request (400). The request was invalid or could not be processed.  Common codes: VALIDATION_ERROR, INVALID_TOKEN_TYPE, NOT_SUPPORTED_BY_PROCESSOR. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 401 | Unauthorized (401). Authentication failed.  Common codes: AUTH_HEADER_MISSING, INVALID_APP_TOKEN, INVALID_CREDENTIALS. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 403 | Forbidden (403). The request is understood, but access is refused.  This occurs if permissions are insufficient or if a security lock is triggered. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 404 | Not Found (404). The requested resource (e.g., Store ID or Token ID) does not exist. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 429 | Too Many Requests (429). Rate limit exceeded. Returns an empty JSON object in this spec. | `ApiException` |

