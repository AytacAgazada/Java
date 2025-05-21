package designPattern.observerPattern.weatherStationNotificationSystem;

public class MobileApp implements Observer {
    public void update(String weatherUpdate) {
        System.out.println("Mobile App: " + weatherUpdate);
    }
}
