package universitySystem;

public class Person {

    private String name;
    private int age;
    private String role;

    public Person(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + ", I am " + age + " years old, and I am a " + role + ".");
    }
}
