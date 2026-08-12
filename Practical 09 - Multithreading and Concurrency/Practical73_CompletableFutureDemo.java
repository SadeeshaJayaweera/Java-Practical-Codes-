/**
 * Practical 73: `CompletableFuture` — Async Pipelines
 * 
 * Concept: `CompletableFuture` supports composable, non-blocking asynchronous pipelines with chained transformations.
 * 
 * Question: Chain an async computation with `thenApply` and `thenAccept`.
 * 
 * Sample Output:
 * Final result: 51
 */

import java.util.concurrent.*;

public class CompletableFutureDemo {
    public static void main(String[] args) throws Exception {
        CompletableFuture<Integer> future = CompletableFuture
            .supplyAsync(() -> 10)
            .thenApply(x -> x * 5)
            .thenApply(x -> x + 1);

        future.thenAccept(result -> System.out.println("Final result: " + result));
        future.get(); // wait for completion in this demo
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the benefit of `CompletableFuture` over plain `Future`? A: It supports non-blocking chaining/composition (`thenApply`, `thenCompose`, `thenCombine`) instead of requiring a blocking `get()` call.
 * 2. Q: What does `thenApply` do compared to `thenAccept`? A: `thenApply` transforms the result and returns a new `CompletableFuture`; `thenAccept` consumes the result without returning a new value.
 */
