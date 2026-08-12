/**
 * Practical 09: Private Fields with Getters and Setters
 * 
 * Concept: Encapsulation hides internal state behind `private` fields, exposing controlled access via public methods.
 * 
 * Question: Create a `BankAccount` class with a private balance and safe getter/setter.
 * 
 * Sample Output:
 * Balance: 1500.0
 */

public class BankAccount {
    private double balance;

    public double getBalance() { return balance; }

    public void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(1500.0);
        System.out.println("Balance: " + acc.getBalance());
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why not just make fields public? A: Public fields allow uncontrolled, invalid modification; encapsulation lets you validate and control access, and change internal representation without breaking callers.
 * 2. Q: What access modifier is the most restrictive in Java? A: `private` — accessible only within the declaring class.
 */
