/**
 * Practical 95: Builder Pattern
 * 
 * Concept: The Builder pattern constructs complex objects step by step, avoiding telescoping constructors with many parameters.
 * 
 * Question: Build a `Pizza` object using a fluent builder.
 * 
 * Sample Output:
 * Large pizza + cheese + pepperoni
 */

public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean pepperoni;

    private Pizza(Builder b) { size = b.size; cheese = b.cheese; pepperoni = b.pepperoni; }

    static class Builder {
        private String size = "Medium";
        private boolean cheese = false;
        private boolean pepperoni = false;

        Builder size(String size) { this.size = size; return this; }
        Builder cheese() { this.cheese = true; return this; }
        Builder pepperoni() { this.pepperoni = true; return this; }
        Pizza build() { return new Pizza(this); }
    }

    @Override public String toString() {
        return size + " pizza" + (cheese ? " + cheese" : "") + (pepperoni ? " + pepperoni" : "");
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder().size("Large").cheese().pepperoni().build();
        System.out.println(pizza);
    }
}

/*
 * Viva Q&A:
 * 1. Q: What problem does the Builder pattern solve compared to a large constructor? A: It avoids "telescoping constructors" (many overloaded constructors) and makes optional parameters readable via named fluent methods.
 * 2. Q: Why is the `Pizza` constructor private? A: To force all object creation through the `Builder`, ensuring consistent, validated construction.
 */
