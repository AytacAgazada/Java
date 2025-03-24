package homework.Lesson;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {

        Scanner scn =  new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = scn.nextLine();

        // Student Exam Evaluator

        /*

        System.out.print("Enter exam score: ");
        int exam = scn.nextInt();

        if (exam >= 50 && exam <= 100){
            System.out.print(" You passed the exam!!!");
            if (exam == 100){
                System.out.print(" Perfect score! You qualify for a scholarship!");
            }else if (exam >= 90){
                System.out.println(" Excellent!");
            } else if (exam >= 75 && exam <=89 ) {
                System.out.print("Good job!");
            }else {
                System.out.println(" You passed! Keep improving!");
            }

        }else {
            System.out.println(" Unfortunately, you failed. Try again!");
        }*/

        //ATM Cash Withdrawal System

        System.out.println("Enter their current account balance : ");
        double balance = scn.nextDouble();

        System.out.println("Enter the amount you want to withdraw: ");
        double amount = scn.nextDouble();

        if (balance <=0 && amount <=0 ){
            System.out.println("Invalid amount! Please enter a positive number.");
        }else {
            if (amount > balance){
                System.out.println("Insufficient funds!");
            } else if (amount >=1000) {
                System.out.println("Large transaction detected! Manager approval required.");

            } else if (amount == balance) {
                System.out.println("Are you sure? Your account will be empty!");

            } else {
                balance -= amount;
                System.out.println("Balance: " + balance );
                if (balance < 20){
                    System.out.println("Low balance alert!");
                }
                

            }
                

        }


    }
}
