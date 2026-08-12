# Practical 07 - Collections Framework

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 53 | ArrayList Basics | `ArrayList` is a resizable, index-based list backed by an array. |
| 54 | LinkedList and Deque Operations | `LinkedList` implements both `List` and `Deque`, efficient for insert/remove at both ends. |
| 55 | HashMap Basics | `HashMap` stores key-value pairs with O(1) average-case lookup, no guaranteed order. |
| 56 | TreeMap and Sorted Collections | `TreeMap`/`TreeSet` keep elements sorted (by natural order or a Comparator) using a red-black tree. |
| 57 | HashSet and TreeSet — Removing Duplicates | `Set` implementations disallow duplicate elements; `HashSet` is unordered, `TreeSet` is sorted. |
| 58 | Iterator and ConcurrentModificationException | Modifying a collection while iterating with a for-each loop throws `ConcurrentModificationException`; use `Iterator.remove()` instead. |
| 59 | PriorityQueue | `PriorityQueue` is a heap-based queue that always dequeues the smallest (or custom-ordered) element first. |
| 60 | Stack and Queue via Deque | `Deque` is the recommended modern replacement for the legacy `Stack` class, supporting both LIFO and FIFO usage. |
| 61 | Collections Utility Class | `java.util.Collections` provides static helper methods: sorting, shuffling, min/max, immutability wrappers, etc. |
| 62 | Custom Objects in Collections (equals/hashCode reliance) | Correctly relying on `equals`/`hashCode` is essential for custom objects used as `HashMap` keys or in `HashSet`. |
