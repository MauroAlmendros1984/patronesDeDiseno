package com.example.patronesDeDiseno.Comportamiento.Observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Subject {
    private List<Observer> observers;
    private String channelName;
    private String message;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
        this.observers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void uploadNewVideo(String videoTitle) {
        this.message = "New video uploaded: " + videoTitle;
        notifyObservers();
    }

    public String getChannelName() {
        return channelName;
    }
}
