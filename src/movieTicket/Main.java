package movieTicket;

public class Main {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("The Great Battle", MovieGenre.ACTION, 12.5, true);
        Ticket t2 = new Ticket("Laugh Riot", MovieGenre.COMEDY, 10.0, false);
        Ticket t3 = new Ticket("Deep Space", MovieGenre.SCIFI, 15.0, true);

        Ticket[] tickets = { t1, t2, t3 };

        Ticket.printAvailableTickets(tickets);
    }
}
