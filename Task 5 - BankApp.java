import java.util.ArrayList;

class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: " + initialBalance);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount);
            System.out.println("Deposit successful!");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount);
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void showBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public void showTransactionHistory() {
        System.out.println("Transaction History:");
        for (String entry : transactionHistory) {
            System.out.println(entry);
        }
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(String accountHolder, double initialBalance) {
        super(accountHolder, initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 100) {
            System.out.println("Minimum withdrawal amount is 100 for SavingsAccount.");
        } else {
            super.withdraw(amount);
        }
    }
}

public class BankApp {
    public static void main(String[] args) {
        Account account = new SavingsAccount("Janani", 1000);

        System.out.println("Welcome, Janani!");

        // Simulated transactions
        account.deposit(500);
        account.withdraw(50);   // Should be rejected (less than 100)
        account.withdraw(200);  // Should succeed
        account.deposit(-100);  // Should be rejected
        account.showBalance();
        account.showTransactionHistory();

        System.out.println("Thank you for banking with us!");
    }
}
