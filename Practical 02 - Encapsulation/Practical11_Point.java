/**
 * Practical 11: Immutable Class Design
 * 
 * Concept: An immutable object's state cannot change after construction — achieved via `final` fields, no setters, and defensive copying.
 * 
 * Question: Design an immutable `Point` class.
 * 
 * Sample Output:
 * p1 = (2, 3)
p2 = (7, 2)
 */

public final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }

    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy); // returns a new object instead of mutating
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = p1.translate(5, -1);
        System.out.println("p1 = (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 = (" + p2.getX() + ", " + p2.getY() + ")");
    }
}

/*
 * Viva Q&A:
 * 1. Q: Name a well-known immutable class in the JDK. A: `String` (and wrapper classes like `Integer`, `LocalDate`).
 * 2. Q: Why mark an immutable class `final`? A: To prevent subclasses from adding mutable state or overriding methods in ways that break immutability guarantees.
 */
