package galaxyExplorerStreamMission;

public class Mission {
    String title;
    int requiredExperience;
    boolean classified;

    public Mission(String title, int requiredExperience, boolean classified) {
        this.title = title;
        this.requiredExperience = requiredExperience;
        this.classified = classified;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "title='" + title + '\'' +
                ", requiredExperience=" + requiredExperience +
                ", classified=" + classified +
                '}';
    }
}
