# Practical 08 - Generics

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 63 | Generic Classes | Generics let a class work with any type while preserving compile-time type safety, avoiding casts. |
| 64 | Generic Methods | A method can declare its own type parameter, independent of the class it belongs to. |
| 65 | Bounded Type Parameters | `<T extends SomeClass>` restricts what types can be used, allowing calls to methods defined on the bound. |
| 66 | Wildcards — `? extends` vs `? super` | `? extends T` (producer, read-only) and `? super T` (consumer, write-only) follow the PECS principle (Producer Extends, Consumer Super). |
| 67 | Generic Interfaces | Interfaces can be parameterized too, e.g., a generic `Repository<T, ID>` pattern common in real applications. |
| 68 | Generic Stack Implementation | Combine generics with a classic data structure to build a fully type-safe custom `Stack<T>`. |
