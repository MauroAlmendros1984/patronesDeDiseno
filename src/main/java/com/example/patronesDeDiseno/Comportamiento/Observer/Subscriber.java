package com.example.patronesDeDiseno.Comportamiento.Observer;

public class Subscriber implements Observer {
    private String name;
    private YouTubeChannel channel;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received notification: " + message);
    }

    public void subscribeChannel(YouTubeChannel channel) {
        this.channel = channel;
        channel.subscribe(this);
    }

    public void unsubscribeChannel() {
        channel.unsubscribe(this);
    }
}
