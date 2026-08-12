/**
 * Practical 72: `Callable` and `Future`
 * 
 * Concept: Unlike `Runnable`, `Callable<V>` can return a value and throw checked exceptions; `Future<V>` represents the pending result.
 * 
 * Question: Submit a `Callable` that computes a factorial and retrieve its result.
 * 
 * Sample Output:
 * 10! = 3628800
 */

import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Callable<Long> factorialTask = () -> {
            long result = 1;
            for (int i = 1; i <= 10; i++) result *= i;
            return result;
        };
        Future<Long> future = pool.submit(factorialTask);
        System.out.println("10! = " + future.get());
        pool.shutdown();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does `future.get()` do if the task isn't finished yet? A: It blocks the calling thread until the result becomes available (or throws if the task failed/was cancelled).
 * 2. Q: Can `Callable.call()` throw checked exceptions, unlike `Runnable.run()`? A: Yes, `Callable<V>.call()` is declared to throw `Exception`, while `Runnable.run()` cannot throw checked exceptions.
 */
