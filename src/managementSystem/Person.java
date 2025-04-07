package managementSystem;

public class Person {
    String name;
    int age;
    String occupation;

    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void introduce() {
        System.out.println("👋 Hello, I'm " + name + ", a " + occupation + ".");
    }

    public void doWork() {
        System.out.println(name + " is working...");
    }

    public void rest() {
        System.out.println("😴 " + name + " is resting.");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
