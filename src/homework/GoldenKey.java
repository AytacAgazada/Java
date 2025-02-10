package homework;

import java.util.Scanner;

public class GoldenKey {
    public static void main(String[] args) {
        System.out.println("You wake up in a dark room. A voice whispers: 'Find the Golden Key to escape!'\uD83D\uDD11");

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your selection (- `1\uFE0F⃣ Open the wooden door \uD83D\uDEAA`\n" +
                "- `2\uFE0F⃣ Climb through the vent \uD83D\uDD32`): ");
        int choice = scn.nextInt();
        int health = 100;
        scn.nextLine();
        System.out.print("enter your weapon choice: ");
        String weapon = scn.nextLine().toLowerCase();
        System.out.println(differentPaths(choice,health,weapon));

        int key = 7890;
        int record = 3;

        boolean isUnlocked = safeCode(record,key,scn);
        if (isUnlocked) {
            System.out.println("🎉 Congratulations! You have escaped with the Golden Key!");
        } else {
            System.out.println("❌ You failed to unlock the safe. Game Over!");
        }

        goldenKey(isUnlocked);

    }

    public static String differentPaths (int choice, int health, String weapon){
        String result = "";
        if (choice == 1) {
            result = "You were greeted by a security guard....\n";
            switch (weapon) {
                case "sword":
                    result += "You brandish your sword, and the guard steps back, letting you pass!";
                    break;
                case "bow":
                    result += "You aim your bow at the guard, making him nervous, but he lets you go.";
                    break;
                default:
                    health -= 20;
                    result += "You are unarmed! The guard attacks you, and you lose 20 health.";
            }
        } else {
            health -= 10;
            result = "You climb through the vent, but it's sharp and you get scratched, losing 10 health.";
        }

        return result + "\nYour current health is: " + health;
    }

    public static boolean safeCode (int record, int key, Scanner scn) {
        while (record > 0){
            System.out.print("Enter the 4-digit code to open the safe: ");
            int reply = scn.nextInt();
            if (reply == key) {
                System.out.println("The safe clicks open... You found the Golden Key! 🔑");
                return true;
            } else {
                record--;
                if (record > 0) {
                    System.out.println("Incorrect code! You have " + record + " attempt(s) left.");
                }
            }
        }

        if (record == 0) {
            System.out.println("🚪 The safe remains locked... Game Over!");
        }
        return false;
    }

    public static void goldenKey (boolean hasKey) {
        String message = hasKey
                ? "🎊 You use the Golden Key and escape the castle! YOU WIN! 🏆"
                : "😱 You failed to find the key. You are trapped forever!";
        System.out.println(message);

    }
}

