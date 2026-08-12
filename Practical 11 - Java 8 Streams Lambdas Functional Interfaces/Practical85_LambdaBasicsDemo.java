/**
 * Practical 85: Lambda Expressions Basics
 * 
 * Concept: Lambdas provide a concise way to represent an instance of a functional interface.
 * 
 * Question: Compare an anonymous class implementation with an equivalent lambda.
 * 
 * Sample Output:
 * -3
-3
 */

import java.util.function.*;

public class LambdaBasicsDemo {
    public static void main(String[] args) {
        Comparator<String> byLengthAnon = new Comparator<String>() {
            @Override public int compare(String a, String b) { return a.length() - b.length(); }
        };
        Comparator<String> byLengthLambda = (a, b) -> a.length() - b.length();

        System.out.println(byLengthAnon.compare("hi", "hello"));
        System.out.println(byLengthLambda.compare("hi", "hello"));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What must a target type be for a lambda to compile? A: A functional interface (an interface with exactly one abstract method).
 * 2. Q: Do lambdas create a new `.class` file for each usage the way anonymous classes do? A: No, lambdas are compiled using `invokedynamic` and don't generate a separate named class per lambda instance the same way anonymous inner classes do.
 */
