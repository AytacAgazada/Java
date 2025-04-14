package virtualZoo;

public class Elephant extends Animal{
    public Elephant(String name, int age, String species) {
        super("Elephant", age, species);
    }

    @Override
    public void makeSound() {
        System.out.println("adsfd");
    }

    @Override
    public void eat() {
        System.out.println();
    }
}
