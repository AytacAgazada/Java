package homework.universitySystem;

public class Main {
    public static void main(String[] args) {

        Person professorPerson = new Person("Dr. Smith", 45, "Professor");
        Professor professor = new Professor(professorPerson, "Computer Science");
        professor.introduce();
        professor.teachCourse();

        System.out.println();

        Person studentPerson = new Person("Alice", 20, "Student");
        Student student = new Student(studentPerson, "Software Engineering");
        student.introduce();
        student.study();

        System.out.println();

        Person adminPerson = new Person("Mr. Johnson", 50, "Administrator");
        Administrator admin = new Administrator(adminPerson, "Admissions");
        admin.introduce();
        admin.manage();
    }
}
