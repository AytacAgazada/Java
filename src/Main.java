import java.io.File;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int n = scn.nextInt();
//        System.out.println("Enter array: ");
//        int[] nums = new int[n];
//        for (int i = 0; i < nums.length; i++) {
//            nums[i] = scn.nextInt();
//        }
//        System.out.println(containsDuplicate(nums));
//    }
//    public static boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++){
//            if (nums[i] == nums[i+1]){
//                return true;
//            }
//        }
//        return false;
//
//        //2ci formasi
//        for(int i=1;i<nums.length;i++){
//
//            if(nums[i-1]==nums[i]) return true;
//
//            if(i<nums.length-1 && nums[i]==nums[i+1]) return true;
//
//            int temp=nums[i];
//            if(nums[i]<nums[i-1]){
//                for(int j=i-1;j>=0;j--){
//                    if(nums[j]==temp) return true;
//                }
//                nums[i]=nums[i-1];
//                nums[i-1]=temp;
//            }
//        }
//        return false;
        class Solution {
            public int maxProfit(int[] prices) {
                int lsf = Integer.MAX_VALUE;
                int op = 0;
                int pist = 0;

                for(int i = 0; i < prices.length; i++){
                    if(prices[i] < lsf){
                        lsf = prices[i];
                    }
                    pist = prices[i] - lsf;
                    if(op < pist){
                        op = pist;
                    }
                }
                return op;
            }
        }
    }



}