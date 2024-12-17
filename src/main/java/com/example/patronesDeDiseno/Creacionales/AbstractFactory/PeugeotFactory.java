package com.example.patronesDeDiseno.Creacionales.AbstractFactory;

public class PeugeotFactory implements VehicleFactory {
    @Override
    public Automobile createAutomobile() {
        return new PeugeotAutomobile();
    }

    @Override
    public Motorcycle createMotorcycle() {
        return new PaugeotMotorcycle();
    }
}
