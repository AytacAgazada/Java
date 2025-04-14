package ecommerceApplication;

import java.util.Objects;

public class CoffeeProduct {
    private int id;
    private String cofeeName;
    private double price;

    public CoffeeProduct(int id, String cofeeName, double price) {
        this.id = id;
        this.cofeeName = cofeeName;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCofeeName() {
        return cofeeName;
    }

    public void setCofeeName(String cofeeName) {
        this.cofeeName = cofeeName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\n CoffeeProduct: " +
                "\n id= " + id +
                "\n cofeeName= " + cofeeName  +
                "\n price=" + price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeProduct that = (CoffeeProduct) o;
        return id == that.id && Double.compare(price, that.price) == 0 && Objects.equals(cofeeName, that.cofeeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cofeeName, price);
    }
}
