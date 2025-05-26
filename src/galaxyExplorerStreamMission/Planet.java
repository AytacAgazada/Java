package galaxyExplorerStreamMission;

public class Planet {
    String name;
    boolean habitable;
    double distanceFromEarth;

    public Planet(String name, boolean habitable, double distanceFromEarth) {
        this.name = name;
        this.habitable = habitable;
        this.distanceFromEarth = distanceFromEarth;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", habitable=" + habitable +
                ", distanceFromEarth=" + distanceFromEarth +
                '}';
    }
}
