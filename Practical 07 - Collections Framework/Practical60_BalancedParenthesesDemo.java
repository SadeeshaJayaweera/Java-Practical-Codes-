/**
 * Practical 60: Stack and Queue via Deque
 * 
 * Concept: `Deque` is the recommended modern replacement for the legacy `Stack` class, supporting both LIFO and FIFO usage.
 * 
 * Question: Check for balanced parentheses using a `Deque` as a stack.
 * 
 * Sample Output:
 * (a+b)*(c-d): true
((a+b): false
 */

import java.util.*;
public class BalancedParenthesesDemo {
    static boolean isBalanced(String expr) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : expr.toCharArray()) {
            if (c == '(') stack.push(c);
            else if (c == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println("(a+b)*(c-d): " + isBalanced("(a+b)*(c-d)"));
        System.out.println("((a+b): " + isBalanced("((a+b)"));
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why is `ArrayDeque` generally preferred over the legacy `Stack` class? A: `Stack` extends `Vector` and is synchronized (slower, legacy); `ArrayDeque` is faster and is the recommended modern stack/queue implementation.
 * 2. Q: What does `push()` do on an `ArrayDeque` used as a stack? A: It adds the element at the head, mimicking LIFO stack push behaviour.
 */
