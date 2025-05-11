package coffeeShop;

public enum CoffeeType {
    ESPRESSO("Espresso", 2.5),
    LATTE("Latte", 3.5),
    CAPPUCCINO("Cappuccino", 3.8),
    AMERICANO("Americano", 2.8),
    MOCHA("Mocha", 4.0);

    private final String label;
    private final double price;

    CoffeeType(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public String getLabel() {
        return label;
    }

    public double getPrice() {
        return price;
    }
}

