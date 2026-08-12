# Practical 03 - Inheritance Abstract Classes and Methods

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 17 | Basic Inheritance with `extends` | Inheritance lets a subclass reuse and extend the fields/methods of a superclass. |
| 18 | Method Overriding | A subclass can provide its own implementation of a method already defined in the superclass, enabling runtime polymorphism. |
| 19 | The `super` Keyword — Calling Parent Methods | `super.method()` invokes the overridden superclass version from within an overriding method. |
| 20 | Abstract Classes and Abstract Methods | An abstract class cannot be instantiated and may declare abstract methods that subclasses *must* implement. |
| 21 | Constructor Chaining Across Hierarchies | Every subclass constructor implicitly or explicitly calls a superclass constructor before its own body runs. |
| 22 | The `final` Keyword — Classes, Methods, Variables | `final` prevents further subclassing, overriding, or reassignment respectively. |
| 23 | `instanceof` and Downcasting | `instanceof` checks an object's runtime type before safely downcasting a superclass reference. |
| 24 | Abstract Class vs Concrete Template Method Pattern | An abstract class can define a fixed algorithm skeleton (template method) while leaving specific steps to subclasses. |
| 25 | Multilevel Inheritance and Field Hiding | Multilevel inheritance chains classes A→B→C; field hiding occurs when a subclass declares a field with the same name as a parent's. |
| 26 | Overriding `equals()`, `hashCode()`, and `toString()` | Every class inherits `Object`'s default `equals`/`hashCode`/`toString`; overriding them gives meaningful value-based behaviour. |
