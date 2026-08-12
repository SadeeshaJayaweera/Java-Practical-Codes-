/**
 * Practical 86: Stream Basics — filter, map, collect
 * 
 * Concept: Streams process sequences of elements declaratively via chained operations (intermediate + terminal).
 * 
 * Question: Filter even numbers, square them, and collect into a list.
 * 
 * Sample Output:
 * [4, 16, 36, 64, 100]
 */

import java.util.*;
import java.util.stream.*;

public class StreamBasicsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(result);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What's the difference between "intermediate" and "terminal" stream operations? A: Intermediate ops (like `filter`, `map`) are lazy and return a new stream; terminal ops (like `collect`, `forEach`) trigger actual processing and produce a result or side effect.
 * 2. Q: Can a stream be reused/iterated twice? A: No — once a terminal operation is invoked, the stream is considered consumed and throws `IllegalStateException` if reused.
 */
