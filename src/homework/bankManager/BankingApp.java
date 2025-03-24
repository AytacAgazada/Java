package homework.bankManager;

import java.util.List;
import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Account> accounts = FileHandler.loadAccountsFromFile("C:\\Users\\User\\Desktop\\BankManager.txt");

        if (accounts.isEmpty()) {
            System.out.println("No accounts found!");
            return;
        }

        System.out.println("Please select an account:");
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println((i + 1) + ". " + accounts.get(i).getName());
        }

        int accountChoice = scanner.nextInt();
        if (accountChoice < 1 || accountChoice > accounts.size()) {
            System.out.println("Invalid choice. Exiting.");
            return;
        }

        Account selectedAccount = accounts.get(accountChoice - 1);

        CustomerHandler customerHandler = new CustomerHandler(selectedAccount);

        boolean running = true;
        while (running) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. View Account Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Calculate Interest");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    selectedAccount.displayAccountInfo();
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    customerHandler.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    customerHandler.withdraw(withdrawAmount);
                    break;
                case 4:
                    System.out.print("Enter interest rate: ");
                    double interestRate = scanner.nextDouble();
                    customerHandler.calculation(interestRate);
                    break;
                case 5:
                    System.out.println("Exiting the Banking System...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        selectedAccount.verifyAge();
    }
}
