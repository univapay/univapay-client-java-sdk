
# Merchant Webhook Card Brand Percent Fees

Per-card-brand percent fee overrides.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookCardBrandPercentFees`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Visa` | `Double` | Optional | Percent fee override applied to Visa transactions. | Double getVisa() | setVisa(Double visa) |
| `AmericanExpress` | `Double` | Optional | Percent fee override applied to American Express transactions. | Double getAmericanExpress() | setAmericanExpress(Double americanExpress) |
| `Mastercard` | `Double` | Optional | Percent fee override applied to Mastercard transactions. | Double getMastercard() | setMastercard(Double mastercard) |
| `Maestro` | `Double` | Optional | Percent fee override applied to Maestro transactions. | Double getMaestro() | setMaestro(Double maestro) |
| `Discover` | `Double` | Optional | Percent fee override applied to Discover transactions. | Double getDiscover() | setDiscover(Double discover) |
| `Jcb` | `Double` | Optional | Percent fee override applied to JCB transactions. | Double getJcb() | setJcb(Double jcb) |
| `DinersClub` | `Double` | Optional | Percent fee override applied to Diners Club transactions. | Double getDinersClub() | setDinersClub(Double dinersClub) |
| `UnionPay` | `Double` | Optional | Percent fee override applied to UnionPay transactions. | Double getUnionPay() | setUnionPay(Double unionPay) |
| `PrivateLabel` | `Double` | Optional | Percent fee override applied to private-label card transactions. | Double getPrivateLabel() | setPrivateLabel(Double privateLabel) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookCardBrandPercentFees;

MerchantWebhookCardBrandPercentFees merchantWebhookCardBrandPercentFees = new MerchantWebhookCardBrandPercentFees.Builder()
    .visa(3.6D)
    .mastercard(3.6D)
    .jcb(3.8D)
    .build();
```

