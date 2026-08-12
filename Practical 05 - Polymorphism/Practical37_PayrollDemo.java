/**
 * Practical 37: Polymorphism with Abstract Classes
 * 
 * Concept: Abstract classes are a common vehicle for polymorphism, forcing each subclass to define its own behaviour.
 * 
 * Question: Compute total payroll using polymorphic `calculatePay()` for different employee types.
 * 
 * Sample Output:
 * Total payroll: LKR 172000.0
 */

abstract class StaffMember { abstract double calculatePay(); }
class FullTime extends StaffMember { double monthly = 100000; @Override double calculatePay() { return monthly; } }
class PartTime extends StaffMember { double hourly = 800; int hours = 90; @Override double calculatePay() { return hourly * hours; } }

public class PayrollDemo {
    public static void main(String[] args) {
        StaffMember[] staff = { new FullTime(), new PartTime() };
        double total = 0;
        for (StaffMember s : staff) total += s.calculatePay();
        System.out.println("Total payroll: LKR " + total);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why is polymorphism useful for the `staff` array loop here? A: The loop doesn't need to know the concrete type of each element — it just calls `calculatePay()` and the right version runs automatically.
 * 2. Q: Could `StaffMember` be an interface instead of an abstract class here? A: Yes, if there's no shared state or default implementation needed; an interface would work equally well for pure behavioural contracts.
 */
