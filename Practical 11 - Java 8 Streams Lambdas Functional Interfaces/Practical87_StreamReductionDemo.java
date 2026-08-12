/**
 * Practical 87: Stream Reduction — reduce, sum, average
 * 
 * Concept: `reduce` and specialized aggregate collectors combine stream elements into a single summary value.
 * 
 * Question: Compute the sum, average, and max of a list of prices using streams.
 * 
 * Sample Output:
 * Total: 585.24
Average: 146.31
Max: 320.0
 */

import java.util.*;
import java.util.stream.*;

public class StreamReductionDemo {
    public static void main(String[] args) {
        List<Double> prices = List.of(199.99, 49.5, 320.0, 15.75);
        double total = prices.stream().mapToDouble(Double::doubleValue).sum();
        double avg = prices.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double max = prices.stream().mapToDouble(Double::doubleValue).max().orElse(0);

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why does `average()` return an `OptionalDouble`? A: Because averaging an empty stream is undefined; `Optional` forces the caller to handle the "no elements" case explicitly.
 * 2. Q: What does `mapToDouble` do compared to `map`? A: It converts a `Stream<Double>` into a primitive `DoubleStream`, avoiding boxing overhead and enabling numeric-specific operations like `sum()`.
 */
