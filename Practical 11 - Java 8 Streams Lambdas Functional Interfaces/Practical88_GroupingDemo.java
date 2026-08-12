/**
 * Practical 88: Grouping and Partitioning with Collectors
 * 
 * Concept: `Collectors.groupingBy` and `partitioningBy` organize stream elements into `Map`s based on a classifier function.
 * 
 * Question: Group employees by department and partition by salary threshold.
 * 
 * Sample Output:
 * IT -> 2 employees
HR -> 2 employees
High earners: 2
 */

import java.util.*;
import java.util.stream.*;

public class GroupingDemo {
    record Employee(String name, String department, double salary) { }
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Ravindu", "IT", 95000),
            new Employee("Sithara", "HR", 65000),
            new Employee("Malith", "IT", 72000),
            new Employee("Piumi", "HR", 58000)
        );

        Map<String, List<Employee>> byDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::department));
        byDept.forEach((dept, list) -> System.out.println(dept + " -> " + list.size() + " employees"));

        Map<Boolean, List<Employee>> highEarners = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.salary() > 70000));
        System.out.println("High earners: " + highEarners.get(true).size());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What's the difference between `groupingBy` and `partitioningBy`? A: `groupingBy` creates arbitrary key groups based on a classifier function; `partitioningBy` always splits into exactly two groups keyed by `true`/`false`.
 * 2. Q: Can `groupingBy` be combined with a downstream collector (e.g., counting)? A: Yes, e.g. `Collectors.groupingBy(Employee::department, Collectors.counting())` counts employees per department directly.
 */
