/**
 * Practical 77: Deadlock Demonstration and Avoidance
 * 
 * Concept: A deadlock occurs when two or more threads wait forever for locks held by each other; consistent lock ordering avoids it.
 * 
 * Question: Show a deadlock-prone design conceptually and the fix using ordered locking.
 * 
 * Sample Output:
 * T1 acquired lockA
T1 acquired lockB
T2 acquired lockA
T2 acquired lockB
No deadlock occurred.
 */

public class DeadlockAvoidanceDemo {
    static final Object lockA = new Object();
    static final Object lockB = new Object();

    static void safeTransfer(boolean firstA) {
        // Always acquire lockA before lockB, regardless of caller, to avoid circular wait
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + " acquired lockA");
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + " acquired lockB");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> safeTransfer(true), "T1");
        Thread t2 = new Thread(() -> safeTransfer(false), "T2");
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("No deadlock occurred.");
    }
}

/*
 * Viva Q&A:
 * 1. Q: What are the four classic conditions required for deadlock? A: Mutual exclusion, hold-and-wait, no preemption, and circular wait.
 * 2. Q: What is the simplest common strategy to prevent deadlock among multiple locks? A: Always acquire multiple locks in a fixed, consistent global order across all threads.
 */
