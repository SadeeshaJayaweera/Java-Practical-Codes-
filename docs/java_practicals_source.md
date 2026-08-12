---
title: "Java Practical Codes — Extended Collection"
subtitle: "100+ Java Practicals from Beginner to Expert, with Viva Q&A (Based on Java-Practical-Codes- repo structure)"
author: "Compiled for Java OOP Practice Repository"
date: "August 2026"
---

\newpage

# About This Document

This document extends the **Java-Practical-Codes-** repository (originally organized around six OOP topics: *Introduction, Encapsulation, Inheritance, Interfaces, Polymorphism, and Exception Handling*) with a full set of **100 practical coding exercises**, graded from **Beginner → Intermediate → Advanced → Expert**, plus a **Viva/Interview Question & Answer bank**.

**Suggested repository structure to match this document:**

```
Java-Practical-Codes-/
├── Practical 01 - Introduction to OOP and Java/
├── Practical 02 - Encapsulation/
├── Practical 03 - Inheritance, Abstract Classes and Methods/
├── Practical 04 - Interfaces/
├── Practical 05 - Polymorphism/
├── Practical 06 - Exception Handling/
├── Practical 07 - Collections Framework/
├── Practical 08 - Generics/
├── Practical 09 - Multithreading and Concurrency/
├── Practical 10 - File Handling and I O/
├── Practical 11 - Java 8+ Streams Lambdas Functional Interfaces/
├── Practical 12 - Design Patterns and Expert Mini-Projects/
├── Other Java Exercises/
├── Java Assignment/
└── README.md
```

Each practical below lists: a short **concept summary**, the **question/task**, complete **Java source code**, expected **sample output**, and **2 viva-style Q&A** pairs. A larger **Q&A appendix** (60+ questions) follows the practicals for exam/interview revision.

\newpage

# Section 1 — Introduction to OOP and Java (Beginner)

## Practical 1: Hello World and Compilation Basics
**Concept:** Every Java program needs a class with a `main` method as its entry point. `javac` compiles `.java` to `.class` bytecode; `java` runs it on the JVM.

**Question:** Write a program that prints a welcome message and the current Java version.

```java
public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Practicals!");
        System.out.println("Running on Java version: " + System.getProperty("java.version"));
    }
}
```
**Sample Output:**
```
Welcome to Java Practicals!
Running on Java version: 21.0.2
```
**Viva Q&A:**
1. Q: Why must the class name match the file name in Java? A: The public class name and file name must match so the compiler/JVM can locate the correct `.class` file for the public type.
2. Q: What is the JVM? A: The Java Virtual Machine executes compiled bytecode, providing platform independence ("write once, run anywhere").

---

## Practical 2: Variables, Data Types and Type Casting
**Concept:** Java is statically typed; primitives (`int`, `double`, `char`, `boolean`, etc.) and casting (implicit widening vs explicit narrowing) are core basics.

**Question:** Declare variables of different primitive types and demonstrate widening and narrowing casts.

```java
public class TypeCastingDemo {
    public static void main(String[] args) {
        int marks = 87;
        double average = marks;          // widening (implicit)
        double price = 199.99;
        int roundedPrice = (int) price;  // narrowing (explicit)
        char grade = 'A';
        int asciiValue = grade;          // char to int widening

        System.out.println("Average (widened): " + average);
        System.out.println("Rounded price (narrowed): " + roundedPrice);
        System.out.println("ASCII of grade '" + grade + "': " + asciiValue);
    }
}
```
**Sample Output:**
```
Average (widened): 87.0
Rounded price (narrowed): 199
ASCII of grade 'A': 65
```
**Viva Q&A:**
1. Q: Why does narrowing require an explicit cast? A: Because it can lose data (precision or magnitude), Java forces the developer to acknowledge that risk explicitly.
2. Q: Is `String` a primitive type in Java? A: No, `String` is a reference type (an object), not a primitive.

---

## Practical 3: Operators and Expressions
**Concept:** Arithmetic, relational, logical, and the ternary operator control expression evaluation.

**Question:** Compute the area/perimeter of a rectangle and determine if it's a square using operators.

```java
public class RectangleOperators {
    public static void main(String[] args) {
        int length = 10, width = 10;
        int area = length * width;
        int perimeter = 2 * (length + width);
        String shapeType = (length == width) ? "Square" : "Rectangle";

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Shape type: " + shapeType);
    }
}
```
**Sample Output:**
```
Area: 100
Perimeter: 40
Shape type: Square
```
**Viva Q&A:**
1. Q: What does the ternary operator `?:` do? A: It is a shorthand conditional expression: `condition ? valueIfTrue : valueIfFalse`.
2. Q: What is the difference between `==` and `.equals()` for objects? A: `==` compares references (memory address), `.equals()` compares logical/content equality when overridden.

---

## Practical 4: Control Flow — if/else and switch
**Concept:** Decision-making constructs direct program flow based on conditions.

**Question:** Grade a student's score using both if-else chains and a switch expression.

```java
public class GradeCalculator {
    static String gradeWithIfElse(int score) {
        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 60) return "C";
        else return "F";
    }

    static String gradeWithSwitch(int scoreBand) {
        return switch (scoreBand) {
            case 9, 10 -> "A";
            case 7, 8 -> "B";
            case 6 -> "C";
            default -> "F";
        };
    }

    public static void main(String[] args) {
        System.out.println("Score 82 -> Grade: " + gradeWithIfElse(82));
        System.out.println("Band 9 -> Grade: " + gradeWithSwitch(9));
    }
}
```
**Sample Output:**
```
Score 82 -> Grade: B
Band 9 -> Grade: A
```
**Viva Q&A:**
1. Q: When is a switch preferable to if-else? A: When comparing one variable against many discrete constant values, switch is clearer and can be more efficient.
2. Q: Does Java's modern switch expression need `break`? A: No — the arrow (`->`) form does not fall through, so `break` is unnecessary.

---

## Practical 5: Loops — for, while, do-while
**Concept:** Loops repeat a block of code; choice depends on whether the iteration count is known in advance.

**Question:** Print a multiplication table and count digits of a number using different loop types.

```java
public class LoopsDemo {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        int number = 4821, digitCount = 0;
        while (number != 0) {
            number /= 10;
            digitCount++;
        }
        System.out.println("Digit count: " + digitCount);

        int attempt = 0;
        do {
            attempt++;
        } while (attempt < 3);
        System.out.println("Attempts made: " + attempt);
    }
}
```
**Sample Output:**
```
5 x 1 = 5
...
5 x 10 = 50
Digit count: 4
Attempts made: 3
```
**Viva Q&A:**
1. Q: What's the key difference between `while` and `do-while`? A: `do-while` always executes the loop body at least once because the condition is checked after the body.
2. Q: What is a "for-each" loop used for? A: Iterating over arrays/collections without manually managing an index.

---

## Practical 6: Arrays — 1D and 2D
**Concept:** Arrays store fixed-size, indexed collections of same-typed elements.

**Question:** Find the max value in a 1D array and print a 2D matrix, then sum its elements.

```java
public class ArraysDemo {
    public static void main(String[] args) {
        int[] scores = {45, 89, 67, 92, 31};
        int max = scores[0];
        for (int s : scores) if (s > max) max = s;
        System.out.println("Max score: " + max);

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
                sum += val;
            }
            System.out.println();
        }
        System.out.println("Matrix sum: " + sum);
    }
}
```
**Sample Output:**
```
Max score: 92
1 2 3
4 5 6
7 8 9
Matrix sum: 45
```
**Viva Q&A:**
1. Q: Are Java arrays fixed size? A: Yes, once created, an array's length cannot change; use `ArrayList` for dynamic sizing.
2. Q: How is a 2D array represented internally in Java? A: As an array of arrays (each row can even have a different length — a "jagged" array).

---

## Practical 7: Methods, Parameters and Overloading
**Concept:** Methods encapsulate reusable logic; overloading allows same method name with different parameter lists.

**Question:** Create overloaded `add` methods for int, double and three integers.

```java
public class MethodOverloadingDemo {
    static int add(int a, int b) { return a + b; }
    static double add(double a, double b) { return a + b; }
    static int add(int a, int b, int c) { return a + b + c; }

    public static void main(String[] args) {
        System.out.println("int+int: " + add(2, 3));
        System.out.println("double+double: " + add(2.5, 3.1));
        System.out.println("int+int+int: " + add(1, 2, 3));
    }
}
```
**Sample Output:**
```
int+int: 5
double+double: 5.6
int+int+int: 6
```
**Viva Q&A:**
1. Q: What determines which overloaded method is called? A: The compiler resolves it at compile time based on the number, type, and order of arguments (static/compile-time polymorphism).
2. Q: Can two methods be overloaded by return type alone? A: No, return type alone is not sufficient to distinguish overloaded methods.

---

## Practical 8: Introduction to Classes and Objects
**Concept:** A class is a blueprint; an object is an instance holding state (fields) and behaviour (methods).

**Question:** Model a simple `Book` class and create multiple objects from it.

```java
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
```
**Sample Output:**
```
Effective Java by Joshua Bloch (412 pages)
Clean Code by Robert C. Martin (464 pages)
```
**Viva Q&A:**
1. Q: What is the difference between a class and an object? A: A class is a template/definition; an object is a concrete instance of that template occupying memory at runtime.
2. Q: Where are Java objects stored? A: On the heap; local variable references to them live on the stack.

---

# Section 2 — Encapsulation (Beginner–Intermediate)

## Practical 9: Private Fields with Getters and Setters
**Concept:** Encapsulation hides internal state behind `private` fields, exposing controlled access via public methods.

**Question:** Create a `BankAccount` class with a private balance and safe getter/setter.

```java
public class BankAccount {
    private double balance;

    public double getBalance() { return balance; }

    public void setBalance(double balance) {
        if (balance < 0) throw new IllegalArgumentException("Balance cannot be negative");
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setBalance(1500.0);
        System.out.println("Balance: " + acc.getBalance());
    }
}
```
**Sample Output:**
```
Balance: 1500.0
```
**Viva Q&A:**
1. Q: Why not just make fields public? A: Public fields allow uncontrolled, invalid modification; encapsulation lets you validate and control access, and change internal representation without breaking callers.
2. Q: What access modifier is the most restrictive in Java? A: `private` — accessible only within the declaring class.

---

## Practical 10: Validated Setters (Data Integrity)
**Concept:** Setters can enforce business rules so an object is never left in an invalid state.

**Question:** Build a `Student` class where age must be between 5 and 100.

```java
public class Student {
    private String name;
    private int age;

    public void setAge(int age) {
        if (age < 5 || age > 100) {
            System.out.println("Invalid age: " + age + ". Keeping previous value.");
            return;
        }
        this.age = age;
    }
    public int getAge() { return age; }
    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Nimal");
        s.setAge(150);
        s.setAge(21);
        System.out.println(s.getName() + " -> age: " + s.getAge());
    }
}
```
**Sample Output:**
```
Invalid age: 150. Keeping previous value.
Nimal -> age: 21
```
**Viva Q&A:**
1. Q: What is a "guard clause"? A: An early validation check (like the age range check) that exits or rejects invalid input before further processing.
2. Q: How does encapsulation support maintainability? A: Internal implementation can change freely as long as the public interface (getters/setters) stays the same.

---

## Practical 11: Immutable Class Design
**Concept:** An immutable object's state cannot change after construction — achieved via `final` fields, no setters, and defensive copying.

**Question:** Design an immutable `Point` class.

```java
public final class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) { this.x = x; this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }

    public Point translate(int dx, int dy) {
        return new Point(x + dx, y + dy); // returns a new object instead of mutating
    }

    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = p1.translate(5, -1);
        System.out.println("p1 = (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("p2 = (" + p2.getX() + ", " + p2.getY() + ")");
    }
}
```
**Sample Output:**
```
p1 = (2, 3)
p2 = (7, 2)
```
**Viva Q&A:**
1. Q: Name a well-known immutable class in the JDK. A: `String` (and wrapper classes like `Integer`, `LocalDate`).
2. Q: Why mark an immutable class `final`? A: To prevent subclasses from adding mutable state or overriding methods in ways that break immutability guarantees.

---

## Practical 12: Static Fields and the Singleton-of-Counters Pattern
**Concept:** `static` fields belong to the class, shared across all instances — useful for counters and constants.

**Question:** Track how many `Employee` objects have been created.

```java
public class Employee {
    private static int totalEmployees = 0;
    private String name;

    public Employee(String name) {
        this.name = name;
        totalEmployees++;
    }

    public static int getTotalEmployees() { return totalEmployees; }

    public static void main(String[] args) {
        new Employee("Kasun");
        new Employee("Ishara");
        new Employee("Dulani");
        System.out.println("Total employees created: " + Employee.getTotalEmployees());
    }
}
```
**Sample Output:**
```
Total employees created: 3
```
**Viva Q&A:**
1. Q: How many copies of a static field exist across all instances? A: Just one — it is shared at the class level, not per-instance.
2. Q: Can a static method access instance (non-static) fields directly? A: No, because a static method has no implicit `this`; it must access instance fields through an object reference.

---

## Practical 13: Encapsulating a Collection (Defensive Copy)
**Concept:** Returning an internal mutable collection directly breaks encapsulation; return a copy or unmodifiable view instead.

**Question:** Build a `Playlist` class that safely exposes its song list.

```java
import java.util.*;

public class Playlist {
    private final List<String> songs = new ArrayList<>();

    public void addSong(String song) { songs.add(song); }

    public List<String> getSongs() {
        return Collections.unmodifiableList(new ArrayList<>(songs));
    }

    public static void main(String[] args) {
        Playlist pl = new Playlist();
        pl.addSong("Blinding Lights");
        pl.addSong("Levitating");

        List<String> exposed = pl.getSongs();
        System.out.println("Songs: " + exposed);
        try {
            exposed.add("Hacked Song");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot modify playlist from outside: " + e.getClass().getSimpleName());
        }
    }
}
```
**Sample Output:**
```
Songs: [Blinding Lights, Levitating]
Cannot modify playlist from outside: UnsupportedOperationException
```
**Viva Q&A:**
1. Q: Why wrap the list with `Collections.unmodifiableList`? A: To prevent external code from mutating the class's internal state through the returned reference.
2. Q: What exception is thrown when modifying an unmodifiable collection? A: `UnsupportedOperationException`.

---

## Practical 14: Encapsulation with Enum-Based State
**Concept:** Enums provide a type-safe, encapsulated way to represent a fixed set of related constants.

**Question:** Model order status using an enum inside an `Order` class.

```java
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
```
**Sample Output:**
```
Initial: PENDING
After ship(): SHIPPED
```
**Viva Q&A:**
1. Q: Why use an `enum` instead of `String` constants for status? A: Enums are type-safe and restrict values to a known fixed set, preventing invalid states like `"shiped"` typos.
2. Q: Can enums have methods and fields in Java? A: Yes, Java enums are full classes and can hold fields, constructors, and methods.

---

## Practical 15: Encapsulation via Constructor Validation
**Concept:** Validating input inside constructors ensures an object is never created in an invalid state.

**Question:** Create a `Rectangle` class that rejects non-positive dimensions at construction time.

```java
public class Rectangle {
    private final double width, height;

    public Rectangle(double width, double height) {
        if (width <= 0 || height <= 0)
            throw new IllegalArgumentException("Dimensions must be positive");
        this.width = width;
        this.height = height;
    }

    public double area() { return width * height; }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4, 5);
        System.out.println("Area: " + r.area());
        try {
            new Rectangle(-2, 5);
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected: " + e.getMessage());
        }
    }
}
```
**Sample Output:**
```
Area: 20.0
Rejected: Dimensions must be positive
```
**Viva Q&A:**
1. Q: What is "fail-fast" design? A: Detecting and reporting errors (like invalid constructor arguments) as early as possible, rather than letting bad state propagate.
2. Q: Which unchecked exception is idiomatic for invalid arguments? A: `IllegalArgumentException`.

---

## Practical 16: Package-Private and Protected Access
**Concept:** Java has four access levels: `private`, package-private (default), `protected`, and `public`, each widening visibility.

**Question:** Demonstrate protected access being usable by a subclass in another file conceptually (single-file simplified demo).

```java
class Vehicle {
    protected int topSpeed = 180;
    void showSpeed() { System.out.println("Top speed: " + topSpeed + " km/h"); }
}

public class SportsCar extends Vehicle {
    public static void main(String[] args) {
        SportsCar car = new SportsCar();
        car.topSpeed = 250; // accessible because SportsCar extends Vehicle
        car.showSpeed();
    }
}
```
**Sample Output:**
```
Top speed: 250 km/h
```
**Viva Q&A:**
1. Q: What does `protected` allow that package-private does not? A: `protected` also allows access from subclasses in *different* packages, not just classes in the same package.
2. Q: Rank the four access modifiers from most to least restrictive. A: `private` > default (package-private) > `protected` > `public`.

---

# Section 3 — Inheritance, Abstract Classes and Methods (Intermediate)

## Practical 17: Basic Inheritance with `extends`
**Concept:** Inheritance lets a subclass reuse and extend the fields/methods of a superclass.

**Question:** Create an `Animal` base class and a `Dog` subclass that adds new behaviour.

```java
class Animal {
    String name;
    Animal(String name) { this.name = name; }
    void eat() { System.out.println(name + " is eating."); }
}

public class Dog extends Animal {
    Dog(String name) { super(name); }
    void bark() { System.out.println(name + " says Woof!"); }

    public static void main(String[] args) {
        Dog d = new Dog("Rex");
        d.eat();
        d.bark();
    }
}
```
**Sample Output:**
```
Rex is eating.
Rex says Woof!
```
**Viva Q&A:**
1. Q: What does `super(name)` do here? A: It invokes the superclass `Animal` constructor to initialize inherited state before the subclass constructor continues.
2. Q: Does Java support multiple class inheritance? A: No, a class can extend only one superclass (Java uses interfaces for multiple inheritance of type).

---

## Practical 18: Method Overriding
**Concept:** A subclass can provide its own implementation of a method already defined in the superclass, enabling runtime polymorphism.

**Question:** Override `makeSound()` in `Cat` and `Cow` subclasses of `Animal`.

```java
class Animal {
    void makeSound() { System.out.println("Some generic animal sound"); }
}
class Cat extends Animal {
    @Override void makeSound() { System.out.println("Meow"); }
}
class Cow extends Animal {
    @Override void makeSound() { System.out.println("Moo"); }
}
public class OverridingDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Cat(), new Cow() };
        for (Animal a : animals) a.makeSound();
    }
}
```
**Sample Output:**
```
Meow
Moo
```
**Viva Q&A:**
1. Q: What is the purpose of `@Override`? A: It's an annotation that lets the compiler verify the method actually overrides a superclass method, catching typos at compile time.
2. Q: Can a `private` method be overridden? A: No — private methods aren't inherited/visible to subclasses, so they can only be hidden, not overridden.

---

## Practical 19: The `super` Keyword — Calling Parent Methods
**Concept:** `super.method()` invokes the overridden superclass version from within an overriding method.

**Question:** Extend a `Shape` class's `describe()` method while still reusing the parent's output.

```java
class Shape {
    void describe() { System.out.println("I am a shape."); }
}
public class Circle extends Shape {
    @Override
    void describe() {
        super.describe();
        System.out.println("More specifically, I am a circle.");
    }
    public static void main(String[] args) {
        new Circle().describe();
    }
}
```
**Sample Output:**
```
I am a shape.
More specifically, I am a circle.
```
**Viva Q&A:**
1. Q: Why use `super.describe()` instead of duplicating the parent logic? A: It avoids code duplication and keeps behaviour consistent if the parent implementation changes.
2. Q: Is `super` also used to access hidden fields? A: Yes, `super.fieldName` accesses the parent class's field when the subclass declares a field with the same name.

---

## Practical 20: Abstract Classes and Abstract Methods
**Concept:** An abstract class cannot be instantiated and may declare abstract methods that subclasses *must* implement.

**Question:** Define an abstract `PaymentMethod` class with an abstract `pay()` method.

```java
abstract class PaymentMethod {
    abstract void pay(double amount);
    void receipt(double amount) { System.out.println("Receipt: LKR " + amount + " processed."); }
}
class CardPayment extends PaymentMethod {
    @Override void pay(double amount) {
        System.out.println("Paying LKR " + amount + " via Card");
        receipt(amount);
    }
}
public class AbstractPaymentDemo {
    public static void main(String[] args) {
        PaymentMethod method = new CardPayment();
        method.pay(2500.0);
    }
}
```
**Sample Output:**
```
Paying LKR 2500.0 via Card
Receipt: LKR 2500.0 processed.
```
**Viva Q&A:**
1. Q: Can an abstract class have a constructor? A: Yes — it runs when a concrete subclass is instantiated, even though the abstract class itself can't be `new`'d directly.
2. Q: Can an abstract class have zero abstract methods? A: Yes, a class can be declared `abstract` purely to prevent instantiation, even with all methods implemented.

---

## Practical 21: Constructor Chaining Across Hierarchies
**Concept:** Every subclass constructor implicitly or explicitly calls a superclass constructor before its own body runs.

**Question:** Trace constructor execution order across a 3-level hierarchy.

```java
class A { A() { System.out.println("A constructor"); } }
class B extends A { B() { System.out.println("B constructor"); } }
class C extends B { C() { System.out.println("C constructor"); } }

public class ConstructorChainDemo {
    public static void main(String[] args) {
        new C();
    }
}
```
**Sample Output:**
```
A constructor
B constructor
C constructor
```
**Viva Q&A:**
1. Q: In what order do constructors run in an inheritance chain? A: Top-down — the topmost superclass constructor runs first, then each subclass down to the most derived class.
2. Q: What happens if a subclass constructor doesn't explicitly call `super(...)`? A: The compiler implicitly inserts a call to the superclass's no-argument constructor.

---

## Practical 22: The `final` Keyword — Classes, Methods, Variables
**Concept:** `final` prevents further subclassing, overriding, or reassignment respectively.

**Question:** Demonstrate a `final` method that can't be overridden and a `final` variable that can't be reassigned.

```java
class Base {
    final void identify() { System.out.println("I am the Base class."); }
}
public class FinalDemo extends Base {
    public static void main(String[] args) {
        final int MAX_USERS = 100;
        new FinalDemo().identify();
        System.out.println("MAX_USERS = " + MAX_USERS);
        // MAX_USERS = 200; // would not compile
    }
}
```
**Sample Output:**
```
I am the Base class.
MAX_USERS = 100
```
**Viva Q&A:**
1. Q: What does declaring a class `final` mean? A: It cannot be extended/subclassed at all (e.g., `String` is `final`).
2. Q: Why mark constants `final`? A: To guarantee they are assigned once and never change, communicating immutability and enabling compiler optimizations.

---

## Practical 23: `instanceof` and Downcasting
**Concept:** `instanceof` checks an object's runtime type before safely downcasting a superclass reference.

**Question:** Given an array of `Animal` references, downcast to access subclass-specific methods safely.

```java
class Animal { }
class Parrot extends Animal { void speak() { System.out.println("Parrot: Polly wants a cracker!"); } }
class Fish extends Animal { void swim() { System.out.println("Fish is swimming."); } }

public class InstanceofDemo {
    public static void main(String[] args) {
        Animal[] animals = { new Parrot(), new Fish() };
        for (Animal a : animals) {
            if (a instanceof Parrot p) p.speak();
            else if (a instanceof Fish f) f.swim();
        }
    }
}
```
**Sample Output:**
```
Parrot: Polly wants a cracker!
Fish is swimming.
```
**Viva Q&A:**
1. Q: What is "pattern matching for instanceof" (Java 16+)? A: It lets you combine the type check and cast in one expression, e.g. `a instanceof Parrot p`, binding `p` automatically.
2. Q: What exception can an unsafe cast throw at runtime? A: `ClassCastException`.

---

## Practical 24: Abstract Class vs Concrete Template Method Pattern
**Concept:** An abstract class can define a fixed algorithm skeleton (template method) while leaving specific steps to subclasses.

**Question:** Implement a `ReportGenerator` template that fixes the report flow but lets subclasses customize the body.

```java
abstract class ReportGenerator {
    final void generate() {
        printHeader();
        printBody();
        printFooter();
    }
    void printHeader() { System.out.println("=== Report Start ==="); }
    abstract void printBody();
    void printFooter() { System.out.println("=== Report End ==="); }
}
class SalesReport extends ReportGenerator {
    @Override void printBody() { System.out.println("Sales: LKR 500,000 this month."); }
}
public class TemplateMethodDemo {
    public static void main(String[] args) { new SalesReport().generate(); }
}
```
**Sample Output:**
```
=== Report Start ===
Sales: LKR 500,000 this month.
=== Report End ===
```
**Viva Q&A:**
1. Q: What is the Template Method design pattern? A: A pattern where a base class defines the overall algorithm structure and defers specific steps to subclasses via overridable methods.
2. Q: Why is `generate()` marked `final` here? A: To prevent subclasses from altering the fixed sequence of steps in the algorithm.

---

## Practical 25: Multilevel Inheritance and Field Hiding
**Concept:** Multilevel inheritance chains classes A→B→C; field hiding occurs when a subclass declares a field with the same name as a parent's.

**Question:** Demonstrate multilevel inheritance with a `Person → Employee → Manager` hierarchy.

```java
class Person {
    String name;
    Person(String name) { this.name = name; }
}
class Employee extends Person {
    double salary;
    Employee(String name, double salary) { super(name); this.salary = salary; }
}
class Manager extends Employee {
    int teamSize;
    Manager(String name, double salary, int teamSize) {
        super(name, salary);
        this.teamSize = teamSize;
    }
    void summary() {
        System.out.println(name + " manages " + teamSize + " people, earns LKR " + salary);
    }
}
public class MultilevelDemo {
    public static void main(String[] args) {
        new Manager("Priya", 250000, 8).summary();
    }
}
```
**Sample Output:**
```
Priya manages 8 people, earns LKR 250000.0
```
**Viva Q&A:**
1. Q: What is multilevel inheritance? A: A chain of inheritance where a class derives from a class that itself derives from another class (A → B → C).
2. Q: Does Java support this without limit on depth? A: Yes, there's no fixed limit, but excessively deep hierarchies are discouraged for maintainability.

---

## Practical 26: Overriding `equals()`, `hashCode()`, and `toString()`
**Concept:** Every class inherits `Object`'s default `equals`/`hashCode`/`toString`; overriding them gives meaningful value-based behaviour.

**Question:** Override these three methods for a `Point2D` class.

```java
import java.util.Objects;

public class Point2D {
    private final int x, y;
    Point2D(int x, int y) { this.x = x; this.y = y; }

    @Override public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Point2D)) return false;
        Point2D p = (Point2D) o;
        return x == p.x && y == p.y;
    }
    @Override public int hashCode() { return Objects.hash(x, y); }
    @Override public String toString() { return "Point2D(" + x + ", " + y + ")"; }

    public static void main(String[] args) {
        Point2D p1 = new Point2D(1, 2);
        Point2D p2 = new Point2D(1, 2);
        System.out.println(p1);
        System.out.println("p1.equals(p2): " + p1.equals(p2));
        System.out.println("Same hashCode: " + (p1.hashCode() == p2.hashCode()));
    }
}
```
**Sample Output:**
```
Point2D(1, 2)
p1.equals(p2): true
Same hashCode: true
```
**Viva Q&A:**
1. Q: Why must `equals()` and `hashCode()` be overridden together? A: Equal objects must produce equal hash codes; otherwise, hash-based collections (`HashMap`, `HashSet`) will behave incorrectly.
2. Q: What does `toString()` control by default? A: The string representation used e.g. by `System.out.println(object)` and string concatenation.

---

# Section 4 — Interfaces (Intermediate)

## Practical 27: Basic Interface Implementation
**Concept:** An interface defines a contract of method signatures a class agrees to implement.

**Question:** Define a `Drivable` interface implemented by a `Car` class.

```java
interface Drivable {
    void drive();
}
public class Car implements Drivable {
    @Override public void drive() { System.out.println("The car is driving."); }
    public static void main(String[] args) {
        Drivable d = new Car();
        d.drive();
    }
}
```
**Sample Output:**
```
The car is driving.
```
**Viva Q&A:**
1. Q: Can you instantiate an interface directly? A: No, but you can create an anonymous class or lambda implementing it.
2. Q: What access modifier do interface methods have by default? A: `public abstract` (implicitly), unless marked `default`, `static`, or `private`.

---

## Practical 28: Multiple Interface Implementation
**Concept:** A class can implement several interfaces, achieving a form of multiple inheritance of type.

**Question:** Implement both `Flyable` and `Swimmable` in a `Duck` class.

```java
interface Flyable { void fly(); }
interface Swimmable { void swim(); }

public class Duck implements Flyable, Swimmable {
    @Override public void fly() { System.out.println("Duck is flying."); }
    @Override public void swim() { System.out.println("Duck is swimming."); }

    public static void main(String[] args) {
        Duck d = new Duck();
        d.fly();
        d.swim();
    }
}
```
**Sample Output:**
```
Duck is flying.
Duck is swimming.
```
**Viva Q&A:**
1. Q: Why can a class implement multiple interfaces but extend only one class? A: Java avoids the "diamond problem" of state inheritance; interfaces (pre-Java 8) had no state, so multiple implementation was safe.
2. Q: What happens if two interfaces have conflicting default methods? A: The implementing class must explicitly override the method to resolve the conflict.

---

## Practical 29: Default and Static Methods in Interfaces
**Concept:** Since Java 8, interfaces can have `default` methods (with a body, overridable) and `static` utility methods.

**Question:** Add a default method with common logic and a static factory-like utility to a `Greetable` interface.

```java
interface Greetable {
    String name();
    default void greet() { System.out.println("Hello, " + name() + "!"); }
    static Greetable of(String n) { return () -> n; }
}
public class DefaultMethodDemo {
    public static void main(String[] args) {
        Greetable g = Greetable.of("Amara");
        g.greet();
    }
}
```
**Sample Output:**
```
Hello, Amara!
```
**Viva Q&A:**
1. Q: Why were default methods introduced in Java 8? A: To let interfaces evolve (add new methods) without breaking existing implementing classes.
2. Q: Can a static interface method be overridden by implementing classes? A: No, static interface methods belong to the interface itself and are not inherited or overridable.

---

## Practical 30: Interfaces as Callback Types (Functional Interfaces)
**Concept:** A functional interface has exactly one abstract method, allowing lambda expressions as implementations.

**Question:** Define a `Validator` functional interface and use it with lambdas.

```java
@FunctionalInterface
interface Validator<T> { boolean isValid(T value); }

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        Validator<String> notEmpty = s -> s != null && !s.isEmpty();
        Validator<Integer> isPositive = n -> n > 0;

        System.out.println("notEmpty(\"hi\"): " + notEmpty.isValid("hi"));
        System.out.println("isPositive(-5): " + isPositive.isValid(-5));
    }
}
```
**Sample Output:**
```
notEmpty("hi"): true
isPositive(-5): false
```
**Viva Q&A:**
1. Q: What does `@FunctionalInterface` do? A: It's an optional but recommended annotation that makes the compiler enforce exactly one abstract method.
2. Q: Name a built-in functional interface from `java.util.function`. A: E.g. `Predicate<T>`, `Function<T,R>`, `Supplier<T>`, or `Consumer<T>`.

---

## Practical 31: Interface Constants
**Concept:** Fields declared in an interface are implicitly `public static final` (constants).

**Question:** Define physics constants in an interface used by a calculation class.

```java
interface PhysicsConstants {
    double GRAVITY = 9.8;
    double SPEED_OF_LIGHT = 299792458.0;
}
public class FreeFallCalculator implements PhysicsConstants {
    double fallDistance(double timeSeconds) { return 0.5 * GRAVITY * timeSeconds * timeSeconds; }
    public static void main(String[] args) {
        FreeFallCalculator calc = new FreeFallCalculator();
        System.out.println("Distance after 3s: " + calc.fallDistance(3) + " m");
    }
}
```
**Sample Output:**
```
Distance after 3s: 44.1 m
```
**Viva Q&A:**
1. Q: Can interface constants be reassigned by an implementing class? A: No, they are implicitly `final`, so reassignment is a compile error.
2. Q: Is this the recommended way to share constants today? A: A `final` utility class with static constants is often preferred; using interfaces purely for constants is generally discouraged (the "constant interface antipattern").

---

## Practical 32: Marker Interfaces
**Concept:** A marker interface has no methods; it signals metadata about a class (e.g., `Serializable`, `Cloneable`).

**Question:** Create a custom marker interface `Auditable` and check for it with `instanceof`.

```java
interface Auditable { }
class Transaction implements Auditable {
    double amount;
    Transaction(double amount) { this.amount = amount; }
}
public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Transaction t = new Transaction(1000);
        if (t instanceof Auditable) System.out.println("This transaction will be audited.");
    }
}
```
**Sample Output:**
```
This transaction will be audited.
```
**Viva Q&A:**
1. Q: Give a JDK example of a marker interface. A: `java.io.Serializable` or `java.lang.Cloneable`.
2. Q: How have annotations partially replaced marker interfaces? A: Custom annotations (e.g. `@Deprecated`) can carry similar "marker" metadata and are checkable via reflection, often more flexibly than marker interfaces.

---

## Practical 33: Interface-Based Strategy Pattern
**Concept:** Interfaces enable the Strategy pattern — swapping algorithm implementations at runtime behind a common contract.

**Question:** Implement different discount strategies via a `DiscountStrategy` interface.

```java
interface DiscountStrategy { double apply(double price); }

public class DiscountDemo {
    static double checkout(double price, DiscountStrategy strategy) { return strategy.apply(price); }

    public static void main(String[] args) {
        DiscountStrategy tenPercentOff = price -> price * 0.90;
        DiscountStrategy flatFiveHundredOff = price -> Math.max(0, price - 500);

        System.out.println("10% off 2000: " + checkout(2000, tenPercentOff));
        System.out.println("Flat 500 off 2000: " + checkout(2000, flatFiveHundredOff));
    }
}
```
**Sample Output:**
```
10% off 2000: 1800.0
Flat 500 off 2000: 1500.0
```
**Viva Q&A:**
1. Q: What problem does the Strategy pattern solve? A: It lets you select an algorithm's behaviour at runtime without changing the client code that uses it.
2. Q: How do lambdas make the Strategy pattern more concise in Java? A: A lambda can implement a single-method interface directly, removing the need for verbose anonymous inner classes.

---

## Practical 34: Comparable and Comparator Interfaces
**Concept:** `Comparable<T>` defines a class's "natural ordering"; `Comparator<T>` defines external, pluggable orderings.

**Question:** Sort a list of `Employee` objects by salary (Comparable) and by name (Comparator).

```java
import java.util.*;

class Employee implements Comparable<Employee> {
    String name; double salary;
    Employee(String name, double salary) { this.name = name; this.salary = salary; }
    @Override public int compareTo(Employee o) { return Double.compare(this.salary, o.salary); }
    @Override public String toString() { return name + "(" + salary + ")"; }
}
public class ComparableComparatorDemo {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
            new Employee("Nadun", 75000),
            new Employee("Ashan", 60000),
            new Employee("Chamodi", 90000)
        ));
        Collections.sort(employees);
        System.out.println("By salary: " + employees);

        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("By name: " + employees);
    }
}
```
**Sample Output:**
```
By salary: [Ashan(60000.0), Nadun(75000.0), Chamodi(90000.0)]
By name: [Ashan(60000.0), Chamodi(90000.0), Nadun(75000.0)]
```
**Viva Q&A:**
1. Q: When should you use `Comparator` instead of `Comparable`? A: When you need multiple, alternative, or external orderings that don't belong as the class's single "natural" order.
2. Q: What does `compareTo` returning a negative number mean? A: The current object is considered "less than" the object being compared to, for sorting purposes.

---

# Section 5 — Polymorphism (Intermediate)

## Practical 35: Compile-Time vs Runtime Polymorphism
**Concept:** Overloading = compile-time (static) polymorphism; overriding = runtime (dynamic) polymorphism.

**Question:** Show both forms side by side.

```java
class Printer {
    void print(String s) { System.out.println("String: " + s); }   // overload
    void print(int i) { System.out.println("Int: " + i); }         // overload
}
class ColorPrinter extends Printer {
    @Override void print(String s) { System.out.println("Color String: " + s); } // override
}
public class PolymorphismTypesDemo {
    public static void main(String[] args) {
        Printer p = new ColorPrinter();
        p.print("Report");   // resolved at runtime -> ColorPrinter's version
        p.print(42);         // resolved at compile time -> Printer's int overload
    }
}
```
**Sample Output:**
```
Color String: Report
Int: 42
```
**Viva Q&A:**
1. Q: Why is overloading called "compile-time" polymorphism? A: The compiler decides which overloaded method to call based on argument types at compile time.
2. Q: Why is overriding called "runtime" polymorphism? A: The JVM decides which overridden method to invoke based on the object's actual runtime type (dynamic dispatch).

---

## Practical 36: Upcasting and Dynamic Method Dispatch
**Concept:** A superclass reference can point to a subclass object; the actual method invoked depends on the object's real type.

**Question:** Demonstrate dynamic dispatch across a `Shape` hierarchy.

```java
class Shape { double area() { return 0; } }
class Square extends Shape { double side; Square(double s) { side = s; } @Override double area() { return side * side; } }
class Triangle extends Shape { double base, height; Triangle(double b, double h) { base = b; height = h; } @Override double area() { return 0.5 * base * height; } }

public class DynamicDispatchDemo {
    public static void main(String[] args) {
        Shape[] shapes = { new Square(4), new Triangle(6, 3) };
        for (Shape s : shapes) System.out.println(s.getClass().getSimpleName() + " area: " + s.area());
    }
}
```
**Sample Output:**
```
Square area: 16.0
Triangle area: 9.0
```
**Viva Q&A:**
1. Q: What is "upcasting"? A: Implicitly treating a subclass reference as its superclass type (e.g., `Shape s = new Square(4)`).
2. Q: What mechanism enables dynamic dispatch in the JVM? A: The virtual method table (vtable) lookup at runtime based on the object's actual class.

---

## Practical 37: Polymorphism with Abstract Classes
**Concept:** Abstract classes are a common vehicle for polymorphism, forcing each subclass to define its own behaviour.

**Question:** Compute total payroll using polymorphic `calculatePay()` for different employee types.

```java
abstract class StaffMember { abstract double calculatePay(); }
class FullTime extends StaffMember { double monthly = 100000; @Override double calculatePay() { return monthly; } }
class PartTime extends StaffMember { double hourly = 800; int hours = 90; @Override double calculatePay() { return hourly * hours; } }

public class PayrollDemo {
    public static void main(String[] args) {
        StaffMember[] staff = { new FullTime(), new PartTime() };
        double total = 0;
        for (StaffMember s : staff) total += s.calculatePay();
        System.out.println("Total payroll: LKR " + total);
    }
}
```
**Sample Output:**
```
Total payroll: LKR 172000.0
```
**Viva Q&A:**
1. Q: Why is polymorphism useful for the `staff` array loop here? A: The loop doesn't need to know the concrete type of each element — it just calls `calculatePay()` and the right version runs automatically.
2. Q: Could `StaffMember` be an interface instead of an abstract class here? A: Yes, if there's no shared state or default implementation needed; an interface would work equally well for pure behavioural contracts.

---

## Practical 38: Polymorphic Collections
**Concept:** Collections declared with a supertype can hold mixed subtype objects, iterated polymorphically.

**Question:** Store various `Notification` types in one list and send them polymorphically.

```java
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
```
**Sample Output:**
```
Sending Email...
Sending SMS...
Sending Push notification...
```
**Viva Q&A:**
1. Q: What is `Notification::send` in this code? A: A method reference — shorthand for the lambda `n -> n.send()`.
2. Q: What would happen if `send()` weren't overridden in a subclass? A: It would inherit the parent's implementation (or fail to compile if the parent method is abstract and not implemented anywhere in the hierarchy).

---

## Practical 39: Covariant Return Types
**Concept:** An overriding method may return a more specific (subclass) type than the method it overrides.

**Question:** Override a method to return a narrower type using covariant returns.

```java
class Animal { Animal reproduce() { return new Animal(); } }
class Cat extends Animal { @Override Cat reproduce() { return new Cat(); } }

public class CovariantReturnDemo {
    public static void main(String[] args) {
        Cat kitten = new Cat().reproduce(); // no cast needed
        System.out.println("Reproduced: " + kitten.getClass().getSimpleName());
    }
}
```
**Sample Output:**
```
Reproduced: Cat
```
**Viva Q&A:**
1. Q: What is a covariant return type? A: When an overriding method's return type is a subtype of the return type declared in the overridden method.
2. Q: Since which Java version has this been supported? A: Java 5.

---

## Practical 40: Polymorphism and the `Object` Class
**Concept:** Every class implicitly extends `Object`, so `Object` references can hold any type, and calling overridden `toString()` demonstrates polymorphism.

**Question:** Store mixed objects in an `Object[]` and print them polymorphically.

```java
public class ObjectPolymorphismDemo {
    static class Item { String name; Item(String n){name=n;} @Override public String toString() { return "Item:" + name; } }
    public static void main(String[] args) {
        Object[] mixed = { 42, "hello", 3.14, new Item("Notebook") };
        for (Object o : mixed) System.out.println(o.getClass().getSimpleName() + " -> " + o);
    }
}
```
**Sample Output:**
```
Integer -> 42
String -> hello
Double -> 3.14
Item -> Item:Notebook
```
**Viva Q&A:**
1. Q: Why can an `Object[]` hold ints, Strings, and custom objects? A: Every reference type in Java (and autoboxed primitives) is ultimately a subtype of `Object`.
2. Q: What does `getClass()` return? A: A `Class` object representing the object's actual runtime type.

---

## Practical 41: Operator "Polymorphism" — The Overloaded `+`
**Concept:** The `+` operator behaves differently for numbers (addition) vs Strings (concatenation) — a built-in form of ad-hoc polymorphism.

**Question:** Demonstrate `+` behaving differently based on operand types.

```java
public class PlusOperatorDemo {
    public static void main(String[] args) {
        System.out.println(2 + 3);            // numeric addition
        System.out.println("2" + 3);           // string concatenation
        System.out.println(2 + 3 + "kg");       // left-to-right: 5 then concatenation
        System.out.println("Weight: " + 2 + 3); // string then numeric concatenation
    }
}
```
**Sample Output:**
```
5
23
5kg
Weight: 23
```
**Viva Q&A:**
1. Q: Why does `2 + 3 + "kg"` print `5kg` but `"Weight: " + 2 + 3` prints `Weight: 23`? A: Java evaluates `+` left to right; once a `String` operand appears, everything after becomes string concatenation.
2. Q: Is this true operator overloading like C++? A: No, Java does not allow user-defined operator overloading; only `+` has built-in dual behaviour for numbers and Strings.

---

## Practical 42: Polymorphism in Exception Hierarchies
**Concept:** Catch blocks can catch a broader exception supertype, polymorphically handling multiple specific exception subtypes.

**Question:** Catch different numeric exceptions using a common `RuntimeException` handler and specific ones first.

```java
public class ExceptionPolymorphismDemo {
    public static void main(String[] args) {
        int[] data = {10, 0};
        try {
            System.out.println(data[2] / data[1]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic problem: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index problem: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("General runtime problem: " + e.getMessage());
        }
    }
}
```
**Sample Output:**
```
Index problem: Index 2 out of bounds for length 2
```
**Viva Q&A:**
1. Q: Why must specific catch blocks come before general ones? A: Java matches catch blocks top-to-bottom; a broader supertype block placed first would swallow all subtypes, making later specific blocks unreachable (a compile error).
2. Q: What is the common superclass of all exceptions Java code typically catches? A: `Exception` (and ultimately `Throwable`).

---

# Section 6 — Exception Handling (Intermediate)

## Practical 43: try-catch-finally Basics
**Concept:** `try` wraps risky code, `catch` handles specific exceptions, `finally` always runs (cleanup), regardless of whether an exception occurred.

**Question:** Divide two numbers safely and always print a closing message.

```java
public class TryCatchFinallyDemo {
    static int safeDivide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0;
        } finally {
            System.out.println("Division attempt finished.");
        }
    }
    public static void main(String[] args) {
        System.out.println("Result: " + safeDivide(10, 0));
    }
}
```
**Sample Output:**
```
Error: / by zero
Division attempt finished.
Result: 0
```
**Viva Q&A:**
1. Q: Does `finally` run even if the `try` block has a `return` statement? A: Yes, `finally` runs before the method actually returns, unless the JVM exits or a fatal error occurs.
2. Q: What is `ArithmeticException` an example of? A: An unchecked (runtime) exception.

---

## Practical 44: Checked vs Unchecked Exceptions
**Concept:** Checked exceptions (subclasses of `Exception`, not `RuntimeException`) must be declared or caught; unchecked ones need not be.

**Question:** Throw and handle a checked `IOException`-style custom exception plus an unchecked one.

```java
import java.io.IOException;

public class CheckedUncheckedDemo {
    static void readFile(boolean exists) throws IOException {
        if (!exists) throw new IOException("File not found");
        System.out.println("Reading file...");
    }
    public static void main(String[] args) {
        try {
            readFile(false);
        } catch (IOException e) {
            System.out.println("Checked exception caught: " + e.getMessage());
        }
        try {
            int[] arr = new int[2];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked exception caught: " + e.getMessage());
        }
    }
}
```
**Sample Output:**
```
Checked exception caught: File not found
Unchecked exception caught: Index 5 out of bounds for length 2
```
**Viva Q&A:**
1. Q: Why must checked exceptions be declared with `throws`? A: The compiler enforces that callers acknowledge and handle recoverable conditions like I/O failures at compile time.
2. Q: Give an example of an unchecked exception besides array index issues. A: `NullPointerException`, `ArithmeticException`, or `IllegalArgumentException`.

---

## Practical 45: Custom (User-Defined) Exceptions
**Concept:** You can create domain-specific exceptions by extending `Exception` (checked) or `RuntimeException` (unchecked).

**Question:** Define an `InsufficientFundsException` for a withdrawal operation.

```java
class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) { super(message); }
}
class Account {
    double balance = 1000;
    void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) throw new InsufficientFundsException("Requested " + amount + " but balance is only " + balance);
        balance -= amount;
    }
}
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Account acc = new Account();
        try {
            acc.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}
```
**Sample Output:**
```
Withdrawal failed: Requested 1500.0 but balance is only 1000.0
```
**Viva Q&A:**
1. Q: Why create a custom exception instead of throwing a generic `Exception`? A: It communicates intent clearly and lets callers catch specific business errors separately from other failures.
2. Q: What must a custom exception class typically extend? A: `Exception` (checked) or `RuntimeException` (unchecked), depending on whether callers should be forced to handle it.

---

## Practical 46: Multi-Catch Blocks
**Concept:** A single `catch` clause can handle multiple unrelated exception types using `|`.

**Question:** Handle both `NumberFormatException` and `ArithmeticException` in one multi-catch block.

```java
public class MultiCatchDemo {
    static int parseAndDivide(String numerator, String denominator) {
        try {
            return Integer.parseInt(numerator) / Integer.parseInt(denominator);
        } catch (NumberFormatException | ArithmeticException e) {
            System.out.println("Input problem: " + e.getClass().getSimpleName() + " - " + e.getMessage());
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println(parseAndDivide("abc", "2"));
        System.out.println(parseAndDivide("10", "0"));
    }
}
```
**Sample Output:**
```
Input problem: NumberFormatException - For input string: "abc"
-1
Input problem: ArithmeticException - / by zero
-1
```
**Viva Q&A:**
1. Q: What is the restriction on the exception types used in a multi-catch? A: They must not be related by subclassing (one cannot be a subtype of another) in the same multi-catch clause.
2. Q: Is the caught variable in a multi-catch implicitly `final`? A: Yes, it is effectively final and cannot be reassigned inside the catch block.

---

## Practical 47: try-with-resources (AutoCloseable)
**Concept:** Resources implementing `AutoCloseable` are automatically closed at the end of a try block, even if an exception occurs.

**Question:** Implement a custom `AutoCloseable` resource and use try-with-resources.

```java
class Connection implements AutoCloseable {
    Connection() { System.out.println("Connection opened."); }
    void query(String sql) { System.out.println("Running: " + sql); }
    @Override public void close() { System.out.println("Connection closed."); }
}
public class TryWithResourcesDemo {
    public static void main(String[] args) {
        try (Connection conn = new Connection()) {
            conn.query("SELECT * FROM users");
        }
    }
}
```
**Sample Output:**
```
Connection opened.
Running: SELECT * FROM users
Connection closed.
```
**Viva Q&A:**
1. Q: What interface must a resource implement to be used in try-with-resources? A: `AutoCloseable` (or its subtype `Closeable`).
2. Q: In what order are multiple resources closed if declared together? A: In reverse order of their declaration (last opened, first closed).

---

## Practical 48: Exception Chaining (Cause)
**Concept:** A new exception can wrap an original one as its "cause", preserving the root-cause stack trace for debugging.

**Question:** Catch a low-level exception and rethrow a higher-level one with the original as cause.

```java
public class ExceptionChainingDemo {
    static void loadConfig() {
        try {
            throw new NumberFormatException("bad port value");
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to load configuration", e);
        }
    }
    public static void main(String[] args) {
        try {
            loadConfig();
        } catch (RuntimeException e) {
            System.out.println("Top-level error: " + e.getMessage());
            System.out.println("Caused by: " + e.getCause());
        }
    }
}
```
**Sample Output:**
```
Top-level error: Failed to load configuration
Caused by: java.lang.NumberFormatException: bad port value
```
**Viva Q&A:**
1. Q: Why is exception chaining useful? A: It preserves the original root cause while allowing higher layers to throw more meaningful, context-specific exceptions.
2. Q: Which method retrieves the wrapped original exception? A: `getCause()`.

---

## Practical 49: Custom Exception Hierarchies
**Concept:** You can build a hierarchy of related custom exceptions for fine-grained or broad catching.

**Question:** Create a base `ValidationException` with two subtypes, then catch broadly and specifically.

```java
class ValidationException extends RuntimeException { ValidationException(String m) { super(m); } }
class EmptyFieldException extends ValidationException { EmptyFieldException(String field) { super(field + " cannot be empty"); } }
class OutOfRangeException extends ValidationException { OutOfRangeException(String field) { super(field + " is out of range"); } }

public class ExceptionHierarchyDemo {
    static void validateAge(int age) {
        if (age == 0) throw new EmptyFieldException("Age");
        if (age < 0 || age > 120) throw new OutOfRangeException("Age");
    }
    public static void main(String[] args) {
        try {
            validateAge(200);
        } catch (ValidationException e) {
            System.out.println("Validation failed (" + e.getClass().getSimpleName() + "): " + e.getMessage());
        }
    }
}
```
**Sample Output:**
```
Validation failed (OutOfRangeException): Age is out of range
```
**Viva Q&A:**
1. Q: What is the benefit of a shared `ValidationException` base class? A: Callers who don't care about the exact subtype can catch the broad base type in one place.
2. Q: Could `getClass().getSimpleName()` be used to branch behaviour instead of separate catch blocks? A: It's possible but generally discouraged — using distinct catch blocks or polymorphic exception behaviour is cleaner than type-name string checks.

---

## Practical 50: Stack Traces and `printStackTrace()`
**Concept:** Every exception carries a stack trace showing the call path where it was thrown, useful for debugging.

**Question:** Trigger a nested method call chain that throws, and print the stack trace.

```java
public class StackTraceDemo {
    static void levelThree() { throw new IllegalStateException("Something broke deep inside"); }
    static void levelTwo() { levelThree(); }
    static void levelOne() { levelTwo(); }

    public static void main(String[] args) {
        try {
            levelOne();
        } catch (IllegalStateException e) {
            System.out.println("Caught: " + e.getMessage());
            System.out.println("Stack trace element count: " + e.getStackTrace().length);
        }
    }
}
```
**Sample Output:**
```
Caught: Something broke deep inside
Stack trace element count: 4
```
**Viva Q&A:**
1. Q: What does `e.printStackTrace()` print? A: The exception type/message plus the full call stack of method invocations leading to where it was thrown.
2. Q: Why should production code avoid `printStackTrace()` alone? A: It writes to `System.err` without structured logging; a proper logging framework (e.g., SLF4J) is preferred for real applications.

---

## Practical 51: Rethrowing and the `throws` Clause
**Concept:** A method may partially handle an exception (e.g., logging) and rethrow it, declared via `throws`.

**Question:** Log an error inside a method, then rethrow it to the caller.

```java
public class RethrowDemo {
    static void process(int value) throws Exception {
        try {
            if (value < 0) throw new Exception("Negative value: " + value);
        } catch (Exception e) {
            System.out.println("[LOG] " + e.getMessage());
            throw e; // rethrow after logging
        }
    }
    public static void main(String[] args) {
        try {
            process(-10);
        } catch (Exception e) {
            System.out.println("Caller handled: " + e.getMessage());
        }
    }
}
```
**Sample Output:**
```
[LOG] Negative value: -10
Caller handled: Negative value: -10
```
**Viva Q&A:**
1. Q: Why rethrow after logging instead of just swallowing the exception? A: To keep both a diagnostic log at the point of failure and let the caller still respond appropriately to the error.
2. Q: What is required on a method signature that can throw a checked exception it doesn't fully handle? A: A `throws ExceptionType` clause declaring it to callers.

---

## Practical 52: Global Exception Handling Pattern (Simplified)
**Concept:** Larger applications centralize exception handling (e.g., a single handler layer) instead of scattering try-catch everywhere.

**Question:** Simulate a simple centralized handler that maps exception types to user-friendly messages.

```java
import java.util.*;
import java.util.function.Function;

public class GlobalExceptionHandlerDemo {
    static final Map<Class<? extends Exception>, Function<Exception, String>> HANDLERS = new HashMap<>();
    static {
        HANDLERS.put(ArithmeticException.class, e -> "Math error: " + e.getMessage());
        HANDLERS.put(NullPointerException.class, e -> "Missing data error.");
    }
    static String handle(Exception e) {
        return HANDLERS.getOrDefault(e.getClass(), ex -> "Unexpected error: " + ex.getMessage()).apply(e);
    }
    public static void main(String[] args) {
        System.out.println(handle(new ArithmeticException("/ by zero")));
        System.out.println(handle(new NullPointerException()));
        System.out.println(handle(new IllegalStateException("bad state")));
    }
}
```
**Sample Output:**
```
Math error: / by zero
Missing data error.
Unexpected error: bad state
```
**Viva Q&A:**
1. Q: What real-world Java frameworks use a similar centralized approach? A: Spring's `@ControllerAdvice`/`@ExceptionHandler` centralizes REST API exception handling similarly.
2. Q: Why key the map by `Class<? extends Exception>`? A: To look up the right handling strategy based on the exact runtime type of the exception.

---

# Section 7 — Collections Framework (Intermediate–Advanced)

## Practical 53: ArrayList Basics
**Concept:** `ArrayList` is a resizable, index-based list backed by an array.

**Question:** Add, remove, and iterate over an `ArrayList` of Strings.

```java
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(List.of("Apple", "Banana", "Mango"));
        fruits.add("Grapes");
        fruits.remove("Banana");
        for (String f : fruits) System.out.println(f);
        System.out.println("Size: " + fruits.size());
    }
}
```
**Sample Output:**
```
Apple
Mango
Grapes
Size: 3
```
**Viva Q&A:**
1. Q: What is the time complexity of `ArrayList.get(index)`? A: O(1) — constant time, since it's backed by an array.
2. Q: What is the time complexity of inserting at the front of an `ArrayList`? A: O(n), because subsequent elements must shift right.

---

## Practical 54: LinkedList and Deque Operations
**Concept:** `LinkedList` implements both `List` and `Deque`, efficient for insert/remove at both ends.

**Question:** Use a `LinkedList` as a double-ended queue.

```java
import java.util.*;
public class LinkedListDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        System.out.println("Deque: " + deque);
        System.out.println("Removed from front: " + deque.pollFirst());
        System.out.println("Removed from back: " + deque.pollLast());
        System.out.println("Remaining: " + deque);
    }
}
```
**Sample Output:**
```
Deque: [5, 10, 20]
Removed from front: 5
Removed from back: 20
Remaining: [10]
```
**Viva Q&A:**
1. Q: When is `LinkedList` preferable to `ArrayList`? A: When frequent insertions/removals happen at the beginning or middle, since it avoids shifting elements.
2. Q: What two interfaces does `LinkedList` implement that make it versatile? A: `List` and `Deque` (it can act as a list, stack, or queue).

---

## Practical 55: HashMap Basics
**Concept:** `HashMap` stores key-value pairs with O(1) average-case lookup, no guaranteed order.

**Question:** Count word frequency in a sentence using a `HashMap`.

```java
import java.util.*;
public class HashMapDemo {
    public static void main(String[] args) {
        String[] words = "the quick brown fox the lazy fox".split(" ");
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) freq.merge(w, 1, Integer::sum);
        for (Map.Entry<String, Integer> e : freq.entrySet())
            System.out.println(e.getKey() + " -> " + e.getValue());
    }
}
```
**Sample Output:**
```
the -> 2
quick -> 1
brown -> 1
fox -> 2
lazy -> 1
```
**Viva Q&A:**
1. Q: What does `merge(key, 1, Integer::sum)` do? A: If the key exists, it adds 1 to the existing value via the merge function; otherwise it inserts the key with value 1.
2. Q: Does `HashMap` guarantee iteration order? A: No — use `LinkedHashMap` (insertion order) or `TreeMap` (sorted order) if order matters.

---

## Practical 56: TreeMap and Sorted Collections
**Concept:** `TreeMap`/`TreeSet` keep elements sorted (by natural order or a Comparator) using a red-black tree.

**Question:** Store student scores sorted by name using `TreeMap`.

```java
import java.util.*;
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();
        scores.put("Zara", 88);
        scores.put("Amal", 92);
        scores.put("Kavi", 75);
        System.out.println("Sorted by name: " + scores);
        System.out.println("First entry: " + scores.firstEntry());
        System.out.println("Last entry: " + scores.lastEntry());
    }
}
```
**Sample Output:**
```
Sorted by name: {Amal=92, Kavi=75, Zara=88}
First entry: Amal=92
Last entry: Zara=88
```
**Viva Q&A:**
1. Q: What is the time complexity of `TreeMap` operations? A: O(log n) for get/put/remove, due to the underlying balanced tree.
2. Q: What interface must keys implement (or a Comparator be supplied) for `TreeMap`? A: `Comparable`, unless a `Comparator` is passed to the constructor.

---

## Practical 57: HashSet and TreeSet — Removing Duplicates
**Concept:** `Set` implementations disallow duplicate elements; `HashSet` is unordered, `TreeSet` is sorted.

**Question:** Remove duplicates from a list and sort the result.

```java
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 2, 7, 2, 9, 4, 1);
        Set<Integer> unique = new HashSet<>(numbers);
        Set<Integer> sortedUnique = new TreeSet<>(numbers);
        System.out.println("HashSet (no dup, no order): " + unique.size() + " elements");
        System.out.println("TreeSet (no dup, sorted): " + sortedUnique);
    }
}
```
**Sample Output:**
```
HashSet (no dup, no order): 5 elements
TreeSet (no dup, sorted): [1, 2, 4, 7, 9]
```
**Viva Q&A:**
1. Q: What makes an object eligible to be stored uniquely in a `HashSet`? A: A correct, consistent implementation of `equals()` and `hashCode()`.
2. Q: Which Set implementation preserves insertion order? A: `LinkedHashSet`.

---

## Practical 58: Iterator and ConcurrentModificationException
**Concept:** Modifying a collection while iterating with a for-each loop throws `ConcurrentModificationException`; use `Iterator.remove()` instead.

**Question:** Safely remove even numbers from a list while iterating.

```java
import java.util.*;
public class IteratorRemovalDemo {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6));
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            if (it.next() % 2 == 0) it.remove();
        }
        System.out.println("Odd numbers only: " + numbers);
    }
}
```
**Sample Output:**
```
Odd numbers only: [1, 3, 5]
```
**Viva Q&A:**
1. Q: Why does modifying a list during a for-each loop fail? A: The for-each loop uses an internal iterator whose fail-fast check detects the list's modification count changed unexpectedly, throwing `ConcurrentModificationException`.
2. Q: What alternative modern approach avoids manual iterator handling here? A: `list.removeIf(n -> n % 2 == 0)`.

---

## Practical 59: PriorityQueue
**Concept:** `PriorityQueue` is a heap-based queue that always dequeues the smallest (or custom-ordered) element first.

**Question:** Simulate a hospital triage queue prioritizing lower severity numbers first.

```java
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
```
**Sample Output:**
```
Treating: Dilani (severity 1)
Treating: Saman (severity 2)
Treating: Ruwan (severity 3)
```
**Viva Q&A:**
1. Q: What is the default ordering of a `PriorityQueue` without a Comparator? A: Natural ordering (smallest first), requiring elements to implement `Comparable`.
2. Q: What is the time complexity of `poll()` on a `PriorityQueue`? A: O(log n).

---

## Practical 60: Stack and Queue via Deque
**Concept:** `Deque` is the recommended modern replacement for the legacy `Stack` class, supporting both LIFO and FIFO usage.

**Question:** Check for balanced parentheses using a `Deque` as a stack.

```java
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
```
**Sample Output:**
```
(a+b)*(c-d): true
((a+b): false
```
**Viva Q&A:**
1. Q: Why is `ArrayDeque` generally preferred over the legacy `Stack` class? A: `Stack` extends `Vector` and is synchronized (slower, legacy); `ArrayDeque` is faster and is the recommended modern stack/queue implementation.
2. Q: What does `push()` do on an `ArrayDeque` used as a stack? A: It adds the element at the head, mimicking LIFO stack push behaviour.

---

## Practical 61: Collections Utility Class
**Concept:** `java.util.Collections` provides static helper methods: sorting, shuffling, min/max, immutability wrappers, etc.

**Question:** Demonstrate `sort`, `reverse`, `max`, and `frequency`.

```java
import java.util.*;
public class CollectionsUtilityDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 3, 8, 3, 1, 9, 3));
        Collections.sort(nums);
        System.out.println("Sorted: " + nums);
        Collections.reverse(nums);
        System.out.println("Reversed: " + nums);
        System.out.println("Max: " + Collections.max(nums));
        System.out.println("Frequency of 3: " + Collections.frequency(nums, 3));
    }
}
```
**Sample Output:**
```
Sorted: [1, 3, 3, 3, 5, 8, 9]
Reversed: [9, 8, 5, 3, 3, 3, 1]
Max: 9
Frequency of 3: 3
```
**Viva Q&A:**
1. Q: How does `Collections.unmodifiableList` differ from `List.of()`? A: `unmodifiableList` wraps an existing (possibly mutable) list read-only view; `List.of()` creates a genuinely immutable list directly and disallows `null` elements.
2. Q: What algorithm does `Collections.sort` use under the hood for objects? A: A variant of merge sort/TimSort, guaranteeing O(n log n) and stability.

---

## Practical 62: Custom Objects in Collections (equals/hashCode reliance)
**Concept:** Correctly relying on `equals`/`hashCode` is essential for custom objects used as `HashMap` keys or in `HashSet`.

**Question:** Use a custom `Coordinate` class as a `HashMap` key.

```java
import java.util.*;
public class CustomKeyDemo {
    record Coordinate(int x, int y) { } // records auto-generate equals/hashCode

    public static void main(String[] args) {
        Map<Coordinate, String> grid = new HashMap<>();
        grid.put(new Coordinate(0, 0), "Origin");
        grid.put(new Coordinate(1, 1), "Diagonal");

        System.out.println(grid.get(new Coordinate(0, 0))); // works due to record equals/hashCode
    }
}
```
**Sample Output:**
```
Origin
```
**Viva Q&A:**
1. Q: Why do Java `record`s work well as map keys out of the box? A: Records automatically generate `equals()`, `hashCode()`, and `toString()` based on their components.
2. Q: What breaks if a mutable object used as a `HashMap` key changes its fields after insertion? A: Its hash code may change, making it impossible to correctly find the entry again — the entry becomes effectively "lost".

---

# Section 8 — Generics (Advanced)

## Practical 63: Generic Classes
**Concept:** Generics let a class work with any type while preserving compile-time type safety, avoiding casts.

**Question:** Build a generic `Box<T>` container.

```java
public class Box<T> {
    private T content;
    public void set(T content) { this.content = content; }
    public T get() { return content; }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello Generics");
        System.out.println(stringBox.get());

        Box<Integer> intBox = new Box<>();
        intBox.set(100);
        System.out.println(intBox.get());
    }
}
```
**Sample Output:**
```
Hello Generics
100
```
**Viva Q&A:**
1. Q: What problem do generics solve compared to using `Object`? A: They provide compile-time type checking, eliminating the need for manual casts and preventing `ClassCastException` at runtime.
2. Q: What is "type erasure"? A: The JVM removes generic type information at runtime (via compiler-inserted casts), so generic type parameters don't exist in the compiled bytecode.

---

## Practical 64: Generic Methods
**Concept:** A method can declare its own type parameter, independent of the class it belongs to.

**Question:** Write a generic method that finds the maximum element in any array of `Comparable` items.

```java
public class GenericMethodDemo {
    static <T extends Comparable<T>> T findMax(T[] items) {
        T max = items[0];
        for (T item : items) if (item.compareTo(max) > 0) max = item;
        return max;
    }
    public static void main(String[] args) {
        Integer[] nums = {3, 7, 2, 9, 4};
        String[] words = {"banana", "apple", "cherry"};
        System.out.println("Max number: " + findMax(nums));
        System.out.println("Max word: " + findMax(words));
    }
}
```
**Sample Output:**
```
Max number: 9
Max word: cherry
```
**Viva Q&A:**
1. Q: What does `<T extends Comparable<T>>` mean? A: A bounded type parameter — `T` must implement `Comparable<T>`, guaranteeing elements can be compared with `compareTo`.
2. Q: Can generic methods be static? A: Yes — the type parameter is declared before the return type, independent of any class-level generics.

---

## Practical 65: Bounded Type Parameters
**Concept:** `<T extends SomeClass>` restricts what types can be used, allowing calls to methods defined on the bound.

**Question:** Write a generic method that sums any list of `Number` subtypes.

```java
import java.util.*;
public class BoundedTypeDemo {
    static double sumAll(List<? extends Number> numbers) {
        double total = 0;
        for (Number n : numbers) total += n.doubleValue();
        return total;
    }
    public static void main(String[] args) {
        System.out.println("Sum of ints: " + sumAll(List.of(1, 2, 3)));
        System.out.println("Sum of doubles: " + sumAll(List.of(1.5, 2.5, 3.0)));
    }
}
```
**Sample Output:**
```
Sum of ints: 6.0
Sum of doubles: 7.0
```
**Viva Q&A:**
1. Q: What does the bound `? extends Number` guarantee? A: The list contains some unknown subtype of `Number`, so elements can safely be read as `Number` (but not added to, except `null`).
2. Q: Why is this called an "upper bounded wildcard"? A: It restricts the unknown type to be `Number` or any of its subclasses — an upper limit on the type hierarchy.

---

## Practical 66: Wildcards — `? extends` vs `? super`
**Concept:** `? extends T` (producer, read-only) and `? super T` (consumer, write-only) follow the PECS principle (Producer Extends, Consumer Super).

**Question:** Copy elements from a source list (`? extends T`) into a destination list (`? super T`).

```java
import java.util.*;
public class PecsDemo {
    static <T> void copy(List<? extends T> source, List<? super T> destination) {
        for (T item : source) destination.add(item);
    }
    public static void main(String[] args) {
        List<Integer> source = List.of(1, 2, 3);
        List<Number> destination = new ArrayList<>();
        copy(source, destination);
        System.out.println("Destination: " + destination);
    }
}
```
**Sample Output:**
```
Destination: [1, 2, 3]
```
**Viva Q&A:**
1. Q: What does "PECS" stand for? A: Producer Extends, Consumer Super — use `extends` when reading from a structure, `super` when writing into it.
2. Q: Why can't you add to a `List<? extends T>`? A: The compiler can't guarantee the exact runtime type, so adding any specific type (except `null`) is unsafe and disallowed.

---

## Practical 67: Generic Interfaces
**Concept:** Interfaces can be parameterized too, e.g., a generic `Repository<T, ID>` pattern common in real applications.

**Question:** Define a generic `Repository<T, ID>` interface and a simple in-memory implementation.

```java
import java.util.*;
interface Repository<T, ID> {
    void save(ID id, T item);
    T findById(ID id);
}
class InMemoryUserRepository implements Repository<String, Integer> {
    private final Map<Integer, String> store = new HashMap<>();
    @Override public void save(Integer id, String item) { store.put(id, item); }
    @Override public String findById(Integer id) { return store.get(id); }
}
public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Repository<String, Integer> repo = new InMemoryUserRepository();
        repo.save(1, "Nimesha");
        System.out.println("User 1: " + repo.findById(1));
    }
}
```
**Sample Output:**
```
User 1: Nimesha
```
**Viva Q&A:**
1. Q: Why is this pattern (`Repository<T, ID>`) common in real frameworks? A: It generalizes data-access logic (like Spring Data's `CrudRepository<T, ID>`) across any entity and identifier type.
2. Q: Can a class implement a generic interface with a concrete type argument? A: Yes, as shown — `InMemoryUserRepository` binds `T=String, ID=Integer` concretely.

---

## Practical 68: Generic Stack Implementation
**Concept:** Combine generics with a classic data structure to build a fully type-safe custom `Stack<T>`.

**Question:** Implement a simple generic stack backed by an `ArrayList`.

```java
import java.util.*;
public class GenericStack<T> {
    private final List<T> elements = new ArrayList<>();

    public void push(T item) { elements.add(item); }
    public T pop() {
        if (elements.isEmpty()) throw new NoSuchElementException("Stack is empty");
        return elements.remove(elements.size() - 1);
    }
    public boolean isEmpty() { return elements.isEmpty(); }

    public static void main(String[] args) {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("first");
        stack.push("second");
        stack.push("third");
        while (!stack.isEmpty()) System.out.println("Popped: " + stack.pop());
    }
}
```
**Sample Output:**
```
Popped: third
Popped: second
Popped: first
```
**Viva Q&A:**
1. Q: Why write a custom generic stack when `Deque` already exists? A: Educational purposes — understanding how generic, type-safe data structures are built internally.
2. Q: What exception is idiomatic when popping from an empty collection? A: `NoSuchElementException`.

---

# Section 9 — Multithreading and Concurrency (Advanced)

## Practical 69: Creating Threads — Thread vs Runnable
**Concept:** A thread can be created by extending `Thread` or (preferably) implementing `Runnable` and passing it to a `Thread`.

**Question:** Create two threads that print numbers concurrently.

```java
class CounterTask implements Runnable {
    String label;
    CounterTask(String label) { this.label = label; }
    @Override public void run() {
        for (int i = 1; i <= 3; i++) System.out.println(label + ": " + i);
    }
}
public class ThreadBasicsDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new CounterTask("Thread-A"));
        Thread t2 = new Thread(new CounterTask("Thread-B"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("Both threads finished.");
    }
}
```
**Sample Output (order may interleave):**
```
Thread-A: 1
Thread-B: 1
Thread-A: 2
Thread-B: 2
Thread-A: 3
Thread-B: 3
Both threads finished.
```
**Viva Q&A:**
1. Q: Why is implementing `Runnable` generally preferred over extending `Thread`? A: Java doesn't support multiple inheritance; implementing `Runnable` keeps the class free to extend something else, and separates "the task" from "the thread mechanism".
2. Q: What does `join()` do? A: It blocks the calling thread until the target thread finishes execution.

---

## Practical 70: Synchronization and Race Conditions
**Concept:** Without synchronization, concurrent access to shared mutable state can produce a race condition and lost updates.

**Question:** Demonstrate a race condition on a shared counter, then fix it with `synchronized`.

```java
public class SynchronizationDemo {
    static int counter = 0;
    static synchronized void increment() { counter++; }

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 0; i < 10000; i++) increment(); };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final counter (should be 20000): " + counter);
    }
}
```
**Sample Output:**
```
Final counter (should be 20000): 20000
```
**Viva Q&A:**
1. Q: What is a race condition? A: A bug that occurs when multiple threads access/modify shared state concurrently without coordination, producing unpredictable results.
2. Q: What does the `synchronized` keyword do here? A: It ensures only one thread at a time can execute `increment()`, preventing lost updates via mutual exclusion (a monitor lock).

---

## Practical 71: The `ExecutorService` Thread Pool
**Concept:** `ExecutorService` manages a pool of reusable threads, avoiding the overhead of manually creating/destroying threads for every task.

**Question:** Submit multiple tasks to a fixed thread pool.

```java
import java.util.concurrent.*;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            pool.submit(() -> System.out.println("Task " + taskId + " running on " + Thread.currentThread().getName()));
        }
        pool.shutdown();
        pool.awaitTermination(5, TimeUnit.SECONDS);
        System.out.println("All tasks completed.");
    }
}
```
**Sample Output (thread names vary):**
```
Task 1 running on pool-1-thread-1
Task 2 running on pool-1-thread-2
Task 3 running on pool-1-thread-3
Task 4 running on pool-1-thread-1
Task 5 running on pool-1-thread-2
All tasks completed.
```
**Viva Q&A:**
1. Q: Why prefer `ExecutorService` over manually managed `Thread` objects? A: It reuses a bounded pool of threads efficiently, manages queuing/scheduling, and simplifies lifecycle management (shutdown, awaiting termination).
2. Q: What must you always call to release an `ExecutorService`'s resources? A: `shutdown()` (or `shutdownNow()`), otherwise the JVM may not exit and threads stay alive.

---

## Practical 72: `Callable` and `Future`
**Concept:** Unlike `Runnable`, `Callable<V>` can return a value and throw checked exceptions; `Future<V>` represents the pending result.

**Question:** Submit a `Callable` that computes a factorial and retrieve its result.

```java
import java.util.concurrent.*;

public class CallableFutureDemo {
    public static void main(String[] args) throws Exception {
        ExecutorService pool = Executors.newSingleThreadExecutor();
        Callable<Long> factorialTask = () -> {
            long result = 1;
            for (int i = 1; i <= 10; i++) result *= i;
            return result;
        };
        Future<Long> future = pool.submit(factorialTask);
        System.out.println("10! = " + future.get());
        pool.shutdown();
    }
}
```
**Sample Output:**
```
10! = 3628800
```
**Viva Q&A:**
1. Q: What does `future.get()` do if the task isn't finished yet? A: It blocks the calling thread until the result becomes available (or throws if the task failed/was cancelled).
2. Q: Can `Callable.call()` throw checked exceptions, unlike `Runnable.run()`? A: Yes, `Callable<V>.call()` is declared to throw `Exception`, while `Runnable.run()` cannot throw checked exceptions.

---

## Practical 73: `CompletableFuture` — Async Pipelines
**Concept:** `CompletableFuture` supports composable, non-blocking asynchronous pipelines with chained transformations.

**Question:** Chain an async computation with `thenApply` and `thenAccept`.

```java
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
```
**Sample Output:**
```
Final result: 51
```
**Viva Q&A:**
1. Q: What is the benefit of `CompletableFuture` over plain `Future`? A: It supports non-blocking chaining/composition (`thenApply`, `thenCompose`, `thenCombine`) instead of requiring a blocking `get()` call.
2. Q: What does `thenApply` do compared to `thenAccept`? A: `thenApply` transforms the result and returns a new `CompletableFuture`; `thenAccept` consumes the result without returning a new value.

---

## Practical 74: Producer-Consumer with `BlockingQueue`
**Concept:** `BlockingQueue` provides thread-safe blocking `put`/`take` operations, ideal for producer-consumer coordination.

**Question:** Implement a simple producer-consumer using `ArrayBlockingQueue`.

```java
import java.util.concurrent.*;

public class ProducerConsumerDemo {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);

        Thread producer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                try { queue.put(i); System.out.println("Produced: " + i); }
                catch (InterruptedException ignored) { }
            }
        });
        Thread consumer = new Thread(() -> {
            for (int i = 1; i <= 3; i++) {
                try { System.out.println("Consumed: " + queue.take()); }
                catch (InterruptedException ignored) { }
            }
        });
        producer.start(); consumer.start();
        producer.join(); consumer.join();
    }
}
```
**Sample Output (order may vary slightly):**
```
Produced: 1
Consumed: 1
Produced: 2
Consumed: 2
Produced: 3
Consumed: 3
```
**Viva Q&A:**
1. Q: What happens when `put()` is called on a full `BlockingQueue`? A: The calling thread blocks until space becomes available.
2. Q: What happens when `take()` is called on an empty `BlockingQueue`? A: The calling thread blocks until an element becomes available.

---

## Practical 75: `volatile` Keyword
**Concept:** `volatile` guarantees visibility of a variable's latest value across threads, without providing atomicity/mutual exclusion.

**Question:** Use a `volatile` flag to stop a worker thread safely from another thread.

```java
public class VolatileDemo {
    static volatile boolean running = true;

    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            int count = 0;
            while (running) { count++; }
            System.out.println("Worker stopped after observing count ~ " + count);
        });
        worker.start();
        Thread.sleep(50);
        running = false; // visible to worker thread immediately due to volatile
        worker.join();
        System.out.println("Main thread finished.");
    }
}
```
**Sample Output (count varies):**
```
Worker stopped after observing count ~ 5123456
Main thread finished.
```
**Viva Q&A:**
1. Q: Does `volatile` make compound operations like `count++` atomic? A: No — `volatile` only ensures visibility, not atomicity; use `AtomicInteger` or synchronization for compound operations.
2. Q: Why might the worker loop run forever without `volatile`? A: Without it, the JIT compiler/CPU cache might let the worker thread never observe the updated value of `running` from another thread.

---

## Practical 76: `AtomicInteger` — Lock-Free Thread Safety
**Concept:** `java.util.concurrent.atomic` classes provide lock-free, atomic operations using CAS (compare-and-swap).

**Question:** Replace a `synchronized` counter with `AtomicInteger`.

```java
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerDemo {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Runnable task = () -> { for (int i = 0; i < 10000; i++) counter.incrementAndGet(); };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("Final count: " + counter.get());
    }
}
```
**Sample Output:**
```
Final count: 20000
```
**Viva Q&A:**
1. Q: What does "CAS" stand for and how does it help avoid locks? A: Compare-And-Swap — the CPU atomically updates a value only if it still matches an expected old value, retrying otherwise, avoiding traditional locks.
2. Q: When might `synchronized` still be preferable to atomics? A: When multiple related variables must be updated together consistently (a single atomic variable can't coordinate multi-field invariants).

---

## Practical 77: Deadlock Demonstration and Avoidance
**Concept:** A deadlock occurs when two or more threads wait forever for locks held by each other; consistent lock ordering avoids it.

**Question:** Show a deadlock-prone design conceptually and the fix using ordered locking.

```java
public class DeadlockAvoidanceDemo {
    static final Object lockA = new Object();
    static final Object lockB = new Object();

    static void safeTransfer(boolean firstA) {
        // Always acquire lockA before lockB, regardless of caller, to avoid circular wait
        synchronized (lockA) {
            System.out.println(Thread.currentThread().getName() + " acquired lockA");
            synchronized (lockB) {
                System.out.println(Thread.currentThread().getName() + " acquired lockB");
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> safeTransfer(true), "T1");
        Thread t2 = new Thread(() -> safeTransfer(false), "T2");
        t1.start(); t2.start();
        t1.join(); t2.join();
        System.out.println("No deadlock occurred.");
    }
}
```
**Sample Output:**
```
T1 acquired lockA
T1 acquired lockB
T2 acquired lockA
T2 acquired lockB
No deadlock occurred.
```
**Viva Q&A:**
1. Q: What are the four classic conditions required for deadlock? A: Mutual exclusion, hold-and-wait, no preemption, and circular wait.
2. Q: What is the simplest common strategy to prevent deadlock among multiple locks? A: Always acquire multiple locks in a fixed, consistent global order across all threads.

---

## Practical 78: Thread States and `Thread.sleep`
**Concept:** A Java thread moves through states: NEW, RUNNABLE, BLOCKED, WAITING, TIMED_WAITING, TERMINATED.

**Question:** Observe a thread's state before, during, and after execution.

```java
public class ThreadStateDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread worker = new Thread(() -> {
            try { Thread.sleep(200); } catch (InterruptedException ignored) { }
        });
        System.out.println("Before start: " + worker.getState());
        worker.start();
        Thread.sleep(50);
        System.out.println("While sleeping: " + worker.getState());
        worker.join();
        System.out.println("After finish: " + worker.getState());
    }
}
```
**Sample Output:**
```
Before start: NEW
While sleeping: TIMED_WAITING
After finish: TERMINATED
```
**Viva Q&A:**
1. Q: What state is a thread in while waiting to acquire a contended lock? A: `BLOCKED`.
2. Q: What's the difference between `WAITING` and `TIMED_WAITING`? A: `WAITING` blocks indefinitely until notified (e.g., `wait()` with no timeout); `TIMED_WAITING` blocks for a bounded time (e.g., `sleep(ms)` or `wait(timeout)`).

---

# Section 10 — File Handling and I/O (Advanced)

## Practical 79: Writing and Reading Text Files
**Concept:** `java.nio.file.Files` offers simple static methods for reading/writing whole files.

**Question:** Write a list of lines to a file, then read them back.

```java
import java.nio.file.*;
import java.util.*;
import java.io.IOException;

public class FileWriteReadDemo {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("notes.txt");
        List<String> lines = List.of("Learn Java", "Practice OOP", "Build projects");
        Files.write(file, lines);

        List<String> readBack = Files.readAllLines(file);
        readBack.forEach(System.out::println);

        Files.deleteIfExists(file); // cleanup
    }
}
```
**Sample Output:**
```
Learn Java
Practice OOP
Build projects
```
**Viva Q&A:**
1. Q: What package provides the modern (post-Java 7) file API? A: `java.nio.file` (NIO.2), including `Path`, `Paths`, and `Files`.
2. Q: What older stream classes were commonly used for text files before NIO.2? A: `FileReader`/`BufferedReader` for reading, `FileWriter`/`BufferedWriter` for writing.

---

## Practical 80: BufferedReader for Line-by-Line Processing
**Concept:** `BufferedReader` wraps a `Reader` to efficiently read text line by line, reducing I/O calls.

**Question:** Read a file's contents line by line, numbering each line.

```java
import java.io.*;
import java.nio.file.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("poem.txt");
        Files.write(file, "Roses are red\nViolets are blue\n".getBytes());

        try (BufferedReader br = new BufferedReader(new FileReader(file.toFile()))) {
            String line;
            int lineNo = 1;
            while ((line = br.readLine()) != null) {
                System.out.println(lineNo++ + ": " + line);
            }
        }
        Files.deleteIfExists(file);
    }
}
```
**Sample Output:**
```
1: Roses are red
2: Violets are blue
```
**Viva Q&A:**
1. Q: Why wrap a `FileReader` with `BufferedReader`? A: `BufferedReader` reduces the number of costly underlying I/O calls by reading larger chunks into an internal buffer and exposing convenient `readLine()`.
2. Q: What does `readLine()` return at end-of-file? A: `null`.

---

## Practical 81: Serialization and Deserialization
**Concept:** Implementing `Serializable` allows an object's state to be converted to a byte stream and restored later.

**Question:** Serialize a `Student` object to a file, then deserialize it back.

```java
import java.io.*;

class Student implements Serializable {
    private static final long serialVersionUID = 1L;
    String name; int age;
    Student(String name, int age) { this.name = name; this.age = age; }
    @Override public String toString() { return name + " (" + age + ")"; }
}

public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s = new Student("Hasini", 22);
        File file = new File("student.ser");

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(s);
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            Student restored = (Student) in.readObject();
            System.out.println("Restored: " + restored);
        }
        file.delete();
    }
}
```
**Sample Output:**
```
Restored: Hasini (22)
```
**Viva Q&A:**
1. Q: What is `serialVersionUID` used for? A: A version identifier used to verify that a serialized object's class is compatible with the loaded class definition during deserialization.
2. Q: What keyword excludes a field from serialization? A: `transient`.

---

## Practical 82: Reading CSV-Style Data
**Concept:** Structured text data (like CSV) can be parsed manually with `String.split()` for simple cases.

**Question:** Parse a small in-memory CSV of employee records and compute total salary.

```java
import java.util.*;

public class CsvParsingDemo {
    public static void main(String[] args) {
        List<String> csvLines = List.of(
            "name,salary",
            "Anushka,85000",
            "Ridma,92000",
            "Vinuka,78000"
        );
        double total = 0;
        for (int i = 1; i < csvLines.size(); i++) { // skip header
            String[] parts = csvLines.get(i).split(",");
            String name = parts[0];
            double salary = Double.parseDouble(parts[1]);
            System.out.println(name + " earns " + salary);
            total += salary;
        }
        System.out.println("Total payroll: " + total);
    }
}
```
**Sample Output:**
```
Anushka earns 85000.0
Ridma earns 92000.0
Vinuka earns 78000.0
Total payroll: 255000.0
```
**Viva Q&A:**
1. Q: What's a limitation of splitting CSV lines by comma naively? A: It breaks on quoted fields containing commas; a proper CSV parser (or library like Apache Commons CSV) handles quoting/escaping correctly.
2. Q: Why skip index 0 in the loop? A: It's the header row (column names), not actual data.

---

## Practical 83: File and Directory Operations with `java.nio.file`
**Concept:** `Files` and `Path` support checking existence, creating directories, listing contents, and copying files.

**Question:** Create a directory, write a file inside it, then list the directory's contents.

```java
import java.nio.file.*;
import java.io.IOException;
import java.util.stream.Stream;

public class DirectoryOpsDemo {
    public static void main(String[] args) throws IOException {
        Path dir = Path.of("demo_folder");
        Files.createDirectories(dir);
        Files.writeString(dir.resolve("a.txt"), "File A");
        Files.writeString(dir.resolve("b.txt"), "File B");

        try (Stream<Path> entries = Files.list(dir)) {
            entries.forEach(p -> System.out.println("Found: " + p.getFileName()));
        }

        Files.walk(dir).sorted(java.util.Comparator.reverseOrder()).forEach(p -> {
            try { Files.delete(p); } catch (IOException ignored) { }
        });
    }
}
```
**Sample Output:**
```
Found: a.txt
Found: b.txt
```
**Viva Q&A:**
1. Q: Why delete files in reverse sorted order when cleaning up a directory tree? A: Directories must be empty before deletion, so deleting deepest paths (files) before their parent directories avoids errors.
2. Q: What does `Files.createDirectories` do differently from `Files.createDirectory`? A: `createDirectories` also creates any missing parent directories; `createDirectory` fails if the parent doesn't already exist.

---

## Practical 84: Try-With-Resources for Multiple Streams (Copying a File)
**Concept:** Multiple resources can be declared in one try-with-resources statement, all auto-closed safely.

**Question:** Copy a text file's content byte-by-byte using input/output streams.

```java
import java.io.*;
import java.nio.file.*;

public class FileCopyDemo {
    public static void main(String[] args) throws IOException {
        Path source = Path.of("source.txt");
        Path destination = Path.of("destination.txt");
        Files.writeString(source, "Copy this content please.");

        try (InputStream in = new FileInputStream(source.toFile());
             OutputStream out = new FileOutputStream(destination.toFile())) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
        System.out.println("Copied content: " + Files.readString(destination));

        Files.deleteIfExists(source);
        Files.deleteIfExists(destination);
    }
}
```
**Sample Output:**
```
Copied content: Copy this content please.
```
**Viva Q&A:**
1. Q: In what order are resources closed when multiple are declared in one try-with-resources? A: In reverse of declaration order — `out` closes before `in` here.
2. Q: What simpler one-liner could replace this manual byte-copy loop? A: `Files.copy(source, destination)`.

---

# Section 11 — Java 8+ Streams, Lambdas, and Functional Interfaces (Advanced)

## Practical 85: Lambda Expressions Basics
**Concept:** Lambdas provide a concise way to represent an instance of a functional interface.

**Question:** Compare an anonymous class implementation with an equivalent lambda.

```java
import java.util.function.*;

public class LambdaBasicsDemo {
    public static void main(String[] args) {
        Comparator<String> byLengthAnon = new Comparator<String>() {
            @Override public int compare(String a, String b) { return a.length() - b.length(); }
        };
        Comparator<String> byLengthLambda = (a, b) -> a.length() - b.length();

        System.out.println(byLengthAnon.compare("hi", "hello"));
        System.out.println(byLengthLambda.compare("hi", "hello"));
    }
}
```
**Sample Output:**
```
-3
-3
```
**Viva Q&A:**
1. Q: What must a target type be for a lambda to compile? A: A functional interface (an interface with exactly one abstract method).
2. Q: Do lambdas create a new `.class` file for each usage the way anonymous classes do? A: No, lambdas are compiled using `invokedynamic` and don't generate a separate named class per lambda instance the same way anonymous inner classes do.

---

## Practical 86: Stream Basics — filter, map, collect
**Concept:** Streams process sequences of elements declaratively via chained operations (intermediate + terminal).

**Question:** Filter even numbers, square them, and collect into a list.

```java
import java.util.*;
import java.util.stream.*;

public class StreamBasicsDemo {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> result = numbers.stream()
            .filter(n -> n % 2 == 0)
            .map(n -> n * n)
            .collect(Collectors.toList());
        System.out.println(result);
    }
}
```
**Sample Output:**
```
[4, 16, 36, 64, 100]
```
**Viva Q&A:**
1. Q: What's the difference between "intermediate" and "terminal" stream operations? A: Intermediate ops (like `filter`, `map`) are lazy and return a new stream; terminal ops (like `collect`, `forEach`) trigger actual processing and produce a result or side effect.
2. Q: Can a stream be reused/iterated twice? A: No — once a terminal operation is invoked, the stream is considered consumed and throws `IllegalStateException` if reused.

---

## Practical 87: Stream Reduction — reduce, sum, average
**Concept:** `reduce` and specialized aggregate collectors combine stream elements into a single summary value.

**Question:** Compute the sum, average, and max of a list of prices using streams.

```java
import java.util.*;
import java.util.stream.*;

public class StreamReductionDemo {
    public static void main(String[] args) {
        List<Double> prices = List.of(199.99, 49.5, 320.0, 15.75);
        double total = prices.stream().mapToDouble(Double::doubleValue).sum();
        double avg = prices.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        double max = prices.stream().mapToDouble(Double::doubleValue).max().orElse(0);

        System.out.println("Total: " + total);
        System.out.println("Average: " + avg);
        System.out.println("Max: " + max);
    }
}
```
**Sample Output:**
```
Total: 585.24
Average: 146.31
Max: 320.0
```
**Viva Q&A:**
1. Q: Why does `average()` return an `OptionalDouble`? A: Because averaging an empty stream is undefined; `Optional` forces the caller to handle the "no elements" case explicitly.
2. Q: What does `mapToDouble` do compared to `map`? A: It converts a `Stream<Double>` into a primitive `DoubleStream`, avoiding boxing overhead and enabling numeric-specific operations like `sum()`.

---

## Practical 88: Grouping and Partitioning with Collectors
**Concept:** `Collectors.groupingBy` and `partitioningBy` organize stream elements into `Map`s based on a classifier function.

**Question:** Group employees by department and partition by salary threshold.

```java
import java.util.*;
import java.util.stream.*;

public class GroupingDemo {
    record Employee(String name, String department, double salary) { }
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Ravindu", "IT", 95000),
            new Employee("Sithara", "HR", 65000),
            new Employee("Malith", "IT", 72000),
            new Employee("Piumi", "HR", 58000)
        );

        Map<String, List<Employee>> byDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::department));
        byDept.forEach((dept, list) -> System.out.println(dept + " -> " + list.size() + " employees"));

        Map<Boolean, List<Employee>> highEarners = employees.stream()
            .collect(Collectors.partitioningBy(e -> e.salary() > 70000));
        System.out.println("High earners: " + highEarners.get(true).size());
    }
}
```
**Sample Output:**
```
IT -> 2 employees
HR -> 2 employees
High earners: 2
```
**Viva Q&A:**
1. Q: What's the difference between `groupingBy` and `partitioningBy`? A: `groupingBy` creates arbitrary key groups based on a classifier function; `partitioningBy` always splits into exactly two groups keyed by `true`/`false`.
2. Q: Can `groupingBy` be combined with a downstream collector (e.g., counting)? A: Yes, e.g. `Collectors.groupingBy(Employee::department, Collectors.counting())` counts employees per department directly.

---

## Practical 89: Method References
**Concept:** Method references (`Class::method`) are shorthand for lambdas that just call an existing method.

**Question:** Demonstrate the four kinds of method references.

```java
import java.util.*;
import java.util.function.*;

public class MethodReferenceDemo {
    static void printUpper(String s) { System.out.println(s.toUpperCase()); }

    public static void main(String[] args) {
        // Static method reference
        Consumer<String> printer = MethodReferenceDemo::printUpper;
        printer.accept("static ref");

        // Instance method reference on a particular object
        String greeting = "hello";
        Supplier<String> upperSupplier = greeting::toUpperCase;
        System.out.println(upperSupplier.get());

        // Instance method reference on an arbitrary object of a type
        Function<String, Integer> lengthFn = String::length;
        System.out.println(lengthFn.apply("Colombo"));

        // Constructor reference
        Supplier<ArrayList<String>> listFactory = ArrayList::new;
        System.out.println(listFactory.get());
    }
}
```
**Sample Output:**
```
STATIC REF
HELLO
7
[]
```
**Viva Q&A:**
1. Q: What are the four kinds of method references in Java? A: Static method (`Type::staticMethod`), bound instance method (`instance::method`), unbound instance method (`Type::instanceMethod`), and constructor reference (`Type::new`).
2. Q: Why prefer a method reference over an equivalent lambda? A: It's often more concise and readable when the lambda body is just a direct call to an existing method.

---

## Practical 90: Optional — Avoiding Null Checks
**Concept:** `Optional<T>` explicitly represents a value that may or may not be present, discouraging `null` returns.

**Question:** Look up a user in a map safely using `Optional`.

```java
import java.util.*;

public class OptionalDemo {
    public static void main(String[] args) {
        Map<Integer, String> users = Map.of(1, "Tharindu", 2, "Achini");

        Optional<String> user = Optional.ofNullable(users.get(3));
        System.out.println("Found: " + user.orElse("Unknown User"));

        user.ifPresentOrElse(
            name -> System.out.println("Hello, " + name),
            () -> System.out.println("No such user exists.")
        );
    }
}
```
**Sample Output:**
```
Found: Unknown User
No such user exists.
```
**Viva Q&A:**
1. Q: Why is returning `Optional<T>` often preferred over returning `null`? A: It forces callers to explicitly handle the "absent" case rather than risking a `NullPointerException`.
2. Q: What's discouraged when using `Optional`? A: Calling `.get()` without first checking `.isPresent()`, and using `Optional` as a field type or method parameter (it's intended primarily as a return type).

---

## Practical 91: Custom Functional Interfaces with Generics
**Concept:** You can define your own generic functional interfaces beyond the built-in `java.util.function` ones.

**Question:** Define a `TriFunction<A,B,C,R>` interface (three inputs, one output) not present in the standard library.

```java
@FunctionalInterface
interface TriFunction<A, B, C, R> {
    R apply(A a, B b, C c);
}

public class CustomFunctionalInterfaceDemo {
    public static void main(String[] args) {
        TriFunction<Integer, Integer, Integer, Integer> volumeCalc = (l, w, h) -> l * w * h;
        System.out.println("Volume: " + volumeCalc.apply(3, 4, 5));
    }
}
```
**Sample Output:**
```
Volume: 60
```
**Viva Q&A:**
1. Q: Why isn't there a built-in `TriFunction` in `java.util.function`? A: The standard library only ships `Function` (1 arg) and `BiFunction` (2 args); anything beyond that must be user-defined as needed.
2. Q: Is `@FunctionalInterface` mandatory for a lambda-compatible interface? A: No, it's optional documentation/enforcement — any interface with exactly one abstract method works with lambdas regardless of the annotation.

---

## Practical 92: Parallel Streams
**Concept:** `.parallelStream()` (or `.stream().parallel()`) splits work across multiple threads using the common ForkJoinPool, useful for CPU-bound bulk operations on large data.

**Question:** Sum a large range of numbers using a parallel stream.

```java
import java.util.stream.*;

public class ParallelStreamDemo {
    public static void main(String[] args) {
        long sum = LongStream.rangeClosed(1, 10_000_000)
            .parallel()
            .sum();
        System.out.println("Sum 1..10,000,000 = " + sum);
    }
}
```
**Sample Output:**
```
Sum 1..10,000,000 = 50000005000000
```
**Viva Q&A:**
1. Q: When are parallel streams *not* worth using? A: For small datasets or I/O-bound / side-effecting operations, where thread coordination overhead outweighs any speedup benefit.
2. Q: What thread pool do parallel streams use by default? A: The common `ForkJoinPool`, shared across the JVM unless explicitly configured otherwise.

---

# Section 12 — Design Patterns and Expert Mini-Projects (Expert)

## Practical 93: Singleton Pattern
**Concept:** Ensures a class has exactly one instance, with a global access point — commonly used for shared resources like configuration or logging.

**Question:** Implement a thread-safe Singleton using an enum (the recommended modern approach).

```java
enum AppConfig {
    INSTANCE;
    private final java.util.Map<String, String> settings = new java.util.HashMap<>();
    public void set(String key, String value) { settings.put(key, value); }
    public String get(String key) { return settings.get(key); }
}
public class SingletonDemo {
    public static void main(String[] args) {
        AppConfig.INSTANCE.set("env", "production");
        System.out.println("Config env: " + AppConfig.INSTANCE.get("env"));
    }
}
```
**Sample Output:**
```
Config env: production
```
**Viva Q&A:**
1. Q: Why is an enum-based Singleton considered the safest implementation? A: The JVM guarantees enum instances are created exactly once and are inherently serialization- and reflection-attack-safe.
2. Q: Name a downside of the Singleton pattern. A: It introduces global mutable state and hidden dependencies, making unit testing and reasoning about code harder.

---

## Practical 94: Factory Method Pattern
**Concept:** A factory method centralizes object creation logic, decoupling client code from concrete classes.

**Question:** Create a `ShapeFactory` that returns different `Shape` implementations by name.

```java
interface Shape { void draw(); }
class Circle implements Shape { public void draw() { System.out.println("Drawing a Circle"); } }
class Square implements Shape { public void draw() { System.out.println("Drawing a Square"); } }

class ShapeFactory {
    static Shape create(String type) {
        return switch (type.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> throw new IllegalArgumentException("Unknown shape: " + type);
        };
    }
}
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Shape s1 = ShapeFactory.create("circle");
        Shape s2 = ShapeFactory.create("square");
        s1.draw();
        s2.draw();
    }
}
```
**Sample Output:**
```
Drawing a Circle
Drawing a Square
```
**Viva Q&A:**
1. Q: What problem does the Factory Method pattern solve? A: It hides object-creation logic from client code, so clients depend on abstractions rather than concrete constructors.
2. Q: How does this differ from the Abstract Factory pattern? A: Factory Method creates one product type via a single method; Abstract Factory provides an interface for creating *families* of related products.

---

## Practical 95: Builder Pattern
**Concept:** The Builder pattern constructs complex objects step by step, avoiding telescoping constructors with many parameters.

**Question:** Build a `Pizza` object using a fluent builder.

```java
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
```
**Sample Output:**
```
Large pizza + cheese + pepperoni
```
**Viva Q&A:**
1. Q: What problem does the Builder pattern solve compared to a large constructor? A: It avoids "telescoping constructors" (many overloaded constructors) and makes optional parameters readable via named fluent methods.
2. Q: Why is the `Pizza` constructor private? A: To force all object creation through the `Builder`, ensuring consistent, validated construction.

---

## Practical 96: Observer Pattern
**Concept:** The Observer pattern lets objects (observers) subscribe to and react to state changes in another object (the subject), without tight coupling.

**Question:** Implement a simple stock price notifier with multiple subscribers.

```java
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
```
**Sample Output:**
```
Mobile App alert: LOLC is now 452.75
Email alert: LOLC is now 452.75
```
**Viva Q&A:**
1. Q: Where is the Observer pattern used in the JDK/real frameworks? A: GUI event listeners (e.g. `ActionListener`), and reactive libraries like RxJava; also the classic `java.util.Observer` (now deprecated).
2. Q: What's a risk of the Observer pattern if subscriptions are never removed? A: Memory leaks — observers can be kept alive by the subject longer than intended ("lapsed listener" problem).

---

## Practical 97: Decorator Pattern
**Concept:** The Decorator pattern attaches additional responsibilities to an object dynamically, as a flexible alternative to subclassing.

**Question:** Build a coffee ordering system where add-ons decorate a base `Coffee`.

```java
interface Coffee { double cost(); String description(); }

class SimpleCoffee implements Coffee {
    public double cost() { return 300; }
    public String description() { return "Coffee"; }
}
abstract class CoffeeDecorator implements Coffee {
    protected final Coffee wrapped;
    CoffeeDecorator(Coffee wrapped) { this.wrapped = wrapped; }
}
class Milk extends CoffeeDecorator {
    Milk(Coffee c) { super(c); }
    public double cost() { return wrapped.cost() + 50; }
    public String description() { return wrapped.description() + " + Milk"; }
}
class Sugar extends CoffeeDecorator {
    Sugar(Coffee c) { super(c); }
    public double cost() { return wrapped.cost() + 20; }
    public String description() { return wrapped.description() + " + Sugar"; }
}
public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Coffee order = new Sugar(new Milk(new SimpleCoffee()));
        System.out.println(order.description() + " = LKR " + order.cost());
    }
}
```
**Sample Output:**
```
Coffee + Milk + Sugar = LKR 370.0
```
**Viva Q&A:**
1. Q: How does Decorator differ from simple inheritance for adding behaviour? A: Decorators compose behaviour dynamically at runtime by wrapping objects, avoiding a combinatorial explosion of subclasses for every possible feature combination.
2. Q: Name a JDK class that follows the Decorator pattern. A: `BufferedReader` wrapping a `Reader`, or `BufferedOutputStream` wrapping an `OutputStream`.

---

## Practical 98: MVC-Style Mini Project — Simple Library System
**Concept:** Applying OOP + collections + exception handling together, loosely separating data (Model), logic (Controller), and display (View).

**Question:** Build a minimal library system where books can be added and borrowed.

```java
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
```
**Sample Output:**
```
Error: Book already borrowed: Design Patterns
Design Patterns - Borrowed
Java Concurrency in Practice - Available
```
**Viva Q&A:**
1. Q: What does "MVC" stand for and why separate concerns this way? A: Model-View-Controller; separating data, logic, and presentation improves testability and maintainability.
2. Q: Why use `orElseThrow` here instead of checking `isPresent()` manually? A: It concisely expresses "get the value or fail with a specific exception" in one fluent call.

---

## Practical 99: Expert Mini-Project — Bank ATM Simulation (Full OOP Integration)
**Concept:** Combines encapsulation, inheritance, interfaces, exception handling, and collections into one cohesive program.

**Question:** Simulate an ATM supporting deposit, withdrawal, and transaction history for different account types.

```java
import java.util.*;

abstract class Account {
    protected double balance;
    protected final List<String> history = new ArrayList<>();
    protected final String owner;
    Account(String owner, double initialBalance) { this.owner = owner; this.balance = initialBalance; }

    void deposit(double amount) {
        balance += amount;
        history.add("Deposited " + amount);
    }
    abstract void withdraw(double amount);
    void printHistory() { System.out.println(owner + "'s history: " + history); }
}
class SavingsAccount extends Account {
    static final double MIN_BALANCE = 1000;
    SavingsAccount(String owner, double balance) { super(owner, balance); }
    @Override void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE)
            throw new IllegalStateException("Cannot go below minimum balance of " + MIN_BALANCE);
        balance -= amount;
        history.add("Withdrew " + amount);
    }
}
class CurrentAccount extends Account {
    double overdraftLimit = 5000;
    CurrentAccount(String owner, double balance) { super(owner, balance); }
    @Override void withdraw(double amount) {
        if (balance - amount < -overdraftLimit)
            throw new IllegalStateException("Overdraft limit exceeded");
        balance -= amount;
        history.add("Withdrew " + amount);
    }
}
public class AtmSimulationDemo {
    public static void main(String[] args) {
        Account savings = new SavingsAccount("Kavindu", 2000);
        Account current = new CurrentAccount("Nethmi", 500);

        savings.deposit(500);
        current.withdraw(3000); // allowed via overdraft

        try {
            savings.withdraw(2000); // would breach minimum balance
        } catch (IllegalStateException e) {
            System.out.println("Transaction declined: " + e.getMessage());
        }

        savings.printHistory();
        current.printHistory();
        System.out.println("Savings balance: " + savings.balance);
        System.out.println("Current balance: " + current.balance);
    }
}
```
**Sample Output:**
```
Transaction declined: Cannot go below minimum balance of 1000.0
Kavindu's history: [Deposited 500.0]
Nethmi's history: [Withdrew 3000.0]
Savings balance: 2500.0
Current balance: -2500.0
```
**Viva Q&A:**
1. Q: Which OOP pillars are demonstrated together in this project? A: Encapsulation (protected fields with controlled access), inheritance (`SavingsAccount`/`CurrentAccount` extend `Account`), polymorphism (`withdraw` overridden differently per type), and abstraction (`Account` is abstract).
2. Q: Why give each account type its own `withdraw` rule instead of one shared method? A: Different account types have genuinely different business rules (minimum balance vs overdraft limit), which polymorphism expresses cleanly without conditional type-checking logic.

---

## Practical 100: Expert Mini-Project — Generic Event-Driven Task Scheduler
**Concept:** Combines generics, functional interfaces, collections, and the Observer pattern into a small reusable scheduler component.

**Question:** Build a simple in-memory task scheduler that runs registered tasks and notifies listeners on completion.

```java
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
```
**Sample Output:**
```
[Logger] sum-1-to-100 -> 5050
[Alert] sum-1-to-100 produced a large result: 5050
[Logger] square-of-12 -> 144
```
**Viva Q&A:**
1. Q: What generic and functional-interface concepts are combined here? A: A generic class `TaskScheduler<T>` paired with `Supplier<T>` (task producers) and `BiConsumer<String, T>` (completion listeners), showing generics and functional interfaces working together.
2. Q: How is this an example of the Observer pattern? A: Registered listeners (`onComplete`) are notified automatically whenever a task finishes — the scheduler is the subject, listeners are observers.

---

\newpage

# Appendix — Java & OOP Viva / Interview Question Bank

*(Beyond the per-practical Q&A above, use this bank for exam or interview revision. Organized by topic.)*

### A. Java & OOP Fundamentals
1. **Q:** What are the four pillars of OOP? **A:** Encapsulation, Inheritance, Polymorphism, and Abstraction.
2. **Q:** What is the difference between JDK, JRE, and JVM? **A:** JVM executes bytecode; JRE bundles the JVM plus core libraries needed to *run* Java programs; JDK includes the JRE plus development tools (compiler, debugger) needed to *build* Java programs.
3. **Q:** Why is Java called "platform independent"? **A:** Source code compiles to bytecode, which any JVM (on any OS/hardware) can interpret/JIT-compile, so the same bytecode runs everywhere a JVM exists.
4. **Q:** What is the difference between `==` and `.equals()`? **A:** `==` compares references (or primitive values); `.equals()` compares logical content, if overridden meaningfully.
5. **Q:** What is autoboxing? **A:** The automatic conversion between a primitive type (e.g., `int`) and its corresponding wrapper class (e.g., `Integer`).
6. **Q:** What is the default value of an uninitialized instance `int` field? **A:** `0` (object fields get sensible defaults; local variables do not and must be explicitly initialized).
7. **Q:** What is the difference between `String`, `StringBuilder`, and `StringBuffer`? **A:** `String` is immutable; `StringBuilder` is mutable and not thread-safe (faster); `StringBuffer` is mutable and thread-safe (synchronized, slower).
8. **Q:** What does the `this` keyword refer to? **A:** The current object instance on which a method or constructor is being invoked.

### B. Encapsulation
9. **Q:** What is encapsulation in one sentence? **A:** Bundling data and the methods that operate on it, while restricting direct outside access to that data.
10. **Q:** Why are fields typically declared `private`? **A:** To prevent uncontrolled external modification and enforce validation/business rules through accessor methods.
11. **Q:** What is a POJO? **A:** A Plain Old Java Object — a simple class with private fields and public getters/setters, no special framework dependencies.
12. **Q:** How does encapsulation support the "open/closed principle"? **A:** Internal implementation can be freely changed/extended without modifying the exposed public interface that other code depends on.

### C. Inheritance
13. **Q:** What is the "is-a" relationship? **A:** Inheritance models an "is-a" relationship, e.g., a `Dog` *is an* `Animal`.
14. **Q:** Why does Java not support multiple class inheritance? **A:** To avoid ambiguity from the "diamond problem" when two parent classes define conflicting members.
15. **Q:** What is method hiding vs overriding for static methods? **A:** Static methods with the same signature in a subclass "hide" the parent's version rather than truly overriding it — resolution is based on the reference's compile-time type, not the runtime object type.
16. **Q:** Can constructors be inherited? **A:** No, constructors are not inherited, but a subclass constructor can invoke a superclass constructor via `super(...)`.
17. **Q:** What is composition, and how does it compare to inheritance? **A:** Composition builds objects by containing/using instances of other classes ("has-a" relationship); it's often preferred over inheritance for greater flexibility and looser coupling ("favor composition over inheritance").

### D. Interfaces and Abstraction
18. **Q:** What is abstraction? **A:** Exposing only essential features/behaviour while hiding implementation complexity from the user of a class.
19. **Q:** Can an interface extend multiple interfaces? **A:** Yes, unlike classes, an interface can extend multiple other interfaces.
20. **Q:** What is the difference between an abstract class and an interface (modern Java)? **A:** Abstract classes can hold instance state and constructors and support single inheritance; interfaces support multiple inheritance of type and (since Java 8) default/static methods but traditionally no instance state.
21. **Q:** When would you choose an abstract class over an interface? **A:** When related classes share common state or a common base implementation, not just a behavioural contract.

### E. Polymorphism
22. **Q:** Define polymorphism in the context of OOP. **A:** The ability of different classes to be treated through a common interface/supertype, each responding to the same call in its own way.
23. **Q:** What is method overloading vs overriding? **A:** Overloading: same method name, different parameter lists, resolved at compile time. Overriding: subclass redefines a superclass method with the same signature, resolved at runtime.
24. **Q:** Can constructors be overloaded? **A:** Yes, constructors can be overloaded with different parameter lists.
25. **Q:** What is dynamic method dispatch? **A:** The JVM mechanism that determines, at runtime, which overridden method implementation to invoke based on the actual object type.

### F. Exception Handling
26. **Q:** What is the exception class hierarchy root? **A:** `Throwable`, with two main subclasses: `Exception` (recoverable) and `Error` (usually unrecoverable, e.g. `OutOfMemoryError`).
27. **Q:** What's the difference between `throw` and `throws`? **A:** `throw` actually raises an exception instance; `throws` is a method signature declaration listing checked exceptions the method might propagate.
28. **Q:** Is `NullPointerException` checked or unchecked? **A:** Unchecked (it extends `RuntimeException`).
29. **Q:** What happens if an exception is thrown inside a `finally` block? **A:** It can suppress/replace any exception from the `try`/`catch` block, propagating the `finally` block's exception instead.
30. **Q:** Why should you avoid catching a bare `Exception` (or `Throwable`) broadly? **A:** It can silently swallow unrelated bugs and makes error handling imprecise; catch the most specific exception types you can meaningfully recover from.

### G. Collections
31. **Q:** What's the difference between `List`, `Set`, and `Map`? **A:** `List` is an ordered, index-based, duplicate-allowing collection; `Set` disallows duplicates; `Map` stores key-value pairs with unique keys.
32. **Q:** Why is `HashMap` not thread-safe, and what's the alternative? **A:** Concurrent modification can corrupt its internal structure; use `ConcurrentHashMap` for thread-safe concurrent access.
33. **Q:** What's the load factor in a `HashMap`? **A:** The threshold ratio (default 0.75) of filled buckets to total capacity that triggers automatic resizing (rehashing).
34. **Q:** What's the difference between `Iterator` and `ListIterator`? **A:** `ListIterator` supports bidirectional traversal and element replacement/insertion, while `Iterator` only supports forward traversal and removal.

### H. Generics
35. **Q:** Why were generics introduced in Java 5? **A:** To provide compile-time type safety for collections and reusable classes, eliminating the need for manual casting and reducing `ClassCastException` risk.
36. **Q:** What is type erasure's practical consequence? **A:** You cannot create a generic array directly (`new T[]`), and you cannot check `instanceof SomeGeneric<String>` at runtime — only the raw type is retained.
37. **Q:** What is a raw type? **A:** Using a generic class/interface without specifying its type parameter (e.g., `List list = new ArrayList()`), which loses compile-time type checking and is discouraged.

### I. Multithreading
38. **Q:** What is the difference between a process and a thread? **A:** A process is an independent program execution with its own memory space; threads are lightweight units within a process that share the same memory space.
39. **Q:** What does the `synchronized` keyword actually lock? **A:** For instance methods, the object's monitor (`this`); for static methods, the `Class` object's monitor; for blocks, whatever object reference is specified.
40. **Q:** What's the difference between `wait()`/`notify()` and `Thread.sleep()`? **A:** `wait()` releases the held monitor lock and pauses until `notify()`/`notifyAll()`; `sleep()` pauses the thread without releasing any locks it holds.
41. **Q:** What is a thread-safe class? **A:** A class whose methods behave correctly when accessed concurrently by multiple threads, without external synchronization needed by callers.

### J. Java 8+ Features
42. **Q:** What problem do streams solve compared to traditional loops? **A:** They express data transformation pipelines declaratively (what to do) rather than imperatively (how to iterate), often improving readability and enabling easy parallelism.
43. **Q:** What is a functional interface? **A:** An interface with exactly one abstract method, usable as the target type for a lambda expression or method reference.
44. **Q:** What does `Optional.empty()` represent? **A:** An `Optional` instance explicitly representing "no value present," avoiding ambiguous `null` returns.
45. **Q:** What is the difference between `map` and `flatMap` in streams? **A:** `map` transforms each element to another single value; `flatMap` transforms each element into a stream and flattens all resulting streams into one.

### K. Design Patterns & Best Practices
46. **Q:** What is the SOLID acronym? **A:** Single Responsibility, Open/Closed, Liskov Substitution, Interface Segregation, Dependency Inversion — five core OOP design principles.
47. **Q:** What is dependency injection? **A:** A design technique where an object's dependencies are provided externally (e.g., via constructor) rather than the object creating them itself, improving testability and decoupling.
48. **Q:** What is the difference between the Factory Method and Builder patterns? **A:** Factory Method focuses on *which* object to create; Builder focuses on constructing one complex object *step by step* with many optional parameters.
49. **Q:** What is "programming to an interface, not an implementation"? **A:** A design guideline encouraging code to depend on abstract types (interfaces/abstract classes) rather than concrete classes, enabling flexibility and easier substitution.
50. **Q:** What is technical debt? **A:** The implied cost of extra rework caused by choosing an easy/quick solution now instead of a better, more maintainable approach.

### L. Miscellaneous / Rapid Fire
51. **Q:** What is the entry point method signature in Java? **A:** `public static void main(String[] args)`.
52. **Q:** What does `static` mean when applied to a field? **A:** The field belongs to the class itself, shared across all instances, rather than being per-object.
53. **Q:** Can you overload the `main` method? **A:** Yes, but the JVM will only ever call the exact `public static void main(String[] args)` signature as the entry point.
54. **Q:** What is garbage collection? **A:** The JVM's automatic process of reclaiming memory occupied by objects no longer reachable from any live reference.
55. **Q:** What does the `transient` keyword do? **A:** Marks a field to be skipped during object serialization.
56. **Q:** What is boxing vs unboxing? **A:** Boxing wraps a primitive into its wrapper class (e.g., `int` → `Integer`); unboxing extracts the primitive back out.
57. **Q:** What's the difference between an abstract method and a `default` interface method? **A:** An abstract method has no body and must be implemented by subclasses/implementers; a `default` method provides a usable body that implementers may optionally override.
58. **Q:** What are varargs? **A:** A syntax (`Type... name`) allowing a method to accept a variable number of arguments, internally treated as an array.
59. **Q:** What is the purpose of the `Objects` utility class? **A:** Provides null-safe helper methods like `Objects.equals`, `Objects.hash`, and `Objects.requireNonNull`.
60. **Q:** What does immutability buy you in concurrent programming? **A:** Immutable objects can be freely shared across threads without synchronization, since their state never changes after construction.

\newpage

# Closing Notes

This collection (Practicals 1–100 plus the Q&A appendix) is designed to slot directly into the existing repository structure, extending the original six OOP-focused folders with **six additional advanced/expert folders**: Collections, Generics, Multithreading, File I/O, Java 8+ Streams/Lambdas, and Design Patterns/Mini-Projects.

**Suggested next steps for the repo:**
- Create one `.java` file per practical inside its matching `Practical NN - Topic/` folder.
- Update `README.md`'s "Topics Covered" and "Repository Structure" sections to list all twelve topics.
- Optionally add a `docs/` folder containing this PDF as reference material for learners following the repo.

