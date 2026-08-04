# Cancels

Endpoints to create and manage cancellations for charges.

```java
CancelsApi cancelsApi = client.getCancelsApi();
```

## Class Name

`CancelsApi`

## Methods

* [List Cancels](../../doc/controllers/cancels.md#list-cancels)
* [Create Cancel](../../doc/controllers/cancels.md#create-cancel)
* [Get Cancel](../../doc/controllers/cancels.md#get-cancel)
* [Update Cancel](../../doc/controllers/cancels.md#update-cancel)


# List Cancels

Returns a paginated list of cancels for the specified charge.

```java
CompletableFuture<ApiResponse<CancelList>> listCancelsAsync(
    final UUID storeId,
    final UUID chargeId,
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
| `chargeId` | `UUID` | Template, Required | The unique identifier of the charge. |
| `limit` | `Integer` | Query, Optional | Maximum number of resources to return in one page.<br><br>**Default**: `10`<br><br>**Constraints**: `<= 100` |
| `cursor` | `UUID` | Query, Optional | Cursor pointing to the resource after which pagination should continue. |
| `cursorDirection` | [`CursorDirectionQuery`](../../doc/models/cursor-direction-query.md) | Query, Optional | Pagination direction relative to the supplied cursor.<br><br>**Default**: `CursorDirectionQuery.DESC` |

## Response Type

**200**: Paginated list of cancels.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`CancelList`](../../doc/models/cancel-list.md).

## Example Usage

```java
UUID storeId = UUID.fromString("0cab399b-5621-425b-993b-f8507eba1e78");
UUID chargeId = UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
Integer limit = 10;
UUID cursor = UUID.fromString("3541d4fa-596d-428e-8a36-f274e1b3d505");
CursorDirectionQuery cursorDirection = CursorDirectionQuery.ASC;

cancelsApi.listCancelsAsync(storeId, chargeId, limit, cursor, cursorDirection).thenAccept(result -> {
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
      "id": "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
      "charge_id": "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98",
      "store_id": "76cf4a64-02bc-4cb3-9a28-74622e5928a1",
      "status": "successful",
      "error": {},
      "metadata": {
        "order_id": "ORD-987"
      },
      "mode": "live",
      "created_on": "2026-04-09T07:35:50.000000Z",
      "updated_on": "2026-04-09T07:36:00.000000Z"
    },
    {
      "id": "b2c3d4e5-f6a7-8901-bcde-f23456789012",
      "charge_id": "7fac5f6d-7a1b-51e4-b5f2-1f2ad6f95fa9",
      "store_id": "76cf4a64-02bc-4cb3-9a28-74622e5928a1",
      "status": "successful",
      "error": {},
      "metadata": {
        "order_id": "ORD-988"
      },
      "mode": "live",
      "created_on": "2026-04-10T10:00:00.000000Z",
      "updated_on": "2026-04-10T10:00:12.000000Z"
    },
    {
      "id": "c3d4e5f6-a7b8-9012-cdef-345678901234",
      "charge_id": "80bd6a7e-8b2c-62f5-c6a3-2a3be7a06aba",
      "store_id": "76cf4a64-02bc-4cb3-9a28-74622e5928a1",
      "status": "pending",
      "error": {},
      "metadata": {},
      "mode": "live",
      "created_on": "2026-04-11T14:22:08.000000Z",
      "updated_on": "2026-04-11T14:22:08.000000Z"
    }
  ],
  "has_more": false
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized (401). Authentication failed.  Common codes: AUTH_HEADER_MISSING, INVALID_APP_TOKEN, INVALID_CREDENTIALS. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 404 | Not Found (404). The requested resource (e.g., Store ID or Token ID) does not exist. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |


# Create Cancel

Creates a new cancellation request for a charge. The charge must be in a cancellable state. Bank transfer and konbini charges that have already been paid cannot be cancelled

```java
CompletableFuture<ApiResponse<Cancel>> createCancelAsync(
    final UUID storeId,
    final UUID chargeId,
    final String idempotencyKey,
    final CancelCreateRequest body)
```

## Authentication

This endpoint requires [JWT_TOKEN](../../doc/auth/oauth-2-bearer-token.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `storeId` | `UUID` | Template, Required | The unique identifier of the store. |
| `chargeId` | `UUID` | Template, Required | The unique identifier of the charge. |
| `idempotencyKey` | `String` | Header, Optional | An optional idempotency key to prevent double charges and duplicate operations. We recommend a randomly generated UUID (v4). |
| `body` | [`CancelCreateRequest`](../../doc/models/cancel-create-request.md) | Body, Optional | Optional metadata payload for creating a cancel. |

## Response Type

**201**: Cancel created successfully.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Cancel`](../../doc/models/cancel.md).

## Example Usage

```java
UUID storeId = UUID.fromString("0cab399b-5621-425b-993b-f8507eba1e78");
UUID chargeId = UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
String idempotencyKey = "f64be872-353d-4c3c-84cb-3dc617fe89f7";
CancelCreateRequest body = new CancelCreateRequest.Builder()
    .metadata(new GenericMetadata.Builder()
        .orderId("ORD-987")
        .build())
    .build();

cancelsApi.createCancelAsync(storeId, chargeId, idempotencyKey, body).thenAccept(result -> {
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
  "id": "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
  "charge_id": "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98",
  "store_id": "76cf4a64-02bc-4cb3-9a28-74622e5928a1",
  "status": "pending",
  "error": null,
  "metadata": {},
  "mode": "live",
  "created_on": "2026-04-09T07:35:50.000000Z",
  "updated_on": "2026-04-09T07:35:50.000000Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request (400). The request was invalid or could not be processed.  Common codes: VALIDATION_ERROR, INVALID_TOKEN_TYPE, NOT_SUPPORTED_BY_PROCESSOR. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 401 | Unauthorized (401). Authentication failed.  Common codes: AUTH_HEADER_MISSING, INVALID_APP_TOKEN, INVALID_CREDENTIALS. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 404 | Not Found (404). The requested resource (e.g., Store ID or Token ID) does not exist. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |


# Get Cancel

Retrieves a specific cancel by ID. Supports long-polling by appending `?polling=true` to wait for a status change (up to the server timeout). Requires a secret-bearing token.

```java
CompletableFuture<ApiResponse<Cancel>> getCancelAsync(
    final UUID storeId,
    final UUID chargeId,
    final UUID id,
    final Boolean polling)
```

## Authentication

This endpoint requires [JWT_TOKEN](../../doc/auth/oauth-2-bearer-token.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `storeId` | `UUID` | Template, Required | The unique identifier of the store. |
| `chargeId` | `UUID` | Template, Required | The unique identifier of the charge. |
| `id` | `UUID` | Template, Required | The unique identifier of the resource. |
| `polling` | `Boolean` | Query, Optional | If `true`, the server holds the connection open until the cancel status changes or the polling timeout is reached.<br><br>**Default**: `false` |

## Response Type

**200**: Cancel details retrieved successfully.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Cancel`](../../doc/models/cancel.md).

## Example Usage

```java
UUID storeId = UUID.fromString("0cab399b-5621-425b-993b-f8507eba1e78");
UUID chargeId = UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
UUID id = UUID.fromString("c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
Boolean polling = false;

cancelsApi.getCancelAsync(storeId, chargeId, id, polling).thenAccept(result -> {
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
  "id": "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
  "charge_id": "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98",
  "store_id": "76cf4a64-02bc-4cb3-9a28-74622e5928a1",
  "status": "successful",
  "error": null,
  "metadata": {},
  "mode": "live",
  "created_on": "2026-04-09T07:35:50.000000Z",
  "updated_on": "2026-04-09T07:36:00.000000Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 401 | Unauthorized (401). Authentication failed.  Common codes: AUTH_HEADER_MISSING, INVALID_APP_TOKEN, INVALID_CREDENTIALS. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 404 | Not Found (404). The requested resource (e.g., Store ID or Token ID) does not exist. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |


# Update Cancel

Updates metadata on an existing cancel. Requires a secret-bearing token.

```java
CompletableFuture<ApiResponse<Cancel>> updateCancelAsync(
    final UUID storeId,
    final UUID chargeId,
    final UUID id,
    final CancelUpdateRequest body,
    final String idempotencyKey)
```

## Authentication

This endpoint requires [JWT_TOKEN](../../doc/auth/oauth-2-bearer-token.md)

## Parameters

| Parameter | Type | Tags | Description |
|  --- | --- | --- | --- |
| `storeId` | `UUID` | Template, Required | The unique identifier of the store. |
| `chargeId` | `UUID` | Template, Required | The unique identifier of the charge. |
| `id` | `UUID` | Template, Required | The unique identifier of the resource. |
| `body` | [`CancelUpdateRequest`](../../doc/models/cancel-update-request.md) | Body, Required | Request payload for updating cancel metadata. |
| `idempotencyKey` | `String` | Header, Optional | An optional idempotency key to prevent double charges and duplicate operations. We recommend a randomly generated UUID (v4). |

## Response Type

**200**: Cancel updated successfully.

This method returns an [`ApiResponse`](../../doc/api-response.md) instance. The `getResult()` getter of this instance returns the response data which is of type [`Cancel`](../../doc/models/cancel.md).

## Example Usage

```java
UUID storeId = UUID.fromString("0cab399b-5621-425b-993b-f8507eba1e78");
UUID chargeId = UUID.fromString("6efb4e5c-690a-40f3-a4f1-0e19c5f84e98");
UUID id = UUID.fromString("c4e87129-cad4-47fb-8ded-b4c0a4ae0dd4");
CancelUpdateRequest body = new CancelUpdateRequest.Builder()
    .metadata(new GenericMetadata.Builder()
        .orderId("12345")
        .build())
    .build();

String idempotencyKey = "f64be872-353d-4c3c-84cb-3dc617fe89f7";

cancelsApi.updateCancelAsync(storeId, chargeId, id, body, idempotencyKey).thenAccept(result -> {
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
  "id": "a1b2c3d4-e5f6-7890-abcd-ef1234567890",
  "charge_id": "6efb4e5c-690a-40f3-a4f1-0e19c5f84e98",
  "store_id": "76cf4a64-02bc-4cb3-9a28-74622e5928a1",
  "status": "successful",
  "error": null,
  "metadata": {
    "order_id": "12345"
  },
  "mode": "live",
  "created_on": "2026-04-09T07:35:50.000000Z",
  "updated_on": "2026-04-09T08:00:00.000000Z"
}
```

## Errors

| HTTP Status Code | Error Description | Exception Class |
|  --- | --- | --- |
| 400 | Bad Request (400). The request was invalid or could not be processed.  Common codes: VALIDATION_ERROR, INVALID_TOKEN_TYPE, NOT_SUPPORTED_BY_PROCESSOR. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 401 | Unauthorized (401). Authentication failed.  Common codes: AUTH_HEADER_MISSING, INVALID_APP_TOKEN, INVALID_CREDENTIALS. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 403 | Forbidden (403). The request is understood, but access is refused.  This occurs if permissions are insufficient or if a security lock is triggered. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |
| 404 | Not Found (404). The requested resource (e.g., Store ID or Token ID) does not exist. | [`ApiErrorException`](../../doc/models/api-error-exception.md) |

