package TryCatch;

import java.util.Scanner;

public class ParseException {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try {
            System.out.println("Enter number: ");
            String input = scn.nextLine();
            int num = Integer.parseInt(input);        }
        catch (Exception  e){
            System.out.println("Invalid number format!");
        }finally {
            System.out.println( "Execution completed!" );
        }
    }
}
