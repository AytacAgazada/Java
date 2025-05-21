package designPattern.observerPattern.weatherStationNotificationSystem;

public class WeatherStationApp {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.addObserver(new MobileApp());
        station.addObserver(new SmartWatch());

        station.setWeather("Storm incoming");
    }
}
