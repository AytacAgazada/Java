package eventTicketBookingSystem;

import java.util.*;

public class EventTicketApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketService service = new TicketService();

        System.out.println("\n🎉 Welcome to the CodeFest 2025 Ticket Booking System!");

        while (true) {
            System.out.println("\n📋 Choose an operation: [1] Book  [2] Cancel  [3] View list  [0] Exit");
            System.out.print("Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("👤 Name: ");
                    String name = scanner.nextLine();
                    System.out.print("✉️ Email: ");
                    String email = scanner.nextLine();
                    service.bookTicket(name, email);
                    break;
                case 2:
                    System.out.print("✉️ Email to cancel: ");
                    String cancelEmail = scanner.nextLine();
                    service.cancelTicket(cancelEmail);
                    break;
                case 3:
                    service.printAll();
                    break;
                case 0:
                    System.out.println("👋 Exiting the program. Thank you!");
                    return;
                default:
                    System.out.println("⚠️ Invalid choice! Please try again.");
            }
        }
    }
}
