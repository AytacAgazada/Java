package server;
import java.util.Scanner;
public class MyCode {
    public static void main(String[] args) {

            int[] numbers = {1, 2, 3, 4, 5};

            // for döngüsü
            System.out.println("For Döngüsü:");
            for (int i = 0; i < numbers.length; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();

            // foreach döngüsü
            System.out.println("Foreach Döngüsü:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            // while döngüsü
            System.out.println("While Döngüsü:");
            int i = 0;
            while (i < numbers.length) {
                System.out.print(numbers[i] + " ");
                i++;
            }
            System.out.println();

            // do-while döngüsü
            System.out.println("Do-While Döngüsü:");
            int j = 0;
            do {
                System.out.print(numbers[j] + " ");
                j++;
            } while (j < numbers.length);
            System.out.println();


    }

   // public static String salaryBonus(){}
}


