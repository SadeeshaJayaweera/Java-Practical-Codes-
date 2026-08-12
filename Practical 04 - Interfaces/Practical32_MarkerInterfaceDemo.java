/**
 * Practical 32: Marker Interfaces
 * 
 * Concept: A marker interface has no methods; it signals metadata about a class (e.g., `Serializable`, `Cloneable`).
 * 
 * Question: Create a custom marker interface `Auditable` and check for it with `instanceof`.
 * 
 * Sample Output:
 * This transaction will be audited.
 */

interface Auditable { }
class Transaction implements Auditable {
    double amount;
    Transaction(double amount) { this.amount = amount; }
}
public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Transaction t = new Transaction(1000);
        if (t instanceof Auditable) System.out.println("This transaction will be audited.");
    }
}

/*
 * Viva Q&A:
 * 1. Q: Give a JDK example of a marker interface. A: `java.io.Serializable` or `java.lang.Cloneable`.
 * 2. Q: How have annotations partially replaced marker interfaces? A: Custom annotations (e.g. `@Deprecated`) can carry similar "marker" metadata and are checkable via reflection, often more flexibly than marker interfaces.
 */
