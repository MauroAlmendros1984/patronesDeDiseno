package com.example.patronesDeDiseno.Comportamiento.Observer;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}