/**
 * Practical 39: Covariant Return Types
 * 
 * Concept: An overriding method may return a more specific (subclass) type than the method it overrides.
 * 
 * Question: Override a method to return a narrower type using covariant returns.
 * 
 * Sample Output:
 * Reproduced: Cat
 */

class Animal { Animal reproduce() { return new Animal(); } }
class Cat extends Animal { @Override Cat reproduce() { return new Cat(); } }

public class CovariantReturnDemo {
    public static void main(String[] args) {
        Cat kitten = new Cat().reproduce(); // no cast needed
        System.out.println("Reproduced: " + kitten.getClass().getSimpleName());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is a covariant return type? A: When an overriding method's return type is a subtype of the return type declared in the overridden method.
 * 2. Q: Since which Java version has this been supported? A: Java 5.
 */
