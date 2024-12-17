package com.example.patronesDeDiseno.Comportamiento.ChainOfResponsability;

public class Main {
    public static void main(String[] args) {
        // Crear los manejadores
        Handler basicSupport = new BasicSupportHandler();
        Handler intermediateSupport = new IntermediateSupportHandler();
        Handler advancedSupport = new AdvancedSupportHandler();

        // Configurar la cadena de responsabilidad
        basicSupport.setNextHandler(intermediateSupport);
        intermediateSupport.setNextHandler(advancedSupport);

        // Realizar solicitudes
        System.out.println("Sending a basic request...");
        basicSupport.handleRequest("basic");

        System.out.println("\nSending an intermediate request...");
        basicSupport.handleRequest("intermediate");

        System.out.println("\nSending an advanced request...");
        basicSupport.handleRequest("advanced");

        System.out.println("\nSending an unknown request...");
        basicSupport.handleRequest("unknown");
    }
}

//Chain of Responsibility se utiliza para desacoplar el emisor de una solicitud de sus receptores,
//permitiendo que múltiples objetos tengan la oportunidad de manejar la solicitud. Los receptores
//se encadenan y pasan la solicitud a lo largo de la cadena hasta que un objeto la maneja.

//Supongamos que tenemos un sistema de manejo de solicitudes de soporte técnico.
//Las solicitudes pueden ser manejadas por diferentes niveles de soporte:
//Soporte Básico, Soporte Intermedio y Soporte Avanzado.

//Handler: Es una clase abstracta que declara un método para manejar solicitudes (handleRequest)
// y una referencia al próximo manejador (nextHandler).
//BasicSupportHandler, IntermediateSupportHandler, AdvancedSupportHandler: Son clases concretas
// que extienden Handler y manejan diferentes tipos de solicitudes. Si el manejador actual no
// puede manejar la solicitud, la pasa al siguiente manejador en la cadena.
//Main: Configura la cadena de responsabilidad encadenando los manejadores y
// luego envía diferentes solicitudes para ser manejadas.

//Este ejemplo muestra cómo el patrón Chain of Responsibility permite que diferentes objetos
// manejen una solicitud sin que el emisor de la solicitud sepa qué objeto finalmente la manejará,
// logrando así un diseño más flexible y desacoplado.
