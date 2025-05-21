package designPattern.observerPattern.classTask;

public class Parent implements AnnouncementListener{
    @Override
    public void receive(String message) {
        System.out.println("Parent received announcement: " + message);
    }
}
