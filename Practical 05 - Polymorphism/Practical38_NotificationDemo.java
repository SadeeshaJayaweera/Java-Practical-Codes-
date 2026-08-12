/**
 * Practical 38: Polymorphic Collections
 * 
 * Concept: Collections declared with a supertype can hold mixed subtype objects, iterated polymorphically.
 * 
 * Question: Store various `Notification` types in one list and send them polymorphically.
 * 
 * Sample Output:
 * Sending Email...
Sending SMS...
Sending Push notification...
 */

import java.util.*;
abstract class Notification { abstract void send(); }
class EmailNotification extends Notification { @Override void send() { System.out.println("Sending Email..."); } }
class SmsNotification extends Notification { @Override void send() { System.out.println("Sending SMS..."); } }
class PushNotification extends Notification { @Override void send() { System.out.println("Sending Push notification..."); } }

public class NotificationDemo {
    public static void main(String[] args) {
        List<Notification> notifications = List.of(new EmailNotification(), new SmsNotification(), new PushNotification());
        notifications.forEach(Notification::send);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is `Notification::send` in this code? A: A method reference — shorthand for the lambda `n -> n.send()`.
 * 2. Q: What would happen if `send()` weren't overridden in a subclass? A: It would inherit the parent's implementation (or fail to compile if the parent method is abstract and not implemented anywhere in the hierarchy).
 */
