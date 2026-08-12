/**
 * Practical 75: `volatile` Keyword
 * 
 * Concept: `volatile` guarantees visibility of a variable's latest value across threads, without providing atomicity/mutual exclusion.
 * 
 * Question: Use a `volatile` flag to stop a worker thread safely from another thread.
 * 
 * Sample Output:
 * 
 */



/*
 * Viva Q&A:
 * 1. Q: Does `volatile` make compound operations like `count++` atomic? A: No — `volatile` only ensures visibility, not atomicity; use `AtomicInteger` or synchronization for compound operations.
 * 2. Q: Why might the worker loop run forever without `volatile`? A: Without it, the JIT compiler/CPU cache might let the worker thread never observe the updated value of `running` from another thread.
 */
