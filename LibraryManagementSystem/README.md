# Library Management System

A console-based **Library Management System** built using **Java** that allows users to manage books through a menu-driven interface. This project demonstrates the implementation of Object-Oriented Programming (OOP), CRUD operations, Java Collections, and state management.

## Features

* Add a new book
*  View all books
*  Search books by:

   * Book ID
   * Book Title
   * Author Name
   * Genre
* Update book details
*  Delete a book
*  Issue a book
*  Return a book
*  Prevent duplicate Book IDs
*  Interactive console-based menu system

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Java Collections Framework (`ArrayList`)
* Scanner (User Input)

## Project Structure

```text
LibraryManagementSystem/
│
├── Book.java
├── LibraryManagement.java
└── Main.java
```

### File Description

* **Book.java** – Represents a book with its attributes, constructor, getters, setters, and `toString()` method.

* **LibraryManagement.java** – Contains the business logic for managing books, including CRUD operations, search, issue, and return functionalities.

* **Main.java** – Handles the menu-driven interface, user input, and program execution.

## Concepts Practiced

* Classes & Objects
* Constructors
* Encapsulation
* Getters & Setters
* Method Design
* Object References
* ArrayList & Generics
* CRUD Operations
* Menu-Driven Programming
* Searching & Filtering
* State Management using Boolean (`isIssued`)
* Enhanced For Loop
* Conditional Statements
* Input Validation

## Application Menu

```text
===== Library Management System =====

1. Add Book
2. View Books
3. Search Book
4. Update Book
5. Delete Book
6. Issue Book
7. Return Book
8. Exit
```

### Search Menu

```text
===== Search Book =====

1. Search by ID
2. Search by Title
3. Search by Author
4. Search by Genre
5. Back
```

## Sample Output

```text
===== Library Management System =====

1. Add Book
2. View Books
3. Search Book
4. Update Book
5. Delete Book
6. Issue Book
7. Return Book
8. Exit

Enter your choice: 1

Enter ID: 101
Enter Title: Clean Code
Enter Author: Robert C. Martin
Enter Genre: Programming

Book added successfully.
```

## Learning Outcomes

Through this project, I practiced designing a complete console-based Java application by applying Object-Oriented Programming principles and implementing business logic using Java Collections.

Key takeaways include:

* Building reusable classes and methods
* Managing collections of objects using `ArrayList`
* Designing menu-driven applications
* Implementing multiple search strategies
* Managing object state with a boolean field (`isIssued`)
* Applying clean code organization and method responsibilities

## Future Improvements

* File handling to persist library data
* Member management system
* Book borrowing history
* Due dates and late return tracking
* Fine calculation
* Sorting books by title, author, or genre
* Exception handling for invalid user input
* Database integration using JDBC/MySQL

## Author

**-Neharika Bonu**

If you found this project helpful, feel free to ⭐ the repository!
