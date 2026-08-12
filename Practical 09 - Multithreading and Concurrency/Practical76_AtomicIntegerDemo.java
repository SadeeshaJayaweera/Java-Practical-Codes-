/**
 * Practical 76: `AtomicInteger` — Lock-Free Thread Safety
 * 
 * Concept: `java.util.concurrent.atomic` classes provide lock-free, atomic operations using CAS (compare-and-swap).
 * 
 * Question: Replace a `synchronized` counter with `AtomicInteger`.
 * 
 * Sample Output:
 * Final count: 20000
 */

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 0; i < 10000; i++) counter.incrementAndGet(); };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final count: " + counter.get());
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does "CAS" stand for and how does it help avoid locks? A: Compare-And-Swap — the CPU atomically updates a value only if it still matches an expected old value, retrying otherwise, avoiding traditional locks.
 * 2. Q: When might `synchronized` still be preferable to atomics? A: When multiple related variables must be updated together consistently (a single atomic variable can't coordinate multi-field invariants).
 */
