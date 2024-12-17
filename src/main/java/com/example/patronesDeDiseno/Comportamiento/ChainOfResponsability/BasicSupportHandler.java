package com.example.patronesDeDiseno.Comportamiento.ChainOfResponsability;

public class BasicSupportHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("basic")) {
            System.out.println("BasicSupportHandler: Handling request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
