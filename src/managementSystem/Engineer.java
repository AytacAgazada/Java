package managementSystem;

public class Engineer extends Person{
    public Engineer(String name, int age) {
        super(name, age, "Engineer");
    }

    @Override
    public void doWork() {
        System.out.println("🛠️ " + name + " the Engineer is designing a building.");
    }

    @Override
    public void introduce() {
        System.out.println("👷‍♂️ I'm Engineer " + name + ", aged " + age + ".");
    }
}
