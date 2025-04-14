package genericLesson;

public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String toString() {
        return "User{name='" + name + "', id=" + id + "}";
    }
}
