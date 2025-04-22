package ecommerceApp;
import java.util.*;


public class EcommerceApp {
    public static Map<Integer,Product> product = new HashMap<>();
    public static Scanner scn =  new Scanner(System.in);

    public static void main(String[] args) {
        product.put(1, new Product(1, "Laptop", 600000, "available"));
        product.put(2, new Product(2, "Phone", 300000, "available"));
        product.put(3, new Product(3, "TV", 510000, "out_of_stock"));
        product.put(4, new Product(4, "Monitor", 700000, "available"));
        product.put(5, new Product(5, "Mouse", 150000, "out_of_stock"));

        System.out.println("📦 Producs:");
        for (Map.Entry<Integer, Product> entry : product.entrySet()) {
            System.out.println(entry.getValue());
        }

        showMenu();


    }

    public static void showMenu(){
        while (true) {
            System.out.println("\n📋 MENU:");
            System.out.println("1. Add Product");
            System.out.println("2. List All Products");
            System.out.println("3. Update Product Status");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scn.nextInt();
            scn.nextLine();

            switch (choice){
                case 1 -> addProduct();
                case 2 -> listAllProduct();
                case 3 -> updateStatus();
                case 4 -> deleteProduct();
                case 5 -> {
                    System.out.println("👋 Exiting program. Goodbye!");
                    return;
                }
                default-> System.out.println("⚠️ Invalid choice. Try again.");
            }
        }
    }

    private static void addProduct(){
        try {
            System.out.print("Enter product ID: ");
            int id = scn.nextInt();
            scn.nextLine();

            if (product.containsKey(id)) {
                System.out.println("⚠️ Product with this ID already exists.");
                return;
            }

            System.out.print("Enter product name: ");
            String name = scn.nextLine();

            System.out.print("Enter product price: ");
            double price = scn.nextDouble();
            scn.nextLine();

            System.out.print("Enter product status (available / out_of_stock): ");
            String status = scn.nextLine();

            product.put(id, new Product(id, name, price, status));
            System.out.println("✅ Product added successfully.");
        }catch (NumberFormatException e){
            System.out.println("❌ Invalid input format. Please enter numeric values for ID and price.");
        }
    }

    private static void listAllProduct(){
        if (product.isEmpty()) {
            System.out.println("ℹ️ No products available.");
        } else {
            System.out.println("📦 Product List:");
            for (Product p : product.values()) {
                System.out.println(p);
            }
        }

    }

    private static void updateStatus() {
        try {
            System.out.print("Enter product ID to update: ");
            int updateId = Integer.parseInt(scn.nextLine());

            if (!product.containsKey(updateId)) {
                throw new ProductNotFoundException("Product with ID " + updateId + " not found.");
            }

            System.out.print("Enter new status: ");
            String newStatus = scn.nextLine();
            product.get(updateId).setStatus(newStatus);
            System.out.println("🔄 Product status updated.");

        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid input format.");
        } catch (ProductNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }


    private static void deleteProduct() {
        try {
            System.out.print("Enter product ID to delete: ");
            int deleteId = Integer.parseInt(scn.nextLine());

            if (!product.containsKey(deleteId)) {
                throw new ProductNotFoundException("Product with ID " + deleteId + " not found.");
            }

            product.remove(deleteId);
            System.out.println("🗑️ Product deleted.");
        } catch (NumberFormatException e) {
            System.out.println("❌ Invalid input. Please enter a number.");
        } catch (ProductNotFoundException e) {
            System.out.println("❌ " + e.getMessage());
        }
    }


}
