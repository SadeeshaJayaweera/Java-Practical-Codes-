/**
 * Practical 84: Try-With-Resources for Multiple Streams (Copying a File)
 * 
 * Concept: Multiple resources can be declared in one try-with-resources statement, all auto-closed safely.
 * 
 * Question: Copy a text file's content byte-by-byte using input/output streams.
 * 
 * Sample Output:
 * Copied content: Copy this content please.
 */

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

/*
 * Viva Q&A:
 * 1. Q: In what order are resources closed when multiple are declared in one try-with-resources? A: In reverse of declaration order — `out` closes before `in` here.
 * 2. Q: What simpler one-liner could replace this manual byte-copy loop? A: `Files.copy(source, destination)`.
 */
