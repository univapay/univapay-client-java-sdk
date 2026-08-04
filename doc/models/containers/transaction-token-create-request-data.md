
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

