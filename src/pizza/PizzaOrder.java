package pizza;

import java.util.Scanner;

public class PizzaOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Pizza pizza = new Pizza();

        System.out.print("Enter pizza size (Small, Medium, Large): ");
        pizza.setSize(scn.nextLine());

        System.out.print("Enter toppings (Pepperoni, Margherita, Veggie): ");
        pizza.setToppings(scn.nextLine());

        String size = pizza.getSize();
        String toppings = pizza.getToppings();

        Pizza selectedPizza;

        switch (toppings.toLowerCase()) {
            case "pepperoni":
                selectedPizza = new PepperoniPizza(size, toppings);
                break;
            case "margherita":
                selectedPizza = new MargheritaPizza(size, toppings);
                break;
            case "veggie":
                selectedPizza = new VeggiePizza(size, toppings);
                break;
            default:
                System.out.println("❌ We don't have this type of pizza.");
                return;
        }

        System.out.print("How many pizzas would you like? ");
        int amount = scn.nextInt();

        double unitPrice = selectedPizza.calculatePrice();
        selectedPizza.setPrice(unitPrice);
        double total = unitPrice * amount;

        System.out.println("Total: " + total + "$");
        selectedPizza.displayPizza();

        System.out.println("✅ Order placed successfully!");
        System.out.println("🍕 Enjoy your meal.");
    }
}
