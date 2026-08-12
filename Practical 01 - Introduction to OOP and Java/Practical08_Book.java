/**
 * Practical 08: Introduction to Classes and Objects
 * 
 * Concept: A class is a blueprint; an object is an instance holding state (fields) and behaviour (methods).
 * 
 * Question: Model a simple `Book` class and create multiple objects from it.
 * 
 * Sample Output:
 * Effective Java by Joshua Bloch (412 pages)
Clean Code by Robert C. Martin (464 pages)
 */

public class Book {
    String title;
    String author;
    int pages;

    void describe() {
        System.out.println(title + " by " + author + " (" + pages + " pages)");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.title = "Effective Java";
        b1.author = "Joshua Bloch";
        b1.pages = 412;

        Book b2 = new Book();
        b2.title = "Clean Code";
        b2.author = "Robert C. Martin";
        b2.pages = 464;

        b1.describe();
        b2.describe();
    }
}

/*
 * Viva Q&A:
 * 1. Q: What is the difference between a class and an object? A: A class is a template/definition; an object is a concrete instance of that template occupying memory at runtime.
 * 2. Q: Where are Java objects stored? A: On the heap; local variable references to them live on the stack.
 */
