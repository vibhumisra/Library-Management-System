# Library Management System

## Description

A Java-based Library Management System designed for an engineering college. This system leverages hash tables, linked lists, and binary search trees to efficiently manage book inventories and member records. It features a user-friendly console interface for managing library operations, including book additions, removals, searches, and handling member registrations and book checkouts/returns.

## Key Features

- **Book Management**: Add, remove, and search books by title or ISBN. Books are organized using a binary search tree for efficient lookups.
- **Member Management**: Register new members and track their borrowed books using a linked list.
- **Book Borrowing and Returning**: Manage book checkouts and returns, updating availability and member records.
- **User Interface**: Simple console-based interface for interacting with the system and performing various library operations.

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- A Java IDE or text editor (e.g., IntelliJ IDEA, Eclipse, VSCode)
- Command line tools for compiling and running Java programs

## Project Structure
- **Book.java**: Represents a book in the library.
- **Member.java**: Represents a member of the library.
- **Library.java**: Manages books and members.
- **LibrarySystem.java**: Main class to run the system.

## How to Run
1. Ensure you have JDK installed.
2. Compile the Java files:
   ```sh
   javac Book.java Member.java Library.java LibrarySystem.java

### Steps to Run the Program

1. **Create Directory Structure**:
   - Create a new directory for your project, e.g., `LibraryManagementSystem`.
   - Inside this directory, create the Java files: `Book.java`, `Member.java`, `Library.java`, and `LibrarySystem.java`.
   - Copy the provided code into the respective files.

2. **Compile the Program**:
   - Open a terminal or command prompt, navigate to the directory containing the Java files, and compile them:
     ```sh
     javac Book.java Member.java Library.java LibrarySystem.java
     ```

3. **Run the Program**:
   - Run the `LibrarySystem` class:
     ```sh
     java LibrarySystem
     ```

By following these steps, you should be able to run the Library Management System and interact
