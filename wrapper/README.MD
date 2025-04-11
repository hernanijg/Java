# Java Wrapper Classes Explorer

## 📦 Overview
This demonstration showcases Java's wrapper classes and their utility methods for primitive type conversions and value manipulation. The code examples highlight common operations with `Integer`, `Double`, `Long`, and `Character` wrapper classes.

## ✨ Key Features Demonstrated
- **Value Conversion**: Seamless primitive ↔ object conversions
- **Type Parsing**: String-to-number parsing with validation
- **Character Analysis**: Comprehensive character type checking
- **Constants Usage**: MIN/MAX value references
- **Method Chaining**: Fluid object-oriented operations

## 🧰 Wrapper Class Utilities

### Numeric Wrappers (`Integer`, `Double`, `Long`)
| Operation                | Example                      |
|--------------------------|------------------------------|
| Object creation          | `Integer.valueOf(1234567)`   |
| String parsing           | `Integer.parseInt("2345678")`|
| Type conversion          | `i.doubleValue()`            |
| Constants                | `Integer.MIN_VALUE`          |

### Character Wrapper
| Operation                | Example                      |
|--------------------------|------------------------------|
| Case conversion          | `Character.toLowerCase('A')` |
| Type checking            | `Character.isDigit('7')`     |
| Value extraction         | `c.charValue()`              |

## ⚠️ Important Notes
- **Precision Loss**: Narrowing conversions (`shortValue()`, `byteValue()`) may truncate data
- **Deprecation**: `Character.isSpaceChar('')` is deprecated
- **Null Safety**: Wrappers allow `null` (unlike primitives)
- **Performance**: Autoboxing has minor overhead vs primitives

## 🛠️ Usage Patterns
```java
// Preferred instantiation (caching)
Integer cached = Integer.valueOf(127); 

// String conversion
Double price = Double.parseDouble("29.99");

// Character analysis
if (Character.isUpperCase(inputChar)) {
    // Process uppercase
}
```

## 🌟 Key Takeaways
- **Autoboxing**: Syntactic sugar for `Integer.valueOf()`
- **Unboxing**: Hidden `intValue()` calls
- **Cache Range**: `-128 to 127` (for `Integer.valueOf()`)
- **Null Danger**: Wrappers can be `null`, primitives can't

```java
// Ejemplo completo con cierre
Integer autoBoxed = 42;  // Autoboxing
int unboxed = autoBoxed; // Unboxing