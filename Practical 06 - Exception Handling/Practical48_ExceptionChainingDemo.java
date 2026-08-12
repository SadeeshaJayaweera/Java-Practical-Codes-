/**
 * Practical 48: Exception Chaining (Cause)
 * 
 * Concept: A new exception can wrap an original one as its "cause", preserving the root-cause stack trace for debugging.
 * 
 * Question: Catch a low-level exception and rethrow a higher-level one with the original as cause.
 * 
 * Sample Output:
 * Top-level error: Failed to load configuration
Caused by: java.lang.NumberFormatException: bad port value
 */

public class ExceptionChainingDemo {
    static void loadConfig() {
        try {
            throw new NumberFormatException("bad port value");
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to load configuration", e);
        }
    }
    public static void main(String[] args) {
        try {
            loadConfig();
        } catch (RuntimeException e) {
            System.out.println("Top-level error: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why is exception chaining useful? A: It preserves the original root cause while allowing higher layers to throw more meaningful, context-specific exceptions.
 * 2. Q: Which method retrieves the wrapped original exception? A: `getCause()`.
 */
