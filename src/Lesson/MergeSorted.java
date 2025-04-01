package Lesson;

import java.util.Scanner;
import java.util.Arrays;

public class MergeSorted {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("m: ");
        int m = scn.nextInt();

        System.out.print("n: ");
        int n = scn.nextInt();

        System.out.println("nums1: ");
        int[] nums1 = new int[m + n];
        for (int i = 0; i < m; i++) {
            nums1[i] = scn.nextInt();
        }



        System.out.println("nums2: ");
        int[] nums2 = new int[n];
        for (int i = 0; i < n; i++) {
            nums2[i] = scn.nextInt();
        }

        merge(nums1, m, nums2, n);

        System.out.println("Birleştirilmiş dizi: " + Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
    }
}
