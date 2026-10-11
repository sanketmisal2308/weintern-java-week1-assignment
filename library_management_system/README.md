# Library Management System

## Objective
To develop a console-based Library Management System using Java and Object-Oriented Programming concepts.

## Features
- Add a new book
- View all books
- Search books by ID or title
- Issue a book
- Return a book
- Remove a book
- Handle invalid user input
- Prevent duplicate book IDs

## Technologies Used
- Java
- Object-Oriented Programming (OOP)
- ArrayList
- Exception Handling
- Visual Studio Code

## Project Structure
```text
library_management_system/
├── src/
│   ├── Book.java
│   ├── Library.java
│   └── Main.java
└── README.md
```

## How to Run
1. Install the Java JDK.
2. Open the project in Visual Studio Code.
3. Open the terminal in the `src` folder.
4. Compile the files:

   `javac Book.java Library.java Main.java`

5. Start the application:

   `java Main`

## Testing
Test adding, viewing, searching, issuing, returning and removing books. Also test duplicate IDs and invalid inputs.

## Limitations
Book records are stored in memory and are not retained after the program exits.

## Author
Sanket Misal