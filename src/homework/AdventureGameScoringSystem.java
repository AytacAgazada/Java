package homework;

import java.util.Scanner;

public class AdventureGameScoringSystem {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Enter character: ");
        String character = scn.nextLine();

        int correctActions = 0;

        boolean isValidCharacter = character.equals("Warrior") || character.equals("Mage") || character.equals("Thief");

        if (!isValidCharacter) {
            System.out.println("Invalid selection!");
            return;
        }

        System.out.println("Character: " + character);

        System.out.print("Enter base score: ");
        int baseScore = scn.nextInt();
        scn.nextLine();

            int actionCount = 0;
             if(correctActions > 1) {
                 if (actionCount % 5 == 0) {
                     if (character.equals("Warrior")) {
                         character = "Mage";
                         System.out.println("Level Up! You are now a Mage!");
                     } else if (character.equals("Mage")) {
                         character = "Thief";
                         System.out.println("Level Up! You are now a Thief!");
                     } else if (character.equals("Thief")) {
                         character = "Warrior";
                         System.out.println("Level Up! You are now a Warrior!");
                     }
                 }
                 correctActions++;
             }

        double bonus;

        switch (character) {
            case "Warrior":
                bonus = baseScore * 0.2;
                break;
            case "Mage":
                bonus = baseScore * 0.15;
                break;
            case "Thief":
                bonus = baseScore * 0.1;
                break;
            default:
                bonus = 0;
        }

        int score = baseScore + (int) bonus;

        String result = calculateScore(score);
        System.out.println(result);

        int totalScore = 0;

        System.out.println("Enter actions: ");
        String actions = scn.nextLine();

        totalScore = totalScore(totalScore, actions);

        int finalscore = score + totalScore;
        System.out.println("Final score: " + finalscore);

        if (finalscore >= 500) {
            System.out.println("Amazing performance! \nYou’re ready for the next challenge!");
        } else if (finalscore > 300 && finalscore <= 499) {
            System.out.println("Good job! \nKeep honing your skills!");
        } else {
            System.out.println("You need more practice! Keep working hard! \nDon’t give up! Practice makes perfect!");
        }

    }

    public static String calculateScore(int score) {
        return (score >= 0) ? "Total score: " + score : "Invalid action score!";
    }

    public static int totalScore(int totalScore, String actions) {
        switch (actions.toLowerCase()) {
            case "defeat boss":
                totalScore += 200;
                break;
            case "find treasure":
                totalScore += 100;
                break;
            case "complete quest":
                totalScore += 150;
                break;
            case "help npc":
                totalScore += 50;
                break;
            default:
                return totalScore;
        }
        return totalScore;
    }
}
