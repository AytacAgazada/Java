package ecommerceApplication;

public class Order {
    private Customer customer;
    private Cart cart;
    private double totalAmount;

    public Order(Customer customer, Cart cart) {
        this.customer = customer;
        this.cart = cart;
        this.totalAmount = cart.calculateTotal();
    }

    public void displayOrderDetails() {
        System.out.println("Order for " + customer.getName() + " (" + customer.getEmail() + ")");
        cart.viewCart();
        System.out.println("Total amount: $" + totalAmount);
    }
}
