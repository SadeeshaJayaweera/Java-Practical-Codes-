/**
 * Practical 31: Interface Constants
 * 
 * Concept: Fields declared in an interface are implicitly `public static final` (constants).
 * 
 * Question: Define physics constants in an interface used by a calculation class.
 * 
 * Sample Output:
 * Distance after 3s: 44.1 m
 */

interface PhysicsConstants {
    double GRAVITY = 9.8;
    double SPEED_OF_LIGHT = 299792458.0;
}
public class FreeFallCalculator implements PhysicsConstants {
    double fallDistance(double timeSeconds) { return 0.5 * GRAVITY * timeSeconds * timeSeconds; }
    public static void main(String[] args) {
        FreeFallCalculator calc = new FreeFallCalculator();
        System.out.println("Distance after 3s: " + calc.fallDistance(3) + " m");
    }
}

/*
 * Viva Q&A:
 * 1. Q: Can interface constants be reassigned by an implementing class? A: No, they are implicitly `final`, so reassignment is a compile error.
 * 2. Q: Is this the recommended way to share constants today? A: A `final` utility class with static constants is often preferred; using interfaces purely for constants is generally discouraged (the "constant interface antipattern").
 */
