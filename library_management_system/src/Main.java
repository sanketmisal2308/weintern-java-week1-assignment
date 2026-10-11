
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        boolean running = true;

        System.out.println("Welcome to Library Management System!");

        while (running) {
            System.out.println("\n==================================");
            System.out.println("     LIBRARY MANAGEMENT SYSTEM");
            System.out.println("==================================");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Remove Book");
            System.out.println("7. Exit");
            System.out.println("==================================");
            System.out.print("Enter your choice: ");

            String input = scanner.nextLine().trim();
            int choice;

            try {
                choice = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input! Please enter a number from 1 to 7."
                );
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.print("Enter Book ID: ");
                    int addId;

                    try {
                        addId = Integer.parseInt(
                            scanner.nextLine().trim()
                        );
                    } catch (NumberFormatException e) {
                        System.out.println(
                            "Invalid Book ID! Enter a whole number."
                        );
                        break;
                    }

                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine().trim();

                    System.out.print("Enter Author Name: ");
                    String author = scanner.nextLine().trim();

                    library.addBook(addId, title, author);
                    break;

                case 2:
                    library.viewBooks();
                    break;

                case 3:
                    System.out.print(
                        "Enter Book ID or Title to search: "
                    );
                    String searchText = scanner.nextLine();
                    library.searchBook(searchText);
                    break;

                case 4:
                    System.out.print("Enter Book ID to issue: ");
                    try {
                        int issueId = Integer.parseInt(
                            scanner.nextLine().trim()
                        );
                        library.issueBook(issueId);
                    } catch (NumberFormatException e) {
                        System.out.println(
                            "Invalid Book ID! Enter a whole number."
                        );
                    }
                    break;

                case 5:
                    System.out.print("Enter Book ID to return: ");
                    try {
                        int returnId = Integer.parseInt(
                            scanner.nextLine().trim()
                        );
                        library.returnBook(returnId);
                    } catch (NumberFormatException e) {
                        System.out.println(
                            "Invalid Book ID! Enter a whole number."
                        );
                    }
                    break;

                case 6:
                    System.out.print("Enter Book ID to remove: ");
                    try {
                        int removeId = Integer.parseInt(
                            scanner.nextLine().trim()
                        );
                        library.removeBook(removeId);
                    } catch (NumberFormatException e) {
                        System.out.println(
                            "Invalid Book ID! Enter a whole number."
                        );
                    }
                    break;

                case 7:
                    running = false;
                    System.out.println(
                        "Thank you for using the Library Management System!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please select 1 to 7."
                    );
            }
        }

        scanner.close();
    }
}
