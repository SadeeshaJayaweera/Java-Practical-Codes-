/**
 * Practical 16: Package-Private and Protected Access
 * 
 * Concept: Java has four access levels: `private`, package-private (default), `protected`, and `public`, each widening visibility.
 * 
 * Question: Demonstrate protected access being usable by a subclass in another file conceptually (single-file simplified demo).
 * 
 * Sample Output:
 * Top speed: 250 km/h
 */

class Vehicle {
    protected int topSpeed = 180;
    void showSpeed() { System.out.println("Top speed: " + topSpeed + " km/h"); }
}

public class SportsCar extends Vehicle {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.topSpeed = 250; // accessible because SportsCar extends Vehicle
        car.showSpeed();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does `protected` allow that package-private does not? A: `protected` also allows access from subclasses in *different* packages, not just classes in the same package.
 * 2. Q: Rank the four access modifiers from most to least restrictive. A: `private` > default (package-private) > `protected` > `public`.
 */
