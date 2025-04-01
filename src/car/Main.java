package car;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("BMW", 250);
        Bmw myBMW = new Bmw(myVehicle, "M5");
        myBMW.startCar();
    }
}
