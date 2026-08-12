/**
 * Practical 53: ArrayList Basics
 * 
 * Concept: `ArrayList` is a resizable, index-based list backed by an array.
 * 
 * Question: Add, remove, and iterate over an `ArrayList` of Strings.
 * 
 * Sample Output:
 * Apple
Mango
Grapes
Size: 3
 */

import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Mango"));
        fruits.add("Grapes");
        fruits.remove("Banana");
        for (String f : fruits) System.out.println(f);
        System.out.println("Size: " + fruits.size());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the time complexity of `ArrayList.get(index)`? A: O(1) — constant time, since it's backed by an array.
 * 2. Q: What is the time complexity of inserting at the front of an `ArrayList`? A: O(n), because subsequent elements must shift right.
 */
