package set;

import java.util.*;

public class Set {
    public static void main(String[] args) {
        HashSet<Object> hashSet = new HashSet<>();
        hashSet.add(123);
        hashSet.add("fdg");
        hashSet.add('a');
        hashSet.add(true);
        System.out.println("HashSet: ");
        hashSet.stream().forEach(System.out::println);

        LinkedHashSet<Object> linkedSet = new LinkedHashSet<>();
        linkedSet.add(554);
        linkedSet.add("djsn");
        linkedSet.add('d');
        linkedSet.add(false);
        System.out.println("LinkedHashSet: ");
        linkedSet.stream().forEach(System.out::println);

//        TreeSet<Object> treeSet = new TreeSet<>();
//        treeSet.add(145);
//        treeSet.add("fsg");
//        treeSet.add('a');
//        treeSet.add(true);
//        System.out.println("TreeSet: ");
        //treeSet.stream().forEach(System.out::println); // object=string and number



        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("dsfsf");
        hashSet1.add("hngh");
        hashSet1.add("fdgsdg");
        hashSet1.add("dnhf");

        hashSet.addAll(hashSet1);
        System.out.println("HashSet: ");
        hashSet.stream().forEach(System.out::println);
     //   hashSet1.addAll(hashSet);// string object qebul ede bilmir

        System.out.println();
        System.out.println(new ArrayList<>(hashSet).get(1));





    }
}
