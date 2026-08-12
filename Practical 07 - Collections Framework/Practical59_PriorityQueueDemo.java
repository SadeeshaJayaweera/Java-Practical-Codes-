/**
 * Practical 59: PriorityQueue
 * 
 * Concept: `PriorityQueue` is a heap-based queue that always dequeues the smallest (or custom-ordered) element first.
 * 
 * Question: Simulate a hospital triage queue prioritizing lower severity numbers first.
 * 
 * Sample Output:
 * Treating: Dilani (severity 1)
Treating: Saman (severity 2)
Treating: Ruwan (severity 3)
 */

import java.util.*;
public class PriorityQueueDemo {
    record Patient(String name, int severity) { }
    public static void main(String[] args) {
        PriorityQueue<Patient> triage = new PriorityQueue<>(Comparator.comparingInt(Patient::severity));
        triage.add(new Patient("Ruwan", 3));
        triage.add(new Patient("Dilani", 1));
        triage.add(new Patient("Saman", 2));
        while (!triage.isEmpty()) {
            Patient p = triage.poll();
            System.out.println("Treating: " + p.name() + " (severity " + p.severity() + ")");
        }
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the default ordering of a `PriorityQueue` without a Comparator? A: Natural ordering (smallest first), requiring elements to implement `Comparable`.
 * 2. Q: What is the time complexity of `poll()` on a `PriorityQueue`? A: O(log n).
 */
