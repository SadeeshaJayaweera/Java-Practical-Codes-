/**
 * Practical 18: Method Overriding
 * 
 * Concept: A subclass can provide its own implementation of a method already defined in the superclass, enabling runtime polymorphism.
 * 
 * Question: Override `makeSound()` in `Cat` and `Cow` subclasses of `Animal`.
 * 
 * Sample Output:
 * Meow
Moo
 */

class Animal {
    void makeSound() { System.out.println("Some generic animal sound"); }
}
class Cat extends Animal {
    @Override void makeSound() { System.out.println("Meow"); }
}
class Cow extends Animal {
    @Override void makeSound() { System.out.println("Moo"); }
}
public class OverridingDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Cat(), new Cow() };
        for (Animal a : animals) a.makeSound();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the purpose of `@Override`? A: It's an annotation that lets the compiler verify the method actually overrides a superclass method, catching typos at compile time.
 * 2. Q: Can a `private` method be overridden? A: No — private methods aren't inherited/visible to subclasses, so they can only be hidden, not overridden.
 */
