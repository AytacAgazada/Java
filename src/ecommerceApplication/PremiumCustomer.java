package ecommerceApplication;

public class PremiumCustomer extends Customer{
    private double discountRate;
    public PremiumCustomer(int id, String name, String email, double discountRate) {
        super(id, name, email);
        this.discountRate = discountRate;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public double getDiscountedPrice(double price) {
        return price - (price * discountRate);
    }
}
