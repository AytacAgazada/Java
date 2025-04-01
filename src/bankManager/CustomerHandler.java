package bankManager;

import java.util.Scanner;

public class CustomerHandler {
    private Account account;

    public CustomerHandler(Account account) {
        this.account = account;
    }

    public void deposit(double amount) {
        try {
            if (account == null) {
                System.out.println("Account not found. Please contact support.");
                return;
            }
            if (amount > 0) {
                account.setBalance(account.getBalance() + amount);
                System.out.println("Deposit successful! New balance: " + account.getBalance());
            } else {
                throw new IllegalArgumentException("Oops! Please enter a valid amount.");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }

    public void withdraw(double amount) {
        try {
            if (account == null) {
                throw new NullPointerException("Account not found. Please contact support.");
            }
            if (amount > 0 && amount <= account.getBalance()) {
                account.setBalance(account.getBalance() - amount);
                System.out.println("Withdrawal successful! Remaining balance: " + account.getBalance());
            } else {
                System.out.println("Invalid withdrawal amount or insufficient balance.");
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

    public void calculation(double interestRate) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter interest rate: ");
            interestRate = Double.parseDouble(scanner.nextLine());

            if (interestRate <= 0) {
                System.out.println("Invalid interest rate. It must be a positive value.");
                return;
            }

            double interest = account.getBalance() * (interestRate / 100);
            double newBalance = account.getBalance() + interest;
            System.out.println("Interest calculated: " + interest);
            System.out.println("New balance after interest: " + newBalance);

        } catch (NumberFormatException e) {
            System.out.println("Invalid interest rate format! Please enter a valid number.");
        } finally {
            System.out.println("Interest calculation completed.");
        }
    }

}
