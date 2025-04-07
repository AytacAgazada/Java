package managementSystem;

import virtualZoo.Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Person> people;
    public static void main(String[] args) {
        people.add(new Engineer("Alice", 30));
        people.add(new Student("Bob", 20));
        people.add(new Doctor("Clara", 40));
        Scanner scn = new Scanner(System.in);
        System.out.println("Choose a city runtime:\n 1. Work\n 2. Rest\n 3. Status Check" );

        System.out.print("Your choice: ");
        int choice = scn.nextInt();

        switch (choice){
            case 1:
                runtime("work");
                break;
            case 2:
                runtime("rest");
                break;
            case 3:
                runtime("Status Check");
                break;
            default:
                System.out.println("❌ Invalid choice.");

        }
        people = null;
        System.gc();
        System.out.println("\nFinalizing...");


    }
    public static void runtime(String type){
        switch (type) {
            case "work":
                for (Person p : people) {
                    p.introduce();
                    p.doWork();
                }
                break;
            case "rest":
                for (Person p : people) {
                    p.introduce();
                    p.rest();
                }
                break;
            case "status":
                for (Person p : people) {
                    p.introduce();
                    try {
                        if (Math.random() > 0.5) {
                            throw new RuntimeException("City sensor malfunction for " + p.name + "!");
                        }
                        System.out.println("✅ Status OK for " + p.name);
                    } catch (RuntimeException e) {
                        System.out.println("⚠️ Error occurred: " + e.getMessage());
                    }
                }
                break;
            default:
                System.out.println("❌ Invalid runtime type. ");

        }
    }

}


