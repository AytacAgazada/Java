package linkedList.eventManagement;

import java.util.Objects;

public class Session {
    String title;
    String speakerName;
    String time;

    public Session(String title, String speakerName, String time) {
        this.title = title;
        this.speakerName = speakerName;
        this.time = time;
    }


    @Override
    public String toString() {
        return "Session{" +
                "title='" + title + '\'' +
                ", speakerName='" + speakerName + '\'' +
                ", time='" + time + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Session session = (Session) o;
        return Objects.equals(title, session.title) && Objects.equals(speakerName, session.speakerName) && Objects.equals(time, session.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, speakerName, time);
    }
}
