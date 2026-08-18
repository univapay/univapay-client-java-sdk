
# Generic Metadata Value

Allowed values for metadata properties. Values may be a string, number, boolean, null, or an array of any of the above — but not a nested object; the server rejects metadata whose direct property values are JSON objects.

## Class Name

`GenericMetadataValue`

## Cases

| Type | Factory Method |
|  --- | --- |
| `String` | GenericMetadataValue.fromString(String string) |
| `double` | GenericMetadataValue.fromPrecision(double precision) |
| `boolean` | GenericMetadataValue.fromBoolean(boolean mBoolean) |
| `List<Object>` | GenericMetadataValue.fromListOfObject(List<Object> listOfObject) |

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

## List<Object>

### Initialization Code

#### Example

```java
GenericMetadataValue.fromListOfObject(
        Arrays.asList(
            ApiHelper.deserialize("\"sale\""),
            ApiHelper.deserialize("\"promo\"")
        )
    )
```

