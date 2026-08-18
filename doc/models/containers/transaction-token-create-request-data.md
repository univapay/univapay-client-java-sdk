
# Transaction Token Create Request Data

Transaction Token Create Request Data schema.

## Class Name

`TransactionTokenCreateRequestData`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`TokenCreateCardData`](../../../doc/models/token-create-card-data.md) | TransactionTokenCreateRequestData.fromTokenCreateCardData(TokenCreateCardData tokenCreateCardData) |
| [`TokenCreateKonbiniData`](../../../doc/models/token-create-konbini-data.md) | TransactionTokenCreateRequestData.fromTokenCreateKonbiniData(TokenCreateKonbiniData tokenCreateKonbiniData) |
| [`TokenCreateOnlineData`](../../../doc/models/token-create-online-data.md) | TransactionTokenCreateRequestData.fromTokenCreateOnlineData(TokenCreateOnlineData tokenCreateOnlineData) |
| [`TokenCreateBankTransferData`](../../../doc/models/token-create-bank-transfer-data.md) | TransactionTokenCreateRequestData.fromTokenCreateBankTransferData(TokenCreateBankTransferData tokenCreateBankTransferData) |
| [`TokenCreatePaidyData`](../../../doc/models/token-create-paidy-data.md) | TransactionTokenCreateRequestData.fromTokenCreatePaidyData(TokenCreatePaidyData tokenCreatePaidyData) |
| [`TokenCreateQrScanData`](../../../doc/models/token-create-qr-scan-data.md) | TransactionTokenCreateRequestData.fromTokenCreateQrScanData(TokenCreateQrScanData tokenCreateQrScanData) |
| [`TokenCreateQrMerchantData`](../../../doc/models/token-create-qr-merchant-data.md) | TransactionTokenCreateRequestData.fromTokenCreateQrMerchantData(TokenCreateQrMerchantData tokenCreateQrMerchantData) |

## TokenCreateCardData

### Initialization Code

#### Example

```java
TransactionTokenCreateRequestData.fromTokenCreateCardData(
        new TokenCreateCardData.Builder(
            "4242424242424242",
            "12",
            "2026"
        )
        .build()
    )
```

## TokenCreateKonbiniData

### Initialization Code

#### Example

```java
TransactionTokenCreateRequestData.fromTokenCreateKonbiniData(
        new TokenCreateKonbiniData.Builder(
            "Taro Yamada",
            BaseKonbiniDataConvenienceStore.SEVEN_ELEVEN,
            new TokenCreatePhoneNumber.Builder(
                "81",
                "08012341234"
            )
            .build()
        )
        .expirationPeriod("P7D")
        .expirationTimeShift("23:59:59+09:00")
        .build()
    )
```

## TokenCreateOnlineData

### Initialization Code

#### Example

```java
TransactionTokenCreateRequestData.fromTokenCreateOnlineData(
        new TokenCreateOnlineData.Builder(
            BaseOnlineDataBrand.WE_CHAT_ONLINE,
            BaseOnlineDataCallMethod.WEB
        )
        .userIdentifier("wechat_open_id_12345")
        .build()
    )
```

## TokenCreateBankTransferData

### Initialization Code

#### Example

```java
TransactionTokenCreateRequestData.fromTokenCreateBankTransferData(
        new TokenCreateBankTransferData.Builder(
            "aozora_bank"
        )
        .expirationPeriod("PT168H")
        .expirationTimeShift("23:59:59+09:00")
        .name("Taro Yamada")
        .build()
    )
```

## TokenCreatePaidyData

### Initialization Code

#### Example

```java
TransactionTokenCreateRequestData.fromTokenCreatePaidyData(
        new TokenCreatePaidyData.Builder(
            "paidy-token-abc123",
            new TokenCreatePaidyDataShippingAddress.Builder(
                "105-0011"
            )
            .line1("1-1-1")
            .city("Minato")
            .state("Tokyo")
            .build()
        )
        .phoneNumber("08012341234")
        .build()
    )
```

## TokenCreateQrScanData

### Initialization Code

#### Example

```java
TransactionTokenCreateRequestData.fromTokenCreateQrScanData(
        new TokenCreateQrScanData.Builder(
            "091234567890123456789012345"
        )
        .build()
    )
```

## TokenCreateQrMerchantData

### Initialization Code

#### Example

```java
TransactionTokenCreateRequestData.fromTokenCreateQrMerchantData(
        new TokenCreateQrMerchantData.Builder(
            "pay_pay_merchant"
        )
        .build()
    )
```

