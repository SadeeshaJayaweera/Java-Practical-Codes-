/**
 * Practical 93: Singleton Pattern
 * 
 * Concept: Ensures a class has exactly one instance, with a global access point — commonly used for shared resources like configuration or logging.
 * 
 * Question: Implement a thread-safe Singleton using an enum (the recommended modern approach).
 * 
 * Sample Output:
 * Config env: production
 */

enum AppConfig {
    INSTANCE;
    private final java.util.Map<String, String> settings = new java.util.HashMap<>();
    public void set(String key, String value) { settings.put(key, value); }
    public String get(String key) { return settings.get(key); }
}
public class SingletonDemo {
    public static void main(String[] args) {
        AppConfig.INSTANCE.set("env", "production");
        System.out.println("Config env: " + AppConfig.INSTANCE.get("env"));
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why is an enum-based Singleton considered the safest implementation? A: The JVM guarantees enum instances are created exactly once and are inherently serialization- and reflection-attack-safe.
 * 2. Q: Name a downside of the Singleton pattern. A: It introduces global mutable state and hidden dependencies, making unit testing and reasoning about code harder.
 */
