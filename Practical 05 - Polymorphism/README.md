# Practical 05 - Polymorphism

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 35 | Compile-Time vs Runtime Polymorphism | Overloading = compile-time (static) polymorphism; overriding = runtime (dynamic) polymorphism. |
| 36 | Upcasting and Dynamic Method Dispatch | A superclass reference can point to a subclass object; the actual method invoked depends on the object's real type. |
| 37 | Polymorphism with Abstract Classes | Abstract classes are a common vehicle for polymorphism, forcing each subclass to define its own behaviour. |
| 38 | Polymorphic Collections | Collections declared with a supertype can hold mixed subtype objects, iterated polymorphically. |
| 39 | Covariant Return Types | An overriding method may return a more specific (subclass) type than the method it overrides. |
| 40 | Polymorphism and the `Object` Class | Every class implicitly extends `Object`, so `Object` references can hold any type, and calling overridden `toString()` demonstrates polymorphism. |
| 41 | Operator "Polymorphism" — The Overloaded `+` | The `+` operator behaves differently for numbers (addition) vs Strings (concatenation) — a built-in form of ad-hoc polymorphism. |
| 42 | Polymorphism in Exception Hierarchies | Catch blocks can catch a broader exception supertype, polymorphically handling multiple specific exception subtypes. |
