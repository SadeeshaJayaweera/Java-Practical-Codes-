/**
 * Practical 92: Parallel Streams
 * 
 * Concept: `.parallelStream()` (or `.stream().parallel()`) splits work across multiple threads using the common ForkJoinPool, useful for CPU-bound bulk operations on large data.
 * 
 * Question: Sum a large range of numbers using a parallel stream.
 * 
 * Sample Output:
 * Sum 1..10,000,000 = 50000005000000
 */

import java.util.stream.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long sum = LongStream.rangeClosed(1, 10_000_000)
            .parallel()
            .sum();
        System.out.println("Sum 1..10,000,000 = " + sum);
    }
}

/*
 * Viva Q&A:
 * 1. Q: When are parallel streams *not* worth using? A: For small datasets or I/O-bound / side-effecting operations, where thread coordination overhead outweighs any speedup benefit.
 * 2. Q: What thread pool do parallel streams use by default? A: The common `ForkJoinPool`, shared across the JVM unless explicitly configured otherwise.
 */
