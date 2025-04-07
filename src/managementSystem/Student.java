package managementSystem;

public class Student extends Person {
    public Student(String name, int age){
        super(name, age, "Student");
    }

    @Override
    public void introduce() {
        System.out.println("👩‍🎓 I'm student " + name + ", aged " + age + ".");
    }

    @Override
    public void doWork(){
        System.out.println("📚" +name+ " the Student is studying for exams.");
    }
}
