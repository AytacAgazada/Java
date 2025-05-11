import java.io.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
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
//        class Solution {
//            public int maxProfit(int[] prices) {
//                int lsf = Integer.MAX_VALUE;
//                int op = 0;
//                int pist = 0;
//
//                for(int i = 0; i < prices.length; i++){
//                    if(prices[i] < lsf){
//                        lsf = prices[i];
//                    }
//                    pist = prices[i] - lsf;
//                    if(op < pist){
//                        op = pist;
//                    }
//                }
//                return op;
//            }
//        }

//        try{
//            FileReader file = new FileReader("file.txt");
//            BufferedReader fileInput = new BufferedReader(file);// Compile-time Exception
//             int a = 10/5;
//            System.out.println(a);
//        } catch (ArithmeticException e) {
//            System.out.println("noo");
//        }finally {
//            System.out.println("helllo world!");
//        }

        //runtime
//        int a = 10/0;
//        System.out.println(a);


//



    }
    public static void  printANumber() {
        try {
            System.out.println(3);
        } catch (Exception e) {
            System.out.println(4);
        } finally {
            System.out.println(5);
        }
    }

    public void sum(int a){
        a=6;
        System.out.println(a);
}
}





