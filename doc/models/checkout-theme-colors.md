
# Checkout Theme Colors

Hex colors applied to the checkout widget. Always resolves to the platform defaults shown here when not customized — never `null`.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutThemeColors`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `MainBackground` | `String` | Optional | Main background color. | String getMainBackground() | setMainBackground(String mainBackground) |
| `SecondaryBackground` | `String` | Optional | Secondary background color. | String getSecondaryBackground() | setSecondaryBackground(String secondaryBackground) |
| `MainColor` | `String` | Optional | Main accent color. | String getMainColor() | setMainColor(String mainColor) |
| `MainText` | `String` | Optional | Main text color. | String getMainText() | setMainText(String mainText) |
| `PrimaryText` | `String` | Optional | Primary text color. | String getPrimaryText() | setPrimaryText(String primaryText) |
| `SecondaryText` | `String` | Optional | Secondary text color. | String getSecondaryText() | setSecondaryText(String secondaryText) |
| `BaseText` | `String` | Optional | Base text color. | String getBaseText() | setBaseText(String baseText) |
| `BodyBackground` | `String` | Optional | Body background color. | String getBodyBackground() | setBodyBackground(String bodyBackground) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutThemeColors;
import java.io.IOException;

CheckoutThemeColors checkoutThemeColors = new CheckoutThemeColors.Builder()
    .mainBackground("#FFFFFF")
    .secondaryBackground("#F5F8FC")
    .mainColor("#4C5F85")
    .mainText("#FFFFFF")
    .primaryText("#4C5F85")
    .secondaryText("#4C5F85")
    .baseText("#4C5F85")
    .bodyBackground("#FFFFFF")
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

