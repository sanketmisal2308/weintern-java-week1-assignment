
public class BankAccount {

    private double balance;

    // Constructor
    public BankAccount(double initialBalance) {
        if (!Double.isFinite(initialBalance) || initialBalance < 0) {
            throw new IllegalArgumentException(
                "Initial balance cannot be negative or invalid."
            );
        }

        this.balance = initialBalance;
    }

    // Deposit money
    public void deposit(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                "Deposit amount must be greater than zero."
            );
        }

        if (!Double.isFinite(balance + amount)) {
            throw new IllegalArgumentException(
                "Amount is too large to process."
            );
        }

        balance += amount;
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (!Double.isFinite(amount) || amount <= 0) {
            throw new IllegalArgumentException(
                "Withdrawal amount must be greater than zero."
            );
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                "Insufficient balance!"
            );
        }

        balance -= amount;
    }

    // Get current balance
    public double getBalance() {
        return balance;
    }
}
