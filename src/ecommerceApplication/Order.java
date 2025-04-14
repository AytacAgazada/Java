package ecommerceApplication;

public class Order {
    private Customer customer;
    private Cart<CoffeeProduct> cart;
    private double totalPrice;

    public Order(Customer customer, Cart<CoffeeProduct> cart) {
        this.customer = customer;
        this.cart = cart;
        this.totalPrice = calculateFinalPrice();
    }

    private double calculateFinalPrice() {
        double total = cart.calculateTotal();
        if (customer instanceof PremiumCustomer) {
            double discount = ((PremiumCustomer) customer).getDiscountRate();
            total = total - (total * discount);
        }
        return total;
    }

    public void displayOrderDetails() {
        System.out.println("\n🧾 Order Summary for " + customer.getName());
        cart.viewCart();
        if (customer instanceof PremiumCustomer) {
            double discount = ((PremiumCustomer) customer).getDiscountRate() * 100;
            System.out.println("🎁 Premium Discount Applied: " + discount + "%");
        }
        System.out.println("💳 Total Price: $" + totalPrice);
    }
}

