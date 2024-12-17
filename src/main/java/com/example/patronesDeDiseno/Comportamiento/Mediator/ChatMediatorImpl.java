package com.example.patronesDeDiseno.Comportamiento.Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<User> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : this.users) {
            // No enviar el mensaje al propio usuario
            if (u != user) {
                u.receive(msg);
            }
        }
    }
}