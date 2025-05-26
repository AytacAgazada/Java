package galaxyExplorerStreamMission;

public class Astronaut {
    String codeName;
    int experienceYears;
    boolean available;

    public Astronaut(String codeName, int experienceYears, boolean available) {
        this.codeName = codeName;
        this.experienceYears = experienceYears;
        this.available = available;
    }

    @Override
    public String toString() {
        return "Astronaut{" +
                "codeName='" + codeName + '\'' +
                ", experienceYears=" + experienceYears +
                ", available=" + available +
                '}';
    }
}
