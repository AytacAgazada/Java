package pizza;

public class Pizza {
    String size;
    String toppings;
    double price;

    public Pizza(String size, String toppings) {
        this.size = size;
        this.toppings = toppings;
    }

    public Pizza() {}

    public double calculatePrice(){ return price; }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getToppings() {
        return toppings;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayPizza(){
        System.out.println("--------------------------");
        System.out.println("Size: " + size);
        System.out.println("Toppings: " + toppings);
        System.out.println("Price: " + price +" $");
        System.out.println("--------------------------");
    }
}