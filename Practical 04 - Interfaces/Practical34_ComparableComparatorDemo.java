/**
 * Practical 34: Comparable and Comparator Interfaces
 * 
 * Concept: `Comparable<T>` defines a class's "natural ordering"; `Comparator<T>` defines external, pluggable orderings.
 * 
 * Question: Sort a list of `Employee` objects by salary (Comparable) and by name (Comparator).
 * 
 * Sample Output:
 * By salary: [Ashan(60000.0), Nadun(75000.0), Chamodi(90000.0)]
By name: [Ashan(60000.0), Chamodi(90000.0), Nadun(75000.0)]
 */

import java.util.*;

class Employee implements Comparable<Employee> {
    String name; double salary;
    Employee(String name, double salary) { this.name = name; this.salary = salary; }
    @Override public int compareTo(Employee o) { return Double.compare(this.salary, o.salary); }
    @Override public String toString() { return name + "(" + salary + ")"; }
}
public class ComparableComparatorDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Nadun", 75000),
            new Employee("Ashan", 60000),
            new Employee("Chamodi", 90000)
        ));
        Collections.sort(employees);
        System.out.println("By salary: " + employees);

        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("By name: " + employees);
    }
}

/*
 * Viva Q&A:
 * 1. Q: When should you use `Comparator` instead of `Comparable`? A: When you need multiple, alternative, or external orderings that don't belong as the class's single "natural" order.
 * 2. Q: What does `compareTo` returning a negative number mean? A: The current object is considered "less than" the object being compared to, for sorting purposes.
 */
