package car;

public class Bmw {
    Vehicle vehicle;
    String model;

    public Bmw(Vehicle vehicle, String model) {
        this.vehicle = vehicle;
        this.model = model;
    }

    public void startCar() {
        vehicle.showDetails();
        System.out.println("Model: " + model);
    }
}
