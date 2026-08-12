/**
 * Practical 61: Collections Utility Class
 * 
 * Concept: `java.util.Collections` provides static helper methods: sorting, shuffling, min/max, immutability wrappers, etc.
 * 
 * Question: Demonstrate `sort`, `reverse`, `max`, and `frequency`.
 * 
 * Sample Output:
 * Sorted: [1, 3, 3, 3, 5, 8, 9]
Reversed: [9, 8, 5, 3, 3, 3, 1]
Max: 9
Frequency of 3: 3
 */

import java.util.*;
public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 3, 8, 3, 1, 9, 3));
        Collections.sort(nums);
        System.out.println("Sorted: " + nums);
        Collections.reverse(nums);
        System.out.println("Reversed: " + nums);
        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Frequency of 3: " + Collections.frequency(nums, 3));
    }
}

/*
 * Viva Q&A:
 * 1. Q: How does `Collections.unmodifiableList` differ from `List.of()`? A: `unmodifiableList` wraps an existing (possibly mutable) list read-only view; `List.of()` creates a genuinely immutable list directly and disallows `null` elements.
 * 2. Q: What algorithm does `Collections.sort` use under the hood for objects? A: A variant of merge sort/TimSort, guaranteeing O(n log n) and stability.
 */
