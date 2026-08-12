/**
 * Practical 98: MVC-Style Mini Project — Simple Library System
 * 
 * Concept: Applying OOP + collections + exception handling together, loosely separating data (Model), logic (Controller), and display (View).
 * 
 * Question: Build a minimal library system where books can be added and borrowed.
 * 
 * Sample Output:
 * Error: Book already borrowed: Design Patterns
Design Patterns - Borrowed
Java Concurrency in Practice - Available
 */

import java.util.*;

class Book { // Model
    String title; boolean borrowed = false;
    Book(String title) { this.title = title; }
}
class LibraryException extends RuntimeException { LibraryException(String m) { super(m); } }

class Library { // Controller
    private final List<Book> books = new ArrayList<>();
    void addBook(String title) { books.add(new Book(title)); }
    void borrow(String title) {
        Book book = books.stream().filter(b -> b.title.equals(title)).findFirst()
            .orElseThrow(() -> new LibraryException("Book not found: " + title));
        if (book.borrowed) throw new LibraryException("Book already borrowed: " + title);
        book.borrowed = true;
    }
    void printStatus() { // View
        for (Book b : books) System.out.println(b.title + " - " + (b.borrowed ? "Borrowed" : "Available"));
    }
}
public class LibrarySystemDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("Design Patterns");
        library.addBook("Java Concurrency in Practice");

        library.borrow("Design Patterns");
        try {
            library.borrow("Design Patterns");
        } catch (LibraryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        library.printStatus();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What does "MVC" stand for and why separate concerns this way? A: Model-View-Controller; separating data, logic, and presentation improves testability and maintainability.
 * 2. Q: Why use `orElseThrow` here instead of checking `isPresent()` manually? A: It concisely expresses "get the value or fail with a specific exception" in one fluent call.
 */
