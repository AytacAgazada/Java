package homework.Lesson;
import java.util.Scanner;
public class MagicNumberGame {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 101);
        Scanner scn = new Scanner(System.in);

        System.out.println("The computer randomly selects a number within a certain range. The user must guess this number. After each guess, the user is given a hint:\n" +
                "If it is said larger, he must increase his guess.\n" +
                "If it is said smaller, he must decrease his guess.\n" +
                "The game ends when the user finds the correct number.You have 5 chances to guess!");

        boolean win = false;

        for (int i=1 ; i<=5 ; i++){
            System.out.print(i +". Enter your guess: ");
            int number = scn.nextInt();
            if(number==randomNumber){
                System.out.println("Congrats! You won!");
                win = true;
                break;
            }else if (number < randomNumber) {
                System.out.println("Sorry! Your guess is wrong! Try a larger number.");
            } else {
                System.out.println("Sorry! Your guess is wrong! Try a smaller number.");
            }
        }

        if (!win) {
            System.out.println("Game Over! The correct number was: " + randomNumber);
        }

    }
}
