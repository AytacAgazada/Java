package pizza;


public class PepperoniPizza extends Pizza{
    public PepperoniPizza(String size, String toppings) {
        super(size, toppings);
    }

    @Override
    public double calculatePrice(){
        switch (size.toLowerCase()){
            case "small":
                return price= 6.99;
            case "medium":
                return price = 9.99;
            case "large":
                return price = 12.99;
            default:
                return price = 0;
        }
    }
}
