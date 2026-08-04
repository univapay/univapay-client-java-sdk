
# Transaction Token Data

Transaction token data payload. The actual structure depends on `payment_type` — card, konbini, online (QR / 3DS), or bank transfer.

## Class Name

`TransactionTokenData`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`TokenResponseCardData`](../../../doc/models/token-response-card-data.md) | TransactionTokenData.fromTokenResponseCardData(TokenResponseCardData tokenResponseCardData) |
| [`TokenResponseKonbiniData`](../../../doc/models/token-response-konbini-data.md) | TransactionTokenData.fromTokenResponseKonbiniData(TokenResponseKonbiniData tokenResponseKonbiniData) |
| [`TokenResponseOnlineData`](../../../doc/models/token-response-online-data.md) | TransactionTokenData.fromTokenResponseOnlineData(TokenResponseOnlineData tokenResponseOnlineData) |
| [`TokenResponseBankTransferData`](../../../doc/models/token-response-bank-transfer-data.md) | TransactionTokenData.fromTokenResponseBankTransferData(TokenResponseBankTransferData tokenResponseBankTransferData) |

## TokenResponseCardData

### Initialization Code

#### Example

```java
TransactionTokenData.fromTokenResponseCardData(
        new TokenResponseCardData.Builder()
            .card(new TokenResponseCardDataCard.Builder()
                .cardholder("TARO YAMADA")
                .expMonth(12)
                .expYear(2026)
                .cardBin("424242")
                .lastFour("4242")
                .brand("visa")
                .cardType("credit")
                .country("JP")
                .category("standard")
                .issuer(null)
                .subBrand("none")
                .build())
            .billing(new TokenResponseCardDataBilling.Builder()
                .line1("1-1-1")
                .line2("Shibakoen")
                .state("Tokyo")
                .city("Minato")
                .country("JP")
                .zip("105-0011")
                .phoneNumber(new TokenResponsePhoneNumber.Builder()
                    .countryCode(81)
                    .localNumber("08012341234")
                    .build())
                .build())
            .cvvAuthorize(new TokenResponseCardDataCvvAuthorize.Builder()
                .enabled(true)
                .status("successful")
                .chargeId(null)
                .credentialsId(null)
                .currency("JPY")
                .build())
            .cvvAuthorizeCheck(new TokenResponseCardDataCvvAuthorizeCheck.Builder()
                .status("successful")
                .chargeId(null)
                .date(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
                .build())
            .threeDs(new TokenResponseCardDataThreeDs.Builder()
                .enabled(true)
                .status(TokenResponseCardDataThreeDsStatus.SUCCESSFUL)
                .redirectEndpoint(null)
                .redirectId(null)
                .exempted(false)
                .error(null)
                .build())
            .build()
    )
```

## TokenResponseKonbiniData

### Initialization Code

#### Example

```java
TransactionTokenData.fromTokenResponseKonbiniData(
        new TokenResponseKonbiniData.Builder()
            .customerName("Taro Yamada")
            .convenienceStore(BaseKonbiniDataConvenienceStore.SEVEN_ELEVEN)
            .expirationPeriod("P7D")
            .expirationTimeShift(null)
            .phoneNumber(new TokenResponsePhoneNumber.Builder()
                .countryCode(81)
                .localNumber("08012341234")
                .build())
            .build()
    )
```

## TokenResponseOnlineData

### Initialization Code

#### Example

```java
TransactionTokenData.fromTokenResponseOnlineData(
        new TokenResponseOnlineData.Builder()
            .brand(BaseOnlineDataBrand.WE_CHAT_ONLINE)
            .callMethod(BaseOnlineDataCallMethod.WEB)
            .userIdentifier("wechat_open_id_12345")
            .build()
    )
```

## TokenResponseBankTransferData

### Initialization Code

#### Example

```java
TransactionTokenData.fromTokenResponseBankTransferData(
        new TokenResponseBankTransferData.Builder()
            .brand("aozora_bank")
            .expirationPeriod("PT168H")
            .expirationTimeShift("23:59:59+09:00")
            .bankCode("0310")
            .bankName("GMOあおぞらネット銀行")
            .branchCode("123")
            .branchName("Test Branch")
            .accountNumber("1234567")
            .accountHolderName("TARO YAMADA")
            .build()
    )
```

