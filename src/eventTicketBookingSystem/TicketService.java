package eventTicketBookingSystem;

import java.util.*;

public class TicketService {
    private HashSet<Attendee> hashSet = new HashSet<>();
    private LinkedHashSet<Attendee> linkedHashSet = new LinkedHashSet<>();
    private TreeSet<Attendee> treeSet = new TreeSet<>();

    public void bookTicket(String name, String email) {
        Attendee attendee = new Attendee(name, email);

        if (hashSet.contains(attendee)) {
            System.out.println("⚠️ Already booked: " + attendee);
        } else {
            hashSet.add(attendee);
            linkedHashSet.add(attendee);
            treeSet.add(attendee);
            System.out.println("✅ Booking successful: " + attendee);
        }
    }

    public void cancelTicket(String email) {
        Attendee temp = new Attendee("", email);

        if (hashSet.remove(temp)) {
            linkedHashSet.remove(temp);
            treeSet.remove(temp);
            System.out.println("❌ Booking canceled: ✉️ " + email);
        } else {
            System.out.println("⚠️ No booking found with email: ✉️ " + email);
        }
    }

    public void printAll() {
        System.out.println("\n🔹 HashSet (Random order):");
        hashSet.forEach(System.out::println);

        System.out.println("\n🔸 LinkedHashSet (Insertion order):");
        linkedHashSet.forEach(System.out::println);

        System.out.println("\n🔺 TreeSet (Alphabetical order):");
        treeSet.forEach(System.out::println);
    }
}
