package lesson21;

public class Task2 {
    public static void main(String[] args) {
        int primitiveInt = 25;

        // Boxing (primitive -> wrapper)
        Integer integer = Integer.valueOf(primitiveInt);
        Integer boxedInt = primitiveInt;

        // Unboxing (wrapper -> primitive)
        int primitiveInt2 = integer.intValue();
        int unboxedInt = boxedInt;

        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("-------------------------------");
        System.out.println("Boxed Integer: " + integer);
        System.out.println("Unboxed int: " + primitiveInt2);
        System.out.println("-------------------------------");
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Unboxed int: " + unboxedInt);


    }


}
