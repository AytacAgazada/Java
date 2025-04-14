package genericLesson;

public class NumberTool <T extends Number>{
    private T value;



    public <T> void cube(T value){
        System.out.println(value);
    }
}
