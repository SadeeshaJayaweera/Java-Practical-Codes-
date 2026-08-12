/**
 * Practical 91: Custom Functional Interfaces with Generics
 * 
 * Concept: You can define your own generic functional interfaces beyond the built-in `java.util.function` ones.
 * 
 * Question: Define a `TriFunction<A,B,C,R>` interface (three inputs, one output) not present in the standard library.
 * 
 * Sample Output:
 * Volume: 60
 */

@FunctionalInterface
interface TriFunction<A, B, C, R> {
    R apply(A a, B b, C c);
}

public class CustomFunctionalInterfaceDemo {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> volumeCalc = (l, w, h) -> l * w * h;
        System.out.println("Volume: " + volumeCalc.apply(3, 4, 5));
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why isn't there a built-in `TriFunction` in `java.util.function`? A: The standard library only ships `Function` (1 arg) and `BiFunction` (2 args); anything beyond that must be user-defined as needed.
 * 2. Q: Is `@FunctionalInterface` mandatory for a lambda-compatible interface? A: No, it's optional documentation/enforcement — any interface with exactly one abstract method works with lambdas regardless of the annotation.
 */
