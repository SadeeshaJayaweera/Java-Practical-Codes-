/**
 * Practical 22: The `final` Keyword — Classes, Methods, Variables
 * 
 * Concept: `final` prevents further subclassing, overriding, or reassignment respectively.
 * 
 * Question: Demonstrate a `final` method that can't be overridden and a `final` variable that can't be reassigned.
 * 
 * Sample Output:
 * I am the Base class.
MAX_USERS = 100
 */

class Base {
    final void identify() { System.out.println("I am the Base class."); }
}
public class FinalDemo extends Base {
    public static void main(String[] args) {
        final int MAX_USERS = 100;
        new FinalDemo().identify();
        System.out.println("MAX_USERS = " + MAX_USERS);
        // MAX_USERS = 200; // would not compile
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does declaring a class `final` mean? A: It cannot be extended/subclassed at all (e.g., `String` is `final`).
 * 2. Q: Why mark constants `final`? A: To guarantee they are assigned once and never change, communicating immutability and enabling compiler optimizations.
 */
