
# Refund Reason Request

The reason for the refund (merchant-settable values). `duplicate`: A duplicate charge was made. `fraud`: The charge is fraudulent. `customer_request`: The customer requested the refund.

## Enumeration

`RefundReasonRequest`

## Fields

| Name |
|  --- |
| `DUPLICATE` |
| `FRAUD` |
| `CUSTOMER_REQUEST` |

## Example

```java
import com.univapay.api.models.RefundReasonRequest;

RefundReasonRequest refundReasonRequest = RefundReasonRequest.CUSTOMER_REQUEST;
```

