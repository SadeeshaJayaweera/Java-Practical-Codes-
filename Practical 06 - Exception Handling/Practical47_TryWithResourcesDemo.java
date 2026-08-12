/**
 * Practical 47: try-with-resources (AutoCloseable)
 * 
 * Concept: Resources implementing `AutoCloseable` are automatically closed at the end of a try block, even if an exception occurs.
 * 
 * Question: Implement a custom `AutoCloseable` resource and use try-with-resources.
 * 
 * Sample Output:
 * Connection opened.
Running: SELECT * FROM users
Connection closed.
 */

class Connection implements AutoCloseable {
    Connection() { System.out.println("Connection opened."); }
    void query(String sql) { System.out.println("Running: " + sql); }
    @Override public void close() { System.out.println("Connection closed."); }
}
public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (Connection conn = new Connection()) {
            conn.query("SELECT * FROM users");
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: What interface must a resource implement to be used in try-with-resources? A: `AutoCloseable` (or its subtype `Closeable`).
 * 2. Q: In what order are multiple resources closed if declared together? A: In reverse order of their declaration (last opened, first closed).
 */
