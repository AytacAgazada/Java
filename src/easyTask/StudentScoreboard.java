package easyTask;

import java.util.*;

public class StudentScoreboard {
    public static void main(String[] args) {
        TreeMap<String, Integer> scores = new TreeMap<>();

        scores.put("Aytac", 95);
        scores.put("Elvin", 80);
        scores.put("Nigar", 88);
        scores.put("Kamran", 76);

        System.out.println("📊 Student Scoreboard:");
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            System.out.println("👩‍🎓 " + entry.getKey() + " -> " + entry.getValue());
        }
        //System.out.println();
       // scores.forEach((key, value) -> System.out.println("👩‍🎓 " + key + " -> " + value));


    }
}
