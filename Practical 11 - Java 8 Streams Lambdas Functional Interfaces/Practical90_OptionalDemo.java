/**
 * Practical 90: Optional — Avoiding Null Checks
 * 
 * Concept: `Optional<T>` explicitly represents a value that may or may not be present, discouraging `null` returns.
 * 
 * Question: Look up a user in a map safely using `Optional`.
 * 
 * Sample Output:
 * Found: Unknown User
No such user exists.
 */

import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        Map<Integer, String> users = Map.of(1, "Tharindu", 2, "Achini");

        Optional<String> user = Optional.ofNullable(users.get(3));
        System.out.println("Found: " + user.orElse("Unknown User"));

        user.ifPresentOrElse(
            name -> System.out.println("Hello, " + name),
            () -> System.out.println("No such user exists.")
        );
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why is returning `Optional<T>` often preferred over returning `null`? A: It forces callers to explicitly handle the "absent" case rather than risking a `NullPointerException`.
 * 2. Q: What's discouraged when using `Optional`? A: Calling `.get()` without first checking `.isPresent()`, and using `Optional` as a field type or method parameter (it's intended primarily as a return type).
 */
