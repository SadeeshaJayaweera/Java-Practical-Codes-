/**
 * Practical 96: Observer Pattern
 * 
 * Concept: The Observer pattern lets objects (observers) subscribe to and react to state changes in another object (the subject), without tight coupling.
 * 
 * Question: Implement a simple stock price notifier with multiple subscribers.
 * 
 * Sample Output:
 * Mobile App alert: LOLC is now 452.75
Email alert: LOLC is now 452.75
 */

import java.util.*;

interface PriceObserver { void onPriceChange(String symbol, double newPrice); }

class Stock {
    private final List<PriceObserver> observers = new ArrayList<>();
    private double price;
    void subscribe(PriceObserver o) { observers.add(o); }
    void setPrice(String symbol, double price) {
        this.price = price;
        for (PriceObserver o : observers) o.onPriceChange(symbol, price);
    }
}
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock();
        stock.subscribe((symbol, price) -> System.out.println("Mobile App alert: " + symbol + " is now " + price));
        stock.subscribe((symbol, price) -> System.out.println("Email alert: " + symbol + " is now " + price));

        stock.setPrice("LOLC", 452.75);
    }
}

/*
 * Viva Q&A:
 * 1. Q: Where is the Observer pattern used in the JDK/real frameworks? A: GUI event listeners (e.g. `ActionListener`), and reactive libraries like RxJava; also the classic `java.util.Observer` (now deprecated).
 * 2. Q: What's a risk of the Observer pattern if subscriptions are never removed? A: Memory leaks — observers can be kept alive by the subject longer than intended ("lapsed listener" problem).
 */
