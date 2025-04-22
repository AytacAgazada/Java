package eventTicketBookingSystem;

import java.util.Objects;

public class Attendee implements Comparable<Attendee>{
    private String name;
    private String email;

    public Attendee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {

        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return Objects.equals(name, attendee.name) && Objects.equals(email, attendee.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
    @Override
    public String toString() {
        return "👤 " + name + " (✉️ " + email + ")";
    }

    @Override
    public int compareTo(Attendee o) {
        return this.name.compareToIgnoreCase(o.name);
    }
}
