/**
 * Practical 46: Multi-Catch Blocks
 * 
 * Concept: A single `catch` clause can handle multiple unrelated exception types using `|`.
 * 
 * Question: Handle both `NumberFormatException` and `ArithmeticException` in one multi-catch block.
 * 
 * Sample Output:
 * Input problem: NumberFormatException - For input string: "abc"
-1
Input problem: ArithmeticException - / by zero
-1
 */

public class MultiCatchDemo {
    static int parseAndDivide(String numerator, String denominator) {
        try {
            return Integer.parseInt(numerator) / Integer.parseInt(denominator);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Input problem: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(parseAndDivide("abc", "2"));
        System.out.println(parseAndDivide("10", "0"));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the restriction on the exception types used in a multi-catch? A: They must not be related by subclassing (one cannot be a subtype of another) in the same multi-catch clause.
 * 2. Q: Is the caught variable in a multi-catch implicitly `final`? A: Yes, it is effectively final and cannot be reassigned inside the catch block.
 */
