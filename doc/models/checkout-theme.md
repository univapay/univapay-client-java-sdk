
# Checkout Theme

Widget theme applied to checkout.

*This model accepts additional fields of type Object.*

## Structure

`CheckoutTheme`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Colors` | [`CheckoutThemeColors`](../../doc/models/checkout-theme-colors.md) | Optional | Hex colors applied to the checkout widget. Always resolves to the platform defaults shown here when not customized — never `null`. | CheckoutThemeColors getColors() | setColors(CheckoutThemeColors colors) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.CheckoutTheme;
import com.univapay.api.models.CheckoutThemeColors;
import java.io.IOException;

CheckoutTheme checkoutTheme = new CheckoutTheme.Builder()
    .colors(new CheckoutThemeColors.Builder()
        .mainBackground("main_background8")
        .secondaryBackground("secondary_background6")
        .mainColor("main_color0")
        .mainText("main_text4")
        .primaryText("primary_text8")
    .additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
        .build())
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

