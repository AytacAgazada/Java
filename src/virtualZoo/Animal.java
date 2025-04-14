package virtualZoo;

public class Animal {
    String name;
    int age;
    String species;

    public Animal(String name, int age, String species) {
        this.name = name;
        this.age = age;
        this.species = species;
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

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void makeSound(){
        System.out.println("hello");
    }

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep....");
    }
}
