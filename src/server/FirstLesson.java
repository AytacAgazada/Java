package server;

import java.util.Scanner;

public class FirstLesson {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//task : Variables

        /*System.out.print("Name: ");
        String name = scn.nextLine();

        System.out.print("Age: ");
        int age = scn.nextInt();

        System.out.print("Height: ");
        double height = scn.nextDouble();

        boolean lissing = false;
        if (age>=18 && height>=0){
            lissing=true;
        }
        System.out.println("Has a Driving License: " + lissing );*/


//task : Operators
        /*System.out.print("Enter first number: ");
        int num1 = scn.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();

        int sum,dif,prod,quot,rem;

        sum = num1+num2;
        if (num1>=num2){
            dif=num1-num2;
        } else {
            dif=num2-num1;
        }
        prod = num1 * num2;
        quot= num1 / num2;
        rem = num1 % num2;
        System.out.println("Sum: "+sum);
        System.out.println("Difference: "+dif);
        System.out.println("Product: "+prod);
        System.out.println("Quotient: "+quot);
        System.out.println("Remainder: "+rem);*/

        //task: Assignment & Comparison Operators Task
        /*int score = 50;
        score+=10;
        score*=2;
        score-=5;
        boolean res = false;
        if (score>100){
            res = true;
        }
        System.out.println("score: " + score);
        System.out.println("Is score greater than 100? " + res);*/

        //task: Logical operators task
        /*System.out.print("Enter age: ");
        int age = scn.nextInt();

        System.out.print("Enter GPA: ");
        double gpa = scn.nextDouble();

        boolean scholarship= false;

        if(age>18 && gpa>3.5){
            scholarship = true;
        }
        System.out.println("Eligible for Scolorship: " + scholarship);*/

        //task: Type casting Task
        int num = 82;
        double db = num;
        int a = (int)db;
        char c = 'A';
        int b = (int)c;
        System.out.println("Number : "+num);
        System.out.println("1. n `int` to a `double`: " +db );
        System.out.println("2. A `double` to an `int`: " + a);
        System.out.println("3. A `char` to an `int`"+c);



    }
}

