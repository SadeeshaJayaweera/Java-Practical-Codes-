/**
 * Practical 50: Stack Traces and `printStackTrace()`
 * 
 * Concept: Every exception carries a stack trace showing the call path where it was thrown, useful for debugging.
 * 
 * Question: Trigger a nested method call chain that throws, and print the stack trace.
 * 
 * Sample Output:
 * Caught: Something broke deep inside
Stack trace element count: 4
 */

public class StackTraceDemo {
    static void levelThree() { throw new IllegalStateException("Something broke deep inside"); }
    static void levelTwo() { levelThree(); }
    static void levelOne() { levelTwo(); }

    public static void main(String[] args) {
        try {
            levelOne();
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Stack trace element count: " + e.getStackTrace().length);
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does `e.printStackTrace()` print? A: The exception type/message plus the full call stack of method invocations leading to where it was thrown.
 * 2. Q: Why should production code avoid `printStackTrace()` alone? A: It writes to `System.err` without structured logging; a proper logging framework (e.g., SLF4J) is preferred for real applications.
 */
