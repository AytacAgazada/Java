package server.lesson;
import java.util.Scanner;
public class SecondLesson {

    public static void main(String[] args) {
       int age = 22;

        int price=0 ;
        double balance = 35.7;
        int result = ticketPrice(age,price);
        System.out.println("Ticket price: "+result);
        var text = checkBalance(balance);
        System.out.println(text);

        int temp = 15;
        String res = weatherSuggestion(temp);
        System.out.println(res);

        Scanner scn = new Scanner(System.in);



        System.out.print("Enter a number between 1 and 5: ");
        int num = scn.nextInt();
        String txt = snackVendingMachine(num);
        System.out.println(txt);


        String color = "yellow";
        String s = trafficLight(color);
        System.out.println(s);

        String voiting = votingEligibility(age);
        System.out.println(voiting);


        System.out.print("Enter first number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scn.nextInt();
        String a = higherNumberFinder(num1,num2);
        System.out.println(a);


        System.out.print("Enter number: ");
        int number = scn.nextInt();
        String b = magicDoor(number);
        System.out.println(b);


    }


    public static int ticketPrice(int age, int price) {
        if(age <=12){
            price = 5;
        } else if (age > 12 && age < 60) {
            price = 10;
        }else {
            price = 7;
        }
        return price;

    }

        public static String checkBalance(double balance){
            int price = ticketPrice(22,37 );
            String text = (balance >= price) ? "Nice watching!" : "Insufficient funds!";
            return text;
        }




    public static String weatherSuggestion(int temp ){
        if (temp <=10){
            return "suggest wearing a jacket and gloves";
        } else if (temp > 10 && temp < 20) {
            return "suggest wearing a light sweater";
        }else {
            return "suggest wearing a T-shirt and sunglasses";
        }
    }



    public static String snackVendingMachine(int num){
        switch (num) {
            case 1:
                return "Chips";
            case 2:
                return "Chocolate";
            case 3:
                return "Soda";
            case 4:
                return "Cookies";
            case 5:
                return "Juice";
            default:
                return "Please enter a number between 1 and 5.";
        }
    }

    public static String trafficLight(String color){
        switch (color){
            case "red":
                return "Stop";
            case "yellow":
                return "Slow down";
            default:
                return "go";
        }
    }


    public static String votingEligibility(int age){
        return  (age>=18) ? "Eligible to vote!" : "Not eligible to vote yet!";

    }


    public static String higherNumberFinder(int num1, int num2){
        return (num1 > num2) ? "The larger number is "+num1 : "The larger number is " +num2;
    }



      public static String magicDoor(int number) {
        switch (number){
            case 1:
                return "You found a treasure chest!";
            case 2:
                return "A wild animal appears!";
            case 3:
                return "You discovered a secret passage!";
            default:
                return "That's not a valid door. Try again!";
        }
      }
}
