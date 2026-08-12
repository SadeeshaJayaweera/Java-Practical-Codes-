/**
 * Practical 02: Variables, Data Types and Type Casting
 * 
 * Concept: Java is statically typed; primitives (`int`, `double`, `char`, `boolean`, etc.) and casting (implicit widening vs explicit narrowing) are core basics.
 * 
 * Question: Declare variables of different primitive types and demonstrate widening and narrowing casts.
 * 
 * Sample Output:
 * Average (widened): 87.0
Rounded price (narrowed): 199
ASCII of grade 'A': 65
 */

public class TypeCastingDemo {
    public static void main(String[] args) {
        int marks = 87;
        double average = marks;          // widening (implicit)
        double price = 199.99;
        int roundedPrice = (int) price;  // narrowing (explicit)
        char grade = 'A';
        int asciiValue = grade;          // char to int widening

        System.out.println("Average (widened): " + average);
        System.out.println("Rounded price (narrowed): " + roundedPrice);
        System.out.println("ASCII of grade '" + grade + "': " + asciiValue);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why does narrowing require an explicit cast? A: Because it can lose data (precision or magnitude), Java forces the developer to acknowledge that risk explicitly.
 * 2. Q: Is `String` a primitive type in Java? A: No, `String` is a reference type (an object), not a primitive.
 */
