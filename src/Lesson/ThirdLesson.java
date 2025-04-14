package Lesson;

public class ThirdLesson {
    public static void main(String[] args) {
        int number = 0 ;
        int result = countUpbyThrees(number);
        System.out.println(result);



    }

    public static int countUpbyThrees (int number){
        for (int num = 3; num <= 30; num+=3){
            System.out.println(num);
        }

        return number;
    }



}
