/**
 * Practical 70: Synchronization and Race Conditions
 * 
 * Concept: Without synchronization, concurrent access to shared mutable state can produce a race condition and lost updates.
 * 
 * Question: Demonstrate a race condition on a shared counter, then fix it with `synchronized`.
 * 
 * Sample Output:
 * Final counter (should be 20000): 20000
 */

public class SynchronizationDemo {
    static int counter = 0;
    static synchronized void increment() { counter++; }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 0; i < 10000; i++) increment(); };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final counter (should be 20000): " + counter);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is a race condition? A: A bug that occurs when multiple threads access/modify shared state concurrently without coordination, producing unpredictable results.
 * 2. Q: What does the `synchronized` keyword do here? A: It ensures only one thread at a time can execute `increment()`, preventing lost updates via mutual exclusion (a monitor lock).
 */
