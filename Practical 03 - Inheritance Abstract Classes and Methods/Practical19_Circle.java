/**
 * Practical 19: The `super` Keyword — Calling Parent Methods
 * 
 * Concept: `super.method()` invokes the overridden superclass version from within an overriding method.
 * 
 * Question: Extend a `Shape` class's `describe()` method while still reusing the parent's output.
 * 
 * Sample Output:
 * I am a shape.
More specifically, I am a circle.
 */

class Shape {
    void describe() { System.out.println("I am a shape."); }
}
public class Circle extends Shape {
    @Override
    void describe() {
        super.describe();
        System.out.println("More specifically, I am a circle.");
    }
    public static void main(String[] args) {
        new Circle().describe();
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why use `super.describe()` instead of duplicating the parent logic? A: It avoids code duplication and keeps behaviour consistent if the parent implementation changes.
 * 2. Q: Is `super` also used to access hidden fields? A: Yes, `super.fieldName` accesses the parent class's field when the subclass declares a field with the same name.
 */
