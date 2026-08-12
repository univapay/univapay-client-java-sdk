
# Merchant Webhook Customer Management Configuration

Customer-management defaults.

*This model accepts additional fields of type Object.*

## Structure

`MerchantWebhookCustomerManagementConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `Enabled` | `Boolean` | Optional | Enables customer-management features. | Boolean getEnabled() | setEnabled(Boolean enabled) |
| `DefaultRoles` | `List<String>` | Optional | Roles applied to newly created customers. | List<String> getDefaultRoles() | setDefaultRoles(List<String> defaultRoles) |
| `DefaultMode` | `String` | Optional | Default processing mode assigned to new customer records. | String getDefaultMode() | setDefaultMode(String defaultMode) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.models.MerchantWebhookCustomerManagementConfiguration;
import java.util.Arrays;

MerchantWebhookCustomerManagementConfiguration merchantWebhookCustomerManagementConfiguration = new MerchantWebhookCustomerManagementConfiguration.Builder()
    .enabled(true)
    .defaultRoles(Arrays.asList(
        "end_user"
    ))
    .defaultMode("live")
    .build();
```

