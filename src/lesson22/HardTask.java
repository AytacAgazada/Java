package lesson22;

import java.util.*;
import java.util.Map;
import java.util.function.*;

public class HardTask {
    public static void main(String[] args) {
        List<String> names = List.of("Alice","Bob","Anna","Brian","anna");

        Function<String, String> trim = String::trim;
        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, Integer> getLength = String::length;

        Function<String, Integer> chainedFunction = trim.andThen(toUpperCase).andThen(getLength);
        for (String name : names) {
            System.out.println("Processed \"" + name + "\" → length: " + chainedFunction.apply(name));
        }
        System.out.println("-------------------------------------------");

        Map<String, Supplier<String>> message = Map.of(
                "greeting", () -> "Hello!",
                "farewell", () -> "Goodbye!"
        );
        System.out.println(message.get("greeting").get());

        System.out.println("-------------------------------------------");

        List<String> sortedNames = new ArrayList<>(names);
        sortedNames.sort(Comparator.comparingInt(String::length));

        System.out.println("Sorted by length:");
        for (String name : sortedNames) {
            System.out.println(name + " → Length: " + name.length());
        }
        System.out.println("-------------------------------------------");

    }
}
