package com.example.patronesDeDiseno.Comportamiento.Command;

public class Main {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        Light livingRoomLight = new Light();
        Fan ceilingFan = new Fan();

        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        FanOnCommand ceilingFanOn = new FanOnCommand(ceilingFan);
        FanOffCommand ceilingFanOff = new FanOffCommand(ceilingFan);

        remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remote.setCommand(1, ceilingFanOn, ceilingFanOff);

        System.out.println("Turning on the living room light...");
        remote.pressOnButton(0);
        System.out.println("Turning off the living room light...");
        remote.pressOffButton(0);
        System.out.println("Undoing the last command...");
        remote.pressUndoButton();

        System.out.println("Starting the ceiling fan...");
        remote.pressOnButton(1);
        System.out.println("Stopping the ceiling fan...");
        remote.pressOffButton(1);
        System.out.println("Undoing the last command...");
        remote.pressUndoButton();
    }
}

//Command encapsula una solicitud como un objeto, permitiendo parametrizar a los clientes con
//diferentes solicitudes, encolar solicitudes, y soportar operaciones que pueden deshacerse.

//Supongamos que estamos creando una aplicación para controlar dispositivos
// electrónicos como luces y ventiladores.

//Command: La interfaz Command declara los métodos execute y undo.
//LightOnCommand y LightOffCommand: Implementan la interfaz Command para encender y apagar una luz.
//FanOnCommand y FanOffCommand: Implementan la interfaz Command para arrancar y detener un ventilador.
//RemoteControl: Actúa como el invocador que almacena comandos y los ejecuta o deshace cuando se
//presionan los botones correspondientes.
//Main: Configura el RemoteControl con comandos específicos y simula presionar los botones para
//ejecutar y deshacer comandos.

//Este ejemplo demuestra cómo usar el patrón Command para encapsular solicitudes como objetos,
//permitiendo mayor flexibilidad y desacoplamiento entre el invocador de una solicitud y el
//objeto que la procesa.
