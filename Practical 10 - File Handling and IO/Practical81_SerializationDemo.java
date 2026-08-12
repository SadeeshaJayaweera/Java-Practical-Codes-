/**
 * Practical 81: Serialization and Deserialization
 * 
 * Concept: Implementing `Serializable` allows an object's state to be converted to a byte stream and restored later.
 * 
 * Question: Serialize a `Student` object to a file, then deserialize it back.
 * 
 * Sample Output:
 * Restored: Hasini (22)
 */

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

/*
 * Viva Q&A:
 * 1. Q: What is `serialVersionUID` used for? A: A version identifier used to verify that a serialized object's class is compatible with the loaded class definition during deserialization.
 * 2. Q: What keyword excludes a field from serialization? A: `transient`.
 */
