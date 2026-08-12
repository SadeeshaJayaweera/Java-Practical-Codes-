/**
 * Practical 30: Interfaces as Callback Types (Functional Interfaces)
 * 
 * Concept: A functional interface has exactly one abstract method, allowing lambda expressions as implementations.
 * 
 * Question: Define a `Validator` functional interface and use it with lambdas.
 * 
 * Sample Output:
 * notEmpty("hi"): true
isPositive(-5): false
 */

@FunctionalInterface
interface Validator<T> { boolean isValid(T value); }

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Validator<String> notEmpty = s -> s != null && !s.isEmpty();
        Validator<Integer> isPositive = n -> n > 0;

        System.out.println("notEmpty(\"hi\"): " + notEmpty.isValid("hi"));
        System.out.println("isPositive(-5): " + isPositive.isValid(-5));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does `@FunctionalInterface` do? A: It's an optional but recommended annotation that makes the compiler enforce exactly one abstract method.
 * 2. Q: Name a built-in functional interface from `java.util.function`. A: E.g. `Predicate<T>`, `Function<T,R>`, `Supplier<T>`, or `Consumer<T>`.
 */
