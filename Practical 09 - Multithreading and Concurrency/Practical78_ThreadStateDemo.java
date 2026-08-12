/**
 * Practical 78: Thread States and `Thread.sleep`
 * 
 * Concept: A Java thread moves through states: NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED.
 * 
 * Question: Observe a thread's state before, during, and after execution.
 * 
 * Sample Output:
 * Before start: NEW
While sleeping: TIMED_WAITING
After finish: TERMINATED
 */

public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try { Thread.sleep(200); } catch (InterruptedException ignored) { }
        });
        System.out.println("Before start: " + worker.getState());
        worker.start();
        Thread.sleep(50);
        System.out.println("While sleeping: " + worker.getState());
        worker.join();
        System.out.println("After finish: " + worker.getState());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What state is a thread in while waiting to acquire a contended lock? A: `BLOCKED`.
 * 2. Q: What's the difference between `WAITING` and `TIMED_WAITING`? A: `WAITING` blocks indefinitely until notified (e.g., `wait()` with no timeout); `TIMED_WAITING` blocks for a bounded time (e.g., `sleep(ms)` or `wait(timeout)`).
 */
