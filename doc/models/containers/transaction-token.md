
# Transaction Token

Stored transaction token resource. `payment_type` discriminates which variant applies — and therefore the concrete shape of `data` — per the mapping above.

## Class Name

`TransactionToken`

## Cases

| Type | Factory Method |
|  --- | --- |
| [`CardTransactionToken`](../../../doc/models/card-transaction-token.md) | TransactionToken.fromCardTransactionToken(CardTransactionToken cardTransactionToken) |
| [`KonbiniTransactionToken`](../../../doc/models/konbini-transaction-token.md) | TransactionToken.fromKonbiniTransactionToken(KonbiniTransactionToken konbiniTransactionToken) |
| [`OnlineTransactionToken`](../../../doc/models/online-transaction-token.md) | TransactionToken.fromOnlineTransactionToken(OnlineTransactionToken onlineTransactionToken) |
| [`BankTransferTransactionToken`](../../../doc/models/bank-transfer-transaction-token.md) | TransactionToken.fromBankTransferTransactionToken(BankTransferTransactionToken bankTransferTransactionToken) |
| [`PaidyTransactionToken`](../../../doc/models/paidy-transaction-token.md) | TransactionToken.fromPaidyTransactionToken(PaidyTransactionToken paidyTransactionToken) |
| [`QrScanTransactionToken`](../../../doc/models/qr-scan-transaction-token.md) | TransactionToken.fromQrScanTransactionToken(QrScanTransactionToken qrScanTransactionToken) |
| [`QrMerchantTransactionToken`](../../../doc/models/qr-merchant-transaction-token.md) | TransactionToken.fromQrMerchantTransactionToken(QrMerchantTransactionToken qrMerchantTransactionToken) |

## CardTransactionToken

### Initialization Code

#### Example

```java
TransactionToken.fromCardTransactionToken(
        new CardTransactionToken.Builder(
            "card",
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
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.ONE_TIME)
        .usageLimit("example")
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
                put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
                    "cust_12345"
                ));
            }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .build()
    )
```

## KonbiniTransactionToken

### Initialization Code

#### Example

```java
TransactionToken.fromKonbiniTransactionToken(
        new KonbiniTransactionToken.Builder(
            "konbini",
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
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.ONE_TIME)
        .usageLimit("example")
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
                put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
                    "cust_12345"
                ));
            }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .build()
    )
```

## OnlineTransactionToken

### Initialization Code

#### Example

```java
TransactionToken.fromOnlineTransactionToken(
        new OnlineTransactionToken.Builder(
            "online",
            new TokenResponseOnlineData.Builder()
                .brand(BaseOnlineDataBrand.WE_CHAT_ONLINE)
                .callMethod(BaseOnlineDataCallMethod.WEB)
                .userIdentifier("wechat_open_id_12345")
                .build()
        )
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.ONE_TIME)
        .usageLimit("example")
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
                put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
                    "cust_12345"
                ));
            }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .build()
    )
```

## BankTransferTransactionToken

### Initialization Code

#### Example

```java
TransactionToken.fromBankTransferTransactionToken(
        new BankTransferTransactionToken.Builder(
            "bank_transfer",
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
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.ONE_TIME)
        .usageLimit("example")
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
                put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
                    "cust_12345"
                ));
            }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .build()
    )
```

## PaidyTransactionToken

### Initialization Code

#### Example

```java
TransactionToken.fromPaidyTransactionToken(
        new PaidyTransactionToken.Builder(
            "paidy",
            new TokenResponsePaidyData.Builder(
                "paidy-token-abc123"
            )
            .phoneNumber("08012341234")
            .shippingAddress(new TokenResponsePaidyDataShippingAddress.Builder()
                    .zip("105-0011")
                    .line1("1-1-1")
                    .city("Minato")
                    .state("Tokyo")
                    .build())
            .build()
        )
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.ONE_TIME)
        .usageLimit("example")
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
                put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
                    "cust_12345"
                ));
            }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .build()
    )
```

## QrScanTransactionToken

### Initialization Code

#### Example

```java
TransactionToken.fromQrScanTransactionToken(
        new QrScanTransactionToken.Builder(
            "qr_scan",
            new TokenResponseQrScanData.Builder(
                "pay_pay"
            )
            .build()
        )
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.ONE_TIME)
        .usageLimit("example")
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
                put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
                    "cust_12345"
                ));
            }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .build()
    )
```

## QrMerchantTransactionToken

### Initialization Code

#### Example

```java
TransactionToken.fromQrMerchantTransactionToken(
        new QrMerchantTransactionToken.Builder(
            "qr_merchant",
            new TokenResponseQrMerchantData.Builder(
                "71001234567890202604141200450"
            )
            .brand("pay_pay_merchant")
            .build()
        )
        .id(UUID.fromString("6426bbd2-17bd-41bf-883b-1fe970db48ee"))
        .storeId(UUID.fromString("fc264608-9a9e-495e-844e-a08129a81af4"))
        .email("test@univapay.com")
        .active(true)
        .mode(TransactionTokenMode.LIVE)
        .type(TransactionTokenType.ONE_TIME)
        .usageLimit("example")
        .confirmed(true)
        .metadata(new LinkedHashMap<String, TransactionTokenMetadataAdditionalProperties>() {{
                put("customer_id", TransactionTokenMetadataAdditionalProperties.fromString(
                    "cust_12345"
                ));
            }})
        .createdOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .updatedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
        .lastUsedOn(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50.000000Z"))
        .build()
    )
```

