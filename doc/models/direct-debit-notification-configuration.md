
# Direct Debit Notification Configuration

Which direct debit email notifications the merchant has opted into.

*This model accepts additional fields of type Object.*

## Structure

`DirectDebitNotificationConfiguration`

## Fields

| Name | Type | Tags | Description | Getter | Setter |
|  --- | --- | --- | --- | --- | --- |
| `NotifyDeadlineMailing` | `Boolean` | Optional | Notify when the deadline for the bank to receive the signed mandate approaches (郵送期限の通知). | Boolean getNotifyDeadlineMailing() | setNotifyDeadlineMailing(Boolean notifyDeadlineMailing) |
| `NotifyDeadlineDebit` | `Boolean` | Optional | Notify when the transfer registration cutoff approaches (締切日の通知). | Boolean getNotifyDeadlineDebit() | setNotifyDeadlineDebit(Boolean notifyDeadlineDebit) |
| `NotifyDebitUpdate` | `Boolean` | Optional | Notify when transfer results are reflected (振替結果の通知). | Boolean getNotifyDebitUpdate() | setNotifyDebitUpdate(Boolean notifyDebitUpdate) |
| `AdditionalProperties` | `Map<String, Object>` | Optional | - | Object getAdditionalProperty(String key) | additionalProperty(String key, Object value) |

## Example

```java
import com.univapay.api.ApiHelper;
import com.univapay.api.models.DirectDebitNotificationConfiguration;
import java.io.IOException;

DirectDebitNotificationConfiguration directDebitNotificationConfiguration = new DirectDebitNotificationConfiguration.Builder()
    .notifyDeadlineMailing(true)
    .notifyDeadlineDebit(true)
    .notifyDebitUpdate(false)
.additionalProperty("exampleAdditionalProperty", ApiHelper.deserialize("{\"key1\":\"val1\",\"key2\":\"val2\"}"))
    .build();
```

