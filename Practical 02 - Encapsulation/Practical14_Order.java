/**
 * Practical 14: Encapsulation with Enum-Based State
 * 
 * Concept: Enums provide a type-safe, encapsulated way to represent a fixed set of related constants.
 * 
 * Question: Model order status using an enum inside an `Order` class.
 * 
 * Sample Output:
 * Initial: PENDING
After ship(): SHIPPED
 */

public class Order {
    enum Status { PENDING, SHIPPED, DELIVERED, CANCELLED }

    private Status status = Status.PENDING;

    public void ship() {
        if (status == Status.PENDING) status = Status.SHIPPED;
        else System.out.println("Cannot ship from state: " + status);
    }

    public Status getStatus() { return status; }

    public static void main(String[] args) {
        Order order = new Order();
        System.out.println("Initial: " + order.getStatus());
        order.ship();
        System.out.println("After ship(): " + order.getStatus());
    }
}

/*
 * Viva Q&A:
 * 1. Q: Why use an `enum` instead of `String` constants for status? A: Enums are type-safe and restrict values to a known fixed set, preventing invalid states like `"shiped"` typos.
 * 2. Q: Can enums have methods and fields in Java? A: Yes, Java enums are full classes and can hold fields, constructors, and methods.
 */
