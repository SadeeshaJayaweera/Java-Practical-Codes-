/**
 * Practical 35: Compile-Time vs Runtime Polymorphism
 * 
 * Concept: Overloading = compile-time (static) polymorphism; overriding = runtime (dynamic) polymorphism.
 * 
 * Question: Show both forms side by side.
 * 
 * Sample Output:
 * Color String: Report
Int: 42
 */

class Printer {
    void print(String s) { System.out.println("String: " + s); }   // overload
    void print(int i) { System.out.println("Int: " + i); }         // overload
}
class ColorPrinter extends Printer {
    @Override void print(String s) { System.out.println("Color String: " + s); } // override
}
public class PolymorphismTypesDemo {
    public static void main(String[] args) {
        Printer p = new ColorPrinter();
        p.print("Report");   // resolved at runtime -> ColorPrinter's version
        p.print(42);         // resolved at compile time -> Printer's int overload
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why is overloading called "compile-time" polymorphism? A: The compiler decides which overloaded method to call based on argument types at compile time.
 * 2. Q: Why is overriding called "runtime" polymorphism? A: The JVM decides which overridden method to invoke based on the object's actual runtime type (dynamic dispatch).
 */
