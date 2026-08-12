/**
 * Practical 20: Abstract Classes and Abstract Methods
 * 
 * Concept: An abstract class cannot be instantiated and may declare abstract methods that subclasses *must* implement.
 * 
 * Question: Define an abstract `PaymentMethod` class with an abstract `pay()` method.
 * 
 * Sample Output:
 * Paying LKR 2500.0 via Card
Receipt: LKR 2500.0 processed.
 */

abstract class PaymentMethod {
    abstract void pay(double amount);
    void receipt(double amount) { System.out.println("Receipt: LKR " + amount + " processed."); }
}
class CardPayment extends PaymentMethod {
    @Override void pay(double amount) {
        System.out.println("Paying LKR " + amount + " via Card");
        receipt(amount);
    }
}
public class AbstractPaymentDemo {
    public static void main(String[] args) {
        PaymentMethod method = new CardPayment();
        method.pay(2500.0);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Can an abstract class have a constructor? A: Yes — it runs when a concrete subclass is instantiated, even though the abstract class itself can't be `new`'d directly.
 * 2. Q: Can an abstract class have zero abstract methods? A: Yes, a class can be declared `abstract` purely to prevent instantiation, even with all methods implemented.
 */
