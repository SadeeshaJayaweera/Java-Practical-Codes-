/**
 * Practical 17: Basic Inheritance with `extends`
 * 
 * Concept: Inheritance lets a subclass reuse and extend the fields/methods of a superclass.
 * 
 * Question: Create an `Animal` base class and a `Dog` subclass that adds new behaviour.
 * 
 * Sample Output:
 * Rex is eating.
Rex says Woof!
 */

class Animal {
    String name;
    Animal(String name) { this.name = name; }
    void eat() { System.out.println(name + " is eating."); }
}

public class Dog extends Animal {
    Dog(String name) { super(name); }
    void bark() { System.out.println(name + " says Woof!"); }

    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.eat();
        d.bark();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does `super(name)` do here? A: It invokes the superclass `Animal` constructor to initialize inherited state before the subclass constructor continues.
 * 2. Q: Does Java support multiple class inheritance? A: No, a class can extend only one superclass (Java uses interfaces for multiple inheritance of type).
 */
