/**
 * Practical 74: Producer-Consumer with `BlockingQueue`
 * 
 * Concept: `BlockingQueue` provides thread-safe blocking `put`/`take` operations, ideal for producer-consumer coordination.
 * 
 * Question: Implement a simple producer-consumer using `ArrayBlockingQueue`.
 * 
 * Sample Output:
 * 
 */



/*
 * Viva Q&A:
 * 1. Q: What happens when `put()` is called on a full `BlockingQueue`? A: The calling thread blocks until space becomes available.
 * 2. Q: What happens when `take()` is called on an empty `BlockingQueue`? A: The calling thread blocks until an element becomes available.
 */
