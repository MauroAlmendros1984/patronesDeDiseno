package com.example.patronesDeDiseno.Comportamiento.Observer;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel techChannel = new YouTubeChannel("TechSavvy");

        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");
        Subscriber charlie = new Subscriber("Charlie");

        alice.subscribeChannel(techChannel);
        bob.subscribeChannel(techChannel);
        charlie.subscribeChannel(techChannel);

        techChannel.uploadNewVideo("Observer Pattern in Java");

        bob.unsubscribeChannel();

        techChannel.uploadNewVideo("Strategy Pattern in Java");
    }
}

//El patrón Observer se utiliza para definir una relación de uno a muchos entre objetos,
//de manera que cuando uno de los objetos cambia su estado, todos sus dependientes son
//notificados y actualizados automáticamente. Este patrón es muy útil en sistemas donde
//los cambios en un objeto necesitan ser reflejados en otros objetos.

//Observer: La interfaz Observer define el método update, que los observadores deben
// implementar para recibir notificaciones.
//Subject: La interfaz Subject define métodos para subscribir, desubscribir y notificar observadores.
//YouTubeChannel: Implementa la interfaz Subject. Mantiene una lista de observadores y
// notifica a todos cuando se sube un nuevo video.
//Subscriber: Implementa la interfaz Observer. Recibe notificaciones del canal de YouTube al que
// está suscrito y puede suscribirse o desubscribirse de canales.
//Main: Demuestra cómo los suscriptores pueden recibir notificaciones de un canal de YouTube y
// cómo pueden desubscribirse.

//Este ejemplo muestra cómo usar el patrón Observer para implementar un sistema de notificaciones
// donde los cambios en un objeto (YouTubeChannel) se reflejan en otros objetos (Subscriber)
// automáticamente.