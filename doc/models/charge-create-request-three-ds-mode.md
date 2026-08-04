
# Charge Create Request Three Ds Mode

3D-Secure authentication type. App Token Secret is required to use 'skip'.

## Enumeration

`ChargeCreateRequestThreeDsMode`

## Fields

| Name |
|  --- |
| `NORMAL` |
| `REQUIRE` |
| `FORCE` |
| `SKIP` |

## Example

```java
import com.univapay.api.models.ChargeCreateRequestThreeDsMode;

ChargeCreateRequestThreeDsMode chargeCreateRequestThreeDsMode = ChargeCreateRequestThreeDsMode.FORCE;
```

