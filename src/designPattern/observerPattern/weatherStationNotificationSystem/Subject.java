package designPattern.observerPattern.weatherStationNotificationSystem;

public interface Subject {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
