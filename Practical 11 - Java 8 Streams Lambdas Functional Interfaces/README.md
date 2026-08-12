# Practical 11 - Java 8 Streams Lambdas Functional Interfaces

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 85 | Lambda Expressions Basics | Lambdas provide a concise way to represent an instance of a functional interface. |
| 86 | Stream Basics — filter, map, collect | Streams process sequences of elements declaratively via chained operations (intermediate + terminal). |
| 87 | Stream Reduction — reduce, sum, average | `reduce` and specialized aggregate collectors combine stream elements into a single summary value. |
| 88 | Grouping and Partitioning with Collectors | `Collectors.groupingBy` and `partitioningBy` organize stream elements into `Map`s based on a classifier function. |
| 89 | Method References | Method references (`Class::method`) are shorthand for lambdas that just call an existing method. |
| 90 | Optional — Avoiding Null Checks | `Optional<T>` explicitly represents a value that may or may not be present, discouraging `null` returns. |
| 91 | Custom Functional Interfaces with Generics | You can define your own generic functional interfaces beyond the built-in `java.util.function` ones. |
| 92 | Parallel Streams | `.parallelStream()` (or `.stream().parallel()`) splits work across multiple threads using the common ForkJoinPool, useful for CPU-bound bulk operations on large data. |
