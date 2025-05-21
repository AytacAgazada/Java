package designPattern.observerPattern.classTask;

public class Student implements AnnouncementListener{
    @Override
    public void receive(String message) {
        System.out.println("Student received announcement: " + message);
    }
}
