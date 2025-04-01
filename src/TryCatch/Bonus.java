package TryCatch;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int age = 0;

        while (true) {
            try {
                System.out.println("Enter age: ");
                String input = scn.nextLine();
                age = Integer.parseInt(input);

                if (age <= 0) {
                    System.out.println("Age must be a positive number. Try again.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }

        System.out.println("Your age: " + age);
    }
}
