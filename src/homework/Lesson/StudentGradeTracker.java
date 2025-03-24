package homework.Lesson;
import java.util.Arrays;
import java.util.Scanner;
public class StudentGradeTracker {

    static double[] array = new double[5];
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter grades for 5 subjects: ");
        for (int i = 0; i < 5; i++) {
            int not = scn.nextInt();
            if (not >= 0 && not <= 100){
                array [i] = not;
            }else {
                System.out.println("Invalid grades!");
                i--;
            }
        }

        Arrays.sort(array);
        System.out.println("Your grades: " + Arrays.toString(array));


        double average = 0;
        System.out.println(Averagecalculator(average));


        int heghest = 0;
        int lowest = 0;
        System.out.println(highestLowest(heghest,lowest));
    }

    public static String Averagecalculator (double average){
        double sum = 0;
        for (double grade : array) {
            sum += grade;
        }
        average = sum / array.length;
        System.out.println("Average grade: " + average);

        return "";
    }

    public static String highestLowest (int heghest, int lowest){

        heghest = (int) Arrays.stream(array).max().getAsDouble();
        lowest = (int) Arrays.stream(array).min().getAsDouble();
        System.out.println("Heghest grade: "+ heghest);
        System.out.println("Lowest grade: "+ lowest);
        return "";
    }
}
