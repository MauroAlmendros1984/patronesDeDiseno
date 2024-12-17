package com.example.patronesDeDiseno.Comportamiento.Memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #2");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.add(originator.saveStateToMemento());

        System.out.println("Current State: " + originator.getState());

        originator.getStateFromMemento(caretaker.undo());
        System.out.println("Undo to State: " + originator.getState());

        originator.getStateFromMemento(caretaker.undo());
        System.out.println("Undo to State: " + originator.getState());

        originator.getStateFromMemento(caretaker.redo());
        System.out.println("Redo to State: " + originator.getState());

        originator.getStateFromMemento(caretaker.redo());
        System.out.println("Redo to State: " + originator.getState());
    }
}

//Memento se utiliza para capturar y restaurar el estado interno de un objeto sin violar su
//encapsulamiento. Es especialmente útil para implementar funcionalidades de deshacer (undo).

//Memento: La clase Memento es inmutable y almacena el estado interno del Originator.
//Originator: La clase Originator crea y restaura estados usando instancias de Memento.
// Tiene métodos para guardar y restaurar su estado.
//Caretaker: La clase Caretaker gestiona una lista de mementos y proporciona métodos para
// deshacer (undo) y rehacer (redo) operaciones.
//Main: La clase principal que demuestra cómo usar el patrón Memento para capturar,
// restaurar y gestionar estados del Originator.

//Este ejemplo muestra cómo usar el patrón Memento para implementar una funcionalidad de deshacer
// y rehacer en un editor de texto simple, capturando y restaurando el estado del objeto Originator.
