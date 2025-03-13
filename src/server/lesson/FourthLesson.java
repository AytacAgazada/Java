package server.lesson;


import java.util.Arrays;

public class FourthLesson {
    static String[] book = new String[5];
    static String[] name = {"Aytac","Ayla","Orxan","Kenan","Sabina","Elvin"};
    static int[] num = {124,97,36,49,20,1,2,3,78,236,45,45};


    public static void main(String[] args) {

        System.out.println(books(book));

        //task2

        Object[][] tracking = {
                {"Mondey", 125.6},
                {"Tuesday", 12.7},
                {"Wednesday", 34.7},
                {"Thursday", 78.6},
                {"Friday", 89.6},
                {"Saturday", 97.5},
                {"Sunday", 100.5}};

        int sum = 0;
        int money = 0;
        System.out.println("Total sum: " + expenseTracking(tracking,sum));

//        for (int i = 0; i < tracking.length-1; i++) {
//            for (int j = 0; j < tracking[i].length-1; j++) {
//                System.out.print(tracking[i][j+1] + " ");
//            }
//            System.out.println();
//        System.out.println(tracking[0][1]);
//        System.out.println(tracking[1][1]);
//        System.out.println(tracking[2][1]);
//        System.out.println(tracking[3][1]);



        int[][] array ={{124,34,94},
                {12,35,67},
                {21,78,95},
                {11,22,33}};
        System.out.println(arrays(array));




        System.out.println(nameIndex(name));

        System.out.println(numbers(num));

        }


        public static String books(String[] book){
        book[0] = "Numbers";
        book[1] = "Secon law";
        book[2] = "Leviticus";
        book[3] = "Exodus";
        book[4] = "Genesis";
        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i] + "");
        }
        System.out.println();

        for (String bookk : book){
            System.out.println(bookk + "");
        }
        System.out.println();

        return "";


    }

    public static double expenseTracking(Object[][] tracking,  double sum) {
        for (int i = 0; i < tracking.length; i++) {
            for (int j = 0; j < tracking[i].length; j++) {
                System.out.print(tracking[i][j] + " ");

                if (j == 1) {
                    sum += (double) tracking[i][j];

                }
            }
            System.out.println();
        }
        return sum ;
    }



    public static Object arrays (int[][] array){
        for (int[] arr :array){
            for (int arr2 : arr){
                System.out.print(arr2 + " ");
        }
        System.out.println();
        }
        return "";
    }

    public static int nameIndex (String[] name){
        for (int i = 0; i < name.length; i++) {
            if (name[i].equals(name)){
                return i;
            }
        }
        return -1;
    }


    public static Object numbers (int[] num){
        Arrays.sort(num);
        for (int number : num) {
            System.out.print( number + " ");
        }
        System.out.println();
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print( num[i] + " ");
        }
        System.out.println();
        return " ";
    }

    public static void copy (){
        //HardCoded
// Backup data for orders
        int[] orderIDs = {101, 102, 103};
        int[] backupOrders = new int[3];


        for(int i=0; i<orderIDs.length; i++) {
            backupOrders[i] = orderIDs[i];
        }


        for(int i: backupOrders) {
            System.out.println(i);
        }

// Easy solution
         backupOrders = Arrays.copyOf(orderIDs, orderIDs.length);

    }

    public static void finding (){
        int min = 0;
        int max = 0;

        min = Arrays.stream(num).min().getAsInt();
        max = Arrays.stream(num).max().getAsInt();
        System.out.println("Min number: " + min);
        System.out.println("Max number: " + max);
    }

}
