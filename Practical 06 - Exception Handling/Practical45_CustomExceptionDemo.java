/**
 * Practical 45: Custom (User-Defined) Exceptions
 * 
 * Concept: You can create domain-specific exceptions by extending `Exception` (checked) or `RuntimeException` (unchecked).
 * 
 * Question: Define an `InsufficientFundsException` for a withdrawal operation.
 * 
 * Sample Output:
 * Withdrawal failed: Requested 1500.0 but balance is only 1000.0
 */

class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) { super(message); }
}
class Account {
    double balance = 1000;
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException("Requested " + amount + " but balance is only " + balance);
        balance -= amount;
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        try {
            acc.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why create a custom exception instead of throwing a generic `Exception`? A: It communicates intent clearly and lets callers catch specific business errors separately from other failures.
 * 2. Q: What must a custom exception class typically extend? A: `Exception` (checked) or `RuntimeException` (unchecked), depending on whether callers should be forced to handle it.
 */
