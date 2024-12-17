package com.example.patronesDeDiseno.Comportamiento.Mediator;

public interface ChatMediator {
    void sendMessage(String msg, User user);
    void addUser(User user);
}
