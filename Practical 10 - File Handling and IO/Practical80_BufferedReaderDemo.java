/**
 * Practical 80: BufferedReader for Line-by-Line Processing
 * 
 * Concept: `BufferedReader` wraps a `Reader` to efficiently read text line by line, reducing I/O calls.
 * 
 * Question: Read a file's contents line by line, numbering each line.
 * 
 * Sample Output:
 * 1: Roses are red
2: Violets are blue
 */

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

/*
 * Viva Q&A:
 * 1. Q: Why wrap a `FileReader` with `BufferedReader`? A: `BufferedReader` reduces the number of costly underlying I/O calls by reading larger chunks into an internal buffer and exposing convenient `readLine()`.
 * 2. Q: What does `readLine()` return at end-of-file? A: `null`.
 */
