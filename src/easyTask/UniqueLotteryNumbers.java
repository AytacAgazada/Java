package easyTask;

import java.util.*;

public class UniqueLotteryNumbers {
    public static void main(String[] args) {
        HashSet<Integer> numbers = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        while (numbers.size() < 6) {
            System.out.print("🎲 Enter a number: ");
            int num = sc.nextInt();
            if (!numbers.add(num)) {
                System.out.println("⚠️ Duplicate! Try again.");
            }
        }

        System.out.println("🎉 Your unique lottery numbers: " + numbers);
    }

}
