/**
 * Practical 66: Wildcards — `? extends` vs `? super`
 * 
 * Concept: `? extends T` (producer, read-only) and `? super T` (consumer, write-only) follow the PECS principle (Producer Extends, Consumer Super).
 * 
 * Question: Copy elements from a source list (`? extends T`) into a destination list (`? super T`).
 * 
 * Sample Output:
 * Destination: [1, 2, 3]
 */

import java.util.*;
public class PecsDemo {
    static <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (T item : source) destination.add(item);
    }
    public static void main(String[] args) {
        List<Integer> source = List.of(1, 2, 3);
        List<Number> destination = new ArrayList<>();
        copy(source, destination);
        System.out.println("Destination: " + destination);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does "PECS" stand for? A: Producer Extends, Consumer Super — use `extends` when reading from a structure, `super` when writing into it.
 * 2. Q: Why can't you add to a `List<? extends T>`? A: The compiler can't guarantee the exact runtime type, so adding any specific type (except `null`) is unsafe and disallowed.
 */
