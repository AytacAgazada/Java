package managementSystem;

public class Doctor extends Person{
    public Doctor(String name, int age) {
        super(name, age, "Doctor");
    }

    @Override
    public void introduce() {
        System.out.println("👩‍⚕️️ I'm doctor " + name + ", aged " + age + ".");
    }

    public void doWork(){
        System.out.println(name+" the Doctor is treating patients.");
    }
}
