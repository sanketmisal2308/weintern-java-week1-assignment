
public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    // Issue the book
    public void issueBook() {
        isAvailable = false;
    }

    // Return the book
    public void returnBook() {
        isAvailable = true;
    }

    // Display book information
    public void displayBook() {
        System.out.println("--------------------------------");
        System.out.println("Book ID    : " + bookId);
        System.out.println("Title      : " + title);
        System.out.println("Author     : " + author);
        System.out.println("Availability: "
                + (isAvailable ? "Available" : "Issued"));
    }
}


// What does this code do?
// - It uses private variables to protect the Book's information. This is called Encapsulation.
// - The constructor initializes a new Book object.
// - getBookId() and other getter methods retrieve the book's information.
// - issueBook() and returnBook() update the book's availability status.
// - displayBook() displays the book's information.