/**
 * Practical 57: HashSet and TreeSet — Removing Duplicates
 * 
 * Concept: `Set` implementations disallow duplicate elements; `HashSet` is unordered, `TreeSet` is sorted.
 * 
 * Question: Remove duplicates from a list and sort the result.
 * 
 * Sample Output:
 * HashSet (no dup, no order): 5 elements
TreeSet (no dup, sorted): [1, 2, 4, 7, 9]
 */

import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 2, 7, 2, 9, 4, 1);
        Set<Integer> unique = new HashSet<>(numbers);
        Set<Integer> sortedUnique = new TreeSet<>(numbers);
        System.out.println("HashSet (no dup, no order): " + unique.size() + " elements");
        System.out.println("TreeSet (no dup, sorted): " + sortedUnique);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What makes an object eligible to be stored uniquely in a `HashSet`? A: A correct, consistent implementation of `equals()` and `hashCode()`.
 * 2. Q: Which Set implementation preserves insertion order? A: `LinkedHashSet`.
 */
