/**
 * Practical 10: Validated Setters (Data Integrity)
 * 
 * Concept: Setters can enforce business rules so an object is never left in an invalid state.
 * 
 * Question: Build a `Student` class where age must be between 5 and 100.
 * 
 * Sample Output:
 * Invalid age: 150. Keeping previous value.
Nimal -> age: 21
 */

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

/*
 * Viva Q&A:
 * 1. Q: What is a "guard clause"? A: An early validation check (like the age range check) that exits or rejects invalid input before further processing.
 * 2. Q: How does encapsulation support maintainability? A: Internal implementation can change freely as long as the public interface (getters/setters) stays the same.
 */
