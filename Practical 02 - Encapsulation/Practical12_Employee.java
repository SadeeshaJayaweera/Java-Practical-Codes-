/**
 * Practical 12: Static Fields and the Singleton-of-Counters Pattern
 * 
 * Concept: `static` fields belong to the class, shared across all instances — useful for counters and constants.
 * 
 * Question: Track how many `Employee` objects have been created.
 * 
 * Sample Output:
 * Total employees created: 3
 */

public class Employee {
    private static int totalEmployees = 0;
    private String name;

    public Employee(String name) {
        this.name = name;
        totalEmployees++;
    }

    public static int getTotalEmployees() { return totalEmployees; }

    public static void main(String[] args) {
        new Employee("Kasun");
        new Employee("Ishara");
        new Employee("Dulani");
        System.out.println("Total employees created: " + Employee.getTotalEmployees());
    }
}

/*
 * Viva Q&A:
 * 1. Q: How many copies of a static field exist across all instances? A: Just one — it is shared at the class level, not per-instance.
 * 2. Q: Can a static method access instance (non-static) fields directly? A: No, because a static method has no implicit `this`; it must access instance fields through an object reference.
 */
