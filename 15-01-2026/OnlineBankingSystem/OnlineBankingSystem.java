package ExceptionHandling;

import java.util.Scanner;

public class OnlineBankingSystem {

    private static Account[] accounts = {
            new Account(101, "Alice", 5000),
            new Account(102, "Bob", 5000)
    };

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            transferFunds();
        } catch (Exception e) {
            System.out.println("Transaction failed: " + e.getMessage());
        } finally {
            System.out.println("Transaction ended.");
        }
    }

    private static void transferFunds()
            throws InsufficientFundsException,
                   AccountNotFoundException,
                   IllegalArgumentException {

        System.out.print("Enter source account number: ");
        int sourceAccNo = sc.nextInt();

        System.out.print("Enter target account number: ");
        int targetAccNo = sc.nextInt();

        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than zero");
        }

        Account source = findAccount(sourceAccNo);
        Account target = findAccount(targetAccNo);

        source.withdraw(amount);
        target.deposit(amount);

        System.out.println("Transaction successful!");
        System.out.println("Updated balance of " + sourceAccNo + ": " + (int) source.getBalance());
        System.out.println("Updated balance of " + targetAccNo + ": " + (int) target.getBalance());
    }

    private static Account findAccount(int accNo)
            throws AccountNotFoundException {

        for (Account acc : accounts) {
            if (acc.getAccountNumber() == accNo) {
                return acc;
            }
        }
        throw new AccountNotFoundException("Account " + accNo + " does not exist");
    }
}

class Account {

    private int accountNumber;
    private String holderName;
    private double balance;

    public Account(int accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount)
            throws InsufficientFundsException {

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance");
        }
        balance -= amount;
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends Exception {
    public AccountNotFoundException(String message) {
        super(message);
    }
}
