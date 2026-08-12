/**
 * Practical 52: Global Exception Handling Pattern (Simplified)
 * 
 * Concept: Larger applications centralize exception handling (e.g., a single handler layer) instead of scattering try-catch everywhere.
 * 
 * Question: Simulate a simple centralized handler that maps exception types to user-friendly messages.
 * 
 * Sample Output:
 * Math error: / by zero
Missing data error.
Unexpected error: bad state
 */

import java.util.*;
import java.util.function.Function;

public class GlobalExceptionHandlerDemo {
    static final Map<Class<? extends Exception>, Function<Exception, String>> HANDLERS = new HashMap<>();
    static {
        HANDLERS.put(ArithmeticException.class, e -> "Math error: " + e.getMessage());
        HANDLERS.put(NullPointerException.class, e -> "Missing data error.");
    }
    static String handle(Exception e) {
        return HANDLERS.getOrDefault(e.getClass(), ex -> "Unexpected error: " + ex.getMessage()).apply(e);
    }
    public static void main(String[] args) {
        System.out.println(handle(new ArithmeticException("/ by zero")));
        System.out.println(handle(new NullPointerException()));
        System.out.println(handle(new IllegalStateException("bad state")));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What real-world Java frameworks use a similar centralized approach? A: Spring's `@ControllerAdvice`/`@ExceptionHandler` centralizes REST API exception handling similarly.
 * 2. Q: Why key the map by `Class<? extends Exception>`? A: To look up the right handling strategy based on the exact runtime type of the exception.
 */
