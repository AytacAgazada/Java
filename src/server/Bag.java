package server;
import java.util.Scanner;

public class Bag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] movies = {"Inception", "Interstellar", "The Matrix", "Avatar"};
        System.out.println("Welcome to the Movie Booking System!");

        System.out.println("\nAvailable Movies:");
        for (int i = 0; i < movies.length; i++) {
            System.out.println(i + ": " + movies[i]);
        }

        System.out.print("\nEnter the movie name you want to book: ");
        String selectedMovie = scanner.nextLine();

        boolean movieExists = false;
        for (String movie : movies) {
            if (movie.equals(selectedMovie)) {
                movieExists = true;
                break;
            }
        }

        if (!movieExists) {
            System.out.println("Invalid movie selection. Try again.");
            return;
        }

        int age = 0;
        boolean validAge = false;

        while (!validAge) {
            System.out.print("Enter your age: ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 0) {
                    validAge = true;
                } else {
                    System.out.println("Age cannot be negative. Please enter a valid age.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number for age.");
                scanner.next();
            }
        }

        String ticketPrice = (age < 12) ? "$5 (Child Price)" :
                (age < 18) ? "$8 (Teen Price)" :
                        "$10 (Adult Price)";

        System.out.println("Ticket Price for " + selectedMovie + ": " + ticketPrice);

        scanner.nextLine();

        System.out.print("Confirm booking? (yes/no): ");
        String confirmation = scanner.nextLine();

        switch (confirmation.toLowerCase()) {
            case "yes":
                System.out.println("Booking confirmed! Enjoy your movie.");
                break;
            case "no":
                System.out.println("Booking cancelled.");
                break;
            default:
                System.out.println("Invalid choice. Exiting.");
        }

        scanner.close();
    }
}