/**
 * Practical 58: Iterator and ConcurrentModificationException
 * 
 * Concept: Modifying a collection while iterating with a for-each loop throws `ConcurrentModificationException`; use `Iterator.remove()` instead.
 * 
 * Question: Safely remove even numbers from a list while iterating.
 * 
 * Sample Output:
 * Odd numbers only: [1, 3, 5]
 */

import java.util.*;
public class IteratorRemovalDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) it.remove();
        }
        System.out.println("Odd numbers only: " + numbers);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why does modifying a list during a for-each loop fail? A: The for-each loop uses an internal iterator whose fail-fast check detects the list's modification count changed unexpectedly, throwing `ConcurrentModificationException`.
 * 2. Q: What alternative modern approach avoids manual iterator handling here? A: `list.removeIf(n -> n % 2 == 0)`.
 */
