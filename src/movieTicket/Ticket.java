package movieTicket;

public class Ticket {
    String movieName;
    MovieGenre genre;
    Double price;
    Boolean isAvailable;

    public Ticket(String movieName, MovieGenre genre, Double price, Boolean isAvailable) {
        this.movieName = movieName;
        this.genre = genre;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    public static void printAvailableTickets(Ticket[] tickets) {
        System.out.println("🎟️ Available Tickets:\n");
        for (Ticket ticket : tickets) {
            if (ticket.isAvailable != null && ticket.isAvailable) {
                System.out.println("## 🎬 Movie: " + ticket.movieName);
                System.out.println("📽️ Genre: " + ticket.genre);
                System.out.println("💵 Price: $" + ticket.price + "\n");
            }
        }
    }
}
