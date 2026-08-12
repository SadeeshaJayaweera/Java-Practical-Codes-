/**
 * Practical 05: Loops — for, while, do-while
 * 
 * Concept: Loops repeat a block of code; choice depends on whether the iteration count is known in advance.
 * 
 * Question: Print a multiplication table and count digits of a number using different loop types.
 * 
 * Sample Output:
 * 5 x 1 = 5
...
5 x 10 = 50
Digit count: 4
Attempts made: 3
 */

public class LoopsDemo {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        int number = 4821, digitCount = 0;
        while (number != 0) {
            number /= 10;
            digitCount++;
        }
        System.out.println("Digit count: " + digitCount);

        int attempt = 0;
        do {
            attempt++;
        } while (attempt < 3);
        System.out.println("Attempts made: " + attempt);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What's the key difference between `while` and `do-while`? A: `do-while` always executes the loop body at least once because the condition is checked after the body.
 * 2. Q: What is a "for-each" loop used for? A: Iterating over arrays/collections without manually managing an index.
 */
