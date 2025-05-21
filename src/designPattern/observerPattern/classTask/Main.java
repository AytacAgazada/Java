package designPattern.observerPattern.classTask;

public class Main {
    public static void main(String[] args) {
        SchoolBoard schoolBoard = new SchoolBoard();

        Student student = new Student();
        Teacher teacher = new Teacher();
        Parent parent = new Parent();

        schoolBoard.addListener(student);
        schoolBoard.addListener(teacher);
        schoolBoard.addListener(parent);

        schoolBoard.sendAnnouncement("School is closed tomorrow");
    }
}
