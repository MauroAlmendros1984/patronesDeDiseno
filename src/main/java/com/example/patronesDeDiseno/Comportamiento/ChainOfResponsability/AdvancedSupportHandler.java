package com.example.patronesDeDiseno.Comportamiento.ChainOfResponsability;

public class AdvancedSupportHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("advanced")) {
            System.out.println("AdvancedSupportHandler: Handling request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
