package com.example.patronesDeDiseno.Creacionales.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de vehículos peugeot
        VehicleFactory peugeotFactory = new PeugeotFactory();

        // Crear un auto y una moto de peugeot
        Automobile peugeotAutomobile = peugeotFactory.createAutomobile();
        Motorcycle peugeotMotorcycle = peugeotFactory.createMotorcycle();

        // Iniciar los vehículos de peugeot
        peugeotAutomobile.start(); // Salida: peugeot automobile started.
        peugeotMotorcycle.start(); // Salida: peugeot motorcycle started.

        // Crear una fábrica de vehículos Honda
        VehicleFactory hondaFactory = new HondaFactory();

        // Crear un auto y una moto de Honda
        Automobile hondaAutomobile = hondaFactory.createAutomobile();
        Motorcycle hondaMotorcycle = hondaFactory.createMotorcycle();

        // Iniciar los vehículos de Honda
        hondaAutomobile.start(); // Salida: Honda automobile started.
        hondaMotorcycle.start(); // Salida: Honda motorcycle started.
    }
}

//Abstract factory permite producir familias de objetos relacionados sin especificar
//sus clases concretas.

//Supongamos que estamos construyendo un sistema de creación de vehículos, y queremos implementar
//diferentes fábricas para crear vehículos de distintos tipos, como automóviles y motos.
//En este ejemplo, las fábricas concretas (PeugeotFactory y HondaFactory) implementan la interfaz
//VehicleFactory y proporcionan la implementación específica para crear productos de la familia
//Peugeot o Honda. Cada una de estas fábricas puede crear vehículos de tipo autos y
//motos, que son productos relacionados pero distintos.