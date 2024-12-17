package com.example.patronesDeDiseno.Creacionales.AbstractFactory;

public class HondaFactory implements VehicleFactory {
    @Override
    public Automobile createAutomobile() {
        return new HondaAutomobile();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new HondaMotorcycle();
    }
}
