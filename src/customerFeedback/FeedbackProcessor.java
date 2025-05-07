package customerFeedback;

import java.util.*;

public class FeedbackProcessor {
    private static List<String> rawFeedbackList = new ArrayList<>();
    private static List<String> cleanedFeedbackList = new ArrayList<>();
    private static StringBuilder summaryReport = new StringBuilder();
    private static StringBuffer logBuffer = new StringBuffer();

    public static void loadRawFeedback() {
        rawFeedbackList.add(" Great product!!! ");
        rawFeedbackList.add(" Terrible customer SERVICE... ");
        rawFeedbackList.add("Okay! but could be better?? ");
        rawFeedbackList.add("Loved it <3");
        rawFeedbackList.add("Will not buy AGAIN!!!");
    }

    public static String cleanFeedback(String feedback) {
        return feedback.trim().replaceAll("[^a-zA-Z0-9\\s]", "").toLowerCase();
    }

    public static void processFeedback() {
        int count = 1;
        for (String feedback : rawFeedbackList) {
            String cleaned = cleanFeedback(feedback);
            cleanedFeedbackList.add(cleaned);

            summaryReport.append("Feedback #")
                    .append(count)
                    .append(": ")
                    .append(cleaned)
                    .append("\n");

            logBuffer.append("Feedback #").append(count).append(" cleaned\n");
            logBuffer.append("Feedback #").append(count).append(" added to summary\n");

            count++;
        }
    }

    public static void displayRawFeedback() {
        System.out.println("\n📝 Raw Feedback:");
        for (String feedback : rawFeedbackList) {
            System.out.println("- " + feedback);
        }
    }

    public static void displayCleanedSummary() {
        System.out.println("\n✅ Cleaned Feedback Summary:");
        System.out.println(summaryReport.toString());
    }

    public static void displayLog() {
        System.out.println("\n📄 Internal Log:");
        System.out.println(logBuffer.toString());
    }

    public static void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {

            System.out.println("\n📋 MENU");
            System.out.println("1. View All Raw Feedback");
            System.out.println("2. View Cleaned Feedback Summary");
            System.out.println("3. View Internal Log");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    displayRawFeedback();
                    break;
                case 2:displayLog();
                    displayCleanedSummary();
                    break;
                case 3:
                    displayLog();
                    break;
                case 4:
                    System.out.println("Exiting FeedbackProcessor goodbye!👋");
                    break;
                default:
                    System.out.println("Invalid choice. Please select again.❌");
            }
        }while (choice != 4);
    }
}
