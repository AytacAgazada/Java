package easyTask;

import java.util.*;

public class RecentlyVisitedPages {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> history = new LinkedHashMap<>();

        history.put(1, "google.com");
        history.put(2, "openai.com");
        history.put(3, "github.com");

        System.out.println("🌐 Recently Visited Pages:");
        for (Map.Entry<Integer, String> entry : history.entrySet()) {
            System.out.println("🧭 Visit ID: " + entry.getKey() + " -> " + entry.getValue());
        }
        System.out.println("------------------------------");
        history.forEach((key, value) -> System.out.println("🧭 Visit ID: " + key + " → " + value));

    }
}
