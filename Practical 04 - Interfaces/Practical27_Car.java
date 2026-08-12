/**
 * Practical 27: Basic Interface Implementation
 * 
 * Concept: An interface defines a contract of method signatures a class agrees to implement.
 * 
 * Question: Define a `Drivable` interface implemented by a `Car` class.
 * 
 * Sample Output:
 * The car is driving.
 */

interface Drivable {
    void drive();
}
public class Car implements Drivable {
    @Override public void drive() { System.out.println("The car is driving."); }
    public static void main(String[] args) {
        Drivable d = new Car();
        d.drive();
    }
}

/*
 * Viva Q&A:
 * 1. Q: Can you instantiate an interface directly? A: No, but you can create an anonymous class or lambda implementing it.
 * 2. Q: What access modifier do interface methods have by default? A: `public abstract` (implicitly), unless marked `default`, `static`, or `private`.
 */
