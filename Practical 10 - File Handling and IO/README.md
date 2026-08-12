# Practical 10 - File Handling and IO

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 79 | Writing and Reading Text Files | `java.nio.file.Files` offers simple static methods for reading/writing whole files. |
| 80 | BufferedReader for Line-by-Line Processing | `BufferedReader` wraps a `Reader` to efficiently read text line by line, reducing I/O calls. |
| 81 | Serialization and Deserialization | Implementing `Serializable` allows an object's state to be converted to a byte stream and restored later. |
| 82 | Reading CSV-Style Data | Structured text data (like CSV) can be parsed manually with `String.split()` for simple cases. |
| 83 | File and Directory Operations with `java.nio.file` | `Files` and `Path` support checking existence, creating directories, listing contents, and copying files. |
| 84 | Try-With-Resources for Multiple Streams (Copying a File) | Multiple resources can be declared in one try-with-resources statement, all auto-closed safely. |
