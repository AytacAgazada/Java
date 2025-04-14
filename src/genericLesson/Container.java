package genericLesson;

import java.util.List;

public class Container <T>{
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

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
