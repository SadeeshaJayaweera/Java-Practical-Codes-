/**
 * Practical 33: Interface-Based Strategy Pattern
 * 
 * Concept: Interfaces enable the Strategy pattern — swapping algorithm implementations at runtime behind a common contract.
 * 
 * Question: Implement different discount strategies via a `DiscountStrategy` interface.
 * 
 * Sample Output:
 * 10% off 2000: 1800.0
Flat 500 off 2000: 1500.0
 */

interface DiscountStrategy { double apply(double price); }

public class DiscountDemo {
    static double checkout(double price, DiscountStrategy strategy) { return strategy.apply(price); }

    public static void main(String[] args) {
        DiscountStrategy tenPercentOff = price -> price * 0.90;
        DiscountStrategy flatFiveHundredOff = price -> Math.max(0, price - 500);

        System.out.println("10% off 2000: " + checkout(2000, tenPercentOff));
        System.out.println("Flat 500 off 2000: " + checkout(2000, flatFiveHundredOff));
    }
}

/*
 * Viva Q&A:
 * 1. Q: What problem does the Strategy pattern solve? A: It lets you select an algorithm's behaviour at runtime without changing the client code that uses it.
 * 2. Q: How do lambdas make the Strategy pattern more concise in Java? A: A lambda can implement a single-method interface directly, removing the need for verbose anonymous inner classes.
 */
