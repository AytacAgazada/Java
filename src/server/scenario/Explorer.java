package server.scenario;

public class Explorer {
    private Starship starship;
    private String explorerName;
    private String rank;

    public Explorer(String rank, String explorerName, Starship starship) {
        this.rank = rank;
        this.explorerName = explorerName;
        this.starship = starship;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getExplorerName() {
        return explorerName;
    }

    public void setExplorerName(String explorerName) {
        this.explorerName = explorerName;
    }

    public Starship getStarship() {
        return starship;
    }

    public void setStarship(Starship starship) {
        this.starship = starship;
    }

    public void boardStarship(Starship starship) {
        this.starship = starship;
        System.out.println(explorerName + " has boarded the starship " + starship.getStarName());
    }

    public String exitStarship() {
        if (this.starship != null) {
            System.out.println(explorerName + " has exited the starship " + starship.getStarName());
            this.starship = null;
        } else {
            System.out.println(explorerName + " is not on any starship.");
        }
        return "";
    }


}
