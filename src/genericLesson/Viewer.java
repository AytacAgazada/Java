package genericLesson;

import java.util.List;

public class Viewer {

    public static void printAnything(List<?> data){
        for (Object list : data){
            System.out.println(list);
        }
    }
}
