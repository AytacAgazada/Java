package server.scenario;

public class ExoPlanet {
    private String exoPlanetName;
    private int gravityLevel;
    private String availableResources;

    public ExoPlanet(String exoPlanetName, String availableResources, int gravityLevel) {
        this.exoPlanetName = exoPlanetName;
        this.availableResources = availableResources;
        this.gravityLevel = gravityLevel;
    }

    public String getExoPlanetName() {
        return exoPlanetName;
    }

    public void setExoPlanetName(String exoPlanetName) {
        this.exoPlanetName = exoPlanetName;
    }

    public int getGravityLevel() {
        return gravityLevel;
    }

    public void setGravityLevel(int gravityLevel) {
        this.gravityLevel = gravityLevel;
    }

    public String getAvailableResources() {
        return availableResources;
    }

    public void setAvailableResources(String availableResources) {
        this.availableResources = availableResources;
    }

    public  String gatherResources() {
        if (!availableResources.isEmpty()) {
            System.out.println("Resources collected from " + exoPlanetName + ": " + availableResources);
            this.availableResources = "";
        } else {
            System.out.println("No resources left on " + exoPlanetName);
        }
        return "";
    }

}
