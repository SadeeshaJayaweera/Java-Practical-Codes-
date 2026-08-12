/**
 * Practical 51: Rethrowing and the `throws` Clause
 * 
 * Concept: A method may partially handle an exception (e.g., logging) and rethrow it, declared via `throws`.
 * 
 * Question: Log an error inside a method, then rethrow it to the caller.
 * 
 * Sample Output:
 * [LOG] Negative value: -10
Caller handled: Negative value: -10
 */

public class RethrowDemo {
    static void process(int value) throws Exception {
        try {
            if (value < 0) throw new Exception("Negative value: " + value);
        } catch (Exception e) {
            System.out.println("[LOG] " + e.getMessage());
            throw e; // rethrow after logging
        }
    }
    public static void main(String[] args) {
        try {
            process(-10);
        } catch (Exception e) {
            System.out.println("Caller handled: " + e.getMessage());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why rethrow after logging instead of just swallowing the exception? A: To keep both a diagnostic log at the point of failure and let the caller still respond appropriately to the error.
 * 2. Q: What is required on a method signature that can throw a checked exception it doesn't fully handle? A: A `throws ExceptionType` clause declaring it to callers.
 */
