/**
 * Practical 44: Checked vs Unchecked Exceptions
 * 
 * Concept: Checked exceptions (subclasses of `Exception`, not `RuntimeException`) must be declared or caught; unchecked ones need not be.
 * 
 * Question: Throw and handle a checked `IOException`-style custom exception plus an unchecked one.
 * 
 * Sample Output:
 * Checked exception caught: File not found
Unchecked exception caught: Index 5 out of bounds for length 2
 */

import java.io.IOException;

public class CheckedUncheckedDemo {
    static void readFile(boolean exists) throws IOException {
        if (!exists) throw new IOException("File not found");
        System.out.println("Reading file...");
    }
    public static void main(String[] args) {
        try {
            readFile(false);
        } catch (IOException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why must checked exceptions be declared with `throws`? A: The compiler enforces that callers acknowledge and handle recoverable conditions like I/O failures at compile time.
 * 2. Q: Give an example of an unchecked exception besides array index issues. A: `NullPointerException`, `ArithmeticException`, or `IllegalArgumentException`.
 */
