/**
 * Practical 41: Operator "Polymorphism" — The Overloaded `+`
 * 
 * Concept: The `+` operator behaves differently for numbers (addition) vs Strings (concatenation) — a built-in form of ad-hoc polymorphism.
 * 
 * Question: Demonstrate `+` behaving differently based on operand types.
 * 
 * Sample Output:
 * 5
23
5kg
Weight: 23
 */

public class PlusOperatorDemo {
    public static void main(String[] args) {
        System.out.println(2 + 3);            // numeric addition
        System.out.println("2" + 3);           // string concatenation
        System.out.println(2 + 3 + "kg");       // left-to-right: 5 then concatenation
        System.out.println("Weight: " + 2 + 3); // string then numeric concatenation
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why does `2 + 3 + "kg"` print `5kg` but `"Weight: " + 2 + 3` prints `Weight: 23`? A: Java evaluates `+` left to right; once a `String` operand appears, everything after becomes string concatenation.
 * 2. Q: Is this true operator overloading like C++? A: No, Java does not allow user-defined operator overloading; only `+` has built-in dual behaviour for numbers and Strings.
 */
