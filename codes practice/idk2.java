// Custom exception class for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// BankAccount class
class BankAccount {
    // Private attribute for balance
    private double balance;

    // Constructor to initialize balance
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. You tried to withdraw $" + amount + ", but your balance is only $" + balance);
        } else {
            balance -= amount;
            System.out.println("Successfully withdrew: $" + amount);
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

// Main class to demonstrate the BankAccount and exception handling
public class Main {
    public static void main(String[] args) {
        // Create a BankAccount object with an initial balance
        BankAccount account = new BankAccount(1000);

        // Perform some deposits
        account.deposit(500);  // Deposit $500
        account.deposit(200);  // Deposit $200

        // Display current balance
        System.out.println("Current balance: $" + account.getBalance());

        // Try to withdraw an amount that might cause an exception
        try {
            account.withdraw(2000);  // Attempt to withdraw $2000 (which exceeds the balance)
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Display balance after the withdrawal attempt
        System.out.println("Balance after withdrawal attempt: $" + account.getBalance());
    }
}
