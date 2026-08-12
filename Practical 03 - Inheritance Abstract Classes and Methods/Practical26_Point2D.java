/**
 * Practical 26: Overriding `equals()`, `hashCode()`, and `toString()`
 * 
 * Concept: Every class inherits `Object`'s default `equals`/`hashCode`/`toString`; overriding them gives meaningful value-based behaviour.
 * 
 * Question: Override these three methods for a `Point2D` class.
 * 
 * Sample Output:
 * Point2D(1, 2)
p1.equals(p2): true
Same hashCode: true
 */

import java.util.Objects;

public class Point2D {
    private final int x, y;
    Point2D(int x, int y) { this.x = x; this.y = y; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2D)) return false;
        Point2D p = (Point2D) o;
        return x == p.x && y == p.y;
    }
    @Override public int hashCode() { return Objects.hash(x, y); }
    @Override public String toString() { return "Point2D(" + x + ", " + y + ")"; }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(1, 2);
        System.out.println(p1);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("Same hashCode: " + (p1.hashCode() == p2.hashCode()));
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why must `equals()` and `hashCode()` be overridden together? A: Equal objects must produce equal hash codes; otherwise, hash-based collections (`HashMap`, `HashSet`) will behave incorrectly.
 * 2. Q: What does `toString()` control by default? A: The string representation used e.g. by `System.out.println(object)` and string concatenation.
 */
