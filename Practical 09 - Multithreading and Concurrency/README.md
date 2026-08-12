# Practical 09 - Multithreading and Concurrency

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 69 | Creating Threads — Thread vs Runnable | A thread can be created by extending `Thread` or (preferably) implementing `Runnable` and passing it to a `Thread`. |
| 70 | Synchronization and Race Conditions | Without synchronization, concurrent access to shared mutable state can produce a race condition and lost updates. |
| 71 | The `ExecutorService` Thread Pool | `ExecutorService` manages a pool of reusable threads, avoiding the overhead of manually creating/destroying threads for every task. |
| 72 | `Callable` and `Future` | Unlike `Runnable`, `Callable<V>` can return a value and throw checked exceptions; `Future<V>` represents the pending result. |
| 73 | `CompletableFuture` — Async Pipelines | `CompletableFuture` supports composable, non-blocking asynchronous pipelines with chained transformations. |
| 74 | Producer-Consumer with `BlockingQueue` | `BlockingQueue` provides thread-safe blocking `put`/`take` operations, ideal for producer-consumer coordination. |
| 75 | `volatile` Keyword | `volatile` guarantees visibility of a variable's latest value across threads, without providing atomicity/mutual exclusion. |
| 76 | `AtomicInteger` — Lock-Free Thread Safety | `java.util.concurrent.atomic` classes provide lock-free, atomic operations using CAS (compare-and-swap). |
| 77 | Deadlock Demonstration and Avoidance | A deadlock occurs when two or more threads wait forever for locks held by each other; consistent lock ordering avoids it. |
| 78 | Thread States and `Thread.sleep` | A Java thread moves through states: NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED. |
