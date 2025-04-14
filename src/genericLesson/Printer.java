package genericLesson;

import java.util.List;

public class Printer {
    public static <T> void showArray(T[] items) {
        for (T item : items) {
            System.out.println("Array item: " + item);
        }
    }

    public static <T> void showList(List<T> items) {
        for (T item : items) {
            System.out.println("List item: " + item);
        }
    }
}
