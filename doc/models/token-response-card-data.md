
# Token Response Card Data

Token Response Card Data schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseCardData`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Card` | [`TokenResponseCardDataCard`](../../doc/models/token-response-card-data-card.md) | Optional | Token Response Card Data Card schema. | TokenResponseCardDataCard getCard() | setCard(TokenResponseCardDataCard card) |
| `Billing` | [`TokenResponseCardDataBilling`](../../doc/models/token-response-card-data-billing.md) | Optional | Token Response Card Data Billing schema. | TokenResponseCardDataBilling getBilling() | setBilling(TokenResponseCardDataBilling billing) |
| `CvvAuthorize` | [`TokenResponseCardDataCvvAuthorize`](../../doc/models/token-response-card-data-cvv-authorize.md) | Optional | Token Response Card Data Cvv Authorize schema. | TokenResponseCardDataCvvAuthorize getCvvAuthorize() | setCvvAuthorize(TokenResponseCardDataCvvAuthorize cvvAuthorize) |
| `CvvAuthorizeCheck` | [`TokenResponseCardDataCvvAuthorizeCheck`](../../doc/models/token-response-card-data-cvv-authorize-check.md) | Optional | Token Response Card Data Cvv Authorize Check schema. | TokenResponseCardDataCvvAuthorizeCheck getCvvAuthorizeCheck() | setCvvAuthorizeCheck(TokenResponseCardDataCvvAuthorizeCheck cvvAuthorizeCheck) |
| `ThreeDs` | [`TokenResponseCardDataThreeDs`](../../doc/models/token-response-card-data-three-ds.md) | Optional | Token Response Card Data Three Ds schema. | TokenResponseCardDataThreeDs getThreeDs() | setThreeDs(TokenResponseCardDataThreeDs threeDs) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.DateTimeHelper;
import com.univapay.api.models.TokenResponseCardData;
import com.univapay.api.models.TokenResponseCardDataBilling;
import com.univapay.api.models.TokenResponseCardDataCard;
import com.univapay.api.models.TokenResponseCardDataCvvAuthorize;
import com.univapay.api.models.TokenResponseCardDataCvvAuthorizeCheck;
import com.univapay.api.models.TokenResponseCardDataThreeDs;
import com.univapay.api.models.TokenResponseCardDataThreeDsStatus;
import com.univapay.api.models.TokenResponsePhoneNumber;
import java.io.IOException;

TokenResponseCardData tokenResponseCardData = new TokenResponseCardData.Builder()
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
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
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
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .cvvAuthorize(new TokenResponseCardDataCvvAuthorize.Builder()
        .enabled(true)
        .status("successful")
        .chargeId(null)
        .credentialsId(null)
        .currency("JPY")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .cvvAuthorizeCheck(new TokenResponseCardDataCvvAuthorizeCheck.Builder()
        .status("successful")
        .chargeId(null)
        .date(DateTimeHelper.fromRfc8601DateTime("2026-04-09T07:35:50Z"))
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
    .threeDs(new TokenResponseCardDataThreeDs.Builder()
        .enabled(true)
        .status(TokenResponseCardDataThreeDsStatus.SUCCESSFUL)
        .redirectEndpoint(null)
        .redirectId(null)
        .exempted(false)
        .error(null)
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

