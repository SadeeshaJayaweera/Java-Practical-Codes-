/**
 * Practical 49: Custom Exception Hierarchies
 * 
 * Concept: You can build a hierarchy of related custom exceptions for fine-grained or broad catching.
 * 
 * Question: Create a base `ValidationException` with two subtypes, then catch broadly and specifically.
 * 
 * Sample Output:
 * Validation failed (OutOfRangeException): Age is out of range
 */

class ValidationException extends RuntimeException { ValidationException(String m) { super(m); } }
class EmptyFieldException extends ValidationException { EmptyFieldException(String field) { super(field + " cannot be empty"); } }
class OutOfRangeException extends ValidationException { OutOfRangeException(String field) { super(field + " is out of range"); } }

public class ExceptionHierarchyDemo {
    static void validateAge(int age) {
        if (age == 0) throw new EmptyFieldException("Age");
        if (age < 0 || age > 120) throw new OutOfRangeException("Age");
    }
    public static void main(String[] args) {
        try {
            validateAge(200);
        } catch (ValidationException e) {
            System.out.println("Validation failed (" + e.getClass().getSimpleName() + "): " + e.getMessage());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the benefit of a shared `ValidationException` base class? A: Callers who don't care about the exact subtype can catch the broad base type in one place.
 * 2. Q: Could `getClass().getSimpleName()` be used to branch behaviour instead of separate catch blocks? A: It's possible but generally discouraged — using distinct catch blocks or polymorphic exception behaviour is cleaner than type-name string checks.
 */
