/**
 * Practical 83: File and Directory Operations with `java.nio.file`
 * 
 * Concept: `Files` and `Path` support checking existence, creating directories, listing contents, and copying files.
 * 
 * Question: Create a directory, write a file inside it, then list the directory's contents.
 * 
 * Sample Output:
 * Found: a.txt
Found: b.txt
 */

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

/*
 * Viva Q&A:
 * 1. Q: Why delete files in reverse sorted order when cleaning up a directory tree? A: Directories must be empty before deletion, so deleting deepest paths (files) before their parent directories avoids errors.
 * 2. Q: What does `Files.createDirectories` do differently from `Files.createDirectory`? A: `createDirectories` also creates any missing parent directories; `createDirectory` fails if the parent doesn't already exist.
 */
