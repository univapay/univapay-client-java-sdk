
# Token Response Card Data Card

Token Response Card Data Card schema.

*This model accepts additional fields of type Object.*

## Structure

`TokenResponseCardDataCard`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Cardholder` | `String` | Optional | Cardholder name. | String getCardholder() | setCardholder(String cardholder) |
| `ExpMonth` | `Integer` | Optional | Card expiration month. | Integer getExpMonth() | setExpMonth(Integer expMonth) |
| `ExpYear` | `Integer` | Optional | Card expiration year. | Integer getExpYear() | setExpYear(Integer expYear) |
| `CardBin` | `String` | Optional | Card bin value. | String getCardBin() | setCardBin(String cardBin) |
| `LastFour` | `String` | Optional | Last four value. | String getLastFour() | setLastFour(String lastFour) |
| `Brand` | `String` | Optional | Brand or network name. | String getBrand() | setBrand(String brand) |
| `CardType` | `String` | Optional | Card type value. | String getCardType() | setCardType(String cardType) |
| `Country` | `String` | Optional | Country code. | String getCountry() | setCountry(String country) |
| `Category` | `String` | Optional | Category value. | String getCategory() | setCategory(String category) |
| `Issuer` | `String` | Optional | Issuer value. | String getIssuer() | setIssuer(String issuer) |
| `SubBrand` | `String` | Optional | Sub brand value. | String getSubBrand() | setSubBrand(String subBrand) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.TokenResponseCardDataCard;

TokenResponseCardDataCard tokenResponseCardDataCard = new TokenResponseCardDataCard.Builder()
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
    .build();
```

