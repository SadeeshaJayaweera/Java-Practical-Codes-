/**
 * Practical 99: Expert Mini-Project — Bank ATM Simulation (Full OOP Integration)
 * 
 * Concept: Combines encapsulation, inheritance, interfaces, exception handling, and collections into one cohesive program.
 * 
 * Question: Simulate an ATM supporting deposit, withdrawal, and transaction history for different account types.
 * 
 * Sample Output:
 * Transaction declined: Cannot go below minimum balance of 1000.0
Kavindu's history: [Deposited 500.0]
Nethmi's history: [Withdrew 3000.0]
Savings balance: 2500.0
Current balance: -2500.0
 */

import java.util.*;

abstract class Account {
    protected double balance;
    protected final List<String> history = new ArrayList<>();
    protected final String owner;
    Account(String owner, double initialBalance) { this.owner = owner; this.balance = initialBalance; }

    void deposit(double amount) {
        balance += amount;
        history.add("Deposited " + amount);
    }
    abstract void withdraw(double amount);
    void printHistory() { System.out.println(owner + "'s history: " + history); }
}
class SavingsAccount extends Account {
    static final double MIN_BALANCE = 1000;
    SavingsAccount(String owner, double balance) { super(owner, balance); }
    @Override void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE)
            throw new IllegalStateException("Cannot go below minimum balance of " + MIN_BALANCE);
        balance -= amount;
        history.add("Withdrew " + amount);
    }
}
class CurrentAccount extends Account {
    double overdraftLimit = 5000;
    CurrentAccount(String owner, double balance) { super(owner, balance); }
    @Override void withdraw(double amount) {
        if (balance - amount < -overdraftLimit)
            throw new IllegalStateException("Overdraft limit exceeded");
        balance -= amount;
        history.add("Withdrew " + amount);
    }
}
public class AtmSimulationDemo {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("Kavindu", 2000);
        Account current = new CurrentAccount("Nethmi", 500);

        savings.deposit(500);
        current.withdraw(3000); // allowed via overdraft

        try {
            savings.withdraw(2000); // would breach minimum balance
        } catch (IllegalStateException e) {
            System.out.println("Transaction declined: " + e.getMessage());
        }

        savings.printHistory();
        current.printHistory();
        System.out.println("Savings balance: " + savings.balance);
        System.out.println("Current balance: " + current.balance);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Which OOP pillars are demonstrated together in this project? A: Encapsulation (protected fields with controlled access), inheritance (`SavingsAccount`/`CurrentAccount` extend `Account`), polymorphism (`withdraw` overridden differently per type), and abstraction (`Account` is abstract).
 * 2. Q: Why give each account type its own `withdraw` rule instead of one shared method? A: Different account types have genuinely different business rules (minimum balance vs overdraft limit), which polymorphism expresses cleanly without conditional type-checking logic.
 */
