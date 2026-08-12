/**
 * Practical 54: LinkedList and Deque Operations
 * 
 * Concept: `LinkedList` implements both `List` and `Deque`, efficient for insert/remove at both ends.
 * 
 * Question: Use a `LinkedList` as a double-ended queue.
 * 
 * Sample Output:
 * Deque: [5, 10, 20]
Removed from front: 5
Removed from back: 20
Remaining: [10]
 */

import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        System.out.println("Deque: " + deque);
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from back: " + deque.pollLast());
        System.out.println("Remaining: " + deque);
    }
}

/*
 * Viva Q&A:
 * 1. Q: When is `LinkedList` preferable to `ArrayList`? A: When frequent insertions/removals happen at the beginning or middle, since it avoids shifting elements.
 * 2. Q: What two interfaces does `LinkedList` implement that make it versatile? A: `List` and `Deque` (it can act as a list, stack, or queue).
 */
