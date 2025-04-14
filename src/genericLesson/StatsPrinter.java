package genericLesson;

import java.util.List;

public class StatsPrinter  {
    public static void displayStats(List <? extends Number> list){
        for (Number number : list){
            System.out.println(number);
        }
    }

}
