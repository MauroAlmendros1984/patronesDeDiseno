package com.example.patronesDeDiseno.Estructurales.Facade;

public class Main {
    public static void main(String[] args) {
        // Creamos la fachada del cine
        CinemaFacade cinemaFacade = new CinemaFacade();

        // Empezamos la película
        System.out.println("=== Starting movie ===");
        cinemaFacade.startMovie();
        System.out.println();

        // Terminamos la película
        System.out.println("=== Ending movie ===");
        cinemaFacade.endMovie();
    }
}

//Facade es un patrón de diseño estructural que proporciona una interfaz simplificada a una
//biblioteca, un framework o cualquier otro grupo complejo de clases.

//Supongamos que tenemos diferentes subsistemas para gestionar las diferentes partes del
//sistema de cine: la luz, el sonido y el proyector.
//Luego, creamos una clase Facade que proporciona una interfaz simplificada para utilizar
//estos subsistemas

//En este ejemplo, la clase CinemaFacade proporciona métodos simples para empezar y terminar
//una película. Internamente, la fachada utiliza los subsistemas de luces, sonido y proyector
//de manera adecuada para realizar estas operaciones. Esto permite al cliente utilizar el
//sistema de cine de manera sencilla sin necesidad de conocer los detalles de implementación
//de los subsistemas.
