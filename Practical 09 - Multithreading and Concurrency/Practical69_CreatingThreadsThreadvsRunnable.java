/**
 * Practical 69: Creating Threads — Thread vs Runnable
 * 
 * Concept: A thread can be created by extending `Thread` or (preferably) implementing `Runnable` and passing it to a `Thread`.
 * 
 * Question: Create two threads that print numbers concurrently.
 * 
 * Sample Output:
 * 
 */



/*
 * Viva Q&A:
 * 1. Q: Why is implementing `Runnable` generally preferred over extending `Thread`? A: Java doesn't support multiple inheritance; implementing `Runnable` keeps the class free to extend something else, and separates "the task" from "the thread mechanism".
 * 2. Q: What does `join()` do? A: It blocks the calling thread until the target thread finishes execution.
 */
