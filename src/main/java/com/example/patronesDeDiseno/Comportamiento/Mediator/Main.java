package com.example.patronesDeDiseno.Comportamiento.Mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();

        User user1 = new UserImpl(mediator, "Alice");
        User user2 = new UserImpl(mediator, "Bob");
        User user3 = new UserImpl(mediator, "Charlie");
        User user4 = new UserImpl(mediator, "David");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Hello, everyone!");
    }
}

//Mediator define un objeto que encapsula cómo interactúan un conjunto de objetos.
//Promueve el diseño de sistemas con componentes altamente independientes y reutilizables.

//ChatMediator: La interfaz del mediador declara los métodos para enviar mensajes y agregar usuarios.
//ChatMediatorImpl: Implementa la interfaz ChatMediator. Mantiene una lista de usuarios y envía
// mensajes a todos los usuarios excepto al que envió el mensaje.
//User: Es una clase abstracta que representa a un usuario. Contiene una referencia al mediador y
// métodos abstractos para enviar y recibir mensajes.
//UserImpl: Implementa la clase User. Define cómo enviar y recibir mensajes utilizando el mediador.
//Main: Crea una instancia de ChatMediatorImpl y varios usuarios. Agrega los usuarios al mediador y
// simula el envío de un mensaje desde uno de los usuarios.

//Este ejemplo muestra cómo usar el patrón Mediator para manejar la comunicación entre diferentes
//objetos (usuarios) a través de un mediador centralizado (el chatroom).
//Esto reduce las dependencias entre los objetos y promueve un diseño más desacoplado.
