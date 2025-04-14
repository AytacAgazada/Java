package ecommerceApplication;
import ecommerceApplication.CoffeeProduct;
import java.util.*;

public class Cart<T> {
    private List<T> selectedProducts = new ArrayList<>();
    private List<T> allProducts;

    public Cart(List<T> allProducts) {
        this.allProducts = allProducts;
    }

    public void addProductById(int id) {
        for (T product : allProducts) {
            if (product instanceof CoffeeProduct) {
                CoffeeProduct p = (CoffeeProduct) product;
                if (p.getId() == id) {
                    selectedProducts.add((T) p);
                    System.out.println(p.getCofeeName() + " added to cart.");
                    return;
                }
            }
        }
        System.out.println("Product not found.");
    }

    public void removeProductById(int id) {
        boolean removed = selectedProducts.removeIf(p -> p instanceof CoffeeProduct && ((CoffeeProduct) p).getId() == id);
        if (removed) {
            System.out.println("Product removed from cart.");
        } else {
            System.out.println("Product not in cart.");
        }
    }

    public void viewCart() {
        if (selectedProducts.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("Cart items:");
            for (T product : selectedProducts) {
                if (product instanceof CoffeeProduct) {
                    CoffeeProduct p = (CoffeeProduct) product;
                    System.out.println(p.getId() + " - " + p.getCofeeName() + " ($" + p.getPrice() + ")");
                }
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (T product : selectedProducts) {
            if (product instanceof CoffeeProduct) {
                CoffeeProduct p = (CoffeeProduct) product;
                total += p.getPrice();
            }
        }
        return total;
    }
}
