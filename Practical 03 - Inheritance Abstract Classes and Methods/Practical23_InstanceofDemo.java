/**
 * Practical 23: `instanceof` and Downcasting
 * 
 * Concept: `instanceof` checks an object's runtime type before safely downcasting a superclass reference.
 * 
 * Question: Given an array of `Animal` references, downcast to access subclass-specific methods safely.
 * 
 * Sample Output:
 * Parrot: Polly wants a cracker!
Fish is swimming.
 */

class Animal { }
class Parrot extends Animal { void speak() { System.out.println("Parrot: Polly wants a cracker!"); } }
class Fish extends Animal { void swim() { System.out.println("Fish is swimming."); } }

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Parrot(), new Fish() };
        for (Animal a : animals) {
            if (a instanceof Parrot p) p.speak();
            else if (a instanceof Fish f) f.swim();
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is "pattern matching for instanceof" (Java 16+)? A: It lets you combine the type check and cast in one expression, e.g. `a instanceof Parrot p`, binding `p` automatically.
 * 2. Q: What exception can an unsafe cast throw at runtime? A: `ClassCastException`.
 */
