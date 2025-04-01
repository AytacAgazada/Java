package scenario;

public class Starship {
    private String starName;
    private int velocity;
    private int fuelLevel;

    public Starship(String starName, int fuelLevel, int velocity) {
        this.starName = starName;
        this.fuelLevel = fuelLevel;
        this.velocity = velocity;
    }

    public String getStarName() {
        return starName;
    }

    public void setStarName(String starName) {
        this.starName = starName;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String launch() {
        if (fuelLevel > 0) {
            return "Starship " + starName + " is launching!";
        } else {
            return "Not enough fuel to launch.";
        }
    }

    public String land() {
        if (velocity > 0) {
            return "Starship " + starName + " has landed safely.";
        } else {
            return "Starship is already on the ground.";
        }
    }

    public String refuel(int amount) {
        fuelLevel += amount;
        return "Starship " + starName + " refueled by " + amount + " units. Current fuel level: " + fuelLevel;
    }
}
