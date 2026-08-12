/**
 * Practical 28: Multiple Interface Implementation
 * 
 * Concept: A class can implement several interfaces, achieving a form of multiple inheritance of type.
 * 
 * Question: Implement both `Flyable` and `Swimmable` in a `Duck` class.
 * 
 * Sample Output:
 * Duck is flying.
Duck is swimming.
 */

interface Flyable { void fly(); }
interface Swimmable { void swim(); }

public class Duck implements Flyable, Swimmable {
    @Override public void fly() { System.out.println("Duck is flying."); }
    @Override public void swim() { System.out.println("Duck is swimming."); }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why can a class implement multiple interfaces but extend only one class? A: Java avoids the "diamond problem" of state inheritance; interfaces (pre-Java 8) had no state, so multiple implementation was safe.
 * 2. Q: What happens if two interfaces have conflicting default methods? A: The implementing class must explicitly override the method to resolve the conflict.
 */
