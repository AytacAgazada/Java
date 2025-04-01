package TryCatch;

public class NullPointer {
    public static void main(String[] args) {
        int[] array = null;
        try{
            System.out.println(array[5]);
        }catch (NullPointerException | IndexOutOfBoundsException e){
            System.out.println( "No values here.");
        }
    }
}
