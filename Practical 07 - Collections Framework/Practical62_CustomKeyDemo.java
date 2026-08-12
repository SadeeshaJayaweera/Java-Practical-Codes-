/**
 * Practical 62: Custom Objects in Collections (equals/hashCode reliance)
 * 
 * Concept: Correctly relying on `equals`/`hashCode` is essential for custom objects used as `HashMap` keys or in `HashSet`.
 * 
 * Question: Use a custom `Coordinate` class as a `HashMap` key.
 * 
 * Sample Output:
 * Origin
 */

import java.util.*;
public class CustomKeyDemo {
    record Coordinate(int x, int y) { } // records auto-generate equals/hashCode

    public static void main(String[] args) {
        Map<Coordinate, String> grid = new HashMap<>();
        grid.put(new Coordinate(0, 0), "Origin");
        grid.put(new Coordinate(1, 1), "Diagonal");

        System.out.println(grid.get(new Coordinate(0, 0))); // works due to record equals/hashCode
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why do Java `record`s work well as map keys out of the box? A: Records automatically generate `equals()`, `hashCode()`, and `toString()` based on their components.
 * 2. Q: What breaks if a mutable object used as a `HashMap` key changes its fields after insertion? A: Its hash code may change, making it impossible to correctly find the entry again — the entry becomes effectively "lost".
 */
