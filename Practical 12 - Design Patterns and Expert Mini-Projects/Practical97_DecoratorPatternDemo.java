/**
 * Practical 97: Decorator Pattern
 * 
 * Concept: The Decorator pattern attaches additional responsibilities to an object dynamically, as a flexible alternative to subclassing.
 * 
 * Question: Build a coffee ordering system where add-ons decorate a base `Coffee`.
 * 
 * Sample Output:
 * Coffee + Milk + Sugar = LKR 370.0
 */

interface Coffee { double cost(); String description(); }

class SimpleCoffee implements Coffee {
    public double cost() { return 300; }
    public String description() { return "Coffee"; }
}
abstract class CoffeeDecorator implements Coffee {
    protected final Coffee wrapped;
    CoffeeDecorator(Coffee wrapped) { this.wrapped = wrapped; }
}
class Milk extends CoffeeDecorator {
    Milk(Coffee c) { super(c); }
    public double cost() { return wrapped.cost() + 50; }
    public String description() { return wrapped.description() + " + Milk"; }
}
class Sugar extends CoffeeDecorator {
    Sugar(Coffee c) { super(c); }
    public double cost() { return wrapped.cost() + 20; }
    public String description() { return wrapped.description() + " + Sugar"; }
}
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee order = new Sugar(new Milk(new SimpleCoffee()));
        System.out.println(order.description() + " = LKR " + order.cost());
    }
}

/*
 * Viva Q&A:
 * 1. Q: How does Decorator differ from simple inheritance for adding behaviour? A: Decorators compose behaviour dynamically at runtime by wrapping objects, avoiding a combinatorial explosion of subclasses for every possible feature combination.
 * 2. Q: Name a JDK class that follows the Decorator pattern. A: `BufferedReader` wrapping a `Reader`, or `BufferedOutputStream` wrapping an `OutputStream`.
 */
