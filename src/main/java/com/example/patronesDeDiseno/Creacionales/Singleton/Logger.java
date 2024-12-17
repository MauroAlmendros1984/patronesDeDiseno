package com.example.patronesDeDiseno.Creacionales.Singleton;

public class Logger {
    // 1. Creamos una instancia estática privada de Logger -- atributo de clase del tipo Logger
    private static Logger instance;

    // 2. Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Logger() {
        // Constructor vacío para evitar la creación de instancias externas
    }

    // 3. Método estático (de clase) para obtener la instancia única de Logger
    public static Logger getInstance() {
        // Si no se ha creado una instancia, la creamos
        if (instance == null) {
            instance = new Logger();
        }
        // Devolvemos la instancia existente
        return instance;
    }

    // Método para registrar un mensaje en el log
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
