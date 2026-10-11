# Banking Application

## Project Objective
To develop a console-based Banking Application using Java and Object-Oriented Programming concepts.

## Features
- Deposit money
- Withdraw money
- Check current balance
- Validate transaction amounts
- Prevent withdrawals exceeding the available balance
- Handle invalid numeric input
- Display user-friendly error messages

## Technologies Used
- Java
- Object-Oriented Programming
- Exception Handling
- Scanner for console input
- VS Code

## Project Structure
```text
banking_application/
├── src/
│   ├── BankAccount.java
│   ├── BankingApp.java
│   └── Main.java
└── README.md
```

## How to Run
Open the terminal inside the `src` folder.

Compile:

```bash
javac BankAccount.java BankingApp.java Main.java
```

Run:

```bash
java Main
```

## Initial Balance
The application starts with a demo balance of Rs. 10,000.00.

## Testing
Test deposits, withdrawals, balance inquiry, negative amounts, insufficient balance, and invalid input.

## Limitation
This is an educational banking simulation. It does not connect to a real bank, and transaction data is not persisted after the program exits.

## Author
Sanket Misal
