/**
 * Practical 79: Writing and Reading Text Files
 * 
 * Concept: `java.nio.file.Files` offers simple static methods for reading/writing whole files.
 * 
 * Question: Write a list of lines to a file, then read them back.
 * 
 * Sample Output:
 * Learn Java
Practice OOP
Build projects
 */

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

/*
 * Viva Q&A:
 * 1. Q: What package provides the modern (post-Java 7) file API? A: `java.nio.file` (NIO.2), including `Path`, `Paths`, and `Files`.
 * 2. Q: What older stream classes were commonly used for text files before NIO.2? A: `FileReader`/`BufferedReader` for reading, `FileWriter`/`BufferedWriter` for writing.
 */
