/**
 * Practical 89: Method References
 * 
 * Concept: Method references (`Class::method`) are shorthand for lambdas that just call an existing method.
 * 
 * Question: Demonstrate the four kinds of method references.
 * 
 * Sample Output:
 * STATIC REF
HELLO
7
[]
 */

import java.util.*;
import java.util.function.*;

public class MethodReferenceDemo {
    static void printUpper(String s) { System.out.println(s.toUpperCase()); }

    public static void main(String[] args) {
        // Static method reference
        Consumer<String> printer = MethodReferenceDemo::printUpper;
        printer.accept("static ref");

        // Instance method reference on a particular object
        String greeting = "hello";
        Supplier<String> upperSupplier = greeting::toUpperCase;
        System.out.println(upperSupplier.get());

        // Instance method reference on an arbitrary object of a type
        Function<String, Integer> lengthFn = String::length;
        System.out.println(lengthFn.apply("Colombo"));

        // Constructor reference
        Supplier<ArrayList<String>> listFactory = ArrayList::new;
        System.out.println(listFactory.get());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What are the four kinds of method references in Java? A: Static method (`Type::staticMethod`), bound instance method (`instance::method`), unbound instance method (`Type::instanceMethod`), and constructor reference (`Type::new`).
 * 2. Q: Why prefer a method reference over an equivalent lambda? A: It's often more concise and readable when the lambda body is just a direct call to an existing method.
 */
