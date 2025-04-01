package Lesson;
import java.util.Arrays;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scn.nextInt();

        int[] nums = new int[n];

        System.out.println( " enter " + n + " an element: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scn.nextInt();
        }
        System.out.println("nums = " + Arrays.toString(nums));

        System.out.print("target = ");
        int target = scn.nextInt();

        int[] result = twoSum(nums,target);

        if (result != null) {
            System.out.println("Indexes: " + Arrays.toString(result));
        } else {
            System.out.println("No valid pair found.");
        }


    }

    public static int[] twoSum(int[] nums, int target) {

        for (int j = 0; j < nums.length; j++) {
            for (int k = j + 1; k < nums.length; k++) {
                if (nums[j] + nums[k] == target) {
                    return new int[]{j, k};
                }
            }
        }

        return null;
    }
}
