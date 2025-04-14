package linkedList.eventManagement;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static ArrayList<Session> sessions = new ArrayList<>();

    public static void main(String[] args) {
        sessions.add(new Session("Keynote Speech", "Dr. Smith", "09:00 AM"));
        sessions.add(new Session("AI in Healthcare", "Dr. Johnson", "10:00 AM"));
        sessions.add(new Session("Future of Work", "Ms. Lee", "11:00 AM"));
        sessions.add(new Session("Cybersecurity Trends", "Mr. Brown", "01:00 PM"));
        sessions.add(new Session("Blockchain Basics", "Ms. Green", "02:00 PM"));
        sessions.add(new Session("Data Science Workshop", "Dr. White", "03:00 PM"));

        System.out.println("First Session: " + sessions.get(0));
        System.out.println("Last Session: " + sessions.get(sessions.size() - 1));

        sessions.remove(2);
        System.out.println("\nUpdated Sessions after removal:");
        printSession();

        sessions.set(1, new Session("AI in Healthcare", "Dr. Johnson", "10:30 AM"));
        System.out.println("\nUpdated Sessions after modification:");
        printSession();

        LinkedList<LinkedList<Attendee>> attendeesList = new LinkedList<>();

        for (Session session : sessions) {
            LinkedList<Attendee> attendees = new LinkedList<>();
            attendees.add(new Attendee("Alice", "alice@example.com", session.title));
            attendees.add(new Attendee("Bob", "bob@example.com", session.title));
            attendees.add(new Attendee("Charlie", "charlie@example.com", session.title));
            attendees.add(new Attendee("David", "david@example.com", session.title));
            attendees.add(new Attendee("Eve", "eve@example.com", session.title));
            attendeesList.add(attendees);
        }

        for (int i = 0; i < attendeesList.size(); i++) {
            LinkedList<Attendee> sessionAttendees = attendeesList.get(i);
            System.out.println("\nChecking in attendees for session: " + sessions.get(i).title);
            while (!sessionAttendees.isEmpty()) {
                Attendee checkedInAttendee = sessionAttendees.removeFirst();
                System.out.println("Checked in: " + checkedInAttendee.name + " for session: " + checkedInAttendee.sessionTitle);
            }
            System.out.println("Session " + sessions.get(i).title + " is full.");
        }

    }
    public static void printSession(){
        for (Session session : sessions) {
            System.out.println(session);
        }
    }
}
