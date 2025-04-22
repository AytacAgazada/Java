package easyTask;

import java.util.*;

public class SortedNameList {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("📝 Enter 5 names:");
        for (int i = 0; i < 5; i++) {
            names.add(sc.nextLine());
        }

        System.out.println("📁 Sorted Name List:");
        for (String name : names) {
            System.out.println("🔹 " + name);
        }
    }
}
