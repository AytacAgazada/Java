package lesson22;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MediumTask {
    public static void main(String[] args) {

        List<String> names = List.of("Alice","Bob","Anna","Brian","anna");

        Predicate<String> startWithA = name -> name.startsWith("A");
        List<String> filtered = names.stream()
                .filter(startWithA)
                .collect(Collectors.toList());
        System.out.println(filtered);
        System.out.println("--------------------");

        Function<String, Integer> nameLength = String::length;
        List<Integer> length = names.stream()
                .map(nameLength)
                .collect(Collectors.toList());
        System.out.println(length);
        System.out.println("--------------------");

        Supplier<Integer> diceRoll =() -> (int)(Math.random() * 6) +1;
        for (int i = 0; i < 10; i++) {
            System.out.print(diceRoll.get() + " , ");
        }
        System.out.println("--------------------");

        List<String> uppercased = names.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercased);

        System.out.println("--------------------");
        Predicate<String> isPalindrome = s -> {
            String reversed = new StringBuilder(s).reverse().toString();
            return s.equalsIgnoreCase(reversed);
        };
        System.out.println(isPalindrome.test("level"));
        System.out.println(isPalindrome.test("Lambda"));
        System.out.println("--------------------");

        Predicate<String> isPalindrome1 = s -> {
            char[] chars = s.toLowerCase().toCharArray();
            int i = 0, j = chars.length - 1;
            while (i < j) {
                if (chars[i] != chars[j]) return false;
                i++;
                j--;
            }
            return true;
        };

        List<String> palindromes = names.stream()
                .filter(isPalindrome)
                .collect(Collectors.toList());

        System.out.println(palindromes);
    }
}
