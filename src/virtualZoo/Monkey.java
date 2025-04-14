package virtualZoo;

public class Monkey extends Animal{
    public Monkey(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void eat() {
        System.out.println();
    }

    @Override
    public void makeSound() {
        System.out.println("bdshbf");    }
}
