/**
 * Practical 15: Encapsulation via Constructor Validation
 * 
 * Concept: Validating input inside constructors ensures an object is never created in an invalid state.
 * 
 * Question: Create a `Rectangle` class that rejects non-positive dimensions at construction time.
 * 
 * Sample Output:
 * Area: 20.0
Rejected: Dimensions must be positive
 */

public class Rectangle {
    private final double width, height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException("Dimensions must be positive");
        this.width = width;
        this.height = height;
    }

    public double area() { return width * height; }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area: " + r.area());
        try {
            new Rectangle(-2, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is "fail-fast" design? A: Detecting and reporting errors (like invalid constructor arguments) as early as possible, rather than letting bad state propagate.
 * 2. Q: Which unchecked exception is idiomatic for invalid arguments? A: `IllegalArgumentException`.
 */
