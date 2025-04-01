package universitySystem;

public class Administrator {
    private Person person;
    private String department;

    public Administrator(Person person, String department) {
        this.person = person;
        this.department = department;
    }

    public void introduce() {
        person.introduce();
        System.out.println("I manage the " + department + " department.");
    }

    public void manage() {
        System.out.println("I am overseeing the operations in " + department + ".");
    }
}
