
# Generic Metadata Value

Allowed values for metadata properties.

## Class Name

`GenericMetadataValue`

## Cases

| Type | Factory Method |
|  --- | --- |
| `String` | GenericMetadataValue.fromString(String string) |
| `double` | GenericMetadataValue.fromPrecision(double precision) |
| `boolean` | GenericMetadataValue.fromBoolean(boolean mBoolean) |

## String

### Initialization Code

#### Example

```java
GenericMetadataValue.fromString(
        "sale"
    )
```

## double

### Initialization Code

#### Example

```java
GenericMetadataValue.fromPrecision(
        10D
    )
```

## boolean

### Initialization Code

#### Example

```java
GenericMetadataValue.fromBoolean(
        true
    )
```

