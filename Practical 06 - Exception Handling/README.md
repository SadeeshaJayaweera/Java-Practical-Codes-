# Practical 06 - Exception Handling

## Table of Contents

| Practical | Title | Concept |
|---|---|---|
| 43 | try-catch-finally Basics | `try` wraps risky code, `catch` handles specific exceptions, `finally` always runs (cleanup), regardless of whether an exception occurred. |
| 44 | Checked vs Unchecked Exceptions | Checked exceptions (subclasses of `Exception`, not `RuntimeException`) must be declared or caught; unchecked ones need not be. |
| 45 | Custom (User-Defined) Exceptions | You can create domain-specific exceptions by extending `Exception` (checked) or `RuntimeException` (unchecked). |
| 46 | Multi-Catch Blocks | A single `catch` clause can handle multiple unrelated exception types using `|`. |
| 47 | try-with-resources (AutoCloseable) | Resources implementing `AutoCloseable` are automatically closed at the end of a try block, even if an exception occurs. |
| 48 | Exception Chaining (Cause) | A new exception can wrap an original one as its "cause", preserving the root-cause stack trace for debugging. |
| 49 | Custom Exception Hierarchies | You can build a hierarchy of related custom exceptions for fine-grained or broad catching. |
| 50 | Stack Traces and `printStackTrace()` | Every exception carries a stack trace showing the call path where it was thrown, useful for debugging. |
| 51 | Rethrowing and the `throws` Clause | A method may partially handle an exception (e.g., logging) and rethrow it, declared via `throws`. |
| 52 | Global Exception Handling Pattern (Simplified) | Larger applications centralize exception handling (e.g., a single handler layer) instead of scattering try-catch everywhere. |
