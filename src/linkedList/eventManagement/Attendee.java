package linkedList.eventManagement;

import java.util.Objects;

public class Attendee {
    String name;
    String email;
    String sessionTitle;

    public Attendee(String name, String email, String sessionTitle) {
        this.name = name;
        this.email = email;
        this.sessionTitle = sessionTitle;
    }

    @Override
    public String toString() {
        return "Attendee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", sessionTitle='" + sessionTitle + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return Objects.equals(name, attendee.name) && Objects.equals(email, attendee.email) && Objects.equals(sessionTitle, attendee.sessionTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, sessionTitle);
    }
}
