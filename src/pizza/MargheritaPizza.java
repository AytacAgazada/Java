package pizza;

public class MargheritaPizza extends Pizza{
    public MargheritaPizza(String size, String toppings) {
        super(size, toppings);
    }

    @Override
    public double calculatePrice(){
        switch (size.toLowerCase()){
            case "small":
                return price = 5.99;
            case "medium":
                return price = 8.99;

            case "large":
                return price = 11.99;

            default:
                return price = 0;
        }
    }
}
