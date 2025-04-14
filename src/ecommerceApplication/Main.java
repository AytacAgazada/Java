package ecommerceApplication;
import java.util.Scanner;
import java.util.*;
import java.nio.file.*;

public class Main {
    public static void main(String[] args) {
        List<CoffeeProduct> allProducts = new ArrayList<>();
        allProducts.add(new CoffeeProduct(1, "Espresso", 3.5));
        allProducts.add(new CoffeeProduct(2, "Cappuccino", 4.0));
        allProducts.add(new CoffeeProduct(3, "Latte", 4.5));

        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer(1, "John Doe", "john@example.com"));
        customers.add(new Customer(2, "Jane Smith", "jane@example.com"));
        customers.add(new Customer(3, "Mark Brown", "mark@example.com"));

        List<PremiumCustomer> premiumCustomers = new ArrayList<>();
        premiumCustomers.add(new PremiumCustomer(4, "Alice Green", "alice@example.com", 0.1));
        premiumCustomers.add(new PremiumCustomer(5, "Bob White", "bob@example.com", 0.15));

        System.out.println("☕Welcome to CaffeeMarket!");
        System.out.print("Please enter your Customer ID to start:");
        Scanner scanner = new Scanner(System.in);
        int customerId = scanner.nextInt();
        Customer selectedCustomer = null;
        for (Customer customer : customers) {
            if (customer.getId() == customerId) {
                selectedCustomer = customer;
                break;
            }
        }

        if (selectedCustomer == null) {
            System.out.println("Customer not found. Exiting.");
            return;
        }

        Cart<CoffeeProduct> cart = new Cart<>(allProducts);

        boolean exit = false;
        while(!exit){
            System.out.println("\n🍵Menu:");
            System.out.println("1. View Products");
            System.out.println("2. Add Product to Cart");
            System.out.println("3. Remove Product from Cart");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. Exit");
            System.out.print("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Available Products:");
                    for (CoffeeProduct p : allProducts) {
                        System.out.println(p.getId() + ". " + p.getCofeeName() + " - $" + p.getPrice());
                    }
                    break;
                case 2:
                    System.out.print("Enter product ID to add to cart: ");
                    int addId = scanner.nextInt();
                    cart.addProductById(addId);
                    break;
                case 3:
                    System.out.print("Enter product ID to remove from cart: ");
                    int removeId = scanner.nextInt();
                    cart.removeProductById(removeId);
                    break;
                case 4:
                    cart.viewCart();
                    break;
                case 5:
                    Order order = new Order(selectedCustomer, cart);
                    order.displayOrderDetails();
                    cart = new Cart<>(allProducts);
                    break;
                case 6:
                    System.out.println("Exiting the application...");
                    System.out.println("Total amount of your cart: $" + cart.calculateTotal());
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }


    }
}
