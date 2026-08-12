/**
 * Practical 94: Factory Method Pattern
 * 
 * Concept: A factory method centralizes object creation logic, decoupling client code from concrete classes.
 * 
 * Question: Create a `ShapeFactory` that returns different `Shape` implementations by name.
 * 
 * Sample Output:
 * Drawing a Circle
Drawing a Square
 */

interface Shape { void draw(); }
class Circle implements Shape { public void draw() { System.out.println("Drawing a Circle"); } }
class Square implements Shape { public void draw() { System.out.println("Drawing a Square"); } }

class ShapeFactory {
    static Shape create(String type) {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> throw new IllegalArgumentException("Unknown shape: " + type);
        };
    }
}
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.create("circle");
        Shape s2 = ShapeFactory.create("square");
        s1.draw();
        s2.draw();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What problem does the Factory Method pattern solve? A: It hides object-creation logic from client code, so clients depend on abstractions rather than concrete constructors.
 * 2. Q: How does this differ from the Abstract Factory pattern? A: Factory Method creates one product type via a single method; Abstract Factory provides an interface for creating *families* of related products.
 */
