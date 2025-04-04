package pizza;

public class VeggiePizza extends Pizza{
    public VeggiePizza(String size, String toppings) {
        super(size, toppings);
    }

    @Override
    public double calculatePrice(){
        switch (size.toLowerCase()){
            case "small":
                return 5.49;
            case "medium":
                return  8.49;
            case "large":
                return 10.99;

            default:
                return  0;
        }
    }

}
