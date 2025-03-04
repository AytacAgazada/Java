package homework.universitySystem;

public class Professor {

    private Person person;
    private String department;

    public Professor(Person person, String department) {
        this.person = person;
        this.department = department;
    }

    public void introduce() {
        person.introduce();
        System.out.println("I work in the " + department + " department.");
    }

    public void teachCourse() {
        System.out.println("I am teaching a course in " + department + ".");
    }
}
