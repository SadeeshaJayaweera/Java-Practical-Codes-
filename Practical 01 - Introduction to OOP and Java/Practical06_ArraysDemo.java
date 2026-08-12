/**
 * Practical 06: Arrays — 1D and 2D
 * 
 * Concept: Arrays store fixed-size, indexed collections of same-typed elements.
 * 
 * Question: Find the max value in a 1D array and print a 2D matrix, then sum its elements.
 * 
 * Sample Output:
 * Max score: 92
1 2 3
4 5 6
7 8 9
Matrix sum: 45
 */

public class ArraysDemo {
    public static void main(String[] args) {
        int[] scores = {45, 89, 67, 92, 31};
        int max = scores[0];
        for (int s : scores) if (s > max) max = s;
        System.out.println("Max score: " + max);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
                sum += val;
            }
            System.out.println();
        }
        System.out.println("Matrix sum: " + sum);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Are Java arrays fixed size? A: Yes, once created, an array's length cannot change; use `ArrayList` for dynamic sizing.
 * 2. Q: How is a 2D array represented internally in Java? A: As an array of arrays (each row can even have a different length — a "jagged" array).
 */
