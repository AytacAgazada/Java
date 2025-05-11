package lesson21;

import java.util.Scanner;

public class ParseMethodExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        String ageInput = scanner.nextLine();

        int age = Integer.parseInt(ageInput);
        int yearsTo18 = 18 - age;

        if (yearsTo18 > 0) {
            System.out.println("You will turn 18 in " + yearsTo18 + " years.");
        } else {
            System.out.println("You are already 18 or older.");
        }
    }
}

