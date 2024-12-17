package com.example.patronesDeDiseno.Creacionales.Singleton;

public class Main {
    public static void main(String[] args) {
        // Obtenemos la instancia única del Logger
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Verificamos si ambas instancias son iguales
        System.out.println("Logger 1 == Logger 2: " + (logger1 == logger2)); // Debería imprimir "true"

        // Registramos un mensaje en el log
        logger1.log("Message 1");

        // Intentamos crear una nueva instancia de Logger (esto no debería ser posible)
        // Logger logger3 = new Logger(); // Esto arrojará un error de compilación

        // Registramos otro mensaje en el log utilizando la misma instancia
        logger2.log("Message 2");
    }
}
//Singleton permite asegurarnos de que una clase tenga una única instancia,
//a la vez que proporciona un punto de acceso global a dicha instancia.

//Se declara una instancia estática privada instance de la clase Logger.
//Esta será la única instancia de Logger en toda la aplicación.
//El constructor de Logger es privado para evitar que se pueda crear una instancia
//desde fuera de la clase.
//Se proporciona un método estático getInstance() que devuelve la única instancia de Logger.
//Si la instancia aún no existe, se crea; de lo contrario, se devuelve la instancia existente.
//Se define un método log() para registrar un mensaje en el log.

//En este ejemplo, creamos dos instancias de Logger utilizando el método getInstance().
//Como el patrón Singleton garantiza que solo haya una instancia de Logger,
//ambas variables logger1 y logger2 apuntarán a la misma instancia.
//La comprobación (logger1 == logger2) imprimirá true.
//
//Luego, registramos dos mensajes en el log utilizando la misma instancia de Logger.
//Esto demuestra que estamos utilizando la misma instancia de Logger en toda la aplicación.
