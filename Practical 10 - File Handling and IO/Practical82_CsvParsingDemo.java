/**
 * Practical 82: Reading CSV-Style Data
 * 
 * Concept: Structured text data (like CSV) can be parsed manually with `String.split()` for simple cases.
 * 
 * Question: Parse a small in-memory CSV of employee records and compute total salary.
 * 
 * Sample Output:
 * Anushka earns 85000.0
Ridma earns 92000.0
Vinuka earns 78000.0
Total payroll: 255000.0
 */

import java.util.*;

public class CsvParsingDemo {
    public static void main(String[] args) {
        List<String> csvLines = List.of(
            "name,salary",
            "Anushka,85000",
            "Ridma,92000",
            "Vinuka,78000"
        );
        double total = 0;
        for (int i = 1; i < csvLines.size(); i++) { // skip header
            String[] parts = csvLines.get(i).split(",");
            String name = parts[0];
            double salary = Double.parseDouble(parts[1]);
            System.out.println(name + " earns " + salary);
            total += salary;
        }
        System.out.println("Total payroll: " + total);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What's a limitation of splitting CSV lines by comma naively? A: It breaks on quoted fields containing commas; a proper CSV parser (or library like Apache Commons CSV) handles quoting/escaping correctly.
 * 2. Q: Why skip index 0 in the loop? A: It's the header row (column names), not actual data.
 */
