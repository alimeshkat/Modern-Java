# Sealed Classes

## Description
In this task, you'll learn how to use sealed classes in Java, and how they can help you to protect your code from incorrect usage.

## Introduction
Sealed classes are a special kind of classes that can be extended only by the classes in the same file as the sealed class, or the classes that explicitly are permitted.
This ensures that the class hierarchy is restricted to a specific set of classes.

## Permitting Subclasses
To permit a class to extend a sealed class, you need to use the `permits` keyword in the sealed class declaration.
This is required when the extending class is in a different file than the sealed class.

## Signatures

Declaring a sealed class in Java is done by using the `sealed` keyword in the class declaration:

```java
public sealed class Animal permits Cow, Chicken {
    // ...
}
```
In the example above, the `Animal` class is declared as sealed, and it `permits` the `Cow` and `Chicken` classes to extend it.

Note: that the `permits` keyword is required only when the extending class is in a different file than the sealed class.

## Extending a Sealed Class
The subclasses of a sealed class are declared as:
- `final` if they are not permitted to be extended.
- `sealed` can be extended by the classes it permits.
- `non-seald` if they are permitted to be extended.

```java
public non-sealed class Cow extends Animal {
    // ...
}
```

## Seal Classes VS Enums
Sealed classes are useful when you want to restrict the usage of a class hierarchy to a specific set of classes.
Enums on the other hand, are useful when dealing with a fixed set of constants.

## Assignment
In this task, you'll create a sealed class hierarchy for the dog breed Terrier.

The hierarchy will contain the following classes:
- `Dog` - An `abstract` sealed class that permits the `Terrier` class to extend it.
- `Terrier` - A sealed class that permits the `JackRussellTerrier` and `FoxTerrier` classes to extend it.
- `JackRussellTerrier` - A `non-seald` class that extends the `Terrier` class.
- `FoxTerrier` - A final class that extends the `Terrier` class.

The class Dog has the following fields:
- `name` - A `String` that represents the name of the dog.
And the one method:
- `bark()` - A method that returns the following message: name + `Woof!` (e.g. `Jack Woof!`).