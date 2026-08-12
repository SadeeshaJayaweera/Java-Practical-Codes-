/**
 * Practical 43: try-catch-finally Basics
 * 
 * Concept: `try` wraps risky code, `catch` handles specific exceptions, `finally` always runs (cleanup), regardless of whether an exception occurred.
 * 
 * Question: Divide two numbers safely and always print a closing message.
 * 
 * Sample Output:
 * Error: / by zero
Division attempt finished.
Result: 0
 */

public class TryCatchFinallyDemo {
    static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("Division attempt finished.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Result: " + safeDivide(10, 0));
    }
}

/*
 * Viva Q&A:
 * 1. Q: Does `finally` run even if the `try` block has a `return` statement? A: Yes, `finally` runs before the method actually returns, unless the JVM exits or a fatal error occurs.
 * 2. Q: What is `ArithmeticException` an example of? A: An unchecked (runtime) exception.
 */
