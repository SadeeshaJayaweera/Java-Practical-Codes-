/**
 * Practical 71: The `ExecutorService` Thread Pool
 * 
 * Concept: `ExecutorService` manages a pool of reusable threads, avoiding the overhead of manually creating/destroying threads for every task.
 * 
 * Question: Submit multiple tasks to a fixed thread pool.
 * 
 * Sample Output:
 * 
 */



/*
 * Viva Q&A:
 * 1. Q: Why prefer `ExecutorService` over manually managed `Thread` objects? A: It reuses a bounded pool of threads efficiently, manages queuing/scheduling, and simplifies lifecycle management (shutdown, awaiting termination).
 * 2. Q: What must you always call to release an `ExecutorService`'s resources? A: `shutdown()` (or `shutdownNow()`), otherwise the JVM may not exit and threads stay alive.
 */
