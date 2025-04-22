package map;

import java.util.*;


public class Changed {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Bob", 20);
        hashMap.put("Smith", 22);
        hashMap.put("Alice", 27);
        System.out.println(hashMap.get(0));

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("dsf","FDg");
        linkedHashMap.put("df","Fg");
        linkedHashMap.put("ds","FD");

        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("abc",123);
        treeMap.put("ab",12);
        treeMap.put("ac",13);

        System.out.println(hashMap.get("Aytac"));

        hashMap.computeIfAbsent("Charlie", key -> 22);
        System.out.println("After computeIfAbsent (Charlie): " + hashMap);

        hashMap.compute("Job",(key ,value) -> 22);

        hashMap.put("Bob",35);
        System.out.println("After update (Bob = 35): " + hashMap);

        hashMap.remove("Alice");
        System.out.println(hashMap);

        hashMap.forEach( (key, value) -> { System.out.println(key + " -> " + value); } );

        System.out.println("All entries:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }








    }
}
