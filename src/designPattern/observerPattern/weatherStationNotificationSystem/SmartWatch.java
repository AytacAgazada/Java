package designPattern.observerPattern.weatherStationNotificationSystem;

public class SmartWatch implements Observer{
    public void update(String weatherUpdate) {
        System.out.println("Smart Watch vibrates: " + weatherUpdate);
    }
}
