package easyTask;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("📝 Enter a sentence: ");
        String text = scanner.nextLine();
        String[] words = text.toLowerCase().split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("\n🔍 Word Frequency Report:");
        System.out.println("──────────────────────────");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println("🟡 \"" + entry.getKey() + "\" appears 👉 " + entry.getValue());
        }
    }
}
