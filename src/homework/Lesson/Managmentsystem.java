package homework.Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Managmentsystem {

    static String[] employeeNames = new String[5];
    static String[] departments = new String[5];
    static double[] salaries = new double[5];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {

            System.out.println("Enter name: ");
            employeeNames[i] = scn.nextLine();

            System.out.println("Enter departments: ");
            departments[i] = scn.nextLine();

            System.out.println("Enter salaries: ");
            salaries[i] = scn.nextDouble();

            scn.nextLine();
        }

        Arrays.sort(salaries);
        for (int i = 0; i < 5; i++) {
            System.out.println("Name: " + employeeNames[i] +
                    ", Department: " + departments[i] +
                    ", Salary: " + salaries[i]);
        }


        double average = 0;
        System.out.println(Averagecalculator(average));

        int heghest = 0;
        int lowest = 0;
        System.out.println(highestLowest(heghest,lowest));

        System.out.print("Search for an employee: ");
        String name = scn.nextLine();
        System.out.println(findEmployee(name));

        System.out.print("Search for an employee: ");
        String name2 = scn.nextLine();
        System.out.println(update(name2,scn));
    }


    public static String Averagecalculator (double average){

        average = Arrays.stream(salaries).average().getAsDouble();
        String result = "Average salary: " + average;

        return result;
    }

    public static String highestLowest (int heghest, int lowest){

        heghest = (int) Arrays.stream(salaries).max().getAsDouble();
        lowest = (int) Arrays.stream(salaries).min().getAsDouble();
        System.out.println("Heghest grade: "+ heghest);
        System.out.println("Lowest grade: "+ lowest);
        return "";
    }

    public static String findEmployee (String name){

        for (int i = 0; i < employeeNames.length; i++) {
            if (employeeNames[i].equals(name)){
                return name + " works in " + departments[i] +" and earns $" + salaries[i];
            }
        }

        return "Invalid name!";
    }

    public static String update(String name2, Scanner scn) {


        for (int i = 0; i < employeeNames.length; i++) {
            if (employeeNames[i].equals(name2)){
                System.out.print("Enter new salary: ");
                double salary = scn.nextDouble();
                return name2 + "'s salary has been updated! New salary: " + salary;
            }
        }
        return "Invalid name!";
    }



}
