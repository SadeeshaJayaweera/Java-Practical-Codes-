/**
 * Practical 29: Default and Static Methods in Interfaces
 * 
 * Concept: Since Java 8, interfaces can have `default` methods (with a body, overridable) and `static` utility methods.
 * 
 * Question: Add a default method with common logic and a static factory-like utility to a `Greetable` interface.
 * 
 * Sample Output:
 * Hello, Amara!
 */

interface Greetable {
    String name();
    default void greet() { System.out.println("Hello, " + name() + "!"); }
    static Greetable of(String n) { return () -> n; }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        Greetable g = Greetable.of("Amara");
        g.greet();
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why were default methods introduced in Java 8? A: To let interfaces evolve (add new methods) without breaking existing implementing classes.
 * 2. Q: Can a static interface method be overridden by implementing classes? A: No, static interface methods belong to the interface itself and are not inherited or overridable.
 */
