package virtualZoo;

public class Lion extends Animal{
    public Lion(String name, int age, String species) {
        super("Lion", age, species);
    }

    @Override
    public void makeSound(){
        System.out.println("dfsd");
    }

    @Override
    public void eat(){
        System.out.println("");
    }

}
