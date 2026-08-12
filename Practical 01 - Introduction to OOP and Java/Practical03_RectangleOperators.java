/**
 * Practical 03: Operators and Expressions
 * 
 * Concept: Arithmetic, relational, logical, and the ternary operator control expression evaluation.
 * 
 * Question: Compute the area/perimeter of a rectangle and determine if it's a square using operators.
 * 
 * Sample Output:
 * Area: 100
Perimeter: 40
Shape type: Square
 */

public class RectangleOperators {
    public static void main(String[] args) {
        int length = 10, width = 10;
        int area = length * width;
        int perimeter = 2 * (length + width);
        String shapeType = (length == width) ? "Square" : "Rectangle";

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Shape type: " + shapeType);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does the ternary operator `?:` do? A: It is a shorthand conditional expression: `condition ? valueIfTrue : valueIfFalse`.
 * 2. Q: What is the difference between `==` and `.equals()` for objects? A: `==` compares references (memory address), `.equals()` compares logical/content equality when overridden.
 */
