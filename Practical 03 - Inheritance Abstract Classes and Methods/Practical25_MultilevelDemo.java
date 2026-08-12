/**
 * Practical 25: Multilevel Inheritance and Field Hiding
 * 
 * Concept: Multilevel inheritance chains classes A→B→C; field hiding occurs when a subclass declares a field with the same name as a parent's.
 * 
 * Question: Demonstrate multilevel inheritance with a `Person → Employee → Manager` hierarchy.
 * 
 * Sample Output:
 * Priya manages 8 people, earns LKR 250000.0
 */

class Person {
    String name;
    Person(String name) { this.name = name; }
}
class Employee extends Person {
    double salary;
    Employee(String name, double salary) { super(name); this.salary = salary; }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    void summary() {
        System.out.println(name + " manages " + teamSize + " people, earns LKR " + salary);
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
        new Manager("Priya", 250000, 8).summary();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is multilevel inheritance? A: A chain of inheritance where a class derives from a class that itself derives from another class (A → B → C).
 * 2. Q: Does Java support this without limit on depth? A: Yes, there's no fixed limit, but excessively deep hierarchies are discouraged for maintainability.
 */
