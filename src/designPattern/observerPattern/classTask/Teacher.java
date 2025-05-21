package designPattern.observerPattern.classTask;

public class Teacher implements AnnouncementListener{
    @Override
    public void receive(String message) {
        System.out.println("Teacher received announcement: " + message);
    }
}
