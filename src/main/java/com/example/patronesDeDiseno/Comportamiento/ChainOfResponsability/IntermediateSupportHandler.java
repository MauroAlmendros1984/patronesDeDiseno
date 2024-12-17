package com.example.patronesDeDiseno.Comportamiento.ChainOfResponsability;

public class IntermediateSupportHandler extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("intermediate")) {
            System.out.println("IntermediateSupportHandler: Handling request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
