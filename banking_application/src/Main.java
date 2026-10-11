
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create account with demo opening balance
        BankAccount account = new BankAccount(10000.00);

        // Start banking application
        BankingApp app = new BankingApp(scanner, account);
        app.start();

        scanner.close();
    }
}
