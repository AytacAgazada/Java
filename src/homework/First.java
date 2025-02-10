package homework;
import java.util.Scanner;
public class First {
    public static void main(String[] args) {
       Scanner scn = new Scanner(System.in);

       //task 1: Hello world
        //System.out.println("Hello World!");

        //task 2: Data types demo
       /* System.out.print("Enter integer number: ");
        int number1 = scn.nextInt();

        System.out.print("Enter double number: ");
        double number2 = scn.nextDouble();
        scn.nextLine();

        System.out.print("Enter text: ");
        String text = scn.nextLine();

        System.out.println("int => " + number1 );
        System.out.println("double => " + number2 );
        System.out.println("String => " + text);*/

        //task 3: User Import Demo
        /*System.out.print("Hello,welcome!\nPlease enter your name: ");
        String name = scn.nextLine();

        System.out.print("Your age: ");
        int age = scn.nextInt();

        System.out.println("HAPPY " + age + "th BRITHDAY "+ name + "!!!");*/

        //task 4:
       /* System.out.print("Enter number: ");
        int number = scn.nextInt();
        if (number >= 1){
            System.out.println("Number is positive!");
        } else if (number == 0) {
            System.out.println("Number is zero!");
        }else {
            System.out.println("Number is negative!");
        }*/

        //task 5: For loop demo
       /* for (int i=0;i<=10;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }*/

        //task 6:Number Operations
        /*System.out.print("Enter number: ");
        int number = scn.nextInt();

        if (number<1){
            System.out.println("Number is not positive!");
        }else {
            for (int i=1 ; i<=number ; i++){
                System.out.println(i);
            }
        }*/

        //task 7: MultiplicationTable
        System.out.print("Enter number: ");
        int number = scn.nextInt();

        System.out.print("Multiplication table for " + number + ":");

        for (int i=0 ; i<=10 ; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }

    }
}
