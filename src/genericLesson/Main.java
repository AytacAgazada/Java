package genericLesson;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        NumberTool<Integer> integerNumberTool= new NumberTool<>();
//        NumberTool<Double> doubleNumberTool = new NumberTool<>();
//        doubleNumberTool.cube(3.5);
//        integerNumberTool.cube(5);
//
//        List<Integer> intList = Arrays.asList(1, 2, 3);
//        List<Float> floatList = Arrays.asList(1.1f, 2.2f, 3.3f);
//
//        StatsPrinter.displayStats(intList);
//        StatsPrinter.displayStats(floatList);
//

//        Container<String> stringContainer = new Container<>();
//        stringContainer.setItem("Hello");
//        System.out.println("Container holds: " + stringContainer.getItem());
//
//        String[] stringArray = {"A", "B", "C"};
//        Integer[] intArray = {1, 2, 3};
//
//        Printer.showArray(stringArray);
//        Printer.showArray(intArray);
//
//        List<String> stringList = Arrays.asList("X", "Y");
//        List<Double> doubleList = Arrays.asList(2.5, 3.5);
//
//        Printer.showList(stringList);
//        Printer.showList(doubleList);

        List<String> strings = Arrays.asList("Apple", "Banana");
        List<Boolean> booleans = Arrays.asList(true, false);

        Viewer.printAnything(strings);
        Viewer.printAnything(booleans);

        Container<String> c1 = new Container<>();
        c1.setItem("Data 1");

        Container<Integer> c2 = new Container<>();
        c2.setItem(123);

        List<Container<?>> containers = List.of(c1, c2);
        Viewer.printAnything(containers);




    }
}
