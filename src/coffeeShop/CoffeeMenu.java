package coffeeShop;

public class CoffeeMenu {
    public static void main(String[] args) {
        System.out.println("Available Coffee Menu:");

        for (CoffeeType coffee : CoffeeType.values()) {
            System.out.println(coffee.getLabel() + " - $" + coffee.getPrice());
        }
    }


}
