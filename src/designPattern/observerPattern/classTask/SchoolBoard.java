package designPattern.observerPattern.classTask;

import java.util.*;

public class SchoolBoard implements AnnouncementSubject{
    private List<AnnouncementListener> listeners = new ArrayList<>();
    private String message;


    @Override
    public void addListener(AnnouncementListener listener) {
        listeners.add(listener);
    }

    @Override
    public void notifyListeners() {
        for (AnnouncementListener listener : listeners){
            listener.receive(message);
        }
    }

    public void sendAnnouncement(String message){
        this.message = message;
        notifyListeners();
    }
}
