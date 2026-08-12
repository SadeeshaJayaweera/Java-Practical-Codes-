/**
 * Practical 63: Generic Classes
 * 
 * Concept: Generics let a class work with any type while preserving compile-time type safety, avoiding casts.
 * 
 * Question: Build a generic `Box<T>` container.
 * 
 * Sample Output:
 * Hello Generics
100
 */

public class Box<T> {
    private T content;
    public void set(T content) { this.content = content; }
    public T get() { return content; }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println(intBox.get());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What problem do generics solve compared to using `Object`? A: They provide compile-time type checking, eliminating the need for manual casts and preventing `ClassCastException` at runtime.
 * 2. Q: What is "type erasure"? A: The JVM removes generic type information at runtime (via compiler-inserted casts), so generic type parameters don't exist in the compiled bytecode.
 */
