package stringBufferBuilder;

import java.util.*;

public class Task {
    public static void main(String[] args) {
        StringBuilder common = new StringBuilder("ABC");
        List<StringBuilder> builders = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
//            StringBuilder common2 = new StringBuilder(common);
            builders.add(new StringBuilder(common).reverse());
            common.append(i);
//            common2.reverse();

        }

//        common.reverse();

        for (StringBuilder sb : builders) {
            System.out.println(sb);
        }
    }
}
