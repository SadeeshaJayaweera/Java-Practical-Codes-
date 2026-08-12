/**
 * Practical 07: Methods, Parameters and Overloading
 * 
 * Concept: Methods encapsulate reusable logic; overloading allows same method name with different parameter lists.
 * 
 * Question: Create overloaded `add` methods for int, double and three integers.
 * 
 * Sample Output:
 * int+int: 5
double+double: 5.6
int+int+int: 6
 */

public class MethodOverloadingDemo {
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        System.out.println("int+int: " + add(2, 3));
        System.out.println("double+double: " + add(2.5, 3.1));
        System.out.println("int+int+int: " + add(1, 2, 3));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What determines which overloaded method is called? A: The compiler resolves it at compile time based on the number, type, and order of arguments (static/compile-time polymorphism).
 * 2. Q: Can two methods be overloaded by return type alone? A: No, return type alone is not sufficient to distinguish overloaded methods.
 */
