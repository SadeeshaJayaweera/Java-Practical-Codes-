/**
 * Practical 68: Generic Stack Implementation
 * 
 * Concept: Combine generics with a classic data structure to build a fully type-safe custom `Stack<T>`.
 * 
 * Question: Implement a simple generic stack backed by an `ArrayList`.
 * 
 * Sample Output:
 * Popped: third
Popped: second
Popped: first
 */

import java.util.*;
public class GenericStack<T> {
    private final List<T> elements = new ArrayList<>();

    public void push(T item) { elements.add(item); }
    public T pop() {
        if (elements.isEmpty()) throw new NoSuchElementException("Stack is empty");
        return elements.remove(elements.size() - 1);
    }
    public boolean isEmpty() { return elements.isEmpty(); }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        while (!stack.isEmpty()) System.out.println("Popped: " + stack.pop());
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why write a custom generic stack when `Deque` already exists? A: Educational purposes — understanding how generic, type-safe data structures are built internally.
 * 2. Q: What exception is idiomatic when popping from an empty collection? A: `NoSuchElementException`.
 */
