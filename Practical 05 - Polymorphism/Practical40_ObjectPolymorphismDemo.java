/**
 * Practical 40: Polymorphism and the `Object` Class
 * 
 * Concept: Every class implicitly extends `Object`, so `Object` references can hold any type, and calling overridden `toString()` demonstrates polymorphism.
 * 
 * Question: Store mixed objects in an `Object[]` and print them polymorphically.
 * 
 * Sample Output:
 * Integer -> 42
String -> hello
Double -> 3.14
Item -> Item:Notebook
 */

public class ObjectPolymorphismDemo {
    static class Item { String name; Item(String n){name=n;} @Override public String toString() { return "Item:" + name; } }
    public static void main(String[] args) {
        Object[] mixed = { 42, "hello", 3.14, new Item("Notebook") };
        for (Object o : mixed) System.out.println(o.getClass().getSimpleName() + " -> " + o);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why can an `Object[]` hold ints, Strings, and custom objects? A: Every reference type in Java (and autoboxed primitives) is ultimately a subtype of `Object`.
 * 2. Q: What does `getClass()` return? A: A `Class` object representing the object's actual runtime type.
 */
