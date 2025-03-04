package homework.universitySystem;

public class Student {

    private Person person;
    private String major;

    public Student(Person person, String major) {
        this.person = person;
        this.major = major;
    }

    public void introduce() {
        person.introduce();
        System.out.println("I am studying " + major + ".");
    }

    public void study() {
        System.out.println("I am studying hard to become an expert in " + major + ".");
    }
}
