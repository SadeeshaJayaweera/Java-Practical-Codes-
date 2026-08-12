/**
 * Practical 21: Constructor Chaining Across Hierarchies
 * 
 * Concept: Every subclass constructor implicitly or explicitly calls a superclass constructor before its own body runs.
 * 
 * Question: Trace constructor execution order across a 3-level hierarchy.
 * 
 * Sample Output:
 * A constructor
B constructor
C constructor
 */

class A { A() { System.out.println("A constructor"); } }
class B extends A { B() { System.out.println("B constructor"); } }
class C extends B { C() { System.out.println("C constructor"); } }

public class ConstructorChainDemo {
    public static void main(String[] args) {
        new C();
    }
}

/*
 * Viva Q&A:
 * 1. Q: In what order do constructors run in an inheritance chain? A: Top-down — the topmost superclass constructor runs first, then each subclass down to the most derived class.
 * 2. Q: What happens if a subclass constructor doesn't explicitly call `super(...)`? A: The compiler implicitly inserts a call to the superclass's no-argument constructor.
 */
