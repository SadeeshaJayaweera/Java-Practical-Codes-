# Practical 02 - Encapsulation

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 9 | Private Fields with Getters and Setters | Encapsulation hides internal state behind `private` fields, exposing controlled access via public methods. |
| 10 | Validated Setters (Data Integrity) | Setters can enforce business rules so an object is never left in an invalid state. |
| 11 | Immutable Class Design | An immutable object's state cannot change after construction — achieved via `final` fields, no setters, and defensive copying. |
| 12 | Static Fields and the Singleton-of-Counters Pattern | `static` fields belong to the class, shared across all instances — useful for counters and constants. |
| 13 | Encapsulating a Collection (Defensive Copy) | Returning an internal mutable collection directly breaks encapsulation; return a copy or unmodifiable view instead. |
| 14 | Encapsulation with Enum-Based State | Enums provide a type-safe, encapsulated way to represent a fixed set of related constants. |
| 15 | Encapsulation via Constructor Validation | Validating input inside constructors ensures an object is never created in an invalid state. |
| 16 | Package-Private and Protected Access | Java has four access levels: `private`, package-private (default), `protected`, and `public`, each widening visibility. |
