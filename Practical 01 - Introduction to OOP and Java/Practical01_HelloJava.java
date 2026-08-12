/**
 * Practical 01: Hello World and Compilation Basics
 * 
 * Concept: Every Java program needs a class with a `main` method as its entry point. `javac` compiles `.java` to `.class` bytecode; `java` runs it on the JVM.
 * 
 * Question: Write a program that prints a welcome message and the current Java version.
 * 
 * Sample Output:
 * Welcome to Java Practicals!
Running on Java version: 21.0.2
 */

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Practicals!");
        System.out.println("Running on Java version: " + System.getProperty("java.version"));
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why must the class name match the file name in Java? A: The public class name and file name must match so the compiler/JVM can locate the correct `.class` file for the public type.
 * 2. Q: What is the JVM? A: The Java Virtual Machine executes compiled bytecode, providing platform independence ("write once, run anywhere").
 */
