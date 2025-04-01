package scenario;

public class Main {
    public static void main(String[] args) {

        Starship starship = new Starship("Aytac",100,500);
        System.out.println(starship.land());
        System.out.println(starship.launch());
        System.out.println(starship.refuel(200));

        Explorer explorer = new Explorer("ashh","ahh",starship);

        System.out.println(explorer.getStarship().getStarName());

        System.out.println(explorer.exitStarship());

        ExoPlanet exoPlanet = new ExoPlanet("hello","data",45);
        System.out.println(exoPlanet.gatherResources());
    }
}
