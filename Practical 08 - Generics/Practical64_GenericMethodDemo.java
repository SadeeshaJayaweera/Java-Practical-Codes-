/**
 * Practical 64: Generic Methods
 * 
 * Concept: A method can declare its own type parameter, independent of the class it belongs to.
 * 
 * Question: Write a generic method that finds the maximum element in any array of `Comparable` items.
 * 
 * Sample Output:
 * Max number: 9
Max word: cherry
 */

public class GenericMethodDemo {
    static <T extends Comparable<T>> T findMax(T[] items) {
        T max = items[0];
        for (T item : items) if (item.compareTo(max) > 0) max = item;
        return max;
    }
    public static void main(String[] args) {
        Integer[] nums = {3, 7, 2, 9, 4};
        String[] words = {"banana", "apple", "cherry"};
        System.out.println("Max number: " + findMax(nums));
        System.out.println("Max word: " + findMax(words));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does `<T extends Comparable<T>>` mean? A: A bounded type parameter — `T` must implement `Comparable<T>`, guaranteeing elements can be compared with `compareTo`.
 * 2. Q: Can generic methods be static? A: Yes — the type parameter is declared before the return type, independent of any class-level generics.
 */
