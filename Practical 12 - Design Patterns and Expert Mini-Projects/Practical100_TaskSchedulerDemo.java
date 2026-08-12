/**
 * Practical 100: Expert Mini-Project — Generic Event-Driven Task Scheduler
 * 
 * Concept: Combines generics, functional interfaces, collections, and the Observer pattern into a small reusable scheduler component.
 * 
 * Question: Build a simple in-memory task scheduler that runs registered tasks and notifies listeners on completion.
 * 
 * Sample Output:
 * [Logger] sum-1-to-100 -> 5050
[Alert] sum-1-to-100 produced a large result: 5050
[Logger] square-of-12 -> 144
 */

import java.util.*;
import java.util.function.*;

class TaskScheduler<T> {
    private final Map<String, Supplier<T>> tasks = new LinkedHashMap<>();
    private final List<BiConsumer<String, T>> listeners = new ArrayList<>();

    void register(String name, Supplier<T> task) { tasks.put(name, task); }
    void onComplete(BiConsumer<String, T> listener) { listeners.add(listener); }

    void runAll() {
        for (Map.Entry<String, Supplier<T>> entry : tasks.entrySet()) {
            T result = entry.getValue().get();
            for (BiConsumer<String, T> listener : listeners) listener.accept(entry.getKey(), result);
        }
    }
}
public class TaskSchedulerDemo {
    public static void main(String[] args) {
        TaskScheduler<Integer> scheduler = new TaskScheduler<>();
        scheduler.register("sum-1-to-100", () -> {
            int sum = 0;
            for (int i = 1; i <= 100; i++) sum += i;
            return sum;
        });
        scheduler.register("square-of-12", () -> 12 * 12);

        scheduler.onComplete((name, result) -> System.out.println("[Logger] " + name + " -> " + result));
        scheduler.onComplete((name, result) -> {
            if (result > 1000) System.out.println("[Alert] " + name + " produced a large result: " + result);
        });

        scheduler.runAll();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What generic and functional-interface concepts are combined here? A: A generic class `TaskScheduler<T>` paired with `Supplier<T>` (task producers) and `BiConsumer<String, T>` (completion listeners), showing generics and functional interfaces working together.
 * 2. Q: How is this an example of the Observer pattern? A: Registered listeners (`onComplete`) are notified automatically whenever a task finishes — the scheduler is the subject, listeners are observers.
 */
