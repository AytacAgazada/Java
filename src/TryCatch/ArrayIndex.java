package TryCatch;

public class ArrayIndex {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[12]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Oops! The index is out of bounds!");
        }
    }
}
