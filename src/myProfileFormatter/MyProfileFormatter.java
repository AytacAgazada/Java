package myProfileFormatter;

import  java.util.*;
public class MyProfileFormatter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        System.out.print("Enter your favorite quote: ");
        String quote = scanner.nextLine();

        System.out.print("Enter a short bio: ");
        String bio = scanner.nextLine();

        String upperName = name.toUpperCase();
        String firstName = name.substring(0, name.indexOf(" "));

        boolean containsLife = quote.toLowerCase().contains("life");

        String cleanedBio = bio.trim().replace("coding", "programming");

        StringBuilder profile = new StringBuilder();
        profile.append("=== My Profile ===\n");
        profile.append("Name       : ").append(name).append("\n");
        profile.append("Age        : ").append(age).append("\n");
        profile.append("Quote      : \"").append(quote).append("\"\n");
        profile.append("About Me   : ").append(cleanedBio).append("\n");

        StringBuffer logs = new StringBuffer();
        logs.append("[LOG] Name received\n");
        logs.append("[LOG] Age received\n");
        logs.append("[LOG] Quote received\n");
        logs.append("[LOG] Bio received\n");

        System.out.println("\n--- Processed Profile ---");
        System.out.println(profile);

        System.out.println("--- Activity Log ---");
        System.out.println(logs);

        System.out.println("--- Extras ---");
        System.out.println("Name in Uppercase: " + upperName);
        System.out.println("First Name Only: " + firstName);
        System.out.println("Quote contains 'life'? " + (containsLife ? "Yes" : "No"));
    }
}
