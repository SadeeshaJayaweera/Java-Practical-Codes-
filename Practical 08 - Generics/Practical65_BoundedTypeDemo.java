/**
 * Practical 65: Bounded Type Parameters
 * 
 * Concept: `<T extends SomeClass>` restricts what types can be used, allowing calls to methods defined on the bound.
 * 
 * Question: Write a generic method that sums any list of `Number` subtypes.
 * 
 * Sample Output:
 * Sum of ints: 6.0
Sum of doubles: 7.0
 */

import java.util.*;
public class BoundedTypeDemo {
    static double sumAll(List<? extends Number> numbers) {
        double total = 0;
        for (Number n : numbers) total += n.doubleValue();
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Sum of ints: " + sumAll(List.of(1, 2, 3)));
        System.out.println("Sum of doubles: " + sumAll(List.of(1.5, 2.5, 3.0)));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does the bound `? extends Number` guarantee? A: The list contains some unknown subtype of `Number`, so elements can safely be read as `Number` (but not added to, except `null`).
 * 2. Q: Why is this called an "upper bounded wildcard"? A: It restricts the unknown type to be `Number` or any of its subclasses — an upper limit on the type hierarchy.
 */
