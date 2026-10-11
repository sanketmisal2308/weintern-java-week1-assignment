
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        books = new ArrayList<>();
    }

    // Find a book using its ID
    private Book findBookById(int bookId) {
        for (Book book : books) {
            if (book.getBookId() == bookId) {
                return book;
            }
        }
        return null;
    }

    // Add a new book
    public void addBook(int bookId, String title, String author) {
        if (bookId <= 0) {
            System.out.println("Book ID must be positive.");
            return;
        }

        if (title == null || title.trim().isEmpty()
                || author == null || author.trim().isEmpty()) {
            System.out.println("Title and author cannot be empty.");
            return;
        }

        if (findBookById(bookId) != null) {
            System.out.println("Book ID already exists!");
            return;
        }

        Book book = new Book(bookId, title.trim(), author.trim());
        books.add(book);

        System.out.println("Book added successfully!");
    }

    // Display all books
    public void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
            return;
        }

        System.out.println("\n========== ALL BOOKS ==========");

        for (Book book : books) {
            book.displayBook();
        }
    }

    // Search by ID or title
    public void searchBook(String searchText) {
        boolean found = false;
        String search = searchText.trim();

        if (search.isEmpty()) {
            System.out.println("Please enter a Book ID or title.");
            return;
        }

        // First, try searching by ID
        try {
            int id = Integer.parseInt(search);
            Book book = findBookById(id);

            if (book != null) {
                book.displayBook();
                return;
            }
        } catch (NumberFormatException e) {
            // Search as a title if input is not an integer
        }

        // Search by title (case-insensitive)
        for (Book book : books) {
            if (book.getTitle().toLowerCase()
                    .contains(search.toLowerCase())) {
                book.displayBook();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    // Issue a book
    public void issueBook(int bookId) {
        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isAvailable()) {
            System.out.println("Book is already issued.");
        } else {
            book.issueBook();
            System.out.println("Book issued successfully!");
            System.out.println("Title: " + book.getTitle());
        }
    }

    // Return a book
    public void returnBook(int bookId) {
        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isAvailable()) {
            System.out.println("This book was not issued.");
        } else {
            book.returnBook();
            System.out.println("Book returned successfully!");
            System.out.println("Title: " + book.getTitle());
        }
    }

    // Remove a book
    public void removeBook(int bookId) {
        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
        } else if (!book.isAvailable()) {
            System.out.println("Cannot remove an issued book.");
            System.out.println("Return the book first.");
        } else {
            books.remove(book);
            System.out.println("Book removed successfully!");
        }
    }
}

// Important Things in This File
// Code	Use
// ArrayList<Book>	Stores multiple books.
// addBook()	Adds a new book.
// viewBooks()	Displays all books.
// searchBook()	Searches for a book by ID or title.
// issueBook()	Issues an available book.
// returnBook()	Returns an issued book.
// removeBook()	Removes an available book.