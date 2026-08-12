/**
 * Practical 42: Polymorphism in Exception Hierarchies
 * 
 * Concept: Catch blocks can catch a broader exception supertype, polymorphically handling multiple specific exception subtypes.
 * 
 * Question: Catch different numeric exceptions using a common `RuntimeException` handler and specific ones first.
 * 
 * Sample Output:
 * Index problem: Index 2 out of bounds for length 2
 */

public class ExceptionPolymorphismDemo {
    public static void main(String[] args) {
        int[] data = {10, 0};
        try {
            System.out.println(data[2] / data[1]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index problem: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("General runtime problem: " + e.getMessage());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why must specific catch blocks come before general ones? A: Java matches catch blocks top-to-bottom; a broader supertype block placed first would swallow all subtypes, making later specific blocks unreachable (a compile error).
 * 2. Q: What is the common superclass of all exceptions Java code typically catches? A: `Exception` (and ultimately `Throwable`).
 */
