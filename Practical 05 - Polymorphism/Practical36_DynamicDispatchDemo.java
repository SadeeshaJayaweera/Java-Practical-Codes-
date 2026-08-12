/**
 * Practical 36: Upcasting and Dynamic Method Dispatch
 * 
 * Concept: A superclass reference can point to a subclass object; the actual method invoked depends on the object's real type.
 * 
 * Question: Demonstrate dynamic dispatch across a `Shape` hierarchy.
 * 
 * Sample Output:
 * Square area: 16.0
Triangle area: 9.0
 */

class Shape { double area() { return 0; } }
class Square extends Shape { double side; Square(double s) { side = s; } @Override double area() { return side * side; } }
class Triangle extends Shape { double base, height; Triangle(double b, double h) { base = b; height = h; } @Override double area() { return 0.5 * base * height; } }

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Square(4), new Triangle(6, 3) };
        for (Shape s : shapes) System.out.println(s.getClass().getSimpleName() + " area: " + s.area());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is "upcasting"? A: Implicitly treating a subclass reference as its superclass type (e.g., `Shape s = new Square(4)`).
 * 2. Q: What mechanism enables dynamic dispatch in the JVM? A: The virtual method table (vtable) lookup at runtime based on the object's actual class.
 */
