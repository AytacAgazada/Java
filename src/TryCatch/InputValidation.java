package TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter number:");

        try {
            int num =scn.nextInt();
        } catch (InputMismatchException e){
            System.out.println( "Oops! Please enter a valid number.");
        }
    }
}
