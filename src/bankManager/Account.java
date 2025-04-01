package bankManager;

import java.util.Scanner;

public class Account {
    private String accountNumber;
    private String name;
    private String age;
    private double balance;

    public Account(String accountNumber, String name, String age, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Balance: $" + balance);
        System.out.println("-------------------------------");
    }

    public void verifyAge() {
        Scanner scanner = new Scanner(System.in);
        int correctAge = 0;

        while (true) {
            try {
                correctAge = Integer.parseInt(this.age);
                System.out.println("Please enter your age:");
                String userAgeInput = scanner.nextLine();
                int userAge = Integer.parseInt(userAgeInput);

                if (userAge == correctAge) {
                    System.out.println("Age verified successfully: " + userAge);
                    break;
                } else {
                    System.out.println("Age mismatch. Please enter the correct age.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Invalid age format. Please enter a valid number for age.");
            }
        }
    }





}
