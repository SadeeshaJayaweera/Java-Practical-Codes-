/**
 * Practical 55: HashMap Basics
 * 
 * Concept: `HashMap` stores key-value pairs with O(1) average-case lookup, no guaranteed order.
 * 
 * Question: Count word frequency in a sentence using a `HashMap`.
 * 
 * Sample Output:
 * the -> 2
quick -> 1
brown -> 1
fox -> 2
lazy -> 1
 */

import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        String[] words = "the quick brown fox the lazy fox".split(" ");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) freq.merge(w, 1, Integer::sum);
        for (Map.Entry<String, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does `merge(key, 1, Integer::sum)` do? A: If the key exists, it adds 1 to the existing value via the merge function; otherwise it inserts the key with value 1.
 * 2. Q: Does `HashMap` guarantee iteration order? A: No — use `LinkedHashMap` (insertion order) or `TreeMap` (sorted order) if order matters.
 */
