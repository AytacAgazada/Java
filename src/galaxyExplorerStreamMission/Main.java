package galaxyExplorerStreamMission;

import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<Planet> planets = List.of(
                new Planet("Earth", true, 0),
                new Planet("Mars", false, 0.0000158),
                new Planet("Kepler-452b", true, 1400),
                new Planet("Gliese 581g", true, 20),
                new Planet("Alpha Centauri Bb", false, 4.37),
                new Planet("Proxima Centauri b", true, 4.24)
        );

        List<Astronaut> astronauts = List.of(
                new Astronaut("Nova", 7, true),
                new Astronaut("Orion", 4, false),
                new Astronaut("Vega", 10, true),
                new Astronaut("Sirius", 2, true),
                new Astronaut("Andromeda", 6, true)
        );

        List<Mission> missions = List.of(
                new Mission("Lunar Survey", 2, false),
                new Mission("Mars Colonization", 5, true),
                new Mission("Asteroid Mining", 1, false),
                new Mission("Deep Space Recon", 8, true)
        );

        System.out.println("1. Habitable Planets: ");

        List<String> habitablePlanets = planets.stream()
                .filter(planet -> planet.habitable)
                .map(planet -> planet.name)
                .toList();
        System.out.println(habitablePlanets);

        System.out.println("\nExperienced & Available Astronauts (>5 yrs): ");
        astronauts.stream()
                .filter(astronaut -> astronaut.experienceYears > 5 && astronaut.available)
                .forEach(System.out::println);

        System.out.println("\nFirst Unclassified Mission: ");
        missions.stream()
                .filter(m -> !m.classified)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("\nMission Titles in UPPERCASE (requiredExperience < 3): ");
        List<String> easyMissionsissions = missions.stream()
                .filter(mission -> mission.requiredExperience < 3)
                .map(mission -> mission.title.toUpperCase())
                .toList();
        System.out.println(easyMissionsissions);

        System.out.println("\nPlanets sorted by distance from Earth (ascending): ");
        planets.stream()
                .sorted(Comparator.comparingDouble(p -> p.distanceFromEarth))
                .forEach(System.out::println);

        System.out.println("\nCount of planets farther than 100 light years: ");
        long count = planets.stream()
                .filter(planet -> planet.distanceFromEarth > 100)
                .count();
        System.out.println(count);

        System.out.println("\nSkip first 2 astronauts and print next 2: ");
        astronauts.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        System.out.println("\nIs any mission classified? ");
        boolean anyClassified = missions.stream()
                .anyMatch(mission -> mission.classified);
        System.out.println(anyClassified);

        System.out.println("\nLast planet in the list (using reduce): ");
        planets.stream()
                .reduce((first,second) -> second)
                .ifPresent(System.out::println);

        System.out.println("\nAstronaut code names only: ");
        astronauts.stream().
                map(astronaut -> astronaut.codeName)
                .forEach(System.out::println);

        System.out.println("\nBonus Challenge: Print only lowercase Strings from mixed Stream:");
        Stream<Object> mixedStream = Stream.of("Galaxy", 42, true, "Explorer", 99, false, "Mission");
        mixedStream
                .filter(o -> o instanceof  String)
                .map(o -> ((String) o).toLowerCase())
                .forEach(System.out::println);


    }
}

