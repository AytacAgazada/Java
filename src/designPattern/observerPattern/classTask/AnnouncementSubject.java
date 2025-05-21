package designPattern.observerPattern.classTask;

public interface AnnouncementSubject {
    void addListener(AnnouncementListener listener);
    void notifyListeners();
}
