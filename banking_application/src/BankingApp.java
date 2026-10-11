
import java.util.Scanner;

public class BankingApp {

    private final Scanner scanner;
    private final BankAccount account;

    // Constructor
    public BankingApp(Scanner scanner, BankAccount account) {
        this.scanner = scanner;
        this.account = account;
    }

    // Start the application
    public void start() {
        boolean running = true;

        System.out.println("Welcome to Banking Application!");
        System.out.printf(
            "Opening Balance: Rs. %.2f%n",
            account.getBalance()
        );

        while (running) {
            displayMenu();

            int choice = readInt("Enter your choice: ");

            switch (choice) {
                case 1:
                    depositMoney();
                    break;

                case 2:
                    withdrawMoney();
                    break;

                case 3:
                    displayBalance();
                    break;

                case 4:
                    running = false;
                    System.out.println(
                        "Thank you for using Banking Application!"
                    );
                    break;

                default:
                    System.out.println(
                        "Invalid choice! Please select 1 to 4."
                    );
            }

            System.out.println();
        }
    }

    // Display menu
    private void displayMenu() {
        System.out.println("================================");
        System.out.println("       BANKING APPLICATION");
        System.out.println("================================");
        System.out.println("1. Deposit Money");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.println("================================");
    }

    // Read integer input safely
    private int readInt(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid input! Please enter a whole number."
                );
            }
        }
    }

    // Read decimal or integer amount safely
    private double readAmount(String message) {
        while (true) {
            System.out.print(message);
            String input = scanner.nextLine().trim();

            try {
                double amount = Double.parseDouble(input);

                if (!Double.isFinite(amount)) {
                    System.out.println(
                        "Invalid amount! Enter a valid number."
                    );
                    continue;
                }

                return amount;

            } catch (NumberFormatException e) {
                System.out.println(
                    "Invalid amount! Please enter a numeric value."
                );
            }
        }
    }

    // Deposit operation
    private void depositMoney() {
        double amount = readAmount("Enter deposit amount: Rs. ");

        try {
            account.deposit(amount);

            System.out.println("Deposit successful!");
            System.out.printf(
                "Deposited Amount: Rs. %.2f%n", amount
            );
            displayBalance();

        } catch (IllegalArgumentException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }
    }

    // Withdrawal operation
    private void withdrawMoney() {
        double amount = readAmount("Enter withdrawal amount: Rs. ");

        try {
            account.withdraw(amount);

            System.out.println("Withdrawal successful!");
            System.out.printf(
                "Withdrawn Amount: Rs. %.2f%n", amount
            );
            displayBalance();

        } catch (IllegalArgumentException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }

    // Balance inquiry
    private void displayBalance() {
        System.out.printf(
            "Current Balance: Rs. %.2f%n",
            account.getBalance()
        );
    }
}
