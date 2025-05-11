package lesson22;

import java.util.*;
import java.util.function.*;

import java.util.stream.Collectors;


public class EasyTask {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("banana", "cherry", "apple" );
        Consumer<String> printer = System.out::println;
        list.forEach(printer);

        System.out.println("--------------------");

        Predicate<String> isLong = s -> s.length() > 5;
        System.out.println(isLong.test("Aytac"));

        System.out.println("--------------------");

        List<String> filtered = list.stream()
                .filter(isLong)
                .collect(Collectors.toList());
        System.out.println(filtered);

        System.out.println("--------------------");

        Supplier<UUID> uuidSupplier = UUID::randomUUID;
        System.out.println(uuidSupplier.get());

        System.out.println("--------------------");

        Function<String, Integer> stringLength = String::length;
        System.out.println(stringLength.apply("example"));

        System.out.println("--------------------");

        list.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println(list);



    }
}
