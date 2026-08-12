/**
 * Practical 24: Abstract Class vs Concrete Template Method Pattern
 * 
 * Concept: An abstract class can define a fixed algorithm skeleton (template method) while leaving specific steps to subclasses.
 * 
 * Question: Implement a `ReportGenerator` template that fixes the report flow but lets subclasses customize the body.
 * 
 * Sample Output:
 * === Report Start ===
Sales: LKR 500,000 this month.
=== Report End ===
 */

abstract class ReportGenerator {
    final void generate() {
        printHeader();
        printBody();
        printFooter();
    }
    void printHeader() { System.out.println("=== Report Start ==="); }
    abstract void printBody();
    void printFooter() { System.out.println("=== Report End ==="); }
}
class SalesReport extends ReportGenerator {
    @Override void printBody() { System.out.println("Sales: LKR 500,000 this month."); }
}
public class TemplateMethodDemo {
    public static void main(String[] args) { new SalesReport().generate(); }
}

/*
 * Viva Q&A:
 * 1. Q: What is the Template Method design pattern? A: A pattern where a base class defines the overall algorithm structure and defers specific steps to subclasses via overridable methods.
 * 2. Q: Why is `generate()` marked `final` here? A: To prevent subclasses from altering the fixed sequence of steps in the algorithm.
 */
