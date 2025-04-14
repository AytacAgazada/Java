package genericLesson;

public class GenericMain {
    public static void main(String[] args) {
        User user = new User("Aytac", 505);
        InfoPair<String, String> contact = new UserDetail<>(user, "3535");

        System.out.println("Contact Key (User): " + contact.getKey());
        System.out.println("Contact Value (Phone): " + contact.getValue());
    }
}
