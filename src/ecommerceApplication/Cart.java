package ecommerceApplication;

import java.util.*;

public class Cart<T extends CoffeeProduct> {
    private List<T> selectedProducts = new ArrayList<>();
    private List<T> allProducts;

    public Cart(List<T> allProducts) {
        this.allProducts = allProducts;
    }

    public void addProductById(int productId) {
        for (T product : allProducts) {
            if (product.getId() == productId) {
                selectedProducts.add(product);
                System.out.println("✅ Added to cart: " + product.getCofeeName());
                return;
            }
        }
        System.out.println("❌ Product not found.");
    }

    public void removeProductById(int productId) {
        selectedProducts.removeIf(p -> p.getId() == productId);
    }

    public void viewCart() {
        if (selectedProducts.isEmpty()) {
            System.out.println("🛒 Your cart is empty.");
        } else {
            System.out.println("🛒 Your Cart:");
            for (T product : selectedProducts) {
                System.out.println(product.getCofeeName() + " - $" + product.getPrice());
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (T product : selectedProducts) {
            total += product.getPrice();
        }
        return total;
    }
    public List<T> getCartItems() {
        return selectedProducts;
    }

}
