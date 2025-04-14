package virtualZoo;

import librarySystem.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalMain {
    public static ArrayList<Animal> animals;


    public static void performTask(String task){
        switch (task.toLowerCase()) {
            case "feed":
                System.out.println("🍽️ Feeding all animals...");
                for (Animal a : animals) {
                    a.eat(); // DEBUG: Step into here
                }
                break;

            case "clean":
                System.out.println("🧹 Cleaning the enclosures...");
                for (Animal a : animals) {
                    System.out.println("Cleaning " + a.name + "'s area.");
                }
                break;

            case "monitor":
                System.out.println("📋 Monitoring animal health...");
                try {
                    if (Math.random() > 0.5) {
                        throw new RuntimeException("Unexpected zoo alert! 🚨");
                    }
                    System.out.println("All animals are safe. ✅");
                } catch (RuntimeException e) {
                    System.out.println("⚠️ Error occurred: " + e.getMessage());
                }
                break;

            default:
                System.out.println("Invalid task!");

        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Zoo Management System! 🦓");
        System.out.println("Choose a task:");
        System.out.println("1 - Feed Animals");
        System.out.println("2 - Clean Enclosures");
        System.out.println("3 - Monitor Animals");
        System.out.print("Enter choice (1-3): ");

        int choice = scanner.nextInt();
        scanner.close();

        switch (choice) {
            case 1:
                performTask("feed");
                break;
            case 2:
                performTask("clean");
                break;
            case 3:
                performTask("monitor");
                break;
            default:
                System.out.println("❌ Invalid input. Exiting...");
                return;
        }

        System.out.println("\n🌞 Daily Routine:");
        for (Animal a : animals) {
            a.makeSound();
            a.sleep();
        }
    }
}

