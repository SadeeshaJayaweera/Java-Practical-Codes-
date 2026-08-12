/**
 * Practical 56: TreeMap and Sorted Collections
 * 
 * Concept: `TreeMap`/`TreeSet` keep elements sorted (by natural order or a Comparator) using a red-black tree.
 * 
 * Question: Store student scores sorted by name using `TreeMap`.
 * 
 * Sample Output:
 * Sorted by name: {Amal=92, Kavi=75, Zara=88}
First entry: Amal=92
Last entry: Zara=88
 */

import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Zara", 88);
        scores.put("Amal", 92);
        scores.put("Kavi", 75);
        System.out.println("Sorted by name: " + scores);
        System.out.println("First entry: " + scores.firstEntry());
        System.out.println("Last entry: " + scores.lastEntry());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the time complexity of `TreeMap` operations? A: O(log n) for get/put/remove, due to the underlying balanced tree.
 * 2. Q: What interface must keys implement (or a Comparator be supplied) for `TreeMap`? A: `Comparable`, unless a `Comparator` is passed to the constructor.
 */
